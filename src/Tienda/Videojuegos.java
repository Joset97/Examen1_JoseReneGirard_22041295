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
public class Videojuegos {

    private String nombre;
    private int relaseDate;
    private int cantidad;
    private double precio;

    public Videojuegos(String nombre, int relaseDate, int cantidad, double precio) {
        this.nombre = nombre;
        this.relaseDate = relaseDate;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRelaseDate() {
        return relaseDate;
    }

    public void setRelaseDate(int relaseDate) {
        this.relaseDate = relaseDate;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Videojuegos{" + "\n Nombre=" + nombre 
                + ", \n RelaseDate=" + relaseDate 
                + ", \nCantidad=" + cantidad 
                + ", \nprecio=" + precio + '}';
    }
    

}
