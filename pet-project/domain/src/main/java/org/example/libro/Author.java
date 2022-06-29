package org.example.libro;

import co.com.sofka.domain.generic.Entity;
import org.example.libro.values.AuthorId;
import org.example.libro.values.Nombre;

public class Author extends Entity<AuthorId> {

    private Nombre nombreAuthor;

    public Author(AuthorId entityId, Nombre nombreAuthor) {
        super(entityId);
        this.nombreAuthor = nombreAuthor;
    }

    public void cambiarNombre(String nombre){
        this.nombreAuthor = nombreAuthor.cambiarNombre(nombre);
    }
}
