package com.myschool.gui.api.interaction;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySchoolGateway {

	@RequestMapping("/health")
	public String health() {
		return "I am fine...!";
	}

}
