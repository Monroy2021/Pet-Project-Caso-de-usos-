package org.example.libro.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.libro.values.Estado;

public class EstadoAgregado extends DomainEvent {

    private Estado estado;

    public EstadoAgregado(Estado estado) {
        super("org.example.libro.events.EstadoAgregado");
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
