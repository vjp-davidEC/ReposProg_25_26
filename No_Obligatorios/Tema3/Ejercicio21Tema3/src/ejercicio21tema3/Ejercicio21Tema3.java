/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21tema3;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio21Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double numero1;
        double numero2;
        double resultado;
        
        System.out.print("Introduce el primer numero: ");//Lo que tiene que poner el usuario
        numero1 = entrada.nextDouble();
            
        System.out.print("Introduce el segundo numero: ");
        numero2 = entrada.nextDouble();
        
        try {
            if (numero2 == 0) {
                System.out.println("Error: No se puede dividir entre 0");//Error
            }
            resultado = numero1 / numero2;
            System.out.println("El resultado de la division es: " + resultado);//Resultado
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());//Error en el catch
        }
    }
}