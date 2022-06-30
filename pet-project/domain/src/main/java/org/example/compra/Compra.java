package org.example.compra;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.cliente.ClienteId;
import org.example.compra.events.ClienteAgregado;
import org.example.compra.events.CompraCreada;
import org.example.compra.events.LibroAgregado;
import org.example.compra.events.ReciboGenerado;
import org.example.compra.values.CompraId;
import org.example.libro.values.LibroCod;
import org.example.libro.values.Precio;
import org.example.recibo.values.CajaId;
import org.example.recibo.values.FechaRecibo;
import org.example.recibo.values.ReciboId;
import org.example.compra.values.ValorTotal;
import org.example.recibo.values.VendedorId;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Compra extends AggregateEvent<CompraId> {
    protected ClienteId clienteId;
    protected Map<LibroCod, Precio> listaLibros;
    protected ReciboId reciboId;
    protected ValorTotal valorTotal;
    protected VendedorId vendedorId;
    protected CajaId cajaId;
    protected FechaRecibo fechaRecibo;
    public Compra(CompraId compraId, ClienteId clienteId, Map<LibroCod, Precio> listaLibros, ValorTotal valorTotal, ReciboId reciboId, VendedorId vendedorId, CajaId cajaId, FechaRecibo fechaRecibo) {
        super(compraId);
        appendChange(new CompraCreada(clienteId,listaLibros,valorTotal,vendedorId)).apply();
        appendChange(new ReciboGenerado(compraId,clienteId,listaLibros,valorTotal,reciboId,vendedorId,cajaId,fechaRecibo)).apply();
        subscribe(new CompraEventChange(this));
    }
private Compra(CompraId compraId){
        super(compraId);
        subscribe(new CompraEventChange(this));
}
    public void AgregarLibro(LibroCod libroCod,Precio precio){
        Objects.requireNonNull(libroCod);
        Objects.requireNonNull(precio);
        appendChange(new LibroAgregado(libroCod,precio));

    }
    public void

    GenerarRecibo(CompraId id, ClienteId clienteId, Map<LibroCod, Precio> listaLibros, ValorTotal valorTotal,ReciboId reciboId, VendedorId vendedorId,CajaId cajaId){
  appendChange(new ReciboGenerado(id,clienteId,listaLibros,valorTotal, reciboId, vendedorId, cajaId, fechaRecibo)).apply();
    }
    public void AsignarCliente(ClienteId clienteId){
        appendChange(new ClienteAgregado(clienteId));

    }
    public static Compra from(CompraId id, List<DomainEvent> events){
        var compra = new Compra(id);
        events.forEach(compra::applyEvent);
        return compra;
    }

}
