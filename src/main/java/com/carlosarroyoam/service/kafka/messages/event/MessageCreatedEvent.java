package com.carlosarroyoam.service.kafka.messages.event;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MessageCreatedEvent {
  private Integer id;
  private String content;
}
