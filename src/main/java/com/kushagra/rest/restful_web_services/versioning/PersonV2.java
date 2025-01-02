package com.kushagra.rest.restful_web_services.versioning;

import lombok.Data;

@Data
public class PersonV2 {

    Name name;
    public PersonV2(Name name) {
        this.name = name;
    }
}
