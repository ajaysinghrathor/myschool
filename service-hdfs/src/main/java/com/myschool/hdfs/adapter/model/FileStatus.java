package com.myschool.hdfs.adapter.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FileStatus {
	@JsonProperty("FileStatus")
	private FileStatusProperties fileStatus;
	
	@JsonProperty("FileStatus")
	public FileStatusProperties getFileStatus() {
		return fileStatus;
	}

	@JsonProperty("FileStatus")
	public void setFileStatus(FileStatusProperties fileStatus) {
		this.fileStatus = fileStatus;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FileStatus [fileStatus=").append(fileStatus).append("]");
		return builder.toString();
	}
}
