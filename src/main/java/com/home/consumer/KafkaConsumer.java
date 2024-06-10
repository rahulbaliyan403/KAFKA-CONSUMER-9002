package com.home.consumer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = "topic_demo", groupId = "your-consumer-group-id")
    public void consumeMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
