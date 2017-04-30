package com.myschool.hdfs.interaction;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path("/web")
public class WebHdfsEndpoint {

	@GET
	@Path("/health")
	@Produces(MediaType.APPLICATION_JSON)
	public String health() {
		return "I am fine...!";		
	}
}
