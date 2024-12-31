package com.kushagra.rest.restful_web_services.users;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private LocalDateTime dob;
}
