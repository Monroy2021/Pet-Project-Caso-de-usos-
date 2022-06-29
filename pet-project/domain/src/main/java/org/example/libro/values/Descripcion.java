package org.example.libro.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Descripcion implements ValueObject<Descripcion.Props> {

    private final AñoPublicacion añoPublicacion;
    private final Editorial editorial;

    public Descripcion(AñoPublicacion añoPublicacion, Editorial editorial) {
        this.añoPublicacion = Objects.requireNonNull(añoPublicacion);
        this.editorial = Objects.requireNonNull(editorial);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public AñoPublicacion añoPublicacion() {
                return añoPublicacion;
            }

            @Override
            public Editorial editorial() {
                return editorial;
            }
        };
    }

    public interface Props {
        AñoPublicacion añoPublicacion();
        Editorial editorial();
    }
}
