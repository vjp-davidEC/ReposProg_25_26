/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22tema4;

/**
 *
 * @author DAVID
 */
public class Ejercicio22Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double PI = Math.PI;//Guardar la constante PI con un double
        double Euler = Math.E;//Guardar la constante Euler con un double
        
        mostrarConstantes(PI, Euler);//Llamo al metodo mostrarConstantes pasando el PI y Euler como parametro 
    }
    public static void mostrarConstantes(double PI, double Euler) {//Metodo que muestra en pantalla los valores de PI y Euler en el mensaje
        System.out.println("Valor de la constante PI: " + PI);
        System.out.println("Valor de la constante de Euler: " + Euler);
    }
}