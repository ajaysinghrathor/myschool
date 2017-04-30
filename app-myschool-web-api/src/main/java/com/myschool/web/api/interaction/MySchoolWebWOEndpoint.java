package com.myschool.web.api.interaction;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

import io.swagger.annotations.Api;

@Component
@Path("/wo")
@Api
public class MySchoolWebWOEndpoint {

	@GET
	@Path("/health")
	public String health() {
		return "I am fine...!";		
	}
}
