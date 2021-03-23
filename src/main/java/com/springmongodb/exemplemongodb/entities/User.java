package com.springmongodb.exemplemongodb.entities;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String email;

}
