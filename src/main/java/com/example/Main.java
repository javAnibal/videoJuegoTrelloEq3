package com.example;

import com.example.data.ConexionDB;
import com.example.utils.MenuPrincipal;

public class Main {


    public static void main(String[] args) {


        ConexionDB conexionDB = new ConexionDB();
        conexionDB.infoConnection();
        MenuPrincipal menuPrincipal = new MenuPrincipal();

        menuPrincipal.miMenu();


    }
}
