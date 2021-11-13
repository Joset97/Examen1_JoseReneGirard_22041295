/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

/**
 *
 * @author jrgir
 */
public class Admin extends Usuarios{

    public Admin(String nombre, String username, String password, int Edad) throws MiExcepcion {
        super(nombre, username, password, Edad);
    }

    @Override
    public String toString() {
        return "Admin{" + '}';
    }
    
    
    
}
