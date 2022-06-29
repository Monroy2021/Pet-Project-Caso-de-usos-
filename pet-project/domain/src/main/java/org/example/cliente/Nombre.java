package org.example.cliente;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<Nombre.props> {

    private final String nombre;
    private final String apellido;


    public Nombre(String nombre, String apellido) {
        this.nombre = Objects.requireNonNull(nombre);
        this.apellido = Objects.requireNonNull(apellido);


    }

    @Override
    public props value() {
        return new props() {
            @Override
            public String nombre() {
                return nombre;
            }


            @Override
            public String apellido() {
                return apellido;
            }
        };

    }

    public interface props {
        String nombre();

        String apellido();
    }

}
