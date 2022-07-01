package org.example.recibo.values;

import co.com.sofka.domain.generic.Identity;

public class VendedorId extends Identity {
    public VendedorId(String valor) {
        super(valor);
    }

    public VendedorId() {
    }

    public static VendedorId of(String valor) {
        return new VendedorId(valor);
    }
}
