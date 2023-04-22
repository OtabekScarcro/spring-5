package org.javacoders;

import org.javacoders.cars.Corolla;
import org.javacoders.cars.Swift;
import org.javacoders.specs.EngineType;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.javacoders")
public class AppConfig {
	
	@Bean("myCorolla")
	public Corolla corolla() {
		return new Corolla();
	}
	
	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}
	
	@Bean("engineType")
	public EngineType engineType() {
		return new EngineType("V8 Engine");
	}
}
