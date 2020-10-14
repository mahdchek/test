package fr.cyclingteam.procyclingmanager.service.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceWebController {

	
	
	@GetMapping("serviceweb2")
	public String test() {
		return "ServiceWeb2Controller";
	}
}
