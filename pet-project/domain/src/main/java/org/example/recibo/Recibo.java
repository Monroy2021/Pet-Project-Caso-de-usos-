package org.example.recibo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.cliente.ClienteId;
import org.example.recibo.values.*;
import org.example.compra.values.ValorTotal;

import java.util.List;

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
    public  Recibo(ReciboId reciboId){
        super(reciboId);
        subscribe(new ReciboEventChange(this));
    }
public static  Recibo from(ReciboId reciboId, List<DomainEvent> events){
        var recibo = new Recibo(reciboId);
        events.forEach(recibo::applyEvent);
        return  recibo;
}

public void asignarCaja(Caja caja){
        appendChange(new CajaAsignada(caja)).apply();
}
public void asignarVendedor(Vendedor vendedor){
        appendChange(new VendedorAsignado(vendedor)).apply();
}
public void cambiarNumeroDeUnaCaja(CajaId cajaId, NumeroDeCaja numeroDeCaja){
        appendChange(new NumeroDeCajaCambiada(cajaId,numeroDeCaja)).apply();

}
public void cambiarNombreDeUnVendedor(VendedorId vendedorId,NombreVendedor nombreVendedor){
        appendChange(new NombreDeVendedorCambiado(vendedorId,nombreVendedor)).apply();

}

}
