/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.lab49.person.controller;

import com.lab49.person.model.PatchPersonByIdRequest;
import com.lab49.person.model.Person;
import com.lab49.person.model.PostPersonRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.openapitools.api.ApiUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-05T20:36:04.608358300+05:30[Asia/Calcutta]")
@Validated
@Tag(name = "person", description = "the person API")
public interface PersonApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /person/{personId} : Delete Person Info by Person ID
     * Delete the information of the person with the matching person ID.
     *
     * @param personId Id of an existing person. (required)
     * @return Person Deleted (status code 200)
     * or Person Not Found (status code 404)
     */
    @Operation(
            operationId = "deletePersonById",
            summary = "Delete Person Info by Person ID",
            description = "Delete the information of the person with the matching person ID.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Person Deleted", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = Person.class))
                    }),
                    @ApiResponse(responseCode = "404", description = "Person Not Found")
            }
    )
    @RequestMapping(
            method = RequestMethod.DELETE,
            value = "/person/{personId}",
            produces = {"application/json"}
    )

    default ResponseEntity<Person> deletePersonById(
            @Parameter(name = "personId", description = "Id of an existing person.", required = true, in = ParameterIn.PATH) @PathVariable("personId") Integer personId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"emailVerified\" : true, \"dateOfBirth\" : \"1997-10-31T00:00:00.000+00:00\", \"id\" : 0, \"email\" : \"email\", \"createDate\" : \"2000-01-23\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /person/{personId} : Get Person Info by Person ID
     * Retrieve the information of the person with the matching person ID.
     *
     * @param personId Id of an existing person. (required)
     * @return Person Found (status code 200)
     * or Person Not Found (status code 404)
     */
    @Operation(
            operationId = "getPersonById",
            summary = "Get Person Info by Person ID",
            description = "Retrieve the information of the person with the matching person ID.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Person Found", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = Person.class))
                    }),
                    @ApiResponse(responseCode = "404", description = "Person Not Found")
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/person/{personId}",
            produces = {"application/json"}
    )

    default ResponseEntity<Person> getPersonById(
            @Parameter(name = "personId", description = "Id of an existing person.", required = true, in = ParameterIn.PATH) @PathVariable("personId") Integer personId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"emailVerified\" : true, \"dateOfBirth\" : \"1997-10-31T00:00:00.000+00:00\", \"id\" : 0, \"email\" : \"email\", \"createDate\" : \"2000-01-23\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH /person/{personId} : Update Person Information
     * Update the information of an existing person.
     *
     * @param personId               Id of an existing person. (required)
     * @param patchPersonByIdRequest Patch person properties to update. (optional)
     * @return Person Updated (status code 200)
     * or Person Not Found (status code 404)
     * or Email Already Taken (status code 409)
     */
    @Operation(
            operationId = "patchPersonById",
            summary = "Update Person Information",
            description = "Update the information of an existing person.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Person Updated", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = Person.class))
                    }),
                    @ApiResponse(responseCode = "404", description = "Person Not Found"),
                    @ApiResponse(responseCode = "409", description = "Email Already Taken")
            }
    )
    @RequestMapping(
            method = RequestMethod.PATCH,
            value = "/person/{personId}",
            produces = {"application/json"},
            consumes = {"application/json"}
    )

    default ResponseEntity<Person> patchPersonById(
            @Parameter(name = "personId", description = "Id of an existing person.", required = true, in = ParameterIn.PATH) @PathVariable("personId") Integer personId,
            @Parameter(name = "PatchPersonByIdRequest", description = "Patch person properties to update.") @Valid @RequestBody(required = false) PatchPersonByIdRequest patchPersonByIdRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"emailVerified\" : true, \"dateOfBirth\" : \"1997-10-31T00:00:00.000+00:00\", \"id\" : 0, \"email\" : \"email\", \"createDate\" : \"2000-01-23\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /person : Create New Person
     * Create a new person.
     *
     * @param postPersonRequest Post the necessary fields for the API to create a new person. (optional)
     * @return Person Created (status code 200)
     * or Missing Required Information (status code 400)
     * or Email Already Taken (status code 409)
     */
    @Operation(
            operationId = "postPerson",
            summary = "Create New Person",
            description = "Create a new person.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Person Created", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = Person.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Missing Required Information"),
                    @ApiResponse(responseCode = "409", description = "Email Already Taken")
            }
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/person",
            produces = {"application/json"},
            consumes = {"application/json"}
    )

    default ResponseEntity<Person> postPerson(
            @Parameter(name = "PostPersonRequest", description = "Post the necessary fields for the API to create a new person.") @Valid @RequestBody(required = false) PostPersonRequest postPersonRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"emailVerified\" : true, \"dateOfBirth\" : \"1997-10-31T00:00:00.000+00:00\", \"id\" : 0, \"email\" : \"email\", \"createDate\" : \"2000-01-23\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
