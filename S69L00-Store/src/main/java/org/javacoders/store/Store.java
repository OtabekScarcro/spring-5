package org.javacoders.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.client.RestTemplate;

@Controller
public class Store {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/samsung")
	public ModelAndView samsung() {
		ModelAndView modelAndView = new ModelAndView("samsung");
		RestTemplate restTemplete = new RestTemplate();
		String result = restTemplete.getForObject("http://localhost:8082/samsung/devices", String.class);
		modelAndView.addObject("devices", result);
		return modelAndView;
	}
}
