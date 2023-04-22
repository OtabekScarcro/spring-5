package org.javacoders.cars;

import org.javacoders.interfaces.Car;
import org.javacoders.interfaces.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Corolla implements Car {

	// automatically creating implementation
	// class for Engine interface
	// by giving implementation class name
	// @Autowired
	// Engine V6Engine;
	
	/*
	 * Or
	 * we can choose implementation class
	 * by @Qualifier
	 */
	 @Autowired
	 @Qualifier("engineType")
	 Engine engine;

	@Override
	public String specs() {
		return "Sedan from Tayota with engine type as "+engine.type();
	}

}
