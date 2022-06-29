package org.example.libro.values;

import co.com.sofka.domain.generic.Identity;

public class AuthorId extends Identity {

    private AuthorId(String value){
        super(value);
    }

    public AuthorId(){
        //super -> auto generarlo
    }
}
