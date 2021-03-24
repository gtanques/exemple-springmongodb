package com.springmongodb.exemplemongodb.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Id;

import com.springmongodb.exemplemongodb.dto.AuthorDTO;
import com.springmongodb.exemplemongodb.dto.CommentDTO;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
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

    private List<CommentDTO> comments = new ArrayList<>();

    public Post(String id, Date date, String title, String body, AuthorDTO author){
        this.id = id;        
        this.date = date;
        this.title = title;  
        this.body = body;  
        this.author = author;
    }
}
