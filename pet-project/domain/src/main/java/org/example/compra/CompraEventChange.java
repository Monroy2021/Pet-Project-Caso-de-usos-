package org.example.compra;

import co.com.sofka.domain.generic.EventChange;
import org.example.compra.events.CompraCreada;
import org.example.compra.events.LibroAgregado;
import org.example.compra.events.ReciboGenerado;
import org.example.libro.values.LibroCod;
import org.example.libro.values.Precio;
import org.example.recibo.Caja;
import org.example.recibo.Recibo;
import org.example.recibo.Vendedor;
import org.example.recibo.values.CajaId;
import org.example.recibo.values.Detalle;
import org.example.recibo.values.ReciboId;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CompraEventChange extends EventChange {
    public CompraEventChange(Compra compra) {
     apply((CompraCreada event)->{
         compra.clienteId= event.getClienteId();
         compra.listaLibros= event.getListaLibros();
         compra.valorTotal=  event.getValorTotal();
         compra.vendedorId= event.getVendedorId();
     });
  apply((LibroAgregado event)->{
 compra.listaLibros.put(event.getLibroCod(), event.getPrecio());
  });
  apply((ReciboGenerado event)->{
      var reciboGenerado = new Recibo(event.getReciboId(), event.getClienteId(), new Detalle(event.getListaLibros()),new Caja(event.getCajaId()),new Vendedor(event.getVendedorId()),event.getValorTotal(),event.getFechaRecibo());
      compra.reciboId= reciboGenerado.identity();
  });

    }}