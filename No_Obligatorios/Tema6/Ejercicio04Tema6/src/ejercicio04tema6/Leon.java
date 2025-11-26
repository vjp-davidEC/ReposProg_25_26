/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04tema6;

/**
 *
 * @author DAVID
 */
public class Leon extends Felino {
    
    public Leon(){
        super();
    }
    
    public Leon(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public String sonido() {
        return "Rugido";
    }

    @Override
    public String alimentacion() {
        return "Carnivora";
    }

    @Override
    public String habitat() {
        return "Sabana";
    }

    @Override
    public String nombreCientifico() {
        return "Panthera leo";
    }
}