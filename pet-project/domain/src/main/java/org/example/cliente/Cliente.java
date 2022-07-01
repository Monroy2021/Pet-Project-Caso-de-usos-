package org.example.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import jdk.jshell.JShell;
import org.example.cliente.events.ClienteCreado;
import org.example.libro.Libro;
import org.example.libro.LibroEventChange;
import org.example.libro.PrecioAgregado;
import org.example.libro.events.CategoriaAgregada;
import org.example.libro.events.EstadoAgregado;
import org.example.libro.values.*;

import java.util.List;


public class Cliente extends AggregateEvent<ClienteId> {

    //entidad-id
    protected Subscripcion subscripcion;
    //Entidad-id
    protected Carnet carnet;

    //Objeto de valor-no tiene id
    protected Email correo;

    protected Direccion direccion;

    protected Nombre nombre;


    public Cliente(ClienteId Id, Nombre nombre, Email correo, Subscripcion subscripcion) {
        super(Id);

        appendChange(new ClienteCreado(Id, nombre, correo,subscripcion)).apply();

        subscribe(new ClienteEventChange(this));
    }

    private Cliente(ClienteId id) {
        super(id);
        subscribe(new ClienteEventChange(this));
    }


    public void agregarEstado(Estado estado){
        appendChange(new EstadoAgregado(estado)).apply();
    }

    public void agregarPrecio(Precio precio){
        appendChange(new PrecioAgregado(precio)).apply();
    }

    //Metodo para reconstruir el estado del cliente (llamar como tal)
    public static Cliente from(ClienteId id, List<DomainEvent> events){
        var cliente = new Cliente(id);
        events.forEach(cliente::applyEvent); // se aplica los enventos
        return cliente;
    }


}
