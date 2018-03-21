package pl.krzysiek.olejnik.dmkatalogue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.krzysiek.olejnik.dmkatalogue.repository.DesignMethodRepository;
import pl.krzysiek.olejnik.dmkatalogue.utility.StorageService;

@Controller
public class HomeController {

	@Autowired
	StorageService storageSrevice;
	@Autowired
	DesignMethodRepository designMethodRepository;
	
	
	
	@RequestMapping("/")
	private String helloWorld(Model model) {
		model.addAttribute("methods", designMethodRepository.findFiveNewestMethods());
		return "homepage";
	}

	@GetMapping("/files/{filename:.+}")
	@ResponseBody
	public ResponseEntity<Resource> serveFile(@PathVariable String filename) {

		Resource file = storageSrevice.loadAsResource(filename);
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"")
				.body(file);
	}

}
