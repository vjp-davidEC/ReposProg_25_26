/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01tema6;

/**
 *
 * @author alumno
 */
public class Potencia extends Calculadora{
    //Atributo
    private int exponente;
    
    //Constructores
    public Potencia(){
        super();
        exponente = 0;
    }
    
    public Potencia(double numero, int exponente){
        super(numero);
        this.exponente = exponente;
    }
    
    //Getter/Setter
    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Potencia{" + "exponente=" + exponente + '}';
    }
    
    //Implementación del método abstracto realizarOperacion()
    @Override
    public void realizarOperacion(){
        System.out.println("La potencia de " + getNumero() + " ^ " + exponente + " = " + Math.pow(getNumero(), exponente));
    }
}