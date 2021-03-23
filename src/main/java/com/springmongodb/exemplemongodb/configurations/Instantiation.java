package com.springmongodb.exemplemongodb.configurations;

import java.util.Arrays;

import com.springmongodb.exemplemongodb.entities.User;
import com.springmongodb.exemplemongodb.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Instantiation implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@teste.com");
        User alex = new User(null, "Alex Green", "alex@teste.com");
        User bob = new User(null, "Bob Grey", "bob@teste.com");


        userRepository.saveAll(Arrays.asList(maria, alex, bob));
        
        
    }

    
}
