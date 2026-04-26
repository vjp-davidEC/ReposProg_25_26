package ejercicio06;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        ArrayList<Palabra> listPalabras = new ArrayList<>();
        int opcion = 0;
        
        do {
            try {
                mostrarMenu();
                opcion = pedirOpcion();
                switch (opcion) {
                    case 1 -> aniadirPalabra(listPalabras);
                    case 2 -> mostrarPalabras(listPalabras);
                    case 3 -> guardarFichero(listPalabras);
                    case 4 -> cargarFichero(listPalabras);
                    case 5 -> buscarPalabraMasLarga(listPalabras);
                    case 6 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opcion no valida, intentelo de nuevo");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR, debes introducir un numero entero");
            } catch (IllegalArgumentException e) {
                System.out.println("Error");
            }
        } while (opcion != 6);
    }
    
    public static void mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. ANIADIR PALABRAS");
        System.out.println("2. MOSTRAR PALABRAS");
        System.out.println("3. GUARDAR EN FICHERO");
        System.out.println("4. CARGAR DESDE FICHERO");
        System.out.println("5. BUSCAR PALABRA MAS LARGA");
        System.out.println("6. SALIR DEL PROGRAMA");
        System.out.print("INTRODUCE UNA OPCION: ");
    }
    
    public static void aniadirPalabra(ArrayList<Palabra> listPalabras) throws IllegalArgumentException {
        System.out.println("");
        
        listPalabras.add(new Palabra(pedirPalabra()));
    }
    
    public static void mostrarPalabras(ArrayList<Palabra> listPalabras) {
        System.out.println("");
        
        if (listPalabras.isEmpty()) {
            System.out.println("No hay palabras");
        } else {
            for (Palabra p : listPalabras) {
                System.out.println(p);
            }
        }
    }
    
    public static void guardarFichero(ArrayList<Palabra> listPalabras) {
        System.out.println("");
        
        if (listPalabras.isEmpty()) {
            System.out.println("No hay palabras");
        } else {
            FileWriter fw = null;
            PrintWriter pw = null;
            
            System.out.println("Introduce el nombre del fichero");
            String nombreFichero = pedirNombre();
            
            try {
                fw = new FileWriter(nombreFichero);
                pw = new PrintWriter(fw);
                
                for (Palabra p : listPalabras) {
                    pw.println(p.getTexto());
                }
                System.out.println("Guardado correctamente");
            } catch (FileNotFoundException e) {
                System.out.println("Archivo no encontrado");
            } catch (IOException e) {
                System.out.println("ERROR al guardar el fichero");
            } finally {
                try {
                    if (pw != null) {
                        pw.close();
                    }
                    if (fw != null) {
                        fw.close();
                    }
                } catch (IOException e) {
                    System.out.println("ERROR al cerrar los flujos");
                }
            }
        }
    }
    
    public static void cargarFichero(ArrayList<Palabra> listPalabras) throws IllegalArgumentException {
        System.out.println("");
        
        if (listPalabras.isEmpty()) {
            System.out.println("No hay palabras");
        } else {
            FileReader fr = null;
            BufferedReader br = null;
            
            System.out.println("Introduce el nombre del fichero");
            String nombreFichero = pedirNombre();
            
            try {
                fr = new FileReader(nombreFichero);
                br = new BufferedReader(fr);
                
                String linea = br.readLine();
                
                while (linea != null) {
                    Palabra p = new Palabra(linea);
                    listPalabras.add(p);
                    
                    linea = br.readLine();
                }
                System.out.println("Cargado correctamente");
            } catch (FileNotFoundException e) {
                System.out.println("Archivo no encontrado");
            } catch (IOException e) {
                System.out.println("ERROR al cargar el fichero");
            } finally {
                try {
                    if (br != null) {
                        br.close();
                    }
                    if (fr != null) {
                        fr.close();
                    }
                } catch (IOException e) {
                    System.out.println("ERROR al cerrar los flujos");
                }
            }
        }
    }
    
    public static void buscarPalabraMasLarga(ArrayList<Palabra> listPalabras) {
        System.out.println("");
        
        if (listPalabras.isEmpty()) {
            System.out.println("No hay palabras");
        } else {
            Palabra larga = listPalabras.get(0);
            
            for (Palabra p : listPalabras) {
                if (p.getLongitud() > larga.getLongitud()) {
                    larga = p;
                }
            }
            System.out.println("La palabra mas larga es: " + larga);
        }
    }
    
    
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    public static String pedirPalabra() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Palabra: ");
        return entrada.nextLine();
    }
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del fichero: ");
        return entrada.nextLine();
    }
}