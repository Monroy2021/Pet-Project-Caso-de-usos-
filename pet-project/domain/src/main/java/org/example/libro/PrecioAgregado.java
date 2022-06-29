package org.example.libro;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.libro.values.Precio;

public class PrecioAgregado extends DomainEvent {

    private Precio precio;

    public PrecioAgregado(Precio precio) {
        super("org.example.libro.PrecioAgregado");
        this.precio = precio;
    }

    public Precio getPrecio() {
        return precio;
    }
}
