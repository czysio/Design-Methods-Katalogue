package krzysiek.olejnik.katalogue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import krzysiek.olejnik.katalogue.model.DesignMethod;

@Controller
@RequestMapping("/icon")
public class IconController {
	
	
	@GetMapping("/form")
	public String newIcon(Model model) {
		model.addAttribute("icon", new DesignMethod());
		return "form/iconform";
	}

}
