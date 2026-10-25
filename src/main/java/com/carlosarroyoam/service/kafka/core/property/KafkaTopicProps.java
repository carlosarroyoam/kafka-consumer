package com.carlosarroyoam.service.kafka.core.property;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component("kafkaTopics")
@ConfigurationProperties(prefix = "app.kafka.topics")
@Validated
@Getter
@Setter
public class KafkaTopicProps {
  @NotBlank(message = "app.kafka.topics.message-created must not be empty")
  private String messageCreated;
}
