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
public class Comprador extends Usuarios {

    private CuentaBancaria bank;
    private ArrayList<Videojuegos> Games;
    private double dineroAct;
    private String PersonajeFav;

    public Comprador(String PersonajeFav,CuentaBancaria CB, int dineroAct, String nombre, String username, String password, int Edad) throws MiExcepcion {
        super(nombre, username, password, Edad);
        this.bank =CB;
        this.Games = new ArrayList();
        this.dineroAct = dineroAct;
        this.PersonajeFav= PersonajeFav;
    
    }

    public String getPersonajeFav() {
        return PersonajeFav;
    }

    public void setPersonajeFav(String PersonajeFav) {
        this.PersonajeFav = PersonajeFav;
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

    public double getDineroAct() {
        return dineroAct;
    }

    public void setDineroAct(double dineroAct) {
        this.dineroAct = dineroAct;
    }
    
    
    
    public void recargar(double cantidad) throws MiExcepcion{
   try{ 
    if(cantidad<=bank.getSaldo()){
    
        dineroAct=dineroAct+cantidad;
    double nuevosaldo= bank.getSaldo()-cantidad;
    
        bank.setSaldo(nuevosaldo);
   
    }throw new MiExcepcion("El saldo es menor a la cantidad a retirar");
    
   }catch(MiExcepcion e){
   
   e.getMessage();
   }
    
}

    @Override
    public String toString() {
        return "Comprador{" + "\nbank=" + bank + ", \nGames=" + Games + ", \ndineroAct=" + dineroAct + ", \nPersonajeFav=" + PersonajeFav + '}';
    }

    
    

}
