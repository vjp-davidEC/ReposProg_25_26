/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17tema3;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio17Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero;//Puede tener decimales
        double raiz;
        
        do {
            System.out.print("Introduce un numero para calcular su raiz cuadrada: ");//Peticion que le hacemos al usuario
            numero = entrada.nextDouble();
            
            if (numero < 0){
                System.out.println("Error: No se puede calcular la raiz cuadrada de este numero negativo. Intentalo de nuevo");//Error que debe salir
            }
        }while (numero < 0);
        
        raiz = Math.sqrt(numero);//Lo que hace la raiz cuadrada
        System.out.println("La raiz cuadrada de " + numero + " es " + raiz);//Resultado
    }
}
