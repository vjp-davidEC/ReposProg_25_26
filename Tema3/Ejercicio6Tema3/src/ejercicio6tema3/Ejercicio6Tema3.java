/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6tema3;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio6Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int nota;
        
        System.out.println("Por favoz, introduce la nota del alumno:");
        nota = entrada.nextInt();
        
        if (nota < 0 || nota > 10){
            System.out.println("Error: La nota debe estar entre 0 y 10");
        }else if (nota <= 4){
            System.out.println("Suspenso");
        }else if (nota <= 6){
            System.out.println("Bien");
        }else if (nota <= 8){
            System.out.println("Notable");
        }else {
            System.out.println("Sobresaliente");
        }
    }
    
}
