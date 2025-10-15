package com.example.appLauncher;

import com.example.data.ConexionDB;
import com.example.model.GestorVideoJuego;
import com.example.utils.MenuPrincipal;

public class AppLauncher {
    public static void main(String[] args) {

        GestorVideoJuego gestor = new GestorVideoJuego();
        MenuPrincipal menu = new MenuPrincipal();
        ConexionDB conexionDB = new ConexionDB();


        conexionDB.infoConnection();





    }
}
