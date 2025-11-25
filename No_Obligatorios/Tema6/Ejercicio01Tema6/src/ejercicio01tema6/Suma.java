/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01tema6;

/**
 *
 * @author alumno
 */
public class Suma extends Calculadora{
    private double sumando;
    
    public Suma(){
        super();
        sumando = 0;
    }
    
    public Suma(double numero, double sumando){
        super(numero);
        this.sumando = sumando;
    }

    public double getSumando() {
        return sumando;
    }

    public void setSumando(double sumando) {
        this.sumando = sumando;
    }

    @Override
    public String toString() {
        return "Suma{" + "sumando=" + sumando + '}';
    }
    
    @Override
    public void realizarOperacion(){
        double resultado = getNumero() + sumando;
        System.out.println("La suma de " + getNumero() + " + " + sumando + " = " + resultado);
    }
}