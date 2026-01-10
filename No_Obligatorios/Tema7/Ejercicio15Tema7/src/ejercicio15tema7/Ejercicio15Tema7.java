/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15tema7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio15Tema7 {

    /**
     * @param args the command line arguments
     */
    
    //Array con los nombres de los meses del año
    public static String[] meses = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };
    
    //Método que rellena el array con ventas aleatorias entre 10 y 100
    public static void pedirVentas(int[] vector){
        for(int i = 0; i < vector.length; i++){
            //Generamos un número aleatorio entre 10 y 100
            vector[i] = (int)(Math.random()*(91)) + 10;
        }
        System.out.println("Ventas generadas aleatoriamente");
    }
    
    //Método que muestra las ventas mensuales en orden normal
    public static void mostrarVentas(int [] vector){
        System.out.println("\n--VENTAS MENSUALES--");
        for(int i = 0; i < vector.length; i++){
            //Recorremos el array y mostramos cada mes con su venta
            System.out.println(meses[i] + ": " + vector[i] + " coches");
        }
    }
    
    //Método que muestra las ventas al revés sin modificar el array
    public static void mostrarVentasAlReves(int [] vector){
        System.out.println("\n--VENTAS AL REVES--");
        int numero;
        for(int i = 0; i < vector.length; i++){
            //Calculamos el índice inverso
            numero = vector.length - 1 - i;
            //Mostramos el mes normal pero la venta invertida
            System.out.println(meses[i] + ": " + vector[numero] + " coches");
        }
    }
    
    //Método que calcula y muestra la suma total de ventas del año
    public static void mostrarSumaTotal(int [] vector){
        int suma = 0;
        for(int i = 0; i < vector.length; i++){
            //Sumamos todas las ventas del array
            suma += vector[i];
        }
        System.out.println("\nSuma total del anio: " + suma + " coches");
    }
    
    //Método que muestra las ventas de los meses pares
    public static void mostrarVentasMesesPares(int [] vector){
        System.out.println("\n--VENTAS EN MESES PARES--");
        for(int i = 1; i < vector.length; i+=2){
            System.out.println(meses[i] + ": " + vector[i] + " coches");
        }
    }
    
    //Método que muestra el mes con más ventas
    public static void mostrarMesConMasVentas(int [] vector){
        int max = vector[0];
        int indice = 0;
        
        //Recorremos el array buscando el valor más alto
        for(int i = 1; i < vector.length; i++){
            if(vector[i] > max){
                max = vector[i];
                indice = i;
            }
        }
        System.out.println("\nMes con mas ventas: " + meses[indice] + " (" + max + " coches)");
    }
    
    //Método que muestra el menú de opciones
    public static void mostrarMenu(){
        System.out.println("\n--MENU DE OPCIONES--");
        System.out.println("1. Rellenar ventas mensuales");
        System.out.println("2. Mostrar ventas");
        System.out.println("3. Mostrar ventas al reves");
        System.out.println("4. Mostrar suma total de ventas");
        System.out.println("5. Mostrar ventas de meses pares");
        System.out.println("6. Mostrar mes con mas ventas");
        System.out.println("7. Salir"); 
        System.out.print("Elige una opcion: ");
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vector = new int[12];//Array donde guardaremos las ventas
        int opcion;
        
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            
            switch(opcion){//Opcion a elegir del usuario
                case 1 -> pedirVentas(vector);
                case 2 -> mostrarVentas(vector);
                case 3 -> mostrarVentasAlReves(vector);
                case 4 -> mostrarSumaTotal(vector);
                case 5 -> mostrarVentasMesesPares(vector);
                case 6 -> mostrarMesConMasVentas(vector);
                case 7 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida. Intentalo de nuevo");
            }
        }while(opcion != 7);//Repetimos hasta que el usuario elija salir
    }
}