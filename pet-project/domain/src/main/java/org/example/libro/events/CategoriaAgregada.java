package org.example.libro.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.libro.values.CategoriaId;
import org.example.libro.values.Genero;

public class CategoriaAgregada extends DomainEvent {

    private CategoriaId categoriaId;
    private Genero genero;
    public CategoriaAgregada(CategoriaId categoriaId, Genero genero) {
        super("org.example.libro.categoriaAgregada");
        this.categoriaId = categoriaId;
        this.genero = genero;
    }

    public CategoriaId getCategoriaId() {
        return categoriaId;
    }

    public Genero getGenero() {
        return genero;
    }
}
