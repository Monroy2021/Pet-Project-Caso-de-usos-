package org.example.cliente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.cliente.commands.CrearClienteComm;


public class CreateClienteUseCase extends UseCase<RequestCommand<CrearClienteComm>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearClienteComm> crearClienteCommRequestCommand) {
        var command = crearClienteCommRequestCommand.getCommand();
        var cliente = new Cliente(
                command.getClienteId(),
                command.getNombre(),
                command.getCorreo()
        );

        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
    }
}
