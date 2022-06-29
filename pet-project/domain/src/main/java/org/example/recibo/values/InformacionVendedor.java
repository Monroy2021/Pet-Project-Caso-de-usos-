package org.example.recibo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class InformacionVendedor implements ValueObject<InformacionVendedor.Props> {

    private final String nombre;
    private final String apellido;
    private final Integer numeroTelefono;

    public InformacionVendedor(String nombre, String apellido, Integer numeroTelefono) {
        this.nombre = Objects.requireNonNull(nombre);
        this.apellido = Objects.requireNonNull(apellido);
        this.numeroTelefono = Objects.requireNonNull(numeroTelefono);
    }
@Override
    public InformacionVendedor.Props value() {
        return new Props() {
            @Override
            public String nombre(){
                return nombre;
            }
            @Override
            public String apellido(){
                return nombre;
            }
            @Override
            public Integer numeroTelefono(){
                return numeroTelefono;
            }
        };
    }

    public interface Props {
        String nombre();

        String apellido();

        Integer numeroTelefono();
    }
}
