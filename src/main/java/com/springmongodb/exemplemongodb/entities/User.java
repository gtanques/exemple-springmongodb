package com.springmongodb.exemplemongodb.entities;

import java.io.Serializable;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class User implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String name;
    private String email;

}
