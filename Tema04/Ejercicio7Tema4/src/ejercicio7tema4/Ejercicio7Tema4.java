/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7tema4;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio7Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int numero3;
        int numero4;
                
        System.out.print("Por favor, introduce el primer numero: ");//Pedir al usuario
        numero1 = entrada.nextInt();
        System.out.print("Ahora, introduce un segundo numero: ");
        numero2 = entrada.nextInt();
        System.out.print("Introduce el tercer numero: ");
        numero3 = entrada.nextInt();
        System.out.print("Por ultimo, introduce un cuarto numero: ");
        numero4 = entrada.nextInt();
                       
        ordenarNumeros(numero1, numero2, numero3, numero4);//Metodo al que hemos llamado para ordenar los numeros
    }
    public static void ordenarNumeros(int numero1, int numero2, int numero3, int numero4) {
        int aux;//Variable auxiliar para intercambiar valores
        int i;
        
        for (i=1; i<=3; i++) {//Bucle con un for
            if (numero1 > numero2) {//Pasadas para las comparaciones
                aux = numero1;
                numero1 = numero2;
                numero2 = aux;
            } if (numero2 > numero3) {
                aux = numero2;
                numero2 = numero3;
                numero3 = aux;
            } if (numero3 > numero4) {
                aux = numero3;
                numero3 = numero4;
                numero4 = aux;
            }
        }
        System.out.println("El orden de los numeros introducidos es el: " + numero1 + " - " + numero2 + " - " + numero3 + " - " + numero4);//Resultado
    }
}