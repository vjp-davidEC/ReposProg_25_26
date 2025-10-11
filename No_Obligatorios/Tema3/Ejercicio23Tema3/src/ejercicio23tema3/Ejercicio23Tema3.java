/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23tema3;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio23Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        int i;
        
        do {
            System.out.print("Por favor, ingrese un numero: ");//Debe de ser un numero mayor de 1
            numero = entrada.nextInt();
            if (numero <= 1) {
                System.out.println("Error: El numero debe ser mayor que 1. Intentelo de nuevo");//Pedirle que lo haga de nuevo y sea mayor de 1
            }
        }while (numero <= 1);
        
        System.out.println("Numeros desde 1 hasta " + numero + ":");//Imprimir numeros desde 1 hasta el que usuario quiera
        for (i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
}
