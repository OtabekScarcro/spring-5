package org.javacoders.specs;

import org.javacoders.interfaces.Engine;

public class EngineType implements Engine{

	String type;
	
	public EngineType() {
		type = "unknown";
	}
	
	public EngineType(String type){
		this.type = type;
	}
	
	@Override
	public String type() {
		return type;
	}

}
