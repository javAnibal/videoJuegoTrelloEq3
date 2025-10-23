package com.example.model;

import com.example.data.ConexionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;

import java.util.Set;

public class Biblioteca {

    private Set<VideoJuego> catalogo;

    public Biblioteca() {
        this.catalogo = new HashSet<>();
    }


    //TERMINADO

    public void agregarVideoJuego(VideoJuego juego) {

        this.catalogo.add(juego);

        insertarJV(juego);
        System.out.println("Se ha insertado un nuevo Juego" + juego.getTitulo());

    }

    private void insertarJV(VideoJuego juego) {

        String sql = "INSERT INTO videojuegos (titulo, genero, plataforma, anio, valoracion) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, juego.getTitulo());
            stmt.setString(2, juego.getGenero());
            stmt.setString(3, juego.getPlataforma());
            stmt.setInt(4, juego.getAnio());
            stmt.setDouble(5, juego.getValoracion());

            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println(" Error al insertar videojuego: " + e.getMessage());
        }
    }

    //POR COMPLETAR
    public void eliminarVideoJuego(VideoJuego juego) {

        if (catalogo.remove(juego)) {
            System.out.println("Videojuego eliminado: " + juego.getTitulo());
        } else {
            System.out.println("El videojuego no se encontró en el catálogo.");
        }

    }

    //POR COMPLETAR
    public void mostrarTodosLosVideoJuegos() {

        for (VideoJuego juego : catalogo) {
            System.out.println(juego);
        }

    }

    //POR IMPLEMENTAR

    public void mostrarVideoJuegoMasValorados() {
    }


}
