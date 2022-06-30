package org.example.compra.commands;

import co.com.sofka.domain.generic.Command;
import org.example.cliente.ClienteId;
import org.example.compra.values.CompraId;
import org.example.compra.values.ValorTotal;
import org.example.libro.values.LibroCod;
import org.example.recibo.values.VendedorId;

import java.util.Set;

public class CrearCompraCommand extends Command {
    private final CompraId compraId;
    private final ClienteId clienteId;
    private final Set<LibroCod> listaLibros;
    private final ValorTotal valorTotal;
    private final VendedorId vendedorId;

    public CrearCompraCommand(CompraId compraId, ClienteId clienteId, Set<LibroCod> listaLibros, ValorTotal valorTotal, VendedorId vendedorId) {
        this.compraId = compraId;
        this.clienteId = clienteId;
        this.listaLibros = listaLibros;
        this.valorTotal = valorTotal;
        this.vendedorId = vendedorId;
    }

    public CompraId getCompraId() {
        return compraId;
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
