package org.example.libro.values;

import co.com.sofka.domain.generic.Identity;

public class LibroCod extends Identity {

    private LibroCod(String value) {
        super(value);
    }

    public LibroCod(){

    }

    public static LibroCod of(String value) {
        return new LibroCod(value);
    }
}
