package com.springmongodb.exemplemongodb.dto;

import java.io.Serializable;

import com.springmongodb.exemplemongodb.entities.User;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Data
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
