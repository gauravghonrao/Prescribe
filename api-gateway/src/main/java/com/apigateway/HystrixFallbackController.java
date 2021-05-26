package com.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixFallbackController {

	@GetMapping("/userServiceFallBackMethod")
	public String userServiceFallBackMethod() {
		return "User Service Not Available";
	}
	
	@GetMapping("/documentServiceFallBackMethod")
	public String documentServiceFallBackMethod() {
		return "Document Service Not Available";
	}
}
