package org.javacoders;

import org.javacoders.spring.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.validation.Valid;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String home(ModelMap map) {
		ModelAndView modelAndView = new ModelAndView("userFormView");
		User user = new User();
		map.addAttribute("user", user);
		return "userFormView";
	}
	
	@PostMapping("/displayUserInfo")
	// @ModelAttribute is optional
	public ModelAndView displayUserInfo(@ModelAttribute("user") @Valid User user, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("displayUserInfo");
		modelAndView.addObject("user", user);
		if(result.hasErrors()) {
			ModelAndView repopulatingModelAndView = new ModelAndView("userFormView");
			repopulatingModelAndView.addObject("user", user);
			System.out.println("Has Error!!!");
			return repopulatingModelAndView;
		} else {
			System.out.println("All good!");
			return modelAndView;
		}
	}
}













