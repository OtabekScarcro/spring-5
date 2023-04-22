package org.javacoders.cars;

import org.javacoders.interfaces.Car;
import org.javacoders.interfaces.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Corolla implements Car {

	// automatically creating implementation
	// class for Engine interface
	// by giving implementation class name
	@Autowired
	Engine V6Engine;
	
	/*
	 * Or
	 * we can choose implementation class
	 * by @Qualifier
	 * 
	 *  @Autowired
	 *  @Qualifier("V6Engine")
	 *  Engine v6
	 */

	@Override
	public String specs() {
		return "Sedan from Tayota with engine type as "+V6Engine.type();
	}

}
