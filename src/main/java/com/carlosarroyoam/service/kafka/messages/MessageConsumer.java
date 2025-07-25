package com.carlosarroyoam.service.kafka.messages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {
  private static final Logger log = LoggerFactory.getLogger(MessageConsumer.class);
  private static final String MESSAGES_TOPIC_NAME = "com.carlosarroyoam.kafka.messages";

  @KafkaListener(topics = { MESSAGES_TOPIC_NAME }, groupId = "com.carlosarroyoam.kafka.messages.consumer")
  public void consume(Message message) {
    log.info("Received message: {}", message);
  }
}
