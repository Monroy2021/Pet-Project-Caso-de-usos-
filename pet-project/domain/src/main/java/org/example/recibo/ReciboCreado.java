package org.example.recibo;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.cliente.ClienteId;
import org.example.recibo.values.Detalle;
import org.example.recibo.values.FechaRecibo;
import org.example.recibo.values.ValorTotal;

public class ReciboCreado extends DomainEvent {
    private final ClienteId clienteId;
    private final Detalle detalle;
    private final Caja caja;
    private final Vendedor vendedor;
    private final ValorTotal valorTotal;
    private final FechaRecibo fechaRecibo;

    public ReciboCreado(ClienteId clienteId, Detalle detalle, Caja caja, Vendedor vendedor, ValorTotal valorTotal, FechaRecibo fechaRecibo) {
        super(
                "org.example.recibo.ReciboCreado"
        );

        this.clienteId = clienteId;
        this.detalle = detalle;
        this.caja = caja;
        this.vendedor = vendedor;
        this.valorTotal = valorTotal;
        this.fechaRecibo = fechaRecibo;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Detalle getDetalle() {
        return detalle;
    }

    public Caja getCaja() {
        return caja;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public ValorTotal getValorTotal() {
        return valorTotal;
    }

    public FechaRecibo getFechaRecibo() {
        return fechaRecibo;
    }
}
