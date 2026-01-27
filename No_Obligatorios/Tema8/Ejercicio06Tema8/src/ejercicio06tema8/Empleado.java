/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06tema8;

/**
 *
 * @author DAVID
 */
public class Empleado {
    //Atributos
    private String nombre;
    private int horasTrabajadas;
    private double tarifaHora;
    
    //Constructores
    public Empleado(){
        nombre = "";
        horasTrabajadas = 0;
        tarifaHora = 0;
    }

    public Empleado(String nombre, int horasTrabajadas, double tarifaHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    //Getters/Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
    
    //Metodo
    public double calcularSueldo(){
        if (horasTrabajadas <= 40) {
            return horasTrabajadas * tarifaHora;
        }else {
            int horasExtra = horasTrabajadas - 40;
            return (40 * tarifaHora) + (horasExtra * tarifaHora * 1.5);
        }
    }

    //Mostrar
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", horasTrabajadas=" + horasTrabajadas + ", tarifaHora=" + tarifaHora + '}';
    }   
}