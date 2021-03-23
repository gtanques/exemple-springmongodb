package com.springmongodb.exemplemongodb.services;

import java.util.List;
import java.util.Optional;

import com.springmongodb.exemplemongodb.entities.User;
import com.springmongodb.exemplemongodb.repository.UserRepository;
import com.springmongodb.exemplemongodb.services.exceptions.NotFoundObj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id){
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new NotFoundObj("Objeto não encontrado!"));
    }
}
