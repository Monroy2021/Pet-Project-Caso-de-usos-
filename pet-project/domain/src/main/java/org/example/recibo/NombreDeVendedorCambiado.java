package org.example.recibo;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.recibo.values.NombreVendedor;
import org.example.recibo.values.VendedorId;

public class NombreDeVendedorCambiado extends DomainEvent {
    private final VendedorId vendedorId;
    private final NombreVendedor nombreVendedor;

    public NombreDeVendedorCambiado(VendedorId vendedorId, NombreVendedor nombreVendedor) {
        super("org.example.recibo.NombreDeVendedorCambiado");

        this.vendedorId = vendedorId;
        this.nombreVendedor = nombreVendedor;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public NombreVendedor getNombreVendedor() {
        return nombreVendedor;
    }
}
