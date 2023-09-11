package com.example.identityservice.IdentityService.Entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

import lombok.Data;

@Data
@Document(collection = "userdata")
public class UserCredential {

    @Id
    private String id = UUID.randomUUID().toString();

    private String name;
    private String email;
    private String password;
}
