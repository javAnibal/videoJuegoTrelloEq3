package com.example.utils;


import com.example.model.GestorVideoJuego;
import com.example.model.VideoJuego;

import java.util.Scanner;

public class MenuPrincipal {
    static Scanner sc = new Scanner(System.in);

    GestorVideoJuego gestor = new GestorVideoJuego();
    public void miMenu(){

        while (true){
            System.out.println("Menú Principal");
            System.out.println("1. Añadir nuevo juego.");
            System.out.println("2. Eliminar juego.");
            System.out.println("3. Buscar juego por título.");
            System.out.println("4. Buscar juegos por plataforma.");
            System.out.println("5. Mostrar juegos por género.");
            System.out.println("6. Mostrar todos los juegos.");
            System.out.println("7. Mostrar los juegos mejor valorados.");
            System.out.println("8. Salir");
            System.out.println();
            System.out.print("Elige una opción: ");
            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion){
                case 1 -> {
                    System.out.println("Título:");
                    String titulo = sc.nextLine();
                    System.out.println("Genero");
                    String genero = sc.nextLine();
                    System.out.println("Plataforma");
                    String plataforma = sc.nextLine();
                    System.out.println("Año");
                    int anyo = Integer.parseInt(sc.nextLine());
                    System.out.println("Valoracion (1-10)");
                    int valoracion = Integer.parseInt(sc.nextLine());


                    /**
                     * @juego -> creo el objeto
                     */
                    VideoJuego juego = new VideoJuego();
                    juego.setTitulo(titulo);
                    juego.setGenero(genero);
                    juego.setPlataforma(plataforma);
                    juego.setAnio(anyo);
                    juego.setValoracion(valoracion);

                    /**
                     * AGREGO -> el juego a la biblioteca que contiene la estructura de SET para almacenar los objetos
                     */
                    try {
                        gestor.agregarVideoJuego(juego);
                    } catch (VideoJuegoException e) {
                        System.err.println("No se ha podido crear el objeto VideoJuego");
                    }

                }
                case 2-> {
                    System.out.println("Id");
                    int id = Integer.parseInt(sc.nextLine());
                    //gestor.eliminarVideoJuego(id);
                }

                case 3 -> {
                    System.out.println("Titulo");
                    String titulo = sc.nextLine();
                    //gestor.buscarPorTitulo(titulo);
                }
                case 4 -> {
                    System.out.println("plataforma");
                    String plataforma = sc.nextLine();
                    //gestor.buscarPorPlataforma(plataforma);
                }
                case 5 -> {
                    System.out.println("genero");
                    String genero = sc.nextLine();
                    //gestor.buscarPorGenero(genero);
                }
                case 6 -> {
                    //gestor.mostrarTodosLosVideoJuegos();
                }

                case 7 -> {
                    //gestor.mostrarVideoJuegoMasValorados();
                }

                case 8 -> {
                    System.out.println("Gracias por usar el Gestor de Videojuegos");
                    return;}

                default -> System.out.println("Opción incorrecta");
            }

        }
    }
}
