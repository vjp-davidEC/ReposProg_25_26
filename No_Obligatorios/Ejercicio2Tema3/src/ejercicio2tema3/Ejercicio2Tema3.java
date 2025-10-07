/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2tema3;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio2Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int resultado;
        
        System.out.println("Por favor, introduzca un numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero: ");
        numero2 = entrada.nextInt();
        
        if (numero1 > 10) {
            resultado = numero1 * numero2;
            System.out.println("La operacion que se realizo es producto y es " + resultado);
        }else{
            resultado = numero1 + numero2;
            System.out.println("La operacion que se realizo es suma y es " + resultado);
        }
    }
    
}
