/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio22tema5;

/**
 *
 * @author DAVID
 */
public class Producto {
    //Atributo
    private String nombre;
    private double precio;
    private int stock;
    
    //Constructores
    public Producto(){
        nombre = "";
        precio = 0;
        stock = 0;
    }
    
    public Producto(String n, double p, int s){
        this.nombre = n;
        this.precio = p;
        this.stock = s;
    }
    
    
    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    //Métodos
    public boolean hayStock(int cantidad){
        return cantidad <= stock;
    }
    
    public void vender(int cantidad){
        if(hayStock(cantidad)){
            stock = stock - cantidad;
        }
    }
    
    //Mostrar
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Stock: " + getStock());
    }
}