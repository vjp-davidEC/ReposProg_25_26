/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio15Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        int i;
        int resultado;
        
        System.out.print("Introduzca un numero para calcular su tabla de multiplicar: ");//Pedir al usuario que introduzca un numero
        numero = entrada.nextInt();
        
        for (i = 0; i <= 10; i++) {//Es el que se encarga de hacer el bucle
            resultado = numero * i;
            System.out.println(numero + "x" + i + "=" + resultado);//Resultado
        }
    }
    
}
