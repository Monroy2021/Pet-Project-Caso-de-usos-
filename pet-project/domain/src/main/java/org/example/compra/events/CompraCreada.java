package org.example.compra.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.cliente.ClienteId;
import org.example.compra.values.ValorTotal;
import org.example.libro.values.LibroCod;
import org.example.recibo.values.VendedorId;

import java.util.Set;

public class CompraCreada extends DomainEvent {
    private final ClienteId clienteId;
    private final Set<LibroCod> listaLibros;
    private final ValorTotal valorTotal;
    private final VendedorId vendedorId;

    public CompraCreada(ClienteId clienteId, Set<LibroCod> listaLibros, ValorTotal valorTotal, VendedorId vendedorId) {
        super("org.example.compra.events.CompraCreada");
        this.clienteId = clienteId;
        this.listaLibros = listaLibros;
        this.valorTotal = valorTotal;
        this.vendedorId = vendedorId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Set<LibroCod> getListaLibros() {
        return listaLibros;
    }

    public ValorTotal getValorTotal() {
        return valorTotal;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }
}
