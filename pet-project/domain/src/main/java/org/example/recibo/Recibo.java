package org.example.recibo;

import co.com.sofka.domain.generic.AggregateEvent;

public class Recibo extends AggregateEvent<ReciboId> {

    protected ClienteId clienteId;
    protected Detalle detalle;
    protected Caja caja;
    protected Vendedor vendedor;
    protected ValorTotal valorTotal;
    protected FechaRecibo fechaRecibo;
    public Recibo(ReciboId entityId) {
        super(entityId);
    }
}
