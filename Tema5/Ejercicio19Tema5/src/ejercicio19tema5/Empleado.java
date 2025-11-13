/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19tema5;

/**
 *
 * @author DAVID
 */
public class Empleado {
    //Atributos privados de la clase
    private String nombre;
    private int horas;
    private double tarifa;
    
    //Constructor que inicializa los atributos con los valores proporcionados
    public Empleado(){
        nombre = "";
        horas = 0;
        tarifa = 0;
    }
    
    public Empleado(String n, int h, double t){
        nombre = n;
        horas = h;
        tarifa = t;
    }
    
    //Método que calcula el sueldo bruto del empleado y se hace con un if
    public double calcularSueldo(){
        double sueldo;
        if (horas <= 40){
            sueldo = horas * tarifa;
        } else {
            sueldo = 40 * tarifa + (horas - 40) * tarifa * 1.5;
        }
        return sueldo;
    }
    
    //Método que muestra los datos del empleado y su sueldo bruto
    public void mostrarEmpleado(){
        System.out.println(nombre + " trabajo " + horas + " horas, cobra " + tarifa + " euros/hora" + "\nEl sueldo bruto es de: " + calcularSueldo() + " euros");
    }
}