/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import java.util.ArrayList;

/**
 *
 * @author jrgir
 */
public class Vendedor extends Usuarios {
    
    private CuentaBancaria bank;
    private ArrayList<Videojuegos> Games;
    private double dineroRecibido;
    private String PersonajeFav;
    private double Stars;

    public Vendedor(CuentaBancaria bank,double dineroRecibido, String PersonajeFav, double Stars, String nombre, String username, String password, int Edad) throws MiExcepcion {
        super(nombre, username, password, Edad);
        this.bank = bank;
        this.Games = new ArrayList();
        this.dineroRecibido = dineroRecibido;
        this.PersonajeFav = PersonajeFav;
        this.Stars = Stars;
    
    }

    public CuentaBancaria getBank() {
        return bank;
    }

    public void setBank(CuentaBancaria bank) {
        this.bank = bank;
    }

    public ArrayList<Videojuegos> getGames() {
        return Games;
    }

    public void setGames(ArrayList<Videojuegos> Games) {
        this.Games = Games;
    }

    public double getDineroRecibido() {
        return dineroRecibido;
    }

    public void setDineroRecibido(double dineroRecibido) {
        this.dineroRecibido = dineroRecibido;
    }

    public String getPersonajeFav() {
        return PersonajeFav;
    }

    public void setPersonajeFav(String PersonajeFav) {
        this.PersonajeFav = PersonajeFav;
    }

    public double getStars() {
        return Stars;
    }

    public void setStars(double Stars) {
        this.Stars = Stars;
    }
    
    
    
}










