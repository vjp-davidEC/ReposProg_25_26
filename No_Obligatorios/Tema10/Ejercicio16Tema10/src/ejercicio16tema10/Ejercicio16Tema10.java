/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16tema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio16Tema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Deporte> listaProductos = new ArrayList<>();
        
        int opcion;
        
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1 -> menuAdimistracion();
                case 2 -> menuCompra();
                case 3 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while(opcion != 3);
    }
    
    public static void menuAdimistracion() {
        Scanner entrada = new Scanner(System.in);
        
        
        int opcion;
        
        do {
            mostrarMenuAdministracion();
            opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1 -> introducirProductos();
                case 2 -> visualizarProductos();
                case 3 -> eliminarProductos();
                case 4 -> System.out.println("Saliendo del menu de administracion...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while(opcion != 4);
    }
    
    public static void menuCompra() {
        Scanner entrada = new Scanner(System.in);
        
        
        int opcion;
        
        do {
            mostrarMenuCompra();
            opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1 -> 
                case 2 -> 
                case 3 -> 
                case 4 -> System.out.println("Saliendo del menu de compra...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while(opcion != 4);
    }
    
    public static void mostrarMenu() {
        System.out.println("\n--MENU OPCIONES--");
        System.out.println("1. MENU DE ADMINISTRACION");
        System.out.println("2. MENU DE COMPRA");
        System.out.println("3. SALIR DEL PROGRAMA");
        System.out.print("Introduce una opcion: ");
    }
    
    public static void mostrarMenuAdministracion() {
        System.out.println("\n--MENU ADMINISTRACION--");
        System.out.println("1. INTRODUCIR PRODUCTOS");
        System.out.println("2. VISUALIZAR PRODUCTOS");
        System.out.println("3. ELIMINAR PRODUCTOS");
        System.out.println("4. SALIR DEL MENU");
        System.out.print("Introduce una opcion: ");
    }
    
    public static void mostrarMenuCompra() {
        System.out.println("\n--MENU COMPRA--");
        System.out.println("1. MENU DE ADMINISTRACION");
        System.out.println("2. MENU DE COMPRA");
        System.out.println("3. SALIR DEL MENU");
        System.out.print("Introduce una opcion: ");
    }
    
    public static void introducirProductos() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce los datos de un producto");
        System.out.println("Introduce el nombre del producto: ");
        String nombreProducto = entrada.nextLine();
        System.out.println("Introduce el precio del producto: ");
        float precio = entrada.nextFloat();
        entrada.nextLine();
        System.out.println("Introduce el stock del producto: ");
        int stock = entrada.nextInt();
        entrada.nextLine();
        
        Deporte deporte = new Deporte(nombreProducto, precio, stock);
    }
    
    public static void visualizarProductos() {
        Scanner entrada = new Scanner(System.in);
        
    }
    
    public static void eliminarProductos() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el producto que deseas eliminar");
        String nombreEliminar = entrada.nextLine();
    }
    
    
}