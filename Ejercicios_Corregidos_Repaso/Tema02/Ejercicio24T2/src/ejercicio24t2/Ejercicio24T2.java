/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24t2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio24T2 {

    final static int NUM_ASIG = 6;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float notaProg, notaLm, notaBbdd, notaEd, notaSi, notaFol, media, suma = 0;
        
        System.out.print("\nPor favor, introduzca la nota de Programación: ");
        notaProg = teclado.nextFloat();
        suma += notaProg;
        
        System.out.print("\nIntroduzca la nota de Lenguaje de Marcas: ");
        notaLm = teclado.nextFloat();
        suma += notaLm;
        
        System.out.print("\nIntroduzca la nota de BBDD: ");
        notaBbdd = teclado.nextFloat();
        suma += notaBbdd;
        
        System.out.print("\nIntroduzca la nota de Entornos de desarrollo: ");
        notaEd = teclado.nextFloat();
        suma += notaEd;
        
        System.out.print("\nIntroduzca la nota de Entornos de Sistemas Informáticos: ");
        notaSi = teclado.nextFloat();
        suma += notaSi;
        
        System.out.print("\nPor último, introduzca la nota de FOL: ");
        notaFol = teclado.nextFloat();
        suma += notaFol;
        
        //Calculamos la nota media
        media = suma / NUM_ASIG;
        System.out.println("\nSu nota media del curso es de: "+media);
        
    }
    
}
