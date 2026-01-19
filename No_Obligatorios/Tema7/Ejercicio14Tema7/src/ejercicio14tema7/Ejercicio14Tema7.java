/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14tema7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14Tema7 {

    /**
     * @param args the command line arguments
     */
    public final static int SEM = 4;
    public final static int DIA = 7;
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] temperaturas = new double[SEM][DIA];
        
        String[] diasSemanas = {"Lunes", "Martes", "Miercoles",
            "Jueves", "Sabado", "Domingo"};
        int opcion;
        
        do{
            mostrarMenu();
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1 -> rellenarTemperaturas(temperaturas);
                case 2 -> mostrarTemperaturas(temperaturas);
                case 3 -> temperaturaMediaDelMes(temperaturas);
                case 4 -> diaMasCalurosoDelMes(temperaturas, diasSemanas);
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida. Intentalo de nuevo");
            }
        }
        while(opcion !=5);
    }
    
    //
    public static void mostrarMenu(){
        System.out.println("--MENU--");
        System.out.println("1. Rellenar las temperaturas");
        System.out.println("2. Mostrar las temperaturas");
        System.out.println("3. Visualizar la temperatura media del mes");
        System.out.println("4. Día o días más calurosos del mes");
        System.out.println("5. Salir del menu");
        System.out.print("Elige una opcion: ");
    }
    
    //
    public static void rellenarTemperaturas(double[][] matriz){
        for(int i = 0; i < SEM; i++){
            for(int j = 0; j < DIA; j++){
                matriz[i][j] = (int)(Math.random() * 46);
            }
        }
    }
    
    //
    public static void mostrarTemperaturas(double[][] matriz){
        for(int i = 0; i < SEM; i++){
            for(int j = 0; j < DIA; j++){
                System.out.println(matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
    //
    public static void temperaturaMediaDelMes(double[][] matriz){
        for(int i = 0; i < SEM; i++){
            for(int j = 0; j < DIA; j++){
                matriz[i][j] /= 7;
            }
        }
        System.out.println("La temperatura media del mes es: ");
    }
    
    //
    public static void diaMasCalurosoDelMes(double[][] matriz, String[] diasSemenas){
        for(int i = 0; i < SEM; i++){
            for(int j = 0; j < DIA; j++){
                
            }
        }
    }
}
