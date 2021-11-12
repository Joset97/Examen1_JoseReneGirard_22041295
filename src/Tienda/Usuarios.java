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
public class Usuarios {

    protected String nombre;
    protected String username;
    protected String password;
    protected int Edad;

    public Usuarios(String nombre, String username, String password, int Edad) throws MiExcepcion {
        this.nombre = nombre;
        this.username = username;
        this.password = password;
        setEdad(Edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
       
        return Edad;
    }

    public void setEdad(int Edad) throws MiExcepcion{
     try{   
        if(Edad>=18){   
        this.Edad = Edad;
        }
        
        throw new MiExcepcion("Tienes que ser mayor de edad para registrarte");
     }catch(MiExcepcion e){
     
     e.getMessage();
     }
     }

    @Override
    public String toString() {
        return "Usuarios{" + "\n Nombre=" + nombre + ", \n username=" + username + ", \n password=" + password + ", \nEdad=" + Edad + '}';
    }

    
}
