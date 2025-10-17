/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22tema3;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio22Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int resultado;
        
        try {
            System.out.print("Introduce el primer numero: ");//Lo que tiene que poner el usuario
            numero1 = entrada.nextInt();
            
            System.out.print("Introduce el segundo numero: ");
            numero2 = entrada.nextInt();
            
            resultado = numero1 + numero2;
            System.out.println("El resultado de la suma es: " + resultado);//Resultado
        } catch (Exception e) {
            System.out.println("Error: Debes introducir solo numeros");//Error
        }
    }
}