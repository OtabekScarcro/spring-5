package org.javacoders.store;

import org.springframework.web.bind.annotation.RequestMapping;

public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {
	
	public String getErrorPath() {
		System.out.println("Hello error");
		return "/error";
	}
	
	@RequestMapping("/error")
	public String error() {
		System.out.println("Hello error 2");
		return "error";
	}
}
