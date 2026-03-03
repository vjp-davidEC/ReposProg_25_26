/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2tema4;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio2Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
                
        int numero1;
        int numero2;
        
        System.out.print("Por favor, introduzca un numero: ");//Pedir el primer numero
        numero1 = entrada.nextInt();
        System.out.print("Ahora, introduzca un segundo numero: ");//Pedir el segundo numero
        numero2 = entrada.nextInt();
        
        if (numero1 > 10) {//Multiplicar si es mayor a 10
            Operaciones.multiplicar(numero1, numero2);//Llama al metodo multiplicar
        } else {//Sumar si es menor a 10
            Operaciones.sumar(numero1, numero2);//Llama al metodo sumar
        }
    }
}