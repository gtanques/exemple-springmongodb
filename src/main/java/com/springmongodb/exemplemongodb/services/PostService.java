package com.springmongodb.exemplemongodb.services;

import com.springmongodb.exemplemongodb.repository.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    
    @Autowired
    private PostRepository repository;
}
