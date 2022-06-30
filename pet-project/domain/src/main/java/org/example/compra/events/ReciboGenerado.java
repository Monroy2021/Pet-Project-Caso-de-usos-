package org.example.compra.events;

import co.com.sofka.domain.generic.DomainEvent;
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

public class ReciboGenerado extends DomainEvent {
    private final CompraId compraId;
    private final ClienteId clienteId;
    private final Map<LibroCod, Precio> listaLibros;
    private final ValorTotal valorTotal;
    private final ReciboId reciboId;
    private final VendedorId vendedorId;
    private final CajaId cajaId;
    private final FechaRecibo fechaRecibo;

    public CajaId getCajaId() {
        return cajaId;
    }

    public ReciboGenerado(CompraId compraId, ClienteId clienteId, Map<LibroCod, Precio> listaLibros, ValorTotal valorTotal, ReciboId reciboId, VendedorId vendedorId, CajaId cajaId, FechaRecibo fechaRecibo) {
        super("org.example.compra.events.ReciboGenerado");
        this.compraId = compraId;
        this.clienteId = clienteId;
        this.listaLibros = listaLibros;
        this.valorTotal = valorTotal;
        this.reciboId = reciboId;
        this.vendedorId = vendedorId;
        this.cajaId = cajaId;
        this.fechaRecibo = fechaRecibo;
    }

    public FechaRecibo getFechaRecibo() {
        return fechaRecibo;
    }

    public ReciboId getReciboId() {
        return reciboId;
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
