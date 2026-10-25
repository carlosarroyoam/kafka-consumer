package com.carlosarroyoam.service.kafka.messages;

import com.carlosarroyoam.service.kafka.messages.event.MessageCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {
  private static final Logger log = LoggerFactory.getLogger(MessageConsumer.class);

  @KafkaListener(topics = {"#{@kafkaTopics.messageCreated}"})
  public void consume(MessageCreatedEvent event) {
    log.info("Received message: {}", event);
  }
}
