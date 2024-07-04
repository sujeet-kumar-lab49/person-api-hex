package com.lab49.person.gateways.kafka;

import com.lab49.person.ports.secondary.IKafkaLogger;
import org.springframework.stereotype.Service;

@Service
public class KafkaLogger implements IKafkaLogger {
    @Override
    public void log(String appId, String message) {
        System.out.println("kafkaLogger log() method called");
        KafkaClient kafkaClient = new KafkaClient("127.0.0.1:9092");
        kafkaClient.send("person-api", appId, message);
    }
}
