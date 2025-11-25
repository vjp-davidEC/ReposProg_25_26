/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01tema6;

/**
 *
 * @author alumno
 */
public abstract class Multiplicador extends Calculadora{
    private double multiplicador;
    
    public Multiplicador(){
        super();
        multiplicador = 0;
    }
    
    public Multiplicador(double numero, double multiplicador){
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
        double resultado = getNumero() * multiplicador;
        System.out.println("La multiplicacion de " + multiplicador + " * " + multiplicador + " = " + resultado);
    }
}
