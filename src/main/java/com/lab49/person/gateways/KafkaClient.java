package com.lab49.person.gateways;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.clients.producer.RoundRobinPartitioner;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class KafkaClient {

    private final Properties properties;
    private final KafkaProducer<String, String> producer;

    public KafkaClient(String bootstrapServer) {
        this.properties = new Properties();
        properties.setProperty("bootstrap.servers", bootstrapServer);
        properties.setProperty("key.serializer", StringSerializer.class.getName());
        properties.setProperty("value.serializer", StringSerializer.class.getName());
        properties.setProperty("partitioner.class", RoundRobinPartitioner.class.getName());

        producer = new KafkaProducer<>(properties);
    }

    public void send(String topic, String key, String value) {
        ProducerRecord<String, String> producerRecord =
                new ProducerRecord<>(topic, key, value);
        try {
            RecordMetadata result= producer.send(producerRecord).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        producer.flush();
    }

    public void closeProducer() {
        producer.close();
    }
}
