/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07t3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio07T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean laborable = false;
        int diaSemana;
        System.out.print("Introduzca el día de la semana: ");
        diaSemana = teclado.nextInt();
        switch(diaSemana){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                laborable = true;
                break;
            case 6:
            case 7:
                laborable = false;
                break;
        }
        if  (laborable){
            System.out.println("Recuerde que debe ir a trabajar");
        }
        else{
            System.out.println("No es necesario que vaya a trabajar");
        }
    }
    
}
