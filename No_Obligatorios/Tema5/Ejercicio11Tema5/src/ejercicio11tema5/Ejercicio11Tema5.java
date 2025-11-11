/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11tema5;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio11Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Objetos de la clase Numero sin valor inicial
        Numero num1 = new Numero();
        Numero num2 = new Numero();
        
        //Pedir al usuario que introduzca los dos numeros y asignarle el valor introducido al objeto
        System.out.print("Introduzca el primer numero: ");
        num1.setNumero(entrada.nextInt());
        System.out.print("Introduzca el segundo numero: ");
        num2.setNumero(entrada.nextInt());
        
        //Condicion de si el primer numero es mayor que 10 mostrar una multiplicacion, sino mostrar una suma
        if (num1.getValor() > 10){
            System.out.println("La multiplicacion es: " + (num1.getValor() * num2.getValor()));
        } else {
            System.out.println("La suma es: " + (num1.getValor() + num2.getValor()));
        }
    } 
}