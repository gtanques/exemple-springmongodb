package com.springmongodb.exemplemongodb.dto;

import java.io.Serializable;

import javax.persistence.Id;

import com.springmongodb.exemplemongodb.entities.User;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthorDTO implements Serializable{    
    
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String name;

    public AuthorDTO(User obj){
        id = obj.getId();
        name = obj.getName();
    }
}
