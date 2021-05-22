package com.document.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class DocumentController {

	@GetMapping("/getDoc")
	public String getDocument() {
		return "Document";
	}
}
