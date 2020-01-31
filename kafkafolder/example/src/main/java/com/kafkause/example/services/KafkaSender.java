package com.kafkause.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	private static final String TOPIC = "TOPIC";

	public void send(String message) {
		kafkaTemplate.send(TOPIC, message);
	}

}
