package com.example.appLauncher;

import com.example.data.ConexionDB;
import com.example.model.GestorVideoJuego;
import com.example.model.VideoJuego;
import com.example.utils.MenuPrincipal;

import java.util.Scanner;

public class AppLauncher {
    public static void main(String[] args) {
        MenuPrincipal menu = new MenuPrincipal();
        GestorVideoJuego gestor = new GestorVideoJuego();
        //ConexionDB conexionDB = new ConexionDB();
        //conexionDB.infoConnection();

        menu.miMenu();




    }
}
