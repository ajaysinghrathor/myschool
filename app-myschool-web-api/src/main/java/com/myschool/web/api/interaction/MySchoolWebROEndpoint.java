package com.myschool.web.api.interaction;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

import io.swagger.annotations.Api;

@Component
@Path("/ro")
@Api
public class MySchoolWebROEndpoint {

	@GET
	@Path("/health")
	public String health() {
		return "I am fine...!";		
	}
}
