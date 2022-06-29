package org.example.cliente;


import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.ValueObject;

public class Subscripcion extends Entity<SubscripcionId> {

    private  Descripcion descripcion;


    public Subscripcion(SubscripcionId entityId, Descripcion descripcion) {
        super(entityId);
        this.descripcion = descripcion;
    }

   public  void ActualizarSubscripcion (String valor){
    this.descripcion=descripcion.ActualizarSubscripcion(valor);
   }


}
