package org.example.recibo;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Map;
import java.util.Objects;

public class Detalle implements ValueObject<Detalle.Props> {

    private final Map<LibroCod,Precio> lineasDetalle;

    public Detalle(Map<LibroCod, Precio> lineasDetalle) {
        this.lineasDetalle = Objects.requireNonNull(lineasDetalle);
        if(lineasDetalle.isEmpty()){
            throw new IllegalArgumentException("No se puede generar detalle de una lista vacia de libros");
        }
    }

    @Override
    public Props value() {
        return null;
    }

    public interface Props {

    }
}
