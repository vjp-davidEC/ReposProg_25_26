/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07t10;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Ejercicio07T10 {

    /* Definición de constantes */
    public static final int NUM_SEMANAS = 4; 
    public static final int NUM_DIAS_SEMANA = 7;
    
    /* Rellena la lista de listas */
    public static void rellenarLista(ArrayList<ArrayList<Integer>> lista){
        Scanner teclado = new Scanner(System.in);
        String[] vNombres = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int i, j, temp;
        for(i = 0;i < NUM_SEMANAS;i++){
            lista.add(new ArrayList<>());
            for(j = 0;j < NUM_DIAS_SEMANA;j++){
                System.out.print("Temperatura "+vNombres[j]+" semana "+i+": ");
                temp = teclado.nextInt();
                lista.get(i).add(temp);
            }
        }
    }
    
    /* Muestra las temperaturas de cada día del mes */
    public static void mostrarLista(ArrayList<ArrayList<Integer>> lista){
        String[] vNombres = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int i, j;
        for(i = 0;i < NUM_SEMANAS;i++){  //Celdas de la lista ppal
            System.out.println("Semana "+(i+1));
            for(j = 0;j < NUM_DIAS_SEMANA;j++){  //Celdas de la lista secundaria
                System.out.println(vNombres[j]+" - "+lista.get(i).get(j)+" grados");
            }
            System.out.println(" --------- ");
        }
    }    
    
    /* Muestra la temperatura media del mes */
    public static void mostrarTemperaturaMedia(ArrayList<ArrayList<Integer>> lista){
        int i, j;
        float suma = 0;
        for(i = 0;i < NUM_SEMANAS;i++){
            for(j = 0;j < NUM_DIAS_SEMANA;j++){
                suma = suma + lista.get(i).get(j);
            }
        }
        System.out.println("Media mes: "+(suma / (NUM_SEMANAS * NUM_DIAS_SEMANA)));
    }    
    
    /* Busca la temperatura mayor del mes (la almacena en mayor). Después recorre los días del mes mostrando aquellos que coinciden  con mayor */
    public static void mostrarDiasMasCalurosos(ArrayList<ArrayList<Integer>> lista){
        String[] vNombres = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int i, j, mayor = lista.get(0).get(0);
        /* Busco el día más caluroso del mes */
        for(i = 0;i < NUM_SEMANAS;i++){
            for(j = 0;j < NUM_DIAS_SEMANA;j++){
                if  (lista.get(i).get(j) > mayor){
                    mayor = lista.get(i).get(j);
                }
            }
        }
        /* Muestro los días que coinciden con el día más caluroso del mes */
        System.out.println("Los días más calurosos son: ");
        for(i = 0;i < NUM_SEMANAS;i++){
            for(j = 0;j < NUM_DIAS_SEMANA;j++){
                if  (lista.get(i).get(j) == mayor){
                    System.out.println(vNombres[j]+" semana "+i+" - "+mayor+" grados");
                }
            }
        }
    }    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> lista = new ArrayList<>();
        int opc;
        do{
            System.out.println("1. Rellenar lista");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Temperatura media");
            System.out.println("4. Día o días más calurosos");
            System.out.println("5. Salir");
            System.out.print("   Opción: ");
            opc = teclado.nextInt();
            switch(opc){
                case 1:
                    rellenarLista(lista);
                    break;
                case 2:
                    mostrarLista(lista);
                    break;
                case 3:
                    mostrarTemperaturaMedia(lista);
                    break;
                case 4:
                    mostrarDiasMasCalurosos(lista);
                    break;
                case 5:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }while(opc != 5);
    }
    
}
