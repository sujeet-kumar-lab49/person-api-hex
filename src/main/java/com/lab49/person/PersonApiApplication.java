package com.lab49.person;

import com.lab49.person.ports.secondary.IKafkaLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PersonApiApplication {

    public static void main(String[] args) {

		SpringApplication.run(PersonApiApplication.class, args);
        /*
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PersonApiApplication.class);
            IKafkaLogger kafkaLogger = context.getBean(IKafkaLogger.class);
            kafkaLogger.log(null, null);
        */
    }

}
