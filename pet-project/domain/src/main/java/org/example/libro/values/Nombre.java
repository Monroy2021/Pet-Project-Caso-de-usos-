package org.example.libro.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<Nombre.Props> {

    private final String nombreAuthor;
    private final String apellidoAuthor;

    public Nombre(String nombreAuthor, String apellidoAuthor) {
        this.nombreAuthor = Objects.requireNonNull(nombreAuthor);
        this.apellidoAuthor = Objects.requireNonNull(apellidoAuthor);
    }

    public Nombre cambiarNombre(String nombreAuthor){
        return new Nombre(nombreAuthor, apellidoAuthor);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String NombreAuthor() {
                return nombreAuthor;
            }

            @Override
            public String ApellidoAuthor() {
                return apellidoAuthor;
            }
        };
    }

    public interface Props {
        String NombreAuthor();
        String ApellidoAuthor();
    }
}
