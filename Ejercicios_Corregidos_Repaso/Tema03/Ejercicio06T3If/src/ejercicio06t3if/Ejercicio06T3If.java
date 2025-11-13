/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06t3if;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio06T3If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;
        System.out.print("Introduzca un número: ");
        nota = teclado.nextInt();
        if  ((nota >= 0)&&(nota <= 4)){
            System.out.println("Suspenso");
        }
        else{
            if  ((nota >= 5)&&(nota <= 6)){
                System.out.println("Bien");
            }
            else{
                if  ((nota >= 7)&&(nota <= 8)){
                    System.out.println("Notable");
                }
                else{
                    if  ((nota >= 9)&&(nota <= 10)){
                        System.out.println("Sobresaliente");
                    }
                    else{
                        System.out.println("La nota debe estar entre 0 y 10.");
                    }
                }
            }
        }
    }
    
}
