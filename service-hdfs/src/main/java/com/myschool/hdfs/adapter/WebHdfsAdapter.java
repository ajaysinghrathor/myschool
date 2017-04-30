package com.myschool.hdfs.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.myschool.hdfs.adapter.model.FileStatus;


public class WebHdfsAdapter {

	private static final Logger log = LoggerFactory.getLogger(WebHdfsAdapter.class);
	private static final RestTemplate restTemplate = new RestTemplate();
	
	public static void main(String args[]) throws JsonProcessingException {
		WebHdfsAdapter adapter = new WebHdfsAdapter();
		adapter.getFileStatus();
		/*ObjectMapper mapper = new ObjectMapper();
		WebHdfsAdapter whdfs = new WebHdfsAdapter();
		FileStatusResponse fileStatus = restTemplate.
				getForObject("http://master:50070/webhdfs/v1/tmp?user.name=hduser&op=GETFILESTATUS",
						FileStatusResponse.class);
		log.info(fileStatus.toString());
		log.info(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(fileStatus));*/
	}
	
	public FileStatus getFileStatus() {
		FileStatus fileStatus = new FileStatus();
		String url = "http://master:50070/webhdfs/v1/tmp?user.name=hduser&op=GETFILESTATUS";
		String response = "";//JerseyClient.invokeGet(url);
		log.info(response);
		return fileStatus;
	}
	
}
