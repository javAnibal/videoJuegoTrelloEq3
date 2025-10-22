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




    public void eliminarVideoJuego()  {
    }


    public void mostrarTodosLosVideoJuegos()  {
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
