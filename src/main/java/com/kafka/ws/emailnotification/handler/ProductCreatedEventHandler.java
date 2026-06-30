package com.kafka.ws.emailnotification.handler;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ProductCreatedEventHandler {

    @KafkaListener(topics = "product-created-event-topic")
    public void handle() {

    }
}
