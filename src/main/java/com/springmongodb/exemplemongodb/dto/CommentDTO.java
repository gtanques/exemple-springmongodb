package com.springmongodb.exemplemongodb.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class CommentDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String text;
    private Date date;
    private AuthorDTO author;
    
}
