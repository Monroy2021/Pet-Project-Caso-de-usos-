package org.example.compra.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.cliente.ClienteId;
import org.example.compra.values.CompraId;
import org.example.compra.values.ValorTotal;
import org.example.libro.values.LibroCod;
import org.example.recibo.values.VendedorId;

import java.util.Set;

public class ReciboGenerado extends DomainEvent {
    private final CompraId id;
    private final ClienteId clienteId;
    private final Set<LibroCod> listaLibros;
    private final ValorTotal valorTotal;
    private final VendedorId vendedorId;

    public ReciboGenerado(CompraId id, ClienteId clienteId, Set<LibroCod> listaLibros, ValorTotal valorTotal, VendedorId vendedorId) {
        super("org.example.compra.events.ReciboGenerado");
        this.id = id;
        this.clienteId = clienteId;
        this.listaLibros = listaLibros;
        this.valorTotal = valorTotal;
        this.vendedorId = vendedorId;
    }

    public CompraId getId() {
        return id;
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
