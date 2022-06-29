package org.example.recibo.values;

import co.com.sofka.domain.generic.ValueObject;

public class NumeroDeCaja implements ValueObject<NumeroDeCaja.Props> {
    private final Integer numeroDeCaja;

    public NumeroDeCaja(Integer numeroDeCaja) {
        this.numeroDeCaja = numeroDeCaja;
        if(numeroDeCaja<0){
            throw new IllegalArgumentException("No es un numero de caja valido");
        }
    }

    @Override
    public NumeroDeCaja.Props value() {
        return new Props() {
            @Override
            public Integer numeroDeCaja(){
                return numeroDeCaja;
            }
        };
    }

    public interface Props {
        Integer numeroDeCaja();
    }
}
