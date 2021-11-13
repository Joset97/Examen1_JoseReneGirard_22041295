/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author jrgir
 */
public class ArrayListUsuarios {

    public ArrayList<Usuarios> ArrayListusers;

    public ArrayListUsuarios() throws MiExcepcion {

        Random rd = new Random();

        int randomv1 = rd.nextInt(10000) + 2000;
        int randomv2 = rd.nextInt(10000) + 2000;
        int randomc1 = rd.nextInt(10000) + 2000;
        int randomc2 = rd.nextInt(10000) + 2000;
        int randomcm1 = rd.nextInt(800) + 100;
        int randomcm2 = rd.nextInt(800) + 100;

        CuentaBancaria bancov1 = new CuentaBancaria(randomv1, 341232);
        CuentaBancaria bancov2 = new CuentaBancaria(randomv2, 213542);
        CuentaBancaria bancoc3 = new CuentaBancaria(randomcm1, 154123);
        CuentaBancaria bancoc4 = new CuentaBancaria(randomcm2, 312312);

        ArrayListusers = new ArrayList();

        ArrayListusers.add(new Admin("Jose", "Joset", "pasword", 19));
        ArrayListusers.add(new Vendedor(bancov1, 0, "Yoshi", "James", "Jamememes", "Yoshi123", 21));
        ArrayListusers.add(new Vendedor(bancov2, 0, "Zelda", "Luis", "Linkus", "Hyrule", 31));
        ArrayListusers.add(new Comprador("kirbi", bancoc3, randomc1, "Alex", "Alexhz", "Alexis", 18));
        ArrayListusers.add(new Comprador("Luigi", bancoc4, randomcm2, "Gustavo", "Tavo12", "Mainsayu", 22));

        ((Vendedor) ArrayListusers.get(1)).crearJuego("Foza Horizon 5", 2021, 10, 1500);
        ((Vendedor) ArrayListusers.get(1)).crearJuego("Super Mario Maker", 2016, 10, 1500);
        ((Vendedor) ArrayListusers.get(2)).crearJuego("Foza Horizon 5", 2021, 10, 1500);
        ((Vendedor) ArrayListusers.get(2)).crearJuego("Super Mario Galaxy", 2007, 5, 1500);

    }

    public ArrayList<Usuarios> getUsers() {
        return ArrayListusers;
    }

    public void setUsers(ArrayList<Usuarios> users) {
        this.ArrayListusers = users;
    }

}

//CuentaBancaria bank,double dineroRecibido, String PersonajeFav, String nombre, String username, String password, int Edad
//(String PersonajeFav,CuentaBancaria CB, int dineroAct, String nombre, String username, String password, int Edad) 
