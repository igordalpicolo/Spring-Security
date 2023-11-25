package dio.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping
	public String welcome() {
		return "Welcome to my Sptring Boot API";
	}
	
	@GetMapping("/users")
	public String users() {
		return "Authorized user";
	}
	
	@GetMapping("/managers")
	public String managers() {
		return "Authorized manager";
	}
	
}
