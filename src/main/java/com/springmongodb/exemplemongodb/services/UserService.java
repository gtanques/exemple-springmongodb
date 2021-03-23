package com.springmongodb.exemplemongodb.services;

import java.util.List;

import com.springmongodb.exemplemongodb.entities.User;
import com.springmongodb.exemplemongodb.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
}
