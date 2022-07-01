package org.example.cliente;


import org.example.cliente.commands.CrearClienteComm;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class CreateClienteUseCase  {

    @InjectMocks
    CreateClienteUseCase useCase;

    @Test
    public void crearCliente() {
        //arrange
        ClienteId Id = ClienteId.of("");
        SubscripcionId subscripcionId= SubscripcionId.of("fff");

        //Author
        Nombre nombre = new Nombre("m", "m");
        Email correo = new Email("@correo");
        Descripcion descripcion= new Descripcion("22");


        Subscripcion subscripcion= new Subscripcion(subscripcionId,descripcion);

        //Descripcion


        var command = new CrearClienteComm(Id, nombre, correo,subscripcion);
        //act

       // var events = UseCaseHandler.getInstance()
               // .syncExecutor(useCase,new RequestCommand<>(command))
                //.orElseThrow()
               // .getDomainEvents();
        //assert
        //var event = (ClienteCreado) events.get(0);
       // Assertions.assertEquals("tv", event.getClienteId().value());
       // Assertions.assertEquals("sofka", event.getNombre().value());
    }


}