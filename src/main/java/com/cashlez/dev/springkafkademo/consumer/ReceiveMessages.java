package com.cashlez.dev.springkafkademo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveMessages {

    @KafkaListener(topics = "simple-messages", group = "test-consumer-group")
    public void listen(String message) {
        System.out.println("Received Messasge in group foo: " + message);
    }
}
