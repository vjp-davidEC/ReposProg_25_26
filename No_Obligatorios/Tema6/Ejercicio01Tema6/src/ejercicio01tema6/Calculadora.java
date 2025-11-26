/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01tema6;

/**
 *
 * @author alumno
 */
public abstract class Calculadora {
    //Atributo
    private double numero;
    
    //Constructores
    public Calculadora(){
        numero = 0;
    }
    
    public Calculadora(double numero) {
        this.numero = numero;
    }
    
    //Getter/Setter
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
    
    public abstract void realizarOperacion();
    
    //Mostrar
    @Override
    public String toString() {
        return "Calculadora{" + "numero=" + numero + '}';
    }
}