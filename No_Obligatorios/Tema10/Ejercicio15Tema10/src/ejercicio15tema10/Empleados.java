/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15tema10;

/**
 *
 * @author alumno
 */
public class Empleados {
    private String nombreEmpleado;
    private int sueldo;
    
    public Empleados() {
        nombreEmpleado = "";
        sueldo = 0;
    }

    public Empleados(String nombreEmpleado, int sueldo) {
        this.nombreEmpleado = nombreEmpleado;
        this.sueldo = sueldo;
    }

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

    @Override
    public String toString() {
        return "El nombre del empleado es " + nombreEmpleado + " y tiene un sueldo de " + sueldo;
    }
}
