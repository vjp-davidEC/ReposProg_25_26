/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05tema9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio05Tema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Se crea una array con los dias de la semana
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        
        //Pide al usuario que introduzca un dia
        System.out.print("Introduzca un dia de la semana: ");
        String dia = entrada.nextLine();
        
        boolean encontrado = false;
        int i = 0;
        
        //Buscamos el dia
        while (i < dias.length && !encontrado){
            //Se compara ignorando mayusculas y minusculas
            if (dias[i].equalsIgnoreCase(dia)){
                encontrado = true;
            //Sino se sigue buscando
            }else{
                i++;
            }
        }
        
        //Se muestra el resultado
        if(encontrado){
            System.out.println("Es el " + (i + 1) + " dia de la semana");
        }else{
            System.out.println("Dia no valido");
        }
    }
}