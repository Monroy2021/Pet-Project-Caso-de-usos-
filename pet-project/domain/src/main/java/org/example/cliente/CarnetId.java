package org.example.cliente;

import co.com.sofka.domain.generic.Identity;

public class CarnetId extends Identity {
    public CarnetId(String s) {
        super(s);
    }
public CarnetId(){

}
    public static CarnetId of(String s) {
        return new CarnetId(s);
    }
}
