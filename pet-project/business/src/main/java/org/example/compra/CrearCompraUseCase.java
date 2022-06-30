package org.example.compra;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.compra.commands.CrearCompraCommand;

public class CrearCompraUseCase extends UseCase<RequestCommand<CrearCompraCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearCompraCommand> crearCompraCommandRequestCommand) {
        var command= crearCompraCommandRequestCommand.getCommand();
        var compra = new Compra(command.getCompraId(),
                command.getClienteId(),command.getListaLibros(),command.getValorTotal(),command.getVendedorId());
        emit().onResponse(new ResponseEvents(compra.getUncommittedChanges()));
    }

}
