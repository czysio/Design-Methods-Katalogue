package pl.krzysiek.olejnik.dmkatalogue.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.krzysiek.olejnik.dmkatalogue.model.User;
import pl.krzysiek.olejnik.dmkatalogue.repository.UserRepository;
import pl.krzysiek.olejnik.dmkatalogue.utility.SecurityService;
import pl.krzysiek.olejnik.dmkatalogue.utility.UserService;
import pl.krzysiek.olejnik.dmkatalogue.validator.UserValidator;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private SecurityService securityService;

	@Autowired
	private UserValidator userValidator;

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/registration")
	private String registration(Model model) {
		model.addAttribute("user", new User());
		return "form/registration";
	}

	@PostMapping("/registration")
	private String postRegistration(@Valid User user, BindingResult result) {
		if (result.hasErrors()) {
			return "form/registration";
		}
		userService.save(user);
        securityService.autologin(user.getUsername(), user.getPasswordConfirm());
		return "redirect:";
	}

	@GetMapping("/login")
	public String login(Model model, String error, String logout) {
		if (error != null)
            model.addAttribute("error", "Złe hasło lub username.");

        if (logout != null)
            model.addAttribute("message", "Wylogowanie zakończone sukcesem.");
		
		return "form/login";
	}

	@PostMapping("/login")
	public String postLogin(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpSession sess) {
		User user = getUser(username);
		if (user != null && BCrypt.checkpw(password, user.getPassword())) {
			sess.setAttribute("logged", true);
			return "redirect:";
		}
		sess.setAttribute("logged", false);
		String message = "";
		try {
			message = URLEncoder.encode("Błędny login lub hasło", "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return "redirect:/user/login?message=" + message;
	}

	@RequestMapping("/logout")
	private String logout(HttpSession sess) {
		sess.setAttribute("logged", false);
		return "redirect:";
	}

	private User getUser(String username) {
		User user = null;
		try {
			user = userRepository.findByUsername(username);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (user == null) {
			try {
				user = userRepository.findByEmail(username);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return user;
	}

}
