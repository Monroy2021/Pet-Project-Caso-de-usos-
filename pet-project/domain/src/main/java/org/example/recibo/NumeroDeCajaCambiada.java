package org.example.recibo;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.recibo.values.CajaId;
import org.example.recibo.values.NumeroDeCaja;

public class NumeroDeCajaCambiada extends DomainEvent {
    private final CajaId cajaId;
    private final NumeroDeCaja numeroDeCaja;

    public NumeroDeCajaCambiada(CajaId cajaId, NumeroDeCaja numeroDeCaja) {
        super("org.example.recibo.NumeroDeCajaCambiada");
        this.cajaId = cajaId;
        this.numeroDeCaja = numeroDeCaja;
    }

    public CajaId getCajaId() {
        return cajaId;
    }

    public NumeroDeCaja getNumeroDeCaja() {
        return numeroDeCaja;
    }
}
