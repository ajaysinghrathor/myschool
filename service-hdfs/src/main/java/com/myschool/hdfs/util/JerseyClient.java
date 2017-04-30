package com.myschool.hdfs.util;


import java.io.FileNotFoundException;
import java.io.IOException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.glassfish.jersey.client.ClientConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class JerseyClient {
	private static final Logger log = LoggerFactory.getLogger(JerseyClient.class);

	public static void main(String[] args) throws Exception {
		ClientConfig clientConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(clientConfig);
		WebTarget webTarget = client.target("http://master:50070/webhdfs/v1/tmp?user.name=hduser&op=GETFILESTATUS");
		Invocation.Builder invocationBuilder =
				webTarget.request(MediaType.APPLICATION_JSON_TYPE);
		Response response = invocationBuilder.get();
		System.out.println(response.getStatus());
		System.out.println(response.readEntity(String.class));
	
	}

	private static void invokeHdfs() throws IOException, FileNotFoundException {
		Configuration conf = new Configuration();
		conf.set("fs.defaultFS","hdfs://master:50070");
		FileSystem fs = FileSystem.get(conf);
		
		FileStatus[] fsStatus = fs.listStatus(new Path("/"));
		for(int i = 0; i < fsStatus.length; i++){
		   System.out.println(fsStatus[i].getPath().toString());
		}
	}
	

}
