/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19tema2;

/**
 *
 * @author DAVID
 */
public class Ejercicio19Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 3, b = 6, c;
        c = a / b;
        System.out.println("El valor de c es: " + c);//Division entera
        
        c = a % b;
        System.out.println("El valor de c es: " + c);//Resto de la division
        
        a++;
        System.out.println("El valor de a es : " + a);//Incrementar a 1
        
        c = ++a + b++;
        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);
        System.out.println("El valor de c es: " + c);//Suma de pre-incremento a e incremento b
        
        c = a++ + b++;
        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);
        System.out.println("El valor de c es: " + c);//Suma de incremto a y b
    }
    
}
