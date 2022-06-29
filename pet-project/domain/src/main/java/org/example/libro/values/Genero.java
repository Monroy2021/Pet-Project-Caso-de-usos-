package org.example.libro.values;

import co.com.sofka.domain.generic.ValueObject;

public class Genero implements ValueObject<String> {

    private final String nombre;

    @Override
    public String value() {
        return nombre;
    }

    public Genero(String nombre) {
        this.nombre = nombre;
    }

    public Genero cambiarNombre(String nombre){
        return new Genero(nombre);
    }
}
