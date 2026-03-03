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
    //Atributo
    private double multiplicacion;
    
    //Constructores
    public Multiplicacion(){
        super();
        multiplicacion = 0;
    }
    
    public Multiplicacion(double numero, double multiplicacion){
        super(numero);
        this.multiplicacion = multiplicacion;
    }
    
    //Getter/Setter
    public double getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(double multiplicacion) {
        this.multiplicacion = multiplicacion;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Multiplicador{" + "multiplicador=" + multiplicacion + '}';
    }
    
    //Implementación del método abstracto realizarOperacion()
    @Override
    public void realizarOperacion(){
        System.out.println("La multiplicacion de " + getNumero() + " * " + multiplicacion + " = " + (getNumero() * multiplicacion));
    }
}