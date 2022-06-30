package org.example.recibo;

import co.com.sofka.domain.generic.EventChange;

public class ReciboEventChange extends EventChange {
    public ReciboEventChange(Recibo recibo) {

        apply((ReciboCreado event)->{
            recibo.clienteId= event.getClienteId();
            recibo.fechaRecibo= event.getFechaRecibo();
            recibo.caja= event.getCaja();
            recibo.detalle=event.getDetalle();
        });

        apply((CajaAsignada event)->{
            recibo.caja=event.getCaja();
        });
apply((VendedorAsignado event)->{
    recibo.vendedor= event.getVendedor();
});
apply((NumeroDeCajaCambiada event)->{
    if(!recibo.caja.identity().equals(event.getCajaId())){
        throw new IllegalArgumentException("La caja no existe para este recibo o identificador");
    }
    recibo.caja.cambiarNumeroDeCaja(event.getNumeroDeCaja());
});
apply((NombreDeVendedorCambiado event)->{
    if(!recibo.vendedor.identity().equals(event.getVendedorId())){
        throw new IllegalArgumentException("El vendedor no existe para este recibo o identificador");
    }
     recibo.vendedor.cambiarNombreVendedor(event.getNombreVendedor());
});
    }
}
