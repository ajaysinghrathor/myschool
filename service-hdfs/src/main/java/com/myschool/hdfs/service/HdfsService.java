package com.myschool.hdfs.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HdfsService {

	@RequestMapping("/health")
	public String health() {
		return "I am fine...!";
	}
}
