package org.javacoders.spring;

import org.javacoders.spring.DAO.AppDAOImpl;
import org.javacoders.spring.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/org/javacoders/spring/DAO/Spring-AppDAOConfig.xml");
		AppDAOImpl dao = context.getBean("DAOBean", AppDAOImpl.class);
		users = dao.listUsers();
		model.addObject("users", users);
		return model;
	}
	
}
