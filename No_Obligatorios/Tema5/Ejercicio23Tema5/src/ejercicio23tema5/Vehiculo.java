/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23tema5;

/**
 *
 * @author DAVID
 */
public class Vehiculo {
    //Atributo
    private String matricula;
    private String modelo;
    private int numeroPlazas;
    
    //Constructores
    public Vehiculo(){
        matricula = "";
        modelo = "";
        numeroPlazas = 0;
    }
    
    public Vehiculo(String m, String mo, int np){
        matricula = m;
        modelo = mo;
        numeroPlazas = np;
    }
    
    //Getters y setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String m) {
        matricula = m;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        modelo = m;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int np) {
        numeroPlazas = np;
    }
    
    //Mostrar
    public void mostrarDatosVehiculo(){
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Numero de plazas: " + getNumeroPlazas());
    }
}