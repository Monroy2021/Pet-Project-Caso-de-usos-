package org.example.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import jdk.jshell.JShell;

public class Cliente extends AggregateEvent<CarnetId> {

    //entidad-id
    protected Subscripcion subscripcion;
    //Entidad-id
    protected Carnet carnet;

    //Objeto de valor-no tiene id
    protected Email correo;

    protected Direccion direccion;

    protected Nombre nombre;


    public Cliente(CarnetId Id,Subscripcion subscripcion,Carnet carnet) {
        super(Id);
    }
}
