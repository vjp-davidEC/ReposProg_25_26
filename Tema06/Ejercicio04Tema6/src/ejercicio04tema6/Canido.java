/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04tema6;

/**
 *
 * @author DAVID
 */
public abstract class Canido extends Animal {
    //Constructores
    public Canido(){
        super();
    }
    
    public Canido(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }
    
    //Mostrar
    public void mostrarCanido(){
        System.out.println("Canido");
        super.mostrarDatos();
    }
}