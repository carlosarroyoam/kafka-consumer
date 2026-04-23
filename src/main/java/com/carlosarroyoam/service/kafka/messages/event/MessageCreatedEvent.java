package com.carlosarroyoam.service.kafka.messages.event;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageCreatedEvent {
  private Integer id;
  private String content;
}
