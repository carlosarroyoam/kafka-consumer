package com.carlosarroyoam.service.kafka.core.config;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("kafkaTopics")
@ConfigurationProperties(prefix = "app.kafka.topics")
@Getter
@Setter
public class KafkaTopicProps {
  @NotNull(message = "app.kafka.topics.message-created must not be null")
  private String messageCreated;
}
