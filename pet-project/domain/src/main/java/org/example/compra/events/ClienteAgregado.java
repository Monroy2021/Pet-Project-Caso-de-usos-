package org.example.compra.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.cliente.CarnetId;

public class ClienteAgregado extends DomainEvent {
    private final CarnetId clienteId;

    public ClienteAgregado(CarnetId clienteId) {
        super("org.example.compra.events.ClienteAgregado");
        this.clienteId = clienteId;
    }

    public CarnetId getClienteId() {
        return clienteId;
    }
}
