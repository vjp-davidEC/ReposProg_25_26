/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio23t2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio23T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float precio, total;
        int unidades;
        
        System.out.print("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");
        precio = teclado.nextFloat();
        
        System.out.print("¿Cuántas unidades quiere llevarse? ");
        unidades = teclado.nextInt();
        
        total = precio * unidades;
        System.out.println("El precio total de su compra es de: "+total+" euros");
    }
    
}
