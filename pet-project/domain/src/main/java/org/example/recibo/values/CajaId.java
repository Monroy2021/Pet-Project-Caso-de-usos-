package org.example.recibo.values;

import co.com.sofka.domain.generic.Identity;

public class CajaId extends Identity {
    public CajaId(String valor) {
        super(valor);
    }

    public CajaId() {
    }

    public static CajaId of(String valor){
        return new CajaId(valor);
    }
}
