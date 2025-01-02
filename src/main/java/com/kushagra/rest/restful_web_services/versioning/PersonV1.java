package com.kushagra.rest.restful_web_services.versioning;

import lombok.Getter;

@Getter
public class PersonV1 {

    private String name;
    public PersonV1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonV1{" +
                "name='" + name + '\'' +
                '}';
    }
}
