package com.kushagra.rest.restful_web_services.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public SomeBean filteringExample() {
        return new SomeBean("Field 1", "Field 2", "Field 3");
    }
}
