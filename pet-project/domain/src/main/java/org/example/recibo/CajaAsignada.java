package org.example.recibo;

import co.com.sofka.domain.generic.DomainEvent;

public class CajaAsignada extends DomainEvent {
    private final Caja caja;

    public CajaAsignada(Caja caja) {
        super("org.example.recibo.CajaAsignada");
        this.caja = caja;
    }

    public Caja getCaja() {
        return caja;
    }
}
