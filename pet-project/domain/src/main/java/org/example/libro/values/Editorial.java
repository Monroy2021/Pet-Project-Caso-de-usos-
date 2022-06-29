package org.example.libro.values;

import co.com.sofka.domain.generic.ValueObject;

public class Editorial implements ValueObject<String> {

    //Atributo
    private final String empresa;

    public Editorial(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String value() {
        return empresa;
    }
}
