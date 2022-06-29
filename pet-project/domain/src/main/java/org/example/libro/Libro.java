package org.example.libro;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.libro.events.EstadoAgregado;
import org.example.libro.events.LibroCreado;
import org.example.libro.events.CategoriaAgregada;
import org.example.libro.values.*;

import java.util.List;

public class Libro extends AggregateEvent<LibroCod> {

    //Entidad
    protected Author author;
    //Entidad
    protected Categoria categoria;
    //Objeto de valor
    protected Descripcion descripcion;
    //Objeto de valor
    protected Estado estado;
    //Objeto de valor
    protected Precio precio;
    public Libro(LibroCod entityId, AuthorId authorId,Nombre nombreAuthor, Descripcion descripcion) {
        super(entityId);
        //para crear un libro no se puede por asignacion si no por un evento
        appendChange(new LibroCreado(authorId,descripcion, nombreAuthor)).apply();
        //En el evento de dominio se necesita hacer subscripcion del mismo
        subscribe(new LibroEventChange(this));
    }

    private Libro(LibroCod id) {
        super(id);
        subscribe(new LibroEventChange(this));
    }

    //Los comportamientos en el agregado se hacen a travez de un evento
    public void agregarCategoria(CategoriaId categoriaId, Genero genero){
        appendChange(new CategoriaAgregada(categoriaId,genero)).apply();
    }

    public void agregarEstado(Estado estado){
        appendChange(new EstadoAgregado(estado)).apply();
    }

    public void agregarPrecio(Precio precio){
        appendChange(new PrecioAgregado(precio)).apply();
    }

    //Metodo para reconstruir el estado del libro (llamar como tal)
    public static Libro from(LibroCod id, List<DomainEvent> events){
        var libro = new Libro(id);
        events.forEach(libro::applyEvent); // se aplica los enventos
        return libro;
    }
}
