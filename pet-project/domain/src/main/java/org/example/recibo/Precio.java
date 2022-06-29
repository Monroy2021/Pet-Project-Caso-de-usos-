package org.example.recibo;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<Precio.Props> {
    private final String tipo;
    private final Integer valor;

    public Precio(String tipo, Integer valor) {
        this.tipo = Objects.requireNonNull(tipo);
        this.valor = Objects.requireNonNull(valor);

        if(valor<0){
            throw new IllegalArgumentException("El valor del libro no puede ser negativo");
        }
    }


    public Props value() {
        return new  Props(){
            @Override
            public String tipo(){
                return tipo;
            }

            @Override
            public Integer valor() {
                return valor;
            }

        };
    }

    public interface Props {
        String tipo();
        Integer valor();

    }
}
