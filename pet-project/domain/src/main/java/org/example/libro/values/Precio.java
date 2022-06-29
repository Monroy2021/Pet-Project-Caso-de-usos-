package org.example.libro.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<Precio.Props> {

    private final String tipo;
    private final Integer precio;

    public Precio(String tipo, Integer precio) {
        this.tipo = Objects.requireNonNull(tipo);
        this.precio = Objects.requireNonNull(precio);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String tipo() {
                return tipo;
            }

            @Override
            public Integer Precio() {
                return precio;
            }
        };
    }

    public interface Props {
        String tipo();
        Integer Precio();
    }
}
