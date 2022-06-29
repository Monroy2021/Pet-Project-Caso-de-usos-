package org.example.libro.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.libro.values.AuthorId;
import org.example.libro.values.Descripcion;
import org.example.libro.values.Nombre;

public class LibroCreado extends DomainEvent {

    private final AuthorId authorId;

    private final Nombre nombreAutor;
    private final Descripcion descripcion;

    public LibroCreado(AuthorId authorId, Descripcion descripcion, Nombre nombreAutor) {
        super("org.example.areadeventas.libroCreado");
        this.authorId = authorId;
        this.descripcion = descripcion;
        this.nombreAutor = nombreAutor;
    }

    public AuthorId getAuthorId() {
        return authorId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Nombre getNombreAutor(){
        return nombreAutor;
    }
}
