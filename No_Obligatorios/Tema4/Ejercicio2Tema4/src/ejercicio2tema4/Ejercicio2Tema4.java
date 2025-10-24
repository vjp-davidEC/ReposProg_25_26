/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2tema4;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio2Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Operaciones op = new Operaciones();//Crea una clase
        
        int numero1;
        int numero2;
        int resultado;
        
        System.out.print("Por favor, introduzca un numero: ");//Pedir el primer numero
        numero1 = entrada.nextInt();
        System.out.print("Ahora, introduzca un segundo numero: ");//Pedir el segundo numero
        numero2 = entrada.nextInt();
        
        if (numero1 > 10) {//Multiplicar si es mayor a 10
            resultado = op.multiplicar(numero1, numero2);//Llama al metodo multiplicar
            System.out.println("La operacion que se realizo es producto y el resultado es " + resultado);
        } else {//Sumar si es menor a 10
            resultado = op.sumar(numero1, numero2);//Llama al metodo sumar
            System.out.println("La operacion que se realizo es suma y el resultado es " + resultado);
        }
    }
}