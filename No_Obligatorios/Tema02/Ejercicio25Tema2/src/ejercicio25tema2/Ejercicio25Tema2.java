/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25tema2;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio25Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int numero3;
        int suma;
        int producto;
        
        System.out.println("Por favor, introduzca el primer numero: ");
        numero1 = entrada.nextInt();
        
        System.out.println("Por favor, introduzca el segundo nuemro: ");
        numero2 = entrada.nextInt();
        
        System.out.println("Por favor, introduzca el tercer numero: ");
        numero3 = entrada.nextInt();
        
        suma = numero1 + numero2 + numero3;
        producto = numero1 * numero2 * numero3;
        
        System.out.println("La suma de los numeros introducidos es: " + suma);
        System.out.println("El producto de los numeros introducidos es: " + producto);
    }
    
}
