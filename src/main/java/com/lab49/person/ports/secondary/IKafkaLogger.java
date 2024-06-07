package com.lab49.person.ports.secondary;

public interface IKafkaLogger {


    void log(String appId, String message);

}
