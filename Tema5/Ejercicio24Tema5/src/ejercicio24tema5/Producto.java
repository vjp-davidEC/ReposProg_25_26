/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24tema5;

/**
 *
 * @author DAVID
 */
public class Producto {
    //Atributos
    private String fechaCaducidad;
    private int numeroLote;
    
    //Constructores
    public Producto(){
        fechaCaducidad = "";
        numeroLote = 0;
    }
    
    public Producto(String fc, int nl){
        this.fechaCaducidad = fc;
        this.numeroLote = nl;
    }
    
    //Getters y setters
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fc) {
        this.fechaCaducidad = fc;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int nl) {
        this.numeroLote = nl;
    }
    
    //Mostrar
    public void mostrarDatosProducto(){
        System.out.println("Fecha de caducidad: " + getFechaCaducidad());
        System.out.println("Numero de lote: " + getNumeroLote());
    }
}