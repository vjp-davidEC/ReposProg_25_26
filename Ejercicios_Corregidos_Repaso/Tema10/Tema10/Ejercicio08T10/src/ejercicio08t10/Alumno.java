/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08t10;

/**
 *
 * @author admin
 */
public class Alumno {
    private String nombre;
    private String curso;
    
    public Alumno(){
        this.nombre = "";
        this.curso = "";
    }
    
    public Alumno(String nombre, String curso){
        this.nombre = nombre;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public String toString() {
        return "Nombre: "+this.nombre+" - Curso: "+this.curso;
    }
    
    
}
