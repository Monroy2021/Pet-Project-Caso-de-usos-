package org.example.recibo;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.cliente.CarnetId;
import org.example.recibo.values.Detalle;
import org.example.recibo.values.FechaRecibo;
import org.example.compra.values.ValorTotal;

public class ReciboCreado extends DomainEvent {
    private final CarnetId clienteId;
    private final Detalle detalle;
    private final Caja caja;
    private final Vendedor vendedor;
    private final ValorTotal valorTotal;
    private final FechaRecibo fechaRecibo;

    public ReciboCreado(CarnetId clienteId, Detalle detalle, Caja caja, Vendedor vendedor, ValorTotal valorTotal, FechaRecibo fechaRecibo) {
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

    public CarnetId getClienteId() {
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
