package org.example.cliente;

import co.com.sofka.domain.generic.Entity;

public class Carnet extends Entity<CarnetId> {

    private Descuento descuento;


    public Carnet(CarnetId entityId, Descuento descuento) {
        super(entityId);
        this.descuento = descuento;
    }

    public void ActualizarCarnet(String valor){
        this.descuento=descuento.ActualizarCarnet(valor);
    }
}
