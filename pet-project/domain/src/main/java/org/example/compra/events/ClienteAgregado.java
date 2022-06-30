package org.example.compra.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.cliente.ClienteId;

public class ClienteAgregado extends DomainEvent {
    private final ClienteId clienteId;

    public ClienteAgregado(ClienteId clienteId) {
        super("org.example.compra.events.ClienteAgregado");
        this.clienteId = clienteId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
