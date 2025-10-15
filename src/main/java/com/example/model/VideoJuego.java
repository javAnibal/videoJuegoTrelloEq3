package com.example.model;

public class VideoJuego {
    private int  id;
    private String nombre;
    private String titulo;
    private String genero;
    private String plataforma;
    private int anio;
    private double valoracion;

    public VideoJuego() {

    }

    public VideoJuego(int id) {
        this.id = id;
    }

    public VideoJuego(int id, String nombre, String titulo, String genero, int anio, double valoracion) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.valoracion = valoracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", anio=" + anio +
                ", valoracion=" + valoracion +
                '}';
    }
}
