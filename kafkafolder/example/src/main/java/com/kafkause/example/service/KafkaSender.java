package com.kafkause.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	final static String kafkaTopic = "TOPIC";

	public void send(String message) {
		kafkaTemplate.send(kafkaTopic, message);
	}

}
