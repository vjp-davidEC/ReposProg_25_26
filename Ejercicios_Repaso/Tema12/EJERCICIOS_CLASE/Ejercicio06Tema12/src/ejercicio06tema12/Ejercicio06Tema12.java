/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06tema12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio06Tema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {//Bucle principal
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1 -> volcarArrayFichero();
                    case 2 -> mostrarFichero();
                    case 3 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opcion no valida, intentalo de nuevo");
                }
            } catch (InputMismatchException e) {//Cuando el usuario introduce una letra
                System.out.println("Error: Debes introducir un numero entero");
                entrada.nextLine();
            }
        } while (opcion != 3);//Salir cuando pulse 3
    }
    
    //Metodo que muestra el menu por pantalla
    public static void mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. VOLCAR LOS 100 PRIMEROS NUMEROS PARES A UN FICHERO");
        System.out.println("2. MOSTRAR CONTENIDO DEL FICHERO");
        System.out.println("3. SALIR DEL PROGRAMA");
        System.out.print("INTRODUCE UNA OPCION: ");
    }
    
    //Metodo que crea el array y se vuelca al fichero que crea el usuario
    public static void volcarArrayFichero() {
        System.out.println();
        
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            System.out.print("Introduce el nombre del fichero, acabado en \".txt\": ");
            String nombreFichero = pedirNombreFichero();
            
            //Se crea un array con los 100 primeros numeros pares
            int[] pares = new int[100];
            for (int i = 0; i < pares.length; i++) {
                pares[i] = (i + 1) * 2;
            }
            
            //Se abre el fichero en modo append
            fw = new FileWriter(nombreFichero, true);
            pw = new PrintWriter(fw);
            
            //Se escribe cada numero en una linea
            for (int numero : pares) {
                pw.println(numero);
            }
            System.out.println("Fichero creado correctamente");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {//Se captura los errores de escritura
            System.out.println("Error en la escritura del archivo");
        } finally {
            try {
                //Se cierran los flujos
                if (pw != null) {
                    pw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar los flujos");
            }
        }
    }
    
    //
    public static void mostrarFichero() {
        System.out.println();
        
        FileReader fr = null;
        BufferedReader br = null;
        try {
            System.out.print("Introduce el nombre del fichero a leer: ");
            String nombreFichero = pedirNombreFichero();
            //Se abre el fichero para lectura
            fr = new FileReader(nombreFichero);
            br = new BufferedReader(fr);
            
            System.out.println("--Contenido del fichero--");
            //Se lee linea a linea hasta que no haya mas contenido
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        } catch (FileNotFoundException e) {//Si el fichero no existe
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {//Se captura los errores de escritura
            System.out.println("Error al leer el archivo");
        } finally {
            try {
                //Se cierra los flujos
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar los flujos");
            }
        }
    }
    
    //Metodo que pide el nombre del fichero al usuario
    public static String pedirNombreFichero() {
        Scanner entrada = new Scanner(System.in);
        String nombreFichero = entrada.nextLine();
        return nombreFichero;
    }
}