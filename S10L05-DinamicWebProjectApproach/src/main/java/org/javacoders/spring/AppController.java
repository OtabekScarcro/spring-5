package org.javacoders.spring;

import org.javacoders.spring.DAO.AppDAOImpl;
import org.javacoders.spring.model.User;
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
		System.out.println(users);
		return model;
	}
	
}
