package com.kushagra.rest.restful_web_services.versioning;

import lombok.Data;

@Data
public class Name {

    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
