/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1tema3;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio1Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
        int numeroPedido;
        
        System.out.println("Por favor, introduzca un numero: ");
        numeroPedido = entrada.nextInt();
        
        if (numeroPedido > 0) {
            System.out.println("El numero introducido es positivo");
        }else if (numeroPedido < 0){
            System.out.println("El numero introducido es negativo");
        }
        else if (numeroPedido == 0){
                System.out.println("El numero introducido es 0");
             }
        
    }
    
} 
    
