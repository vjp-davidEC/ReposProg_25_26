/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04tema6;

/**
 *
 * @author DAVID
 */
public abstract class Felino extends Animal {
    //Constructores
    public Felino(){
        super();
    }
    
    public Felino(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }
    
    //Mostrar
    public void mostrarFelino(){
        System.out.println("Felino");
        super.mostrarDatos();
    }
}