package org.example.cliente;

import co.com.sofka.domain.generic.Identity;
import org.example.libro.values.LibroCod;

public class SubscripcionId extends Identity {

    private SubscripcionId(String value) {
        super(value);
    }

    public SubscripcionId(){

    }

    public static SubscripcionId of(String value) {
        return new SubscripcionId(value);
    }


}
