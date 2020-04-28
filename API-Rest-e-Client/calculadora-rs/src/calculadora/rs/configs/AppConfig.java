package calculadora.rs.configs;

import org.glassfish.jersey.server.ResourceConfig;

import calculadora.rs.controllers.Controller;

public class AppConfig extends ResourceConfig{
	public AppConfig() {
		register(Controller.class);
	}
}