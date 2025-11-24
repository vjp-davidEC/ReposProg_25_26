/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01tema6;

/**
 *
 * @author alumno
 */
public class Calculadora {
    //Atributo
    private int numero;
    
    //Constructores
    public Calculadora(){
        numero = 0;
    }
    
    public Calculadora(int numero) {
        this.numero = numero;
    }
    
    //Getter/Setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Calculadora{" + "numero=" + numero + '}';
    }
    
}
