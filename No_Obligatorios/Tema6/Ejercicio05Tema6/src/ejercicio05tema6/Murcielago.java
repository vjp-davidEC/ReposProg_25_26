/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05tema6;

/**
 *
 * @author alumno
 */
public class Murcielago extends Mamifero implements Volador {
    //Atributos
    private double alturaVuelo;
    
    //Constructores
    public Murcielago() {
        super();
        alturaVuelo = 0;
    }
    
    public Murcielago(String nombre, String sexo, String color, int edad, double alturaVuelo) {
        super(nombre, sexo, color, edad);
        this.alturaVuelo = alturaVuelo;
    }

    //Getters/Setters
    public double getAlturaVuelo() {
        return alturaVuelo;
    }

    public void setAlturaVuelo(double alturaVuelo) {
        this.alturaVuelo = alturaVuelo;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Murcielago{" + "alturaVuelo=" + alturaVuelo + '}';
    }
    
    public void mostrarDatosMurcielago() {
        super.mostrarDatos();
        System.out.println(obtenerMensajeVolador());
        mostrarAlturaVuelo();
    }
    
    //Métodos
    @Override
    public String obtenerMensajeVolador() {
        return "El murcielago es un animal volador";
    }

    @Override
    public void aumentarAlturaVuelo() {
        alturaVuelo += 5;
    }

    @Override
    public void bajarAlturaVuelo() {
        if (alturaVuelo >= 5) alturaVuelo -= 5;
    }

    @Override
    public void mostrarAlturaVuelo() {
        System.out.println("Altura de vuelo: " + alturaVuelo + " m");
    }
}