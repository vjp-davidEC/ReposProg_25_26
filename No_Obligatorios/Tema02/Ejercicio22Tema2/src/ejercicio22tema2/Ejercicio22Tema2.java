/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22tema2;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio22Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado;
        double altura;
        double perimetro;
        double area;
        
        //Pedir datos al usuario
        System.out.println("Introduce el lado del triangulo: ");
        lado = entrada.nextDouble();
        System.out.println("Introduce la altura del triangulo: ");
        altura = entrada.nextDouble();
        
        //Calcular perimetro y area
        perimetro = 3 * lado;
        area = (lado * altura)/2;
        
        System.out.println("El perimetro de un triangulo equilatero de lado " + lado + " es: " + perimetro);
        System.out.println("El area de un triangulo de lado " + lado + " es: " + area);
    }
    
}
