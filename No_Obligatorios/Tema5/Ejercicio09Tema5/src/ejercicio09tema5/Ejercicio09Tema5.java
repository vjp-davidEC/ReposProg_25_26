/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09tema5;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio09Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mayor;//Variable
        
        //Pedir al usuario que introduzca tres nuemeros y se guarden en los objetos de la clase Numero
        System.out.print("Por favor, introduzca el primer numero: ");
        Numero num1 = new Numero(entrada.nextInt());
        System.out.print("Introduzca el segundo numero: ");
        Numero num2 = new Numero(entrada.nextInt());
        System.out.print("Por ultimo, introduzca el tercer numero: ");
        Numero num3 = new Numero(entrada.nextInt());
        
        //Determinar cual de los tres numeros es el mayor
        if (num1.getValor() > num2.getValor() && num1.getValor() > num3.getValor()){
            mayor = num1.getValor();
        } else if (num2.getValor() > num3.getValor()){
            mayor = num2.getValor();
        } else {
            mayor = num3.getValor();
        }
        System.out.println("El mayor de los tres numero es: " + mayor);//Resultado
    }
}