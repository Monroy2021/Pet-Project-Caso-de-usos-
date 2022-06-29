package org.example.recibo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDateTime;
import java.util.Objects;

public class FechaRecibo implements ValueObject<FechaRecibo.Props> {
    private final LocalDateTime fechaRecibo;

    public FechaRecibo() {
        this.fechaRecibo = LocalDateTime.now();
    }

    @Override
    public FechaRecibo.Props value() {
        return new Props() {
            @Override
            public LocalDateTime fechaRecibo(){
                return fechaRecibo;
            }
        };
    }

    public interface Props {
        LocalDateTime fechaRecibo();
    }
}
