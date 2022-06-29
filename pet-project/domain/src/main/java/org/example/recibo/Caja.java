package org.example.recibo;

import co.com.sofka.domain.generic.Entity;
import org.example.recibo.values.CajaId;
import org.example.recibo.values.NumeroDeCaja;

public class Caja extends Entity<CajaId> {
    private NumeroDeCaja numeroDeCaja;
    public Caja(CajaId id) {
        super(id);
    }
}
