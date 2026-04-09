/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02tema11;

/**
 *
 * @author DAVID
 */
public class Producto {
    //Atributos
    private String nombreProducto;
    private float precio;
    private int stock;
    
    //Constructores
    public Producto() {
        nombreProducto = "";
        precio = 0f;
        stock = 0;
    }

    public Producto(String nombreProducto, float precio, int stock) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
    }

    //Getters/Setters
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //Mostrar
    @Override
    public String toString() {
        return "Nombre del producto: " + nombreProducto + "\nPrecio: " + precio + "\nStock: " + stock;
    }
}
