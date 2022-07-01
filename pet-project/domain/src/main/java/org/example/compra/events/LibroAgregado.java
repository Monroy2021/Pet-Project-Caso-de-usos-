package org.example.compra.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.libro.values.LibroCod;
import org.example.libro.values.Precio;

public class LibroAgregado extends DomainEvent {
    private final LibroCod libroCod;
    private final Precio precio;

    public LibroAgregado(LibroCod libroCod, Precio precio) {
        super("org.example.compra.events.LibroAgregado"
        );
        this.libroCod = libroCod;
        this.precio = precio;
    }

    public Precio getPrecio() {
        return precio;
    }

    public LibroCod getLibroCod() {
        return libroCod;
    }
}
