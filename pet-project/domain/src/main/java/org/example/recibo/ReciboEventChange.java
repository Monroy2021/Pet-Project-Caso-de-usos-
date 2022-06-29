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
    }
}
