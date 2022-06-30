package org.example.recibo;

import co.com.sofka.domain.generic.Entity;
import org.example.recibo.values.NombreVendedor;
import org.example.recibo.values.VendedorId;

public class Vendedor extends Entity<VendedorId> {
   private NombreVendedor nombreVendedor;

    public Vendedor(VendedorId vendedorId, NombreVendedor nombreVendedor) {
        super(vendedorId);
        this.nombreVendedor = nombreVendedor;
    }
    public void cambiarNombreVendedor(NombreVendedor nuevoNombre){
        this.nombreVendedor = nombreVendedor.cambiarNombreVendedor(nuevoNombre.value());
    }
}
