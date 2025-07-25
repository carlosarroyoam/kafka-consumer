package com.carlosarroyoam.service.kafka.messages;

import lombok.Data;

@Data
public class Message {
  private Integer id;
  private String content;
}
