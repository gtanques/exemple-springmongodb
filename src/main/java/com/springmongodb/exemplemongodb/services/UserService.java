package com.springmongodb.exemplemongodb.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.springmongodb.exemplemongodb.dto.UserDTO;
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

    @Transactional
    public User insert(User obj){
        return repository.insert(obj);
    }

    public User fromDto(UserDTO dto){
        return  new User(dto.getId(), dto.getName(), dto.getEmail());
    }

}
