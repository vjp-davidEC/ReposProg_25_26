package ejercicio02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {
    
    public static String NOMBREFICHERO = "";

    public static void main(String[] args) {
        int opcion = 0;
        
        do {
            try {
                mostrarMenu();
                opcion = pedirOpcion();
                switch (opcion) {
                    case 1 -> introducirNombreFichero();
                    case 2 -> leerLineas();
                    case 3 -> contarInformacion();
                    case 4 -> guardarFichero();
                    case 5 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opcion no valida, intentelo de nuevo");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un numero entero");
            } catch (IllegalArgumentException e) {
                System.out.println("Error");
            }
        } while (opcion != 5);
    }
    
    public static void mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. INTRODUCIR NOMBRE DEL FICHERO");
        System.out.println("2. LEER LINEAS");
        System.out.println("3. CONTAR INFORMACION");
        System.out.println("4. GUARDAR FICHERO");
        System.out.println("5. SALIR DEL PROGRAMA");
        System.out.print("INTRODUCE UNA OPCION: ");
    }
    
    public static void introducirNombreFichero() throws IllegalArgumentException{
        System.out.println("");
        String nombre = pedirNombre();
        
        NOMBREFICHERO = nombre;
        System.out.println("Nombre guardado correctamente");
    }
    
    public static void leerLineas() {
        System.out.println("");
        
        if (NOMBREFICHERO.isEmpty()) {
            System.out.println("No hay nombre en el fichero");
        } else {
            FileReader fr = null;
            BufferedReader br = null;
            
            try {
                fr = new FileReader(NOMBREFICHERO);
                br = new BufferedReader(fr);
                
                String linea = br.readLine();
                int contador = 1;
                
                while (linea != null) {
                    System.out.println("Linea " + contador + ": " + linea);
                    contador++;
                    linea = br.readLine();
                }
            } catch (FileNotFoundException e) {
                System.out.println("Archivo no encontrado");
            } catch (IOException e) {
                System.out.println("Error al leer el fichero");
            } finally {
                try {
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
    }
    
    public static void contarInformacion() {
        System.out.println("");
        
        if (NOMBREFICHERO.isEmpty()) {
            System.out.println("No hay nombre en el fichero");
        } else {
            FileReader fr = null;
            BufferedReader br = null;
            
            int totalLineas = 0;
            int totalPalabras = 0;
            int totalCaracteres = 0;
            
            try {
                fr = new FileReader(NOMBREFICHERO);
                br = new BufferedReader(fr);
                
                String linea = br.readLine();
                
                while (linea != null) {
                    totalLineas++;
                    
                    String[] palabras = linea.split("\\s+");
                    totalPalabras += palabras.length;
                    totalCaracteres += linea.replace(" ", "").length();
                    
                    linea = br.readLine();
                }
                System.out.println("--INFORMACION DEL FICHERO--");
                System.out.println("Lineas totales: " + totalLineas);
                System.out.println("Palabras totales: " + totalPalabras);
                System.out.println("Caracteres totales: " + totalCaracteres);
            } catch (FileNotFoundException e) {
                System.out.println("Archivo no encontrado");
            } catch (IOException e) {
                System.out.println("Error al leer el fichero");
            } finally {
                try {
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
    }
    
    public static void guardarFichero() {
        System.out.println("");
        
        if(NOMBREFICHERO.isEmpty()) {
            System.out.println("No hay nombre en el fichero");
        } else {
            FileWriter fw = null;
            PrintWriter pw = null;
            FileReader fr = null;
            BufferedReader br = null;
            
            int totalLineas = 0;
            int totalPalabras = 0;
            int totalCaracteres = 0;
            
            try {
                fr = new FileReader(NOMBREFICHERO);
                br = new BufferedReader(fr);
                
                String linea = br.readLine();
                
                while (linea != null) {
                    totalLineas++;
                    
                    String[] palabras = linea.split("\\s+");
                    totalPalabras += palabras.length;
                    totalCaracteres += linea.replace(" ", "").length();
                    
                    linea = br.readLine();
                }
                
                fw = new FileWriter("informe.txt");
                pw = new PrintWriter(fw);
                
                pw.println("Lineas totales: " + totalLineas);
                pw.println("Palabras totales: " + totalPalabras);
                pw.println("Caracteres totales: " + totalCaracteres);
                
                System.out.println("Informe guardado correctamente en \"informe.txt\"");
            } catch (FileNotFoundException e) {
                System.out.println("Archivo no encontrado");
            } catch (IOException e) {
                System.out.println("Error al guardar el fichero");
            } finally {
                try {
                    if (br != null) {
                        br.close();
                    }
                    if (fr != null) {
                        fr.close();
                    }
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
    }
    
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el nombre del fichero: ");
        return entrada.nextLine();
    }
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
}