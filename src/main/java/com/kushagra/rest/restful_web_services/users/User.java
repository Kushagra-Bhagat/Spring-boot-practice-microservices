package com.kushagra.rest.restful_web_services.users;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class User {
    private int id;

    @Size(min = 2, message = "Name should have at least two characters")
    private String name;

    @Past(message = "Birthdate should be in the past")
    private LocalDateTime dob;
}
