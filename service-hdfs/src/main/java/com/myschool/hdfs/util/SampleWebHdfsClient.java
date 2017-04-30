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

import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleWebHdfsClient {
	private static final String WEBHDFS_MASTER_50070 = "webhdfs://master:50070";
	private static final String MASTER_WEBHDFS_URL_GETFILESTATUS = "http://master:50070/webhdfs/v1/tmp?user.name=hduser&op=GETFILESTATUS";
	private static final Logger log = LoggerFactory.getLogger(SampleWebHdfsClient.class);

	public static void main(String[] args) throws Throwable {
		sampleWebHdfsJerseyClient();
		sampleWebHdfsClient();
	}

	private static void sampleWebHdfsJerseyClient() throws Throwable {
		ClientConfig clientConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(clientConfig);
		WebTarget webTarget = client.target(MASTER_WEBHDFS_URL_GETFILESTATUS);
		Invocation.Builder invocationBuilder =
				webTarget.request(MediaType.APPLICATION_JSON_TYPE);
		Response response = invocationBuilder.get();

		ObjectMapper mapper = new ObjectMapper();
		
		com.myschool.hdfs.adapter.model.FileStatus fileStatus = response.readEntity(com.myschool.hdfs.adapter.model.FileStatus.class);
		
		log.info(mapper.writeValueAsString(fileStatus));
	}

	private static void sampleWebHdfsClient() throws IOException, FileNotFoundException {
		Configuration conf = new Configuration();
		conf.set("fs.defaultFS", WEBHDFS_MASTER_50070);
		FileSystem fs = FileSystem.get(conf);
		
		FileStatus[] fsStatus = fs.listStatus(new Path("/"));
		for(int i = 0; i < fsStatus.length; i++){
			log.info(fsStatus[i].getPath().toString());
		}
	}
}
