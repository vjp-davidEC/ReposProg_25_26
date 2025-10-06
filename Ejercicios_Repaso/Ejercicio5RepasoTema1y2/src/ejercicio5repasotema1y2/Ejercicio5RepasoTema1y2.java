/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5repasotema1y2;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio5RepasoTema1y2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        
        System.out.println("Introduzca el primer numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        numero2 = entrada.nextInt();
        System.out.println("Introduzca el tercer numero: ");
        numero3 = entrada.nextInt();
        
        if (numero1 >= numero2 && numero1 >= numero3){
            System.out.println("El numero mayor es " + numero1);
        }else if (numero2 >= numero3){
            System.out.println("El numero mayor es " + numero2);
        }else {
            System.out.println("El numero mayor es " + numero3);
        }
    }
    
}
