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
import org.example.recibo.values.ReciboId;
import org.example.compra.values.ValorTotal;
import org.example.recibo.values.VendedorId;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Compra extends AggregateEvent<CompraId> {
    protected ClienteId clienteId;
    protected Set<LibroCod> listaLibros;
    protected ReciboId reciboId;
    protected ValorTotal valorTotal;
    protected VendedorId vendedorId;
    public Compra(CompraId id,ClienteId clienteId,Set<LibroCod> listaLibros,ValorTotal valorTotal, VendedorId vendedorId) {
        super(id);
        appendChange(new CompraCreada(clienteId,listaLibros,valorTotal,vendedorId)).apply();
        subscribe(new CompraEventChange(this));
    }
private Compra(CompraId compraId){
        super(compraId);
        subscribe(new CompraEventChange(this));
}
    public void AgregarLibro(LibroCod libroCod){
        Objects.requireNonNull(libroCod);
        appendChange(new LibroAgregado(libroCod));

    }
    public void

    GenerarRecibo(CompraId id,ClienteId clienteId,Set<LibroCod> listaLibros,ValorTotal valorTotal, VendedorId vendedorId){
  appendChange(new ReciboGenerado(id,clienteId,listaLibros,valorTotal,vendedorId)).apply();
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
