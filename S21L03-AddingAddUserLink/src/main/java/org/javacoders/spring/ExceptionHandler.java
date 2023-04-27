package org.javacoders.spring;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {
	
	/**
	 * if some kind of exception is appeared in the project
	 * this method will be executed
	 * @param ex
	 * @return
	 */
	
	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public String exceptionHandler(Exception ex) {
		return "error";
	}
}
