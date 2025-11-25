/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01tema6;

/**
 *
 * @author alumno
 */
public abstract class Potencia extends Calculadora{
    private int exponente;
    
    public Potencia(){
        super();
        exponente = 0;
    }
    
    public Potencia(double numero, int exponente){
        super(numero);
        this.exponente = exponente;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    @Override
    public String toString() {
        return "Potencia{" + "exponente=" + exponente + '}';
    }
    
    @Override
    public void realizarOperacion(){
        double resultado = Math.pow(getNumero(), exponente);
        System.out.println("La potencia de " + getNumero() + " ^ " + exponente + " = " + resultado);
    }
}
