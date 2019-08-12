package com.training.mongoDb.repository;

import org.springframework.stereotype.Repository;
import com.training.mongoDb.model.users;
import org.springframework.data.mongodb.repository.MongoRepository;


@Repository
public interface userRepository extends MongoRepository<users, String> {

}
