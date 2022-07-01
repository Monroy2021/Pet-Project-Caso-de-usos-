package org.example.cliente;

import co.com.sofka.domain.generic.Identity;

public class ClienteId extends Identity {


    private ClienteId(String value){
        super(value);
    }

    public ClienteId(){
        //super -> auto generarlo
    }

    public static ClienteId of(String valor) {
        return new ClienteId(valor);
    }


}
