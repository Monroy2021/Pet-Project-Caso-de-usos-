package org.example.libro;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.example.libro.commands.CrearLibroCommand;
import org.example.libro.events.LibroCreado;
import org.example.libro.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CrearLibroUseCaseTest {

    @InjectMocks
    CrearLibroUseCase useCase;

    @Test
    public void crearLibro() {
        //arrange
        //Codigo del libro
        LibroCod entityId = LibroCod.of("xxxx");
        //Author
        AuthorId authorId = AuthorId.of("jjjj");
        Nombre nombre = new Nombre("Juan", "Rivera");
        //Descripcion
        Descripcion descripcion = new Descripcion(new AñoPublicacion(19, 5, 1995),
                new Editorial("Cinema"));
        var command = new CrearLibroCommand(entityId,authorId, nombre, descripcion);
        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (LibroCreado) events.get(0);
        Assertions.assertEquals("Cinema", event.getDescripcion().value().editorial().value());
        Assertions.assertEquals("jjjj", event.getAuthorId().value());
    }
}