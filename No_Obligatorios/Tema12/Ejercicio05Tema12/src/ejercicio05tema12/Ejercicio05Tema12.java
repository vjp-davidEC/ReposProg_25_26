/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05tema12;

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
public class Ejercicio05Tema12 {

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
                    case 1 -> aniadirContacto();
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
        System.out.println("1. ANIADIR CONTACTO AL FICHERO");
        System.out.println("2. MOSTRAR CONTENIDO DEL FICHERO");
        System.out.println("3. SALIR DEL PROGRAMA");
        System.out.print("INTRODUCE UNA OPCION: ");
    }
    
    //Metodo que añade un contacto al fichero agenda.txt
    public static void aniadirContacto() {
        System.out.println();
        
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            System.out.println("--Introduce los datos del contacto--");
            //Se piden los datos al usuario
            String nombre = pedirNombre();
            int edad = pedirEdad();
            int telefonoMovil = pedirTelefonoMovil();
            
            //Se abre el fichero en modo append
            fw = new FileWriter("agenda.txt", true);
            pw = new PrintWriter(fw);
            
            //Se escribe una linea con los datos del contacto
            pw.println(nombre + " con " + edad + " anios " + "y telefono movil " + telefonoMovil);
            //Se cierran los flujos
            pw.close();
            fw.close();
            
            System.out.println("Fichero escrito correctamente");
        } catch (IOException e) {//Se captura los errores de escritura
            System.out.println("Error en la escritura del archivo");
        }
    }
    
    //Metodo que muestra el contenido del fichero agenda.txt
    public static void mostrarFichero() {
        System.out.println();
        
        FileReader fr = null;
        BufferedReader br = null;
        try {
            //Se abre el fichero para lectura
            fr = new FileReader("agenda.txt");
            br = new BufferedReader(fr);
            
            System.out.println("--Contenido de agenda.txt--");
            //Se lee linea a linea hasta que no haya mas contenido
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            //Se cierra los flujos
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {//Si el fichero no existe
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {//Si ocurre un error al leer
            System.out.println("Error al leer el archivo");
        }
    }
    
    //Metodos que piden el nombre, edad y telefono movil
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        return nombre;
    }
    
    public static int pedirEdad() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Edad: ");
        int edad = entrada.nextInt();
        return edad;
    }
    
    public static int pedirTelefonoMovil() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Telefono movil: ");
        int telefonoMovil = entrada.nextInt();
        return telefonoMovil;
    }
}