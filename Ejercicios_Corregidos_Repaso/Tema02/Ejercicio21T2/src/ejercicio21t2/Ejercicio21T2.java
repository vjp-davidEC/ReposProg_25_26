/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21t2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio21T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int total, seg, min, horas, dias, totalSeg;
        System.out.print("Por favor, introduzca un numero en segundos: ");
        total = teclado.nextInt();
        totalSeg = total;
        //Calculamos los segundos que nos van a sobrar.
        seg = total % 60;
        
        //Convertimos los segundos a minutos
        total = total / 60;
        
        //Calculamos los minutos
        min = total % 60;
        
        //Convertimos los minutos a horas
        total = total / 60;
        
        //Obtenemos los dás y las horas
        dias = total / 24;
        horas = total % 24;
        
        System.out.print("\n"+totalSeg+" segundos hacen un total de: "+dias+" días, "+horas+" horas, "+min+" minutos y "+seg+" segundos.");
    }
    
}
