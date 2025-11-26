/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02tema6;

/**
 *
 * @author DAVID
 */
public class Profesor extends Persona{
    private String especialidad;
    
    public Profesor() {
        super();
        especialidad = "";
    }

    public Profesor(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" + "especialidad=" + especialidad + '}';
    }
    
    @Override
    public String saludar(){
        return "Hola, soy el profesor " + getNombre() + " y soy de la especialidad de " + especialidad;
    }
}