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
    //Constantes que sirve para ponerlas en vez de poner "matriz.length"
    public final static int SEM = 4;
    public final static int DIA = 7;
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] temperaturas = new double[SEM][DIA];//Matriz donde guardaremos las temperaturas
        
        //Array con los nombres de los días de la semana
        String[] diasSemanas = {"Lunes", "Martes", "Miercoles",
            "Jueves", "Viernes", "Sabado", "Domingo"};
        int opcion;
        
        do{
            mostrarMenu();
            opcion = entrada.nextInt();
            
            switch(opcion){//Selección de la acción según la opción elegida
                case 1 -> rellenarTemperaturas(temperaturas);
                case 2 -> mostrarTemperaturas(temperaturas);
                case 3 -> temperaturaMediaDelMes(temperaturas);
                case 4 -> diaMasCalurosoDelMes(temperaturas, diasSemanas);
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida. Intentalo de nuevo");
            }
        }
        while(opcion !=5);//Repetir hasta que el usuario elija salir
    }
    
    //Metodo que muestra el menu por pantalla
    public static void mostrarMenu(){
        System.out.println("\n--MENU--");
        System.out.println("1. Rellenar las temperaturas");
        System.out.println("2. Mostrar las temperaturas");
        System.out.println("3. Visualizar la temperatura media del mes");
        System.out.println("4. Dia o dias mas calurosos del mes");
        System.out.println("5. Salir del menu");
        System.out.print("Elige una opcion: ");
    }
    
    //Metodo que permite al usuario introducir las temperaturas en la matriz
    public static void rellenarTemperaturas(double[][] matriz){
        Scanner entrada = new Scanner(System.in);
        System.out.println("");
        for(int i = 0; i < SEM; i++){
            for(int j = 0; j < DIA; j++){
                System.out.print("Por favor, introduzca la temperatura en la posicion [" + i + j + "]: ");
                matriz[i][j] = entrada.nextDouble();
            }
        }
    }
    
    //Metodo que muestra todas las temperaturas almacenadas en la matriz
    public static void mostrarTemperaturas(double[][] matriz){
        System.out.println("");
        for(int i = 0; i < SEM; i++){
            for(int j = 0; j < DIA; j++){
                System.out.println("La temperatura son: " + matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
    //Metodo que calcula y muestra la temperatura media del mes
    public static void temperaturaMediaDelMes(double[][] matriz){
        System.out.println("");
        double suma = 0;
        for(int i = 0; i < SEM; i++){
            for(int j = 0; j < DIA; j++){
                suma += matriz[i][j];
            }
        }
        double media = suma / 28;
        System.out.println("La temperatura media del mes es: " + media);
    }
    
    //Metodo que busca el día o días con mayor temperatura del mes
    public static void diaMasCalurosoDelMes(double[][] matriz, String[] diasSemenas){
        System.out.println("");
        double mayor = matriz[0][0];
        //Encontrar la temperatura máxima
        for(int i = 0; i < SEM; i++){
            for(int j = 0; j < DIA; j++){
                if(matriz[i][j] > mayor){
                    mayor = matriz[i][j];
                }
            }
        }
        
        //Mostrar todos los días que coincidan con la temperatura máxima
        for (int i = 0; i < SEM; i++) {
            for (int j = 0; j < DIA; j++) {
                if(matriz[i][j] == mayor){
                    System.out.println("El " + diasSemenas[j] + " de la Semana " + (i + 1) + " con " + mayor + " grados");
                }
            }
        }
    }
}
