package com.myschool.hdfs.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.myschool.hdfs.interaction.HttpHdfsEndpoint;
import com.myschool.hdfs.interaction.WebHdfsEndpoint;


import io.swagger.jaxrs.config.BeanConfig;

@Component
@ApplicationPath("/hdfs")
public class JeresyConfig extends ResourceConfig{
	
	public JeresyConfig() {
		registerEndpoints();
		//TODO:configureSwagger();
	}
	
	private void registerEndpoints() {
		register(WebHdfsEndpoint.class);
		register(HttpHdfsEndpoint.class);
	}
	
	private void configureSwagger() {
		//register(MySchoolWebROEndpoint.class);
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
