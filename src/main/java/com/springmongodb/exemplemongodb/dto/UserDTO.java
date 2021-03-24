package com.springmongodb.exemplemongodb.dto;

import java.io.Serializable;

import com.springmongodb.exemplemongodb.entities.User;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    private String id;
    private String name;
    private String email;

    public UserDTO(User obj){
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }

}
