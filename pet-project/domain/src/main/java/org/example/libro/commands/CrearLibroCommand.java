package org.example.libro.commands;

import co.com.sofka.domain.generic.Command;
import org.example.libro.Author;
import org.example.libro.Categoria;
import org.example.libro.values.*;

public class CrearLibroCommand extends Command {

    private final AuthorId authorId;

    private final LibroCod entityId;
    private final Nombre nombre;
    private final Descripcion descripcion;

    public CrearLibroCommand( LibroCod entityId,AuthorId authorId, Nombre nombre, Descripcion descripcion) {
        this.entityId = entityId;
        this.authorId = authorId;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public LibroCod getEntityId() {
        return entityId;
    }

    public AuthorId getAuthorId() {
        return authorId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

}
