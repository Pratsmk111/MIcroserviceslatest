package com.user.service.Userservice.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.user.service.Userservice.Entities.User;

public interface UserRepository extends MongoRepository<User, String> {

}
