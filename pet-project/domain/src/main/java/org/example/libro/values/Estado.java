package org.example.libro.values;

import co.com.sofka.domain.generic.ValueObject;

public class Estado implements ValueObject<String> {

    private final String valor;

    public Estado(String valor) {
        this.valor = valor;
    }

    /**
     * Comportamiento del objeto de valor Estado
     * @param valor del Estado
     * @return el nuevo objeto
     */
    public Estado CambiarEstado(String valor){
        return new Estado(valor);
    }

    @Override
    public String value() {
        return valor;
    }
}
