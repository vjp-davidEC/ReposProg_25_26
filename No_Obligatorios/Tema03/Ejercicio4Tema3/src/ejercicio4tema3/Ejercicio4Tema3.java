/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4tema3;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio4Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int numero3;
        int menor;
        
        System.out.println("Por favor, introduzca el primer numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Por favor, introduzca el segundo numero: ");
        numero2 = entrada.nextInt();
        System.out.println("Por favor, introduzca el tercer numero: ");
        numero3 = entrada.nextInt();
        
        menor = numero1;
        
        if (numero2 < menor){
            menor = numero2;
        }
        if (numero3 < menor){
            menor = numero3;
        }
        System.out.println("El numero menor de los introducidos es el " + menor);
    }
    
}
