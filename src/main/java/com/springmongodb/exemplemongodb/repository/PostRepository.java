package com.springmongodb.exemplemongodb.repository;

import com.springmongodb.exemplemongodb.entities.Post;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
    
}
