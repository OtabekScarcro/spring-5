package org.javacoders;

import org.javacoders.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean("myCorolla", Car.class);
		System.out.println(myCar.specs());
		context.close();
	}

}
