package org.example.recibo;

import co.com.sofka.domain.generic.Entity;
import org.example.recibo.values.CajaId;
import org.example.recibo.values.NumeroDeCaja;

public class Caja extends Entity<CajaId> {
    private NumeroDeCaja numeroDeCaja;

    public Caja(CajaId cajaId, NumeroDeCaja numeroDeCaja) {
        super(cajaId);
        this.numeroDeCaja = numeroDeCaja;
    }
    public void cambiarNumeroDeCaja(NumeroDeCaja nuevoNumeroDeCaja){
        this.numeroDeCaja= numeroDeCaja.cambiarNumeroDeCaja(nuevoNumeroDeCaja.value().numeroDeCaja());
    }
}
