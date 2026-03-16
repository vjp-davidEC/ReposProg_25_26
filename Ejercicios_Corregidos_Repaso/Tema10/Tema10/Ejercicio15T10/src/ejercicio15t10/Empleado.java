/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15t10;

/**
 *
 * @author d3stroya
 */
public class Empleado {
    // ATRIBUTOS
    private String nombreEmpleado;
    private int sueldo;

    // CONSTRUCTORES
    public Empleado() {
        this.nombreEmpleado = "";
        this.sueldo = 0;
    }
    
    public Empleado(String nombreEmpleado, int sueldo) {
        this.nombreEmpleado = nombreEmpleado;
        this.sueldo = sueldo;
    }

    // GETTER Y SETTER
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    // MOSTRAR
    public void mostrarEmpleado(){
        System.out.println("    [" + this.nombreEmpleado+": " + this.sueldo + "]");
    }
}
