package com.lab49.person.ports.primary;

import com.lab49.person.model.PatchPersonByIdRequest;
import com.lab49.person.model.Person;
import com.lab49.person.model.PostPersonRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

public interface IPersonService {
    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    default ResponseEntity<Person> deletePersonById(Integer personId ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    default ResponseEntity<Person> getPersonById(Integer personId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    default ResponseEntity<Person> patchPersonById(Integer personId, PatchPersonByIdRequest patchPersonByIdRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    default ResponseEntity<Person> postPerson(PostPersonRequest postPersonRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
