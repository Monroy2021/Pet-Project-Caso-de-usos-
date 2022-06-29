package org.example.compra;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.cliente.ClienteId;
import org.example.libro.values.LibroCod;

import java.util.Set;

public class CompraCreada extends DomainEvent {
    public CompraCreada(ClienteId clienteId, Set<LibroCod> listaLibros, Object p2) {
        super();
    }
}
