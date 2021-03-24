package com.springmongodb.exemplemongodb.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

import com.springmongodb.exemplemongodb.dto.AuthorDTO;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Post implements Serializable{
        
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private Date date;
    private String title;
    private String body;
    private AuthorDTO author;
}
