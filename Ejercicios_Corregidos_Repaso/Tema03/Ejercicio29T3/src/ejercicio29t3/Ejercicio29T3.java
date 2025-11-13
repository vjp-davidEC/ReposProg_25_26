/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio29t3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio29T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double aleatorio = Math.floor((Math.random()*100)+1);
        int aleatorioEntero = (int)aleatorio;
        int num = 0, intentos = 0;
        boolean enc = false;
        System.out.println("Número secreto: "+aleatorioEntero);
        do{
            System.out.print("\nAdivina el número: ");
            try{
                num = teclado.nextInt();    
            }
            catch(Exception e){
                System.out.print("Error. Debes introducir un número válido: "+e.getMessage());
                teclado.nextLine();
            }
            finally{
                if  (num > aleatorioEntero){
                    System.out.print("\nEl número a adivinar es más pequeño");
                }
                else{
                    if  (num < aleatorioEntero){
                        System.out.print("\nEl número a adivinar es más grande");
                    }
                    else{
                        enc = true;
                    }
                }
                intentos++;
            }
        }while(!enc);
        System.out.print("\n¡Enhorabuena! Has necesitado "+intentos+" intentos");
    }
    
}
