package org.example.cliente;

import co.com.sofka.domain.generic.EventChange;
import org.example.cliente.events.ClienteCreado;


public class ClienteEventChange extends EventChange {

    public ClienteEventChange(Cliente cli) {

        apply((ClienteCreado event) -> {

            cli.correo = event.getEmail();
            cli.direccion = null;
            cli.carnet=null;
            cli.nombre =  event.getNombre();
            cli.subscripcion = event.getSubscripcion();
        });

    }
}
