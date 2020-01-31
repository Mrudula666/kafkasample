package com.kafkause.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafkause.example.services.KafkaSender;

@RestController
@RequestMapping(value = "/kafka-sample/")
public class KafkaController {

	@Autowired
	KafkaSender kafkaSender;

	@GetMapping(value = "/producer")
	public String producer(@RequestBody String message) {
		kafkaSender.send(message);

		return "Message sent to the Kafka Topic TOPIC Successfully";
	}

}
