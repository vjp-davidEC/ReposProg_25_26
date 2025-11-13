/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18t3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio18T3 {

    final static int PASS = 1234;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pwd;
        int intentos = 0;
        boolean acierto;
        //Pedimos la contraseña
        do{
            acierto = true;
            System.out.print("Contraseña: ");
            pwd = teclado.nextInt();
            if  (pwd != PASS){
                System.out.println("Constraseña incorrecta. ");
                acierto = false;
            }
            intentos++; 
        }while((intentos < 3)&&(!acierto));
        //Mostramos mensaje correspondiente
        if  (acierto == true){
            System.out.print("...Accediendo con "+intentos+" intentos");
        }
        else{
            System.out.print("Número máximo de intentos alcanzado");
        }
    }
    
}
