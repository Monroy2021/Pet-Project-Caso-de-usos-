package org.example.recibo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ValorTotal implements ValueObject<ValorTotal.Props> {
    private final Integer valorTotal;

    public ValorTotal(Integer valorTotal) {
        this.valorTotal = Objects.requireNonNull(valorTotal);
    }


    @Override
    public ValorTotal.Props value() {
        return new Props(){
            @Override
            public Integer valorTotal(){
                return valorTotal;
            }
        };
    }

    public interface Props {
        Integer valorTotal();
    }
}
