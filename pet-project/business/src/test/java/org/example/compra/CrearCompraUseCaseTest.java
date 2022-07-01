package org.example.compra;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.example.cliente.CarnetId;
import org.example.compra.commands.CrearCompraCommand;
import org.example.compra.events.CompraCreada;
import org.example.compra.values.CompraId;
import org.example.compra.values.ValorTotal;
import org.example.libro.values.LibroCod;
import org.example.libro.values.Precio;
import org.example.recibo.values.CajaId;
import org.example.recibo.values.FechaRecibo;
import org.example.recibo.values.ReciboId;
import org.example.recibo.values.VendedorId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

@ExtendWith(MockitoExtension.class)
class CrearCompraUseCaseTest {

    @InjectMocks
    CrearCompraUseCase useCase;

    @Test
    public void crearCompra(){
        //arrange
        CompraId compraId = CompraId.of("dddd");
        CarnetId clienteId= CarnetId.of("xxxx");
        Map<LibroCod, Precio> listaLibros = new HashMap<>();
        LibroCod libro1 = LibroCod.of("libro1");
        Precio precio1= new Precio("COP",5000);
        listaLibros.put(libro1,precio1);
        ValorTotal valorTotal = new ValorTotal(precio1.value().Precio());
        ReciboId reciboId = ReciboId.of("recibo1");
        VendedorId vendedorId = VendedorId.of("vendedor1");
        CajaId cajaId =CajaId.of("caja1");
        var command = new CrearCompraCommand(compraId,clienteId,listaLibros,reciboId,valorTotal,vendedorId,cajaId,new FechaRecibo());
        var events = UseCaseHandler.getInstance().syncExecutor(useCase,new RequestCommand<>(command)).orElseThrow().getDomainEvents();
        //assert
        var event = (CompraCreada)events.get(0);
        Assertions.assertEquals(5000,event.getValorTotal().value().valorTotal());
        Assertions.assertEquals("xxxx",event.getClienteId().value());
    }
}