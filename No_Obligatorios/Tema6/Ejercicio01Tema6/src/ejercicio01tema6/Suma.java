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
    //Atributo
    private double sumando;
    
    //Constructores
    public Suma(){
        super();
        sumando = 0;
    }
    
    public Suma(double numero, double sumando){
        super(numero);
        this.sumando = sumando;
    }
    
    //Getter/Setter
    public double getSumando() {
        return sumando;
    }

    public void setSumando(double sumando) {
        this.sumando = sumando;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Suma{" + "sumando=" + sumando + '}';
    }
    
    //Implementación del método abstracto realizarOperacion()
    @Override
    public void realizarOperacion(){
        System.out.println("La suma de " + getNumero() + " + " + sumando + " = " + (getNumero() + sumando));
    }
}