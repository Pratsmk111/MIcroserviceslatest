package com.example.identityservice.IdentityService.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.identityservice.IdentityService.Entity.UserCredential;

public interface UserCredentialsRepository extends MongoRepository<UserCredential, Integer>{

	Optional<UserCredential> findByName(String username);

}
