package org.example.recibo;

import co.com.sofka.domain.generic.DomainEvent;

public class VendedorAsignado extends DomainEvent {
    private final Vendedor vendedor;

    public VendedorAsignado(Vendedor vendedor) {
        super("org.example.recibo.VendedorAsignado");
        this.vendedor = vendedor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
}
