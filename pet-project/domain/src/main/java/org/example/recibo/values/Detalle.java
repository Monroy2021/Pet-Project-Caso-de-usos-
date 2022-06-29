package org.example.recibo.values;

import co.com.sofka.domain.generic.ValueObject;
import org.example.libro.values.LibroCod;
import org.example.libro.values.Precio;

import java.util.Map;
import java.util.Objects;

public class Detalle implements ValueObject<Detalle.Props> {
    private final Map<LibroCod, Precio> listaDetalleLibros;

    public Detalle(Map<LibroCod, Precio> listaDetalleLibros) {
        this.listaDetalleLibros = Objects.requireNonNull(listaDetalleLibros);
        if(listaDetalleLibros.isEmpty()){
            throw new IllegalArgumentException("No puede generar un detalle de una lista vacia de libros");
        }
    }

    @Override
    public Detalle.Props value() {
        return new Props() {
            @Override
            public Map<LibroCod,Precio> listaDetalleLibros(){
                return listaDetalleLibros;
            }
        };
    }

    public interface Props {
        Map<LibroCod,Precio> listaDetalleLibros();
    }
}
