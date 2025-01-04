package com.kushagra.rest.restful_web_services.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SomeBean {
    private String field1;
    // Static filtering -
    @JsonIgnore
    private String field2;
    private String field3;
}
