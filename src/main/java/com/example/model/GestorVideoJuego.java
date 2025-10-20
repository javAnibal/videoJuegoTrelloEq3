package com.example.model;

import com.example.utils.VideoJuegoException;


/**
 * @GestorVideoJuego Clase responsable de gestionar operaciones CRUD sobre videojuegos.
 * Métodos disponibles: agregar, eliminar, mostrar todos, mostrar más valorados.
 */
public class GestorVideoJuego {

    private Biblioteca biblioteca;

    public GestorVideoJuego() {
        this.biblioteca = new Biblioteca();
    }

    public void agregarVideoJuego(VideoJuego juego) throws VideoJuegoException {

        biblioteca.agregarVideoJuego(juego);


    }


    public void eliminarVideoJuego() throws VideoJuegoException {
    }


    public void mostrarTodosLosVideoJuegos() throws VideoJuegoException {
    }


    public void mostrarVideoJuegoMasValorados() throws VideoJuegoException {
    }


}
