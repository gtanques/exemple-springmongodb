package com.springmongodb.exemplemongodb.services;

import java.util.List;
import java.util.Optional;

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

    public User findById(String id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new NotFoundObj("Objeto não encontrado!"));
    }

    public User insert(User obj) {
        return repository.insert(obj);
    }

    public User fromDto(UserDTO dto) {
        return new User(dto.getId(), dto.getName(), dto.getEmail());
    }

    public User update(User obj) {
        User newObj = findById(obj.getId());
        updateData(newObj, obj);
        return repository.save(newObj);
    }

    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }

    public void delete(String id) {
        User obj = findById(id);
        repository.delete(obj);
    }

}
