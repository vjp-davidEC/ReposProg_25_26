/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5tema4;
import java.util.Scanner;
import utilidades.Operaciones;
/**
 *
 * @author DAVID
 */
public class Ejercicio5Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Por favor, introduzca un numero: ");//Pedir numero al usuario
        numero = entrada.nextInt();
        
        Operaciones.comprobarParImpar(numero);//Llamar al metodo de operaciones.java para comprobar si es par o impar
    }
    
}
