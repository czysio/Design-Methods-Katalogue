package krzysiek.olejnik.katalogue.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import krzysiek.olejnik.katalogue.model.DesignMethod;
import krzysiek.olejnik.katalogue.repository.DesignMethodRepository;
import krzysiek.olejnik.katalogue.utilities.TablesForSelectsInForms;

@Controller
@RequestMapping("/icon")
public class IconController {
	
	@Autowired
	DesignMethodRepository designMethodRepository;
	@Autowired
	TablesForSelectsInForms tablesForSelectsInForms;
	
	@GetMapping("/form")
	public String newIcon(Model model) {
		model.addAttribute("icon", new DesignMethod());
		return "form/iconform";
	}
	
	@PostMapping("/form")
	public String postNewIcon(@Valid DesignMethod designMethod, BindingResult result) {
		if(result.hasErrors()) {
			return "form/iconform";
		}
		designMethodRepository.save(designMethod);
		return "redirect:";
	}
	
	@ModelAttribute("stages")
	public String[] stages() {
		return tablesForSelectsInForms.getStages();
	}
	
	@ModelAttribute("numberofparticipants")
	public String[] numberOfParticipants() {
		return tablesForSelectsInForms.getNumberOfParticipants();
	}
}
