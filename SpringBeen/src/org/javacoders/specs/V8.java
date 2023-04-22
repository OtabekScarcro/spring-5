package org.javacoders.specs;

import org.javacoders.interfaces.Engine;
import org.springframework.stereotype.Component;

@Component
public class V8 implements Engine{

	@Override
	public String type() {
		return "V8 engine";
	}

}
