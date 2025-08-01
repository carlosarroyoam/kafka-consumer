package com.carlosarroyoam.service.kafka.messages;

import com.carlosarroyoam.service.kafka.config.KafkaConsumerConfig;
import com.carlosarroyoam.service.kafka.messages.event.MessageCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {
  private static final Logger log = LoggerFactory.getLogger(MessageConsumer.class);

  @KafkaListener(topics = {
      KafkaConsumerConfig.MESSAGES_CREATED_TOPIC_NAME }, groupId = "com.carlosarroyoam.kafka.messages.created.consumer")
  public void consume(MessageCreatedEvent event) {
    log.info("Received message: {}", event);
  }
}
