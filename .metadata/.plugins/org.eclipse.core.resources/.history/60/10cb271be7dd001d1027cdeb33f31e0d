package org.javacoders;

import javax.xml.catalog.Catalog;

import org.javacoders.cars.Corolla;
import org.javacoders.cars.Swift;
import org.javacoders.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
//		Car myCar = new Swift();
//		System.out.println(myCar);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean("corolla", Car.class);
		System.out.println(myCar.specs());
		context.close();
	}

}
