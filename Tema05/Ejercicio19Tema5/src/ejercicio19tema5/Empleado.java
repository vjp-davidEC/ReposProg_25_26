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
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
    
    //Método que calcula el sueldo bruto del empleado y se hace con un if
    public double calcularSueldo(){
        double sueldo;
        if (getHoras() <= 40){
            sueldo = getHoras() * getTarifa();
        } else {
            sueldo = 40 * getTarifa() + (getHoras() - 40) * getTarifa() * 1.5;
        }
        return sueldo;
    }
    
    //Método que muestra los datos del empleado y su sueldo bruto
    public void mostrarEmpleado(){
        System.out.println(getHoras() + " trabajo " + getHoras() + " horas, cobra " + getTarifa() + " euros/hora" + "\nEl sueldo bruto es de: " + calcularSueldo() + " euros");
    }
}