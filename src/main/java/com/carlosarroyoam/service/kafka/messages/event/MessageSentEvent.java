package com.carlosarroyoam.service.kafka.messages.event;

import lombok.Data;

@Data
public class MessageSentEvent {
  private Integer id;
  private String content;
}
