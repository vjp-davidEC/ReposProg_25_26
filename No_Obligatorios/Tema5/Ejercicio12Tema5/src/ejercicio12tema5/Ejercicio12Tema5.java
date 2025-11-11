/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12tema5;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio12Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Pedir al usuario que introduzca los dos valores y que se guarde los valores en las variables
        System.out.print("Introduza el primer cateto: ");
        double c1 = entrada.nextDouble();
        System.out.print("Introduzca el segundo cateto: ");
        double c2 = entrada.nextDouble();
        
        //Objeto de la clase Triangulo con los valores y calcula la hipotenusa con un método
        Triangulo tri = new Triangulo(c1, c2);
        System.out.println("La hipotenusa es: " + tri.calcularHipotenusa());
    }
}