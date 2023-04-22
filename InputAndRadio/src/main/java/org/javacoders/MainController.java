package org.javacoders;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "hello";
	}

	@GetMapping("displayname")
	public ModelAndView displayName(@RequestParam("firstName") String firstName) {
		ModelAndView modelandview = new ModelAndView("displayName");
		
		Date date = new Date();
		
		List<String> users = new ArrayList<>();
		users.add("Otabek");
		users.add("Asrorbek");
		users.add("Javohir");
		users.add("Ilhombek");
		users.add("Diyorbek");
		
		modelandview.addObject("users", users);
		modelandview.addObject("date", date);
		modelandview.addObject("name", firstName);
		return modelandview;
	}
}
