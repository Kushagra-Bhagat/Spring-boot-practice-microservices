package com.kushagra.rest.restful_web_services.users;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("user_name")
    private String name;

    @Past(message = "Birthdate should be in the past")
    @JsonProperty("Birthdate")
    private LocalDateTime dob;
}
