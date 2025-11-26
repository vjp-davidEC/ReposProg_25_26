/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02tema6;

/**
 *
 * @author DAVID
 */
public class Alumno extends Persona{
        private String grupo;
    
    public Alumno() {
        super();
        grupo = "";
    }

    public Alumno(String nombre, String grupo) {
        super(nombre);
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo){
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "grupo=" + grupo + '}';
    }
    
    @Override
    public String saludar(){
        return "Hola, soy el alumno " + getNombre() + " y estoy en el grupo de " + grupo;
    }
}