/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24tema3;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio24Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        int numeroPedido = 0;
        int i;
        
        do {
            System.out.print("Por favor, introduzca un numero: ");//Debe de ser un numero mayor de 0
            numero = entrada.nextInt();
            
            if (numero <= 0) {
                System.out.println("Error: El numero debe de ser mayor que 0. Intentalo de nuevo");//Pedirle que lo haga de nuevo y sea mayor de 0
            }
        }while (numero <= 0);
        
        System.out.println("Multiplos de 3 entre 1 y " + numero + ":");//Imprimir numeros desde 0 hasta el que usuario quiera
        for (i = 1; i <= numero; i++) {
            if ( i % 3 == 0) {
                System.out.print(i + " ");
                numeroPedido++;
            }
        }
        System.out.println("\nTotal de multiplos de 3 encontrados: " + numeroPedido);//Resultado de los numeros encontrados
    }
}
