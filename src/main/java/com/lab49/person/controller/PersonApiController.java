package com.lab49.person.controller;

import com.lab49.person.model.PatchPersonByIdRequest;
import com.lab49.person.model.Person;
import com.lab49.person.model.PostPersonRequest;
import com.lab49.person.ports.primary.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonApiController implements PersonApi {

    @Autowired
    private IPersonService personService;

    @Override
    public ResponseEntity<Person> deletePersonById(Integer personId) {
        return PersonApi.super.deletePersonById(personId);
    }

    @Override
    public ResponseEntity<Person> getPersonById(Integer personId) {
        return PersonApi.super.getPersonById(personId);
    }

    @Override
    public ResponseEntity<Person> patchPersonById(Integer personId, PatchPersonByIdRequest patchPersonByIdRequest) {
        return PersonApi.super.patchPersonById(personId, patchPersonByIdRequest);
    }

    @Override
    public ResponseEntity<Person> postPerson(PostPersonRequest postPersonRequest) {
        return personService.postPerson(postPersonRequest);
    }
}
