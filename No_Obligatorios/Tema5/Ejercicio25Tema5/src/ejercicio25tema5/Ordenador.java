/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25tema5;

/**
 *
 * @author DAVID
 */
public class Ordenador {
    //Atributos
    private int capacidadRAM;
    private int capacidadDiscoDuro;
    private String modeloProcesador;
    private String modeloTarjetaGrafica;
    private double precio;
    
    //Constructores
    public Ordenador(){
        capacidadRAM = 0;
        capacidadDiscoDuro = 0;
        modeloProcesador = "";
        modeloTarjetaGrafica = "";
        precio = 0;
    }
    
    public Ordenador(int cram, int cdd, String mp, String mtg, double p){
        capacidadRAM = cram;
        capacidadDiscoDuro = cdd;
        modeloProcesador = mp;
        modeloTarjetaGrafica = mtg;
        precio = p;
    }
    
    //Getters y setters
    public int getCapacidadRAM() {
        return capacidadRAM;
    }

    public void establecerCapacidadRAM(int cram) {
        capacidadRAM = cram;
    }

    public int getCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    }

    public void establecerCapacidadDiscoDuro(int cdd) {
        capacidadDiscoDuro = cdd;
    }

    public String getModeloProcesador() {
        return modeloProcesador;
    }

    public void establecerModeloProcesador(String mp) {
        modeloProcesador = mp;
    }

    public String getModeloTarjetaGrafica() {
        return modeloTarjetaGrafica;
    }

    public void establecerModeloTarjetaGrafica(String mtg) {
        modeloTarjetaGrafica = mtg;
    }

    public double getPrecio() {
        return precio;
    }

    public void establecerPrecio(double p) {
        precio = p;
    }
    
    //Mostrar
    public void mostrarDatosOrdenador(){
        System.out.println("Capacidad memoria RAM: " + getCapacidadRAM() + " GB");
        System.out.println("Capacidad disco duro: " + getCapacidadDiscoDuro() + " GB/TB");
        System.out.println("Modelo de procesador: " +  getModeloProcesador());
        System.out.println("Modelo de tarjeta grafica: " + getModeloTarjetaGrafica());
        System.out.println("Precio: " + getPrecio() + " euros");
    }
}