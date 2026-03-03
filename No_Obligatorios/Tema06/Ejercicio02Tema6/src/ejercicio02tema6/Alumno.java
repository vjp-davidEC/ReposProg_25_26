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
    //Atributo
    private String grupo;
    
    //Constructores
    public Alumno() {
        super();
        grupo = "";
    }

    public Alumno(String nombre, String grupo) {
        super(nombre);
        this.grupo = grupo;
    }
    
    //Getter/Setter
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo){
        this.grupo = grupo;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Alumno{" + "grupo=" + grupo + '}';
    }
    
    //Implementación del método abstracto saludar()
    @Override
    public String saludar(){
        return "Hola, soy el alumno " + getNombre() + " y estoy en el grupo de " + grupo;
    }
}