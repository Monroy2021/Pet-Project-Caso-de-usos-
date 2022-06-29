package org.example.cliente;


import co.com.sofka.domain.generic.ValueObject;

public class Email implements ValueObject<String> {

    private  final String usuario;

    public Email (String usuario){
        this.usuario=usuario;
    }

    @Override
    public  String value(){
        return usuario;
    }

}
