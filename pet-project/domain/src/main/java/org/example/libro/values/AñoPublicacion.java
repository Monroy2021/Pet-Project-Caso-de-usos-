package org.example.libro.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AñoPublicacion implements ValueObject<String> {

    private final LocalDate fecha;
    private final String format;

    public AñoPublicacion(int dia, int mes, int año) {
        try{
            fecha = LocalDate.of(año,mes,dia);
            if(fecha.isAfter(LocalDate.now())){
                throw new IllegalArgumentException("La fecha no es valida");
            }
        }catch (DateTimeException e){
            throw new IllegalArgumentException(e.getMessage());
        }
        format = generateFormat();
    }

    private String generateFormat(){
        return fecha.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    @Override
    public String value() {
        return format;
    }


}
