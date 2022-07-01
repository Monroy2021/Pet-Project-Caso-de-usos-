package org.example.cliente.commands;

import co.com.sofka.domain.generic.Command;
import org.example.cliente.ClienteId;
import org.example.cliente.Email;
import org.example.cliente.Nombre;
import org.example.cliente.Subscripcion;


public class CrearClienteComm extends Command {

    private final ClienteId clienteId;
    private final Nombre nombre;
    private final Email correo;
    private final Subscripcion subscripcion;

    public CrearClienteComm(ClienteId clienteId, Nombre nombre, Email correo, Subscripcion subscripcion) {
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.correo = correo;
        this.subscripcion = subscripcion;
    }


    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getCorreo() {
        return correo;
    }

    public Subscripcion getSubscripcion() {
        return subscripcion;
    }


}
