package org.example.libro;

import co.com.sofka.domain.generic.Entity;
import org.example.libro.values.CategoriaId;
import org.example.libro.values.Genero;

public class Categoria extends Entity<CategoriaId> {

    private Genero genero;

    public Categoria(CategoriaId entityId, Genero genero) {
        super(entityId);
        this.genero = genero;
    }

    public void cambiarNombreGenero(String nombre){
        this.genero = genero.cambiarNombre(nombre);
    }
}
