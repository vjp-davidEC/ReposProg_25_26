/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25tema5;

/**
 *
 * @author DAVID
 */
public class Portatil extends Ordenador{//Clase que se hereda de Ordenador
    //Atributos
    private String marca;
    private double tamanioPantalla;
    private double peso;
    
    //Constructores
    public Portatil(){
        super();//Se pone para llamar al constructor de la clase Ordenador sin parámetros
        marca = "";
        tamanioPantalla = 0;
        peso = 0;
    }
    
    public Portatil(int cram, int cdd, String mp, String mtg, double p, String m, double tp, double pp){
        super(cram, cdd, mp, mtg, p);//Se pone para llamar al constructor de la clase Ordenador con parámetros
        marca = m;
        tamanioPantalla = tp;
        peso = pp;
    }
    
    //Getters y setters/establecer
    public String getMarca() {
        return marca;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public double getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void establecerTamanioPantalla(double tp) {
        tamanioPantalla = tp;
    }

    public double getPeso() {
        return peso;
    }

    public void establecerPeso(double pp) {
        peso = pp;
    }
    
    //Mostrar
    public void mostrarDatosPortatil(){
        super.mostrarDatosOrdenador();
        System.out.println("Marca: " + getMarca());
        System.out.println("Tamanio de la pantalla: " + getTamanioPantalla());
        System.out.println("Peso: " + getPeso() + "Kg");
    }
}