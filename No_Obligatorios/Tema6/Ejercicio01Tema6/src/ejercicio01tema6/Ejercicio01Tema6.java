/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01tema6;

/**
 *
 * @author alumno
 */
public class Ejercicio01Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Suma suma = new Suma(10,5);
        Multiplicador multiplicacion = new Multiplicador(4, 3);
        Potencia potencia = new Potencia(2, 4);
        
        suma.realizarOperacion();
        multiplicacion.realizarOperacion();
        potencia.realizarOperacion();
        
        System.out.println("");
        
        Calculadora c1 = new Suma(7, 8);
        Calculadora c2 = new Multiplicador(6, 2);
        Calculadora c3 = new Potencia(3, 3);
        
        c1.realizarOperacion();
        c2.realizarOperacion();
        c3.realizarOperacion();
    }
}