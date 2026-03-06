/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9tema3;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio9Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int aux;
        
        System.out.println("Por favor, introduzca el primer numero:");
        numero1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero:");
        numero2 = entrada.nextInt();
        System.out.println("Introduzca el tercer numero:");
        numero3 = entrada.nextInt();
        System.out.println("Por ultimo, introduzca un cuarto numero:");
        numero4 = entrada.nextInt();
       
        if (numero1 > numero2) {aux = numero1; numero1 = numero2; numero2 = aux; }
        if (numero1 > numero3) {aux = numero1; numero1 = numero3; numero3 = aux; }
        if (numero1 > numero4) {aux = numero1; numero1 = numero4; numero4 = aux; }
        if (numero2 > numero3) {aux = numero2; numero2 = numero3; numero3 = aux; }
        if (numero2 > numero4) {aux = numero2; numero2 = numero4; numero4 = aux; }
        if (numero3 > numero4) {aux = numero3; numero3 = numero4; numero4 = aux; }
        
        System.out.println("El orden de los numeros introducidos es el " + numero1 + "-" + numero2 + "-" + numero3 + "-" + numero4);
    }
}
