package pl.krzysiek.olejnik.dmkatalogue.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import pl.krzysiek.olejnik.dmkatalogue.model.DesignMethod;
import pl.krzysiek.olejnik.dmkatalogue.repository.DesignMethodRepository;
import pl.krzysiek.olejnik.dmkatalogue.utility.StorageFileNotFoundException;
import pl.krzysiek.olejnik.dmkatalogue.utility.StorageService;

@Controller
@RequestMapping("/method")
public class MethodController {
	
	@Autowired
	private StorageService storageService;

	@Autowired
	public void FileUploadController(StorageService storageService) {
		this.storageService = storageService;
	}

	@Autowired
	DesignMethodRepository designMethodRepository;

	@GetMapping("/form")
	public String newIcon(Model model) {
		model.addAttribute("designMethod", new DesignMethod());
		return "form/iconform";
	}

	@PostMapping("/form")
	public String postNewIcon(@Valid DesignMethod designMethod, BindingResult result,
			@RequestParam("icon") MultipartFile icon, RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			return "form/iconform";
		}
		storageService.store(icon);
		designMethod.setIcon(icon.getOriginalFilename());
		designMethodRepository.save(designMethod);
		return "redirect:";
	}

	@ModelAttribute("stages")
	public List<String> stages() {
		String[] stages = { "empatyzacja i zrozumienie", "obserwacja", "definiowanie problemu", "generowanie pomysłów",
				"budowanie prototypów", "testowanie", "implementowanie/wdrażanie", "podsumowanie i feedback" };
		return Arrays.asList(stages);
	}

	@ModelAttribute("numberOfParticipants")
	public List<String> numberOfParticipants() {
		String[] numberOfParticipants = { "1", "2", "3-5", "6-12", "13+" };
		return Arrays.asList(numberOfParticipants);
	}

	@ExceptionHandler(StorageFileNotFoundException.class)
	public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
		return ResponseEntity.notFound().build();
	}
}
