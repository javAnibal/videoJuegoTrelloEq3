package com.example.model;

import java.util.HashSet;

import java.util.Set;

public class Biblioteca {

    private Set<VideoJuego> catalogo = new HashSet<>();

    public Biblioteca() {
        this.catalogo = new HashSet<>();
    }


    public Set<VideoJuego> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Set<VideoJuego> catalogo) {
        this.catalogo = catalogo;
    }


    //Mét-do para agregar videoJuegos a la Biblioteca

    public void agregarVideoJuego(VideoJuego juego) {

        this.catalogo.add(juego);
    }

    //Mét-do para saber si el set del catálogo esta vacío

    public boolean estaVacio() {

        return this.catalogo.isEmpty();

    }



    public void eliminarVideoJuego(VideoJuego juego)  {

        if (catalogo.remove(juego)) {
            System.out.println("Videojuego eliminado: " + juego.getTitulo());
        } else {
            System.out.println("El videojuego no se encontró en el catálogo.");
        }

    }


    public void mostrarTodosLosVideoJuegos()  {

        for (VideoJuego juego : catalogo){
            System.out.println(juego);
        }

    }


    public void mostrarVideoJuegoMasValorados() {
    }





    @Override
    public String toString() {
        return "Biblioteca{" +
                "catalogo=" + catalogo +
                '}';
    }
}
