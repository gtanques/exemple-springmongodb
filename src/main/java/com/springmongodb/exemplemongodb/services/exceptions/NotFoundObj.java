package com.springmongodb.exemplemongodb.services.exceptions;

public class NotFoundObj extends RuntimeException{
    
    private static final long serialVersionUID = 1L;

    public NotFoundObj(String message){
        super(message);
    }
    
}
