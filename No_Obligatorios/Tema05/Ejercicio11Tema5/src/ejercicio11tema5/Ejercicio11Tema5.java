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
        //Objetos de la clase Numero sin valor inicial
        Numero num1 = new Numero();
        num1.setNumero(pedirNumero());
        Numero num2 = new Numero();
        num2.setNumero(pedirNumero());
        
        //Condicion de si el primer numero es mayor que 10 mostrar una multiplicacion, sino mostrar una suma
        if (num1.getValor() > 10){
            System.out.println("La multiplicacion es: " + multiplicar(num1.getValor(), num2.getValor()));
        } else {
            System.out.println("La suma es: " + sumar(num1.getValor(), num2.getValor()));
        }
    }
    
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce numero: ");
        return entrada.nextInt();
    }
    
    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }
    
    public static int sumar(int num1, int num2){
        return num1 + num2;
    }
}