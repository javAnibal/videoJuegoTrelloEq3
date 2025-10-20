package com.example.appLauncher;

import com.example.data.ConexionDB;
import com.example.model.GestorVideoJuego;
import com.example.model.VideoJuego;
import com.example.utils.MenuPrincipal;

import java.util.Scanner;

public class AppLauncher {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        GestorVideoJuego gestor = new GestorVideoJuego();
        //ConexionDB conexionDB = new ConexionDB();
        //conexionDB.infoConnection();

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
                    System.out.println("(Título:");
                    String titulo = sc.nextLine();
                    System.out.println("Genero");
                    String genero = sc.nextLine();
                    System.out.println("Plataforma");
                    String plataforma = sc.nextLine();
                    System.out.println("Año");
                    int anyo = Integer.parseInt(sc.nextLine());
                    System.out.println("Valoracion (1-10)");
                    int valoracion = Integer.parseInt(sc.nextLine());


                    //gestor.agregarVideoJuego(titulo, genero, plataforma, anyo, valoracion);
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
