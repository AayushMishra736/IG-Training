package com.jmsdemoexample.JavaMessageService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jmsdemoexample.JavaMessageService.Model.SystemMessage;

@RestController
public class PublishController {

	@Autowired
	private JmsTemplate jmstemplate;
	
	@PostMapping("/publishMessage")
	public ResponseEntity<String> publishMessage(@RequestBody SystemMessage systemMessage)
	{
	
		try {
			jmstemplate.convertAndSend("bridgingcode-queue", systemMessage);
			return new ResponseEntity<>("Sent",HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
		
	}
}
