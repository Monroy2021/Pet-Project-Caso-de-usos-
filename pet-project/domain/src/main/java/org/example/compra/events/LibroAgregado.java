package org.example.compra.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.libro.values.LibroCod;

public class LibroAgregado extends DomainEvent {
    private final LibroCod libroCod;

    public LibroAgregado(LibroCod libroCod) {
        super("org.example.compra.events.LibroAgregado"
        );
        this.libroCod = libroCod;
    }

    public LibroCod getLibroCod() {
        return libroCod;
    }
}
