package org.example.compra;

import co.com.sofka.domain.generic.AggregateEvent;
import org.example.cliente.ClienteId;
import org.example.libro.values.LibroCod;
import org.example.recibo.values.ReciboId;
import org.example.recibo.values.ValorTotal;
import org.example.recibo.values.VendedorId;

import java.util.Set;

public class Compra extends AggregateEvent<CompraId> {
    protected ClienteId clienteId;
    protected Set<LibroCod> listaLibros;
    protected ReciboId reciboId;
    protected ValorTotal valorTotal;
    protected VendedorId vendedorId;

    public Compra(CompraId id,ClienteId clienteId,Set<LibroCod> listaLibros,ReciboId reciboId,ValorTotal valorTotal, VendedorId vendedorId) {
        super(id);
        appendChange(new CompraCreada(clienteId,listaLibros,
                //
                )).apply();
        subscribe(new CompraEventChange(this));
    }

    public void AgregarLibro(){

    }
    public void

    GenerarRecibo(){
        // TODO document why this method is empty
    }
    public void AsignarCliente(){

    }
}
