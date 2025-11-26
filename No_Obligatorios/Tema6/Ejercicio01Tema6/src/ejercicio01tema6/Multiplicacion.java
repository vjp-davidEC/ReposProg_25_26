/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01tema6;

/**
 *
 * @author DAVID
 */
public class Multiplicacion extends Calculadora{
    private double multiplicador;
    
    public Multiplicacion(){
        super();
        multiplicador = 0;
    }
    
    public Multiplicacion(double numero, double multiplicador){
        super(numero);
        this.multiplicador = multiplicador;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    @Override
    public String toString() {
        return "Multiplicador{" + "multiplicador=" + multiplicador + '}';
    }
    
    @Override
    public void realizarOperacion(){
        System.out.println("La multiplicacion de " + getNumero() + " * " + multiplicador + " = " + (getNumero() * multiplicador));
    }
}