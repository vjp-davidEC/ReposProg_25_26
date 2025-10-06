/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3repasotema1y2;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio3RepasoTema1y2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        
        System.out.println("Introduzca el primer numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        numero2 = entrada.nextInt();
        
        if (numero1 % numero2 == 0){
            System.out.println("El numero " + numero2 + " es divisible de " + numero1);
        }else{
            System.out.println("El numero " + numero2 + " no es divisible de " + numero1);
        }        
    }
    
}
