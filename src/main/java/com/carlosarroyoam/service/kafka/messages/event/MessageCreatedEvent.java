package com.carlosarroyoam.service.kafka.messages.event;

import lombok.Data;

@Data
public class MessageCreatedEvent {
  private Integer id;
  private String content;
}
