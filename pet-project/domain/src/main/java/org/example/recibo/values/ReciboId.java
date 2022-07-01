package org.example.recibo.values;

import co.com.sofka.domain.generic.Identity;

public class ReciboId extends Identity {
    public ReciboId(String valor) {
        super(valor);
    }

    public ReciboId() {
    }
    public static ReciboId of(String valor){
        return new ReciboId(valor);
    }
}