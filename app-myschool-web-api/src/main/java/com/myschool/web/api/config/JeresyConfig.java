package com.myschool.web.api.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.myschool.web.api.interaction.MySchoolWebROEndpoint;
import com.myschool.web.api.interaction.MySchoolWebWOEndpoint;

import io.swagger.jaxrs.config.BeanConfig;

@Component
public class JeresyConfig extends ResourceConfig{
	
	public JeresyConfig() {
		registerEndpoints();
		//TODO:configureSwagger();
	}
	
	private void registerEndpoints() {
		register(MySchoolWebROEndpoint.class);
		register(MySchoolWebWOEndpoint.class);
	}
	
	private void configureSwagger() {
		register(MySchoolWebROEndpoint.class);
		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setVersion("1.0.2");
		beanConfig.setSchemes(new String[]{"http"});
		beanConfig.setHost("localhost:1010");
		beanConfig.setBasePath("/");
		beanConfig.setResourcePackage("com.myschool.gui.api");
		beanConfig.setPrettyPrint(true);
		beanConfig.setScan(true);
	}
}
