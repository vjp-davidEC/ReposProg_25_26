/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3tema3;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio3Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int numero3;
        int mayor;
        
        System.out.println("Por favor, introduzca el primer numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero: ");
        numero2 = entrada.nextInt();
        System.out.println("Por ultimo, introduzca un tercer numero: ");
        numero3 = entrada.nextInt();
        
        mayor = numero1;
        
        if (numero2 > mayor){
            mayor = numero2;
        }
        if (numero3 > mayor){
            mayor = numero3;
        }
        System.out.println("El numero mayor de los introducidos es el " + mayor);
    }
    
}
