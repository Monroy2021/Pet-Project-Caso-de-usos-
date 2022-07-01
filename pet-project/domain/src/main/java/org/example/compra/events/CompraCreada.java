package org.example.compra.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.cliente.CarnetId;
import org.example.compra.values.ValorTotal;
import org.example.libro.values.LibroCod;
import org.example.libro.values.Precio;
import org.example.recibo.values.VendedorId;

import java.util.Map;

public class CompraCreada extends DomainEvent {
    private final CarnetId clienteId;
    private final Map<LibroCod, Precio> listaLibros;
    private final ValorTotal valorTotal;
    private final VendedorId vendedorId;

    public CompraCreada(CarnetId clienteId, Map<LibroCod, Precio> listaLibros, ValorTotal valorTotal, VendedorId vendedorId) {
        super("org.example.compra.events.CompraCreada");
        this.clienteId = clienteId;
        this.listaLibros = listaLibros;
        this.valorTotal = valorTotal;
        this.vendedorId = vendedorId;
    }

    public CarnetId getClienteId() {
        return clienteId;
    }

    public Map<LibroCod, Precio> getListaLibros() {
        return listaLibros;
    }

    public ValorTotal getValorTotal() {
        return valorTotal;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }
}
