/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04tema6;

/**
 *
 * @author DAVID
 */
public class Perro extends Canido {
    
    public Perro(){
        super();
    }
    
    public Perro(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public String sonido() {
        return "Ladrido";
    }

    @Override
    public String alimentacion() {
        return "Carnivora";
    }

    @Override
    public String habitat() {
        return "Domestico";
    }

    @Override
    public String nombreCientifico() {
        return "Canis lupus familiaris";
    }
}