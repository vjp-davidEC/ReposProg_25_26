/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05tema6;

/**
 *
 * @author alumno
 */
public class Ornitorrinco extends Mamifero implements Oviparo {
    private int numHuevos;
    
    public Ornitorrinco(){
        super();
        numHuevos = 0;
    }
    
    public Ornitorrinco(String nombre, String sexo, String color, int edad, int numHuevos) {
        super(nombre, sexo, color, edad);
        this.numHuevos = numHuevos;
    }

    //Getters/Setters
    public int getNumHuevos() {
        return numHuevos;
    }

    public void setNumHuevos(int numHuevos) {
        this.numHuevos = numHuevos;
    }

    //Mostrar
    @Override
    public String toString() {
        return "Ornitorrinco{" + "numHuevos=" + numHuevos + '}';
    }
    
    public void mostrarDatosOrnitorrinco() {
        super.mostrarDatos();
        System.out.println(obtenerMensajeOviparo());
        mostrarNumHuevos();
    }
    
    //Métodos
    @Override
    public String obtenerMensajeOviparo() {
        return "El ornitorrinco es un mamifero oviparo";
    }

    @Override
    public void ponerHuevo() {
        numHuevos++;
    }

    @Override
    public void incubarHuevo() {
        if (numHuevos > 0) numHuevos--;
    }

    @Override
    public void mostrarNumHuevos() {
        System.out.println("Numero de huevos: " + numHuevos);
    }
}