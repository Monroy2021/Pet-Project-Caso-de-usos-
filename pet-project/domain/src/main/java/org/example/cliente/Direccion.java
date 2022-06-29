package org.example.cliente;

import co.com.sofka.domain.generic.ValueObject;

public class Direccion implements ValueObject<String> {

    private final String usuario;

    public Direccion(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String value() {
        return usuario;
    }
}
