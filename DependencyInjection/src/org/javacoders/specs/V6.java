package org.javacoders.specs;

import org.javacoders.interfaces.Engine;
import org.springframework.stereotype.Component;

@Component("V6Engine")
public class V6 implements Engine {

	@Override
	public String type() {
		return "V6 engine";
	}

}
