package org.example.recibo;

import co.com.sofka.domain.generic.Entity;
import org.example.recibo.values.InformacionVendedor;
import org.example.recibo.values.VendedorId;

public class Vendedor extends Entity<VendedorId> {
   private InformacionVendedor informacionVendedor;
    public Vendedor(VendedorId id) {
        super(id);
    }
}
