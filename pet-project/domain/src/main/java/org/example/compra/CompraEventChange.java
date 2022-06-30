package org.example.compra;

import co.com.sofka.domain.generic.EventChange;
import org.example.compra.events.CompraCreada;
import org.example.compra.events.LibroAgregado;
import org.example.compra.events.ReciboGenerado;

public class CompraEventChange extends EventChange {
    public CompraEventChange(Compra compra) {
     apply((CompraCreada event)->{
         compra.clienteId= event.getClienteId();
         compra.listaLibros= event.getListaLibros();
         compra.valorTotal=  event.getValorTotal();
         compra.vendedorId= event.getVendedorId();
     });
  apply((LibroAgregado event)->{
 compra.listaLibros.add(event.getLibroCod());
  });
  apply((ReciboGenerado event)->{
      //TODO: Pensar la logica en cadena
  });
    }

}
