package com.springmongodb.exemplemongodb.configurations;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import com.springmongodb.exemplemongodb.dto.AuthorDTO;
import com.springmongodb.exemplemongodb.entities.Post;
import com.springmongodb.exemplemongodb.entities.User;
import com.springmongodb.exemplemongodb.repository.PostRepository;
import com.springmongodb.exemplemongodb.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC-3"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@teste.com");
        User alex = new User(null, "Alex Green", "alex@teste.com");
        User bob = new User(null, "Bob Grey", "bob@teste.com");

        userRepository.saveAll(Arrays.asList(maria, alex, bob));

        Post post1 = new Post(null, sdf.parse("21/03/2021"), "Partiu viajem", "Vou viajar para São Paulo, Abraços!", new AuthorDTO(maria));
        Post post2 = new Post(null, sdf.parse("22/03/2021"), "Bom dia", "Hoje acordei feliz!", new AuthorDTO(maria));
            
        postRepository.saveAll(Arrays.asList(post1, post2));

    }

}
