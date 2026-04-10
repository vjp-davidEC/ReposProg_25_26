/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01tema12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio01Tema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Contacto> agendaTelefonica = new ArrayList<>();
        
        int opcion;
        
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> aniadirContactosAgenda();
                case 2 -> visualizarListaContactos();
                case 3 -> eliminarContactoLista();
                case 4 -> mostrarContactosEdad();
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while (opcion != 5);
    }
    
    public static void mostrarMenu() {
        System.out.println("\n-- MENU --");
        System.out.println("1. Aniadir contactos a la agenda");
        System.out.println("2. Visualizar la lista de contactos");
        System.out.println("3. Eliminar contactos de la lista");
        System.out.println("4. Mostrar todos los contactos por su edad");
        System.out.println("5. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    public static void aniadirContactosAgenda() {
        
    }
    
    public static void visualizarListaContactos() {
        
    }
    
    public static void eliminarContactoLista() {
        
    }
    
    public static void mostrarContactosEdad() {
        
    }
    
}