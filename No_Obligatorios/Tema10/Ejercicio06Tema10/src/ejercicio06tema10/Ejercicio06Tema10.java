/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06tema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio06Tema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Lista donde se guarda las ventas de los 12 meses
        ArrayList<Integer> ventas = new ArrayList<>();
        //Array con los nombres de los meses
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        int opcion;
        do{//Bucle principal del menu
            mostrarMenu();//Mostrar los opciones
            opcion = entrada.nextInt();
            switch(opcion){
                case 1 -> rellenarVentas(ventas);
                case 2 -> mostrarVentas(ventas, meses);
                case 3 -> mostrarVentasReves(ventas, meses);
                case 4 -> { 
                    if(ventas.size() == 12){
                        System.out.println("Suma total de ventas: " + sumaVentas(ventas));
                    }else{
                        System.out.println("Aun no se han introducido las ventas");
                    }
                }
                case 5 -> ventasMesesConA(ventas, meses);
                case 6 -> mesConMasVentas(ventas, meses);
                case 7 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        }while(opcion != 7);//No se termina hasta que sea 7
    }
    
    //Metodo que muestra el menu
    public static void mostrarMenu(){
        System.out.println("\n--MENU--");
        System.out.println("1. Introducir ventas de los 12 meses");
        System.out.println("2. Mostrar ventas");
        System.out.println("3. Mostrar ventas al reves");
        System.out.println("4. Mostrar suma total de las ventas");
        System.out.println("5. Mostrar ventas totales de los meses con 'a'");
        System.out.println("6. Mostras mes o meses con mas ventas");
        System.out.println("7. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    //Metodo que rellena las ventas del usuario cada mes
    public static void rellenarVentas(ArrayList<Integer> ventas){
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        ventas.clear();//Se eliminan las ventas anteriores
        System.out.println("Introduce las ventas de coches de cada uno de los 12 meses del anio: ");
        for(int i = 0; i < 12; i++){
            System.out.print("Ventas del mes " + (i+1) + ": ");
            int valor = entrada.nextInt();
            ventas.add(valor);//Se añade a la lista
        }
    }
    
    //Se muestra las ventas de los 12 meses
    public static void mostrarVentas(ArrayList<Integer> ventas, String[] meses){
        System.out.println();
        if(ventas.size() != 12){
            System.out.println("Aun no se han introducido las ventas");
            return;
        }
        for(int i = 0; i < 12; i++){
            System.out.println(meses[i] + ": " + ventas.get(i));
        }
    }
    
    //Se muestra las ventas de los 12 meses en orden inverso
    public static void mostrarVentasReves(ArrayList<Integer> ventas, String[] meses){
        System.out.println();
        if(ventas.size() != 12){
            System.out.println("Aun no se han introducido las ventas");
            return;
        }
        //Se recorre la lista al reves calculando el indice inverso
        for(int i = 0; i < ventas.size(); i++){
            int indice = ventas.size() - 1 - i;
            System.out.println(meses[indice] + ": " + ventas.get(indice));
        }
    }
    
    //Metodo que calcula la suma total de las ventas
    public static int sumaVentas(ArrayList<Integer> ventas){
        System.out.println();
        int suma = 0;
        for(int i = 0; i < ventas.size(); i++){
            suma += ventas.get(i);
        }
        return suma;
    }
    
    //Metodo que suma las ventas de los meses cuyo nombre contiene una 'a'
    public static void ventasMesesConA(ArrayList<Integer> ventas, String[] meses){
        System.out.println();
        if(ventas.size() != 12){
            System.out.println("Aun no se han introducido las ventas");
            return;
        }
        int suma = 0;
        for(int i = 0; i < 12; i++){
            if(meses[i].toLowerCase().contains("a")){
                suma += ventas.get(i);
            }
        }
        System.out.println("Ventas totales de los meses con 'a' en su nombre: " + suma);
    }
    
    //Metodo que muestra el mes o meses que han tenido mayor numero de ventas
    public static void mesConMasVentas(ArrayList<Integer> ventas, String[] meses){
        System.out.println();
        if(ventas.size() != 12){
            System.out.println("Aun no se han introducido las ventas");
            return;
        }
        int max = ventas.get(0);
        for(int i = 0; i < 12; i++){
            if(ventas.get(i) > max){
                max = ventas.get(i);
            }
        }
        System.out.println("Mes o meses con mas ventas " + "-" + max + "-" + ":");
        for(int i = 0; i < 12; i++){
            if(ventas.get(i) == max){
                System.out.println(meses[i]);
            }
        }
    }
}