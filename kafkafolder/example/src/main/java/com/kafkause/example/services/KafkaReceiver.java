package com.kafkause.example.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaReceiver {

	private final Logger logger = LoggerFactory.getLogger(KafkaReceiver.class);

	@KafkaListener(topics = "TOPIC", groupId = "group-id")
	public void consume(String message) {
		logger.info(String.format("Consumed message -> %s", message));
	}
}
