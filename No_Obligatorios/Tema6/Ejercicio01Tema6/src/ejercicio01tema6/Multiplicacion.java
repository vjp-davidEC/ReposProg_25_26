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
    private double multiplicador;
    
    //Constructores
    public Multiplicacion(){
        super();
        multiplicador = 0;
    }
    
    public Multiplicacion(double numero, double multiplicador){
        super(numero);
        this.multiplicador = multiplicador;
    }
    
    //Getter/Setter
    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Multiplicador{" + "multiplicador=" + multiplicador + '}';
    }
    
    //Implementación del método abstracto realizarOperacion()
    @Override
    public void realizarOperacion(){
        System.out.println("La multiplicacion de " + getNumero() + " * " + multiplicador + " = " + (getNumero() * multiplicador));
    }
}