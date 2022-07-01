package org.example.compra.values;

import co.com.sofka.domain.generic.Identity;

public class CompraId extends Identity {
    public CompraId(String valor) {
        super(valor);
    }

    public CompraId() {
    }

    public static CompraId of(String valor){
        return new CompraId(valor);
    }
}
