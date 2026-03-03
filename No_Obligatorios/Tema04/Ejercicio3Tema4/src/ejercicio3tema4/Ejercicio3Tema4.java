/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3tema4;
import java.util.Scanner;
import utilidades.Operaciones;
/**
 *
 * @author DAVID
 */
public class Ejercicio3Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int numero3;
        
        System.out.print("Por favor, introduzca el primer numero: ");//Pedir primer numero
        numero1 = entrada.nextInt();
        System.out.print("Ahora, introduzca un segundo numero: ");//Pedir segundo numero
        numero2 = entrada.nextInt();
        System.out.print("Por ultimo, introduzca un tercer numero: ");//Pedir tercer numero
        numero3 = entrada.nextInt();
        
        Operaciones.imprimirMayor(numero1, numero2, numero3);//Llamar al metodo para imprimir el numero mayor
    }
}