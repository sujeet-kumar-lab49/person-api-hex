package com.lab49.person.domain.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lab49.person.model.Person;
import com.lab49.person.model.PostPersonRequest;
import com.lab49.person.ports.primary.IPersonService;
import com.lab49.person.ports.secondary.IKafkaLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements IPersonService {

    @Autowired
    private IKafkaLogger loggerStream;

    private ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Override
    public ResponseEntity<Person> postPerson(PostPersonRequest postPersonRequest) {
        try {
            loggerStream.log("Person-API", "Create Person Request: " + OBJECT_MAPPER.writeValueAsString(postPersonRequest));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return IPersonService.super.postPerson(postPersonRequest);
    }

    @Override
    public ResponseEntity<Person> deletePersonById(Integer personId) {
        return IPersonService.super.deletePersonById(personId);
    }

    @Override
    public ResponseEntity<Person> getPersonById(Integer personId) {
        return IPersonService.super.getPersonById(personId);
    }
}
