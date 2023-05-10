package org.javacoders.store;

import org.javacoders.model.Devices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.client.RestTemplate;

@Controller
public class Store {
	private String result;
	private ModelAndView modelAndView;
	
	private RestTemplate restTemplete = new RestTemplate();
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("{brandName}")
	public ModelAndView samsung(@PathVariable("brandName") String brandName) {
		
		modelAndView = new ModelAndView("viewDevices");
		switch(brandName.toLowerCase()) {
		case "samsung":{
			result = restTemplete.getForObject("http://localhost:8082/samsung/devices", String.class);
			modelAndView.addObject("devices", result);
			return modelAndView;
		}
		
		case "apple":{
			result = restTemplete.getForObject("http://localhost:8081/apple/devices", String.class);
			modelAndView.addObject("devices", result);
			return modelAndView;
		}
		default:{
			return new ModelAndView("redirect: /error");
		}
		}
	}
}