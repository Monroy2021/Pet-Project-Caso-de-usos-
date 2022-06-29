package org.example.libro;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.libro.commands.CrearLibroCommand;

public class CrearLibroUseCase extends UseCase<RequestCommand<CrearLibroCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearLibroCommand> crearLibroCommandRequestCommand) {
        var command = crearLibroCommandRequestCommand.getCommand();
        var libro = new Libro(
                command.getEntityId(),
                command.getAuthorId(),
                command.getNombre(),
                command.getDescripcion()
        );

        emit().onResponse(new ResponseEvents(libro.getUncommittedChanges()));
    }

}
