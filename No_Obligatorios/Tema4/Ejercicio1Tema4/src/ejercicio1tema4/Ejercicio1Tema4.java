/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1tema4;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio1Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Por favor, introduzca un numero: ");//Pedirle al usario que introduzca un numero
        numero = entrada.nextInt();
        
        positivoONegativo(numero);//Metedo que evalua si es positivo o negativo
    }
    public static void positivoONegativo(int numero) {//Parametro
        if (numero >= 0) {//Positivo
            System.out.println("El numero introducido es positivo");//Salida positivo
        } else {//Negativo
            System.out.println("El numero introducido es negativo");//Salida negativo
        }
    }
}