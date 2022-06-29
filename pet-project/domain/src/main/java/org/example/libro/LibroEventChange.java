package org.example.libro;

import co.com.sofka.domain.generic.EventChange;
import org.example.libro.events.CategoriaAgregada;
import org.example.libro.events.EstadoAgregado;
import org.example.libro.events.LibroCreado;

public class LibroEventChange extends EventChange {
    public LibroEventChange(Libro libro) {
        /*apply recibe un evento, cambiando el estado del agregado de manera
         desacoplada*/
        apply((LibroCreado event) -> {
            //Modificar el agregado Libro
            libro.categoria = null;
            libro.precio = null;
            libro.estado = null;
            libro.author = new Author(event.getAuthorId(),event.getNombreAutor());
            libro.descripcion = event.getDescripcion();
        });

        apply((CategoriaAgregada event) ->{
            libro.categoria = new Categoria(event.getCategoriaId(), event.getGenero());
        });

        apply((EstadoAgregado event) ->{
            libro.estado = event.getEstado();
        });

        apply((PrecioAgregado event) ->{
            libro.precio = event.getPrecio();
        });
    }
}
