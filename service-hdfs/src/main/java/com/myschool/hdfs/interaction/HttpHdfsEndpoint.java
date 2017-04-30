package com.myschool.hdfs.interaction;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

@Component
@Path("/http")
public class HttpHdfsEndpoint {

	@GET
	@Path("/health")
	public String health() {
		return "I am fine...!";		
	}
}
