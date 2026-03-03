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
        double c1 = pedirNumero();
        double c2 = pedirNumero();
        
        //Objeto de la clase Triangulo con los valores y calcula la hipotenusa con un método
        Triangulo tri = new Triangulo(c1, c2);
        System.out.println("La hipotenusa es: " + calcularHipotenusa(tri.getCateto1(), tri.getCateto2()));
    }
    
    //Métodos para pedir y calcular
    public static double pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce numero: ");
        return entrada.nextDouble();
    }
    
    public static double calcularHipotenusa(double c1, double c2){
        return Math.sqrt(c1 * c1 + c2 * c2);
    }
}