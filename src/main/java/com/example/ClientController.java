package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	@Value("${region}") String regionVal;
	@Value("${url}") String urlVal;
	
	@RequestMapping("/region")
	public String getConfig(){
		return "It belongs to "+regionVal +"-" + urlVal;
	}
}
