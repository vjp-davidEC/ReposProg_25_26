/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06t3switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio06T3Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;
        System.out.print("Introduzca un número: ");
        nota = teclado.nextInt();
        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspendo");
                break;
            case 5:
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("La nota debe estar entre 0 y 10.");
        }
    }
    
}
