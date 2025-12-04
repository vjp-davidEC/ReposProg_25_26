/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09tema6;

/**
 *
 * @author alumno
 */
public class Persona implements Gravable {
    //Atributos
    private String dni;
    private double ingresosAnuales;
    
    //Constructores
    public Persona(){
        dni = "";
        ingresosAnuales = 0;
    }
    
    public Persona(String dni, double ingresosAnuales) {
        this.dni = dni;
        this.ingresosAnuales = ingresosAnuales;
    }
    
    //Getters/Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(double ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }
    
    //Mostrar
    public void mostrarDatos() {
        System.out.println("--PERSONA--");
        System.out.println("DNI: " + dni);
        System.out.println("Ingresos anuales: " + ingresosAnuales + " euros");
        System.out.println("IRPF a pagar: " + calcularImpuesto() + " euros");
    }
    
    //Mostrar
    @Override
    public double calcularImpuesto() {
        double impuesto = 0;
        if (ingresosAnuales <= 12450) {
            impuesto = ingresosAnuales * 0.19;
        } else if (ingresosAnuales <= 20200) {
            impuesto = ingresosAnuales * 0.24;
        } else if (ingresosAnuales <= 35200) {
            impuesto = ingresosAnuales * 0.30;
        } else if (ingresosAnuales <= 60000) {
            impuesto = ingresosAnuales * 0.37;
        } else if (ingresosAnuales <= 300000) {
            impuesto = ingresosAnuales * 0.45;
        } else {
            impuesto = ingresosAnuales * 0.47;
        }
        return impuesto;
    }

    
}