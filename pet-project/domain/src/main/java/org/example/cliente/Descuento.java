package org.example.cliente;

import co.com.sofka.domain.generic.ValueObject;

public class Descuento implements ValueObject<String> {

    private final String valor;

    public Descuento (String valor){
        this.valor=valor;
    }

    @Override
    public String value(){
        return valor;
    }

    public Descuento ActualizarCarnet (String valor){
        return  new Descuento(valor);
    }
}
