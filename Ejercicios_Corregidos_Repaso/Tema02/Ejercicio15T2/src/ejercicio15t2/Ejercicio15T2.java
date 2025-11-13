/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15t2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio15T2 {

    final static int SESENTA = 60;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables (y asignación de valor a variable tiempo)
        int tiempo = 10000, seg, min, horas;
        
        //Calculamos los segundos de pico
        seg = tiempo % SESENTA;
        
        //Convertimos los segundos a minutos
        tiempo = tiempo / SESENTA;
        
        //Calculamos los minutos
        min = tiempo % SESENTA;
        
        //Calculamos las horas
        horas = tiempo / SESENTA;
        
        //Mostramos el resultado
        System.out.println("10000 segundos equivale a "+horas+" horas, "+min+" minutos y "+seg+" segundos.");
    }
    
}

