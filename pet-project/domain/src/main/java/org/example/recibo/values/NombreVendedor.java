package org.example.recibo.values;

import co.com.sofka.domain.generic.ValueObject;

public class NombreVendedor implements ValueObject<String> {

   private final String nombreVendedor;


    public NombreVendedor(String nombre, String apellido) {
        this.nombreVendedor= nombre+" "+apellido;
    }

    public NombreVendedor(String nombre) {
        this.nombreVendedor=nombre;
    }

    @Override
    public String value() {
        return nombreVendedor;
    }

    public NombreVendedor cambiarNombreVendedor(String nombreNuevo, String apellidoNuevo){
        return new NombreVendedor(nombreNuevo,apellidoNuevo);
    }

    public NombreVendedor cambiarNombreVendedor(String nombre) {
        return  new NombreVendedor(nombre);
    }
}
