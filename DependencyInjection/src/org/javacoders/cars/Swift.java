package org.javacoders.cars;

import org.javacoders.interfaces.Car;
import org.springframework.stereotype.Component;

@Component
public class Swift implements Car {

	@Override
	public String specs() {
		return "Hatchback from Suzuki";
	}

}
