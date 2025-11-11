/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08tema5;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio08Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;//Variable
        
        //Pedir al usuario un numero
        System.out.print("Introduce un numero: ");
        num = entrada.nextInt();
        
        Numero n = new Numero(num);//Objeto de la clase Numero con el valor introducido
        
        //Comprobar si el numero es par o impar
        if (n.getValor() % 2 == 0){
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
}