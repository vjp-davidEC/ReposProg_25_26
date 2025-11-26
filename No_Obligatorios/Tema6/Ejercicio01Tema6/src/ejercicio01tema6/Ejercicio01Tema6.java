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
        //Objetos que se crean de la clase {Suma, Multiplicacion, Potencia} con sus atributos
        Suma suma = new Suma(10.75,5.5);
        Multiplicacion m1 = new Multiplicacion(4.75, 3.15);
        Potencia potencia = new Potencia(2.2, 4);
        
        //Ejecutar las operaciones de los objetos
        suma.realizarOperacion();
        m1.realizarOperacion();
        potencia.realizarOperacion();
        
        System.out.println("");
        
        //Objetos que se crean de la superclase calculadora
        Calculadora c1 = new Suma(7.99, 8.75);
        Calculadora c2 = new Multiplicacion(6.90, 2.86);
        Calculadora c3 = new Potencia(3.3, 3);
        
        //Ejecutar las operaciones de los objetos polimorfismo
        c1.realizarOperacion();
        c2.realizarOperacion();
        c3.realizarOperacion();
    }
}