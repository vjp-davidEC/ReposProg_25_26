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
    //Atributo
    private String especialidad;
    
    //Constructores
    public Profesor() {
        super();
        especialidad = "";
    }

    public Profesor(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }
    
    //Getter/Setter
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Profesor{" + "especialidad=" + especialidad + '}';
    }
    
    //Implementación del método abstracto saludar()
    @Override
    public String saludar(){
        return "Hola, soy el profesor " + getNombre() + " y soy de la especialidad de " + especialidad;
    }
}