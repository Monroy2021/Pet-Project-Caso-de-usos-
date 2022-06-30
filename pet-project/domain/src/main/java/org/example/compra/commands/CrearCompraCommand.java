package org.example.compra.commands;

import co.com.sofka.domain.generic.Command;
import org.example.cliente.ClienteId;
import org.example.compra.values.CompraId;
import org.example.compra.values.ValorTotal;
import org.example.libro.values.LibroCod;
import org.example.libro.values.Precio;
import org.example.recibo.values.CajaId;
import org.example.recibo.values.FechaRecibo;
import org.example.recibo.values.ReciboId;
import org.example.recibo.values.VendedorId;

import java.util.Map;

public class CrearCompraCommand extends Command {
    private final ClienteId clienteId;
    private final Map<LibroCod, Precio> listaLibros;
    private final ReciboId reciboId;
    private final ValorTotal valorTotal;
    private final VendedorId vendedorId;
    private final CajaId cajaId;
    private final FechaRecibo fechaRecibo;
    private final CompraId compraId;

    public CrearCompraCommand(CompraId compraId, ClienteId clienteId, Map<LibroCod, Precio> listaLibros, ReciboId reciboId, ValorTotal valorTotal, VendedorId vendedorId, CajaId cajaId, FechaRecibo fechaRecibo) {
        this.reciboId = reciboId;
        this.cajaId = cajaId;
        this.fechaRecibo = fechaRecibo;
        this.compraId = compraId;
        this.clienteId = clienteId;
        this.listaLibros = listaLibros;
        this.valorTotal = valorTotal;
        this.vendedorId = vendedorId;
    }

    public ReciboId getReciboId() {
        return reciboId;
    }

    public CajaId getCajaId() {
        return cajaId;
    }

    public FechaRecibo getFechaRecibo() {
        return fechaRecibo;
    }

    public CompraId getCompraId() {
        return compraId;
    }

    public ClienteId getClienteId() {
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
