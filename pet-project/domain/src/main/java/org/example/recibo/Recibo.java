package org.example.recibo;

import co.com.sofka.domain.generic.AggregateEvent;
import org.example.cliente.ClienteId;
import org.example.recibo.values.Detalle;
import org.example.recibo.values.FechaRecibo;
import org.example.recibo.values.ReciboId;
import org.example.recibo.values.ValorTotal;

public class Recibo extends AggregateEvent<ReciboId> {

    protected ClienteId clienteId;
    protected Detalle detalle;
    protected Caja caja;
    protected Vendedor vendedor;
    protected ValorTotal valorTotal;
    protected FechaRecibo fechaRecibo;

    public Recibo(ReciboId id, ClienteId clienteId, Detalle detalle, Caja caja, Vendedor vendedor, ValorTotal valorTotal, FechaRecibo fechaRecibo) {
        super(id);
        appendChange(new ReciboCreado(clienteId,detalle,caja,vendedor,valorTotal,fechaRecibo)).apply();
        subscribe(new ReciboEventChange(this));
    }
}
