package org.example.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.cliente.ClienteId;
import org.example.cliente.Email;
import org.example.cliente.Nombre;
import org.example.cliente.Subscripcion;


public class ClienteCreado extends DomainEvent {

    private final ClienteId clienteId;
    private final Nombre nombre;
    private final Email email;
    private  final Subscripcion subscripcion;


    public ClienteCreado(ClienteId clienteId, Nombre nombre, Email correo, Subscripcion subscripcion ) {
        super("org.example.areadeventas.ClienteCreado");
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.email = correo;
        this.subscripcion=subscripcion;
    }


    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }

    public Subscripcion getSubscripcion(){return subscripcion;}
}
