package org.javacoders.spring;

import org.javacoders.spring.DAO.AppDAOImpl;
import org.javacoders.spring.config.AppConfig;
import org.javacoders.spring.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class AppController {
	
	@RequestMapping("/")
	public ModelAndView homepage() {
		ModelAndView model = new ModelAndView("index");
		List<User> users = new ArrayList<User>();
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AppDAOImpl dao = context.getBean("DAOBean", AppDAOImpl.class);
		users = dao.listUsers();
		model.addObject("users", users);
		return model;
	}
	
}
