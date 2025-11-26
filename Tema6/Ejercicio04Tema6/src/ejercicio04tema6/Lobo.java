/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04tema6;

/**
 *
 * @author DAVID
 */
public class Lobo extends Canido {
    
    public Lobo(){
        super();
    }
    
    public Lobo(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public String sonido() {
        return "Aullido";
    }

    @Override
    public String alimentacion() {
        return "Carnivora";
    }

    @Override
    public String habitat() {
        return "Bosque";
    }

    @Override
    public String nombreCientifico() {
        return "Canis lupus";
    }
}