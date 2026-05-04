package ejercicio01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        ArrayList<String> frases = new ArrayList<>();
        int opcion = 0;
        
        do {
            try {
                mostrarMenu();
                opcion = pedirOpcion();
                switch (opcion) {
                    case 1 -> aniadirFrase(frases);
                    case 2 -> mostrarFrases(frases);
                    case 3 -> guardarFrases(frases);
                    case 4 -> cargarFrases(frases);
                    case 5 -> mostrarEstadisticas(frases);
                    case 6 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opcion no valida, intentelo de nuevo");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe introducir un numero entero");
            } catch (IllegalAccessError e) {
                System.out.println("Error");
            }
        } while (opcion != 6);
    }
    
    public static void mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. ANIADIR FRASE");
        System.out.println("2. MOSTRAR FRASES");
        System.out.println("3. GUARDAR FRASES EN UN FICHERO");
        System.out.println("4. CARGAR FRASES DESDE UN FICHERO");
        System.out.println("5. ESTADISTICAS");
        System.out.println("6. SALIR DEL PROGRAMA");
        System.out.print("INTRODUCE UNA OPCION: ");
    }

    public static void aniadirFrase(ArrayList<String> list) throws IllegalAccessError {
        System.out.println("");
        
        String frase = pedirFrase();
        list.add(frase);
    }

    public static void mostrarFrases(ArrayList<String> list) {
        System.out.println("");
        
        if (list.isEmpty()) {
            System.out.println("No hay frases en la lista");
        } else {
            System.out.println("--LISTA DE FRASES--");
            for (String mostrar : list) {
                System.out.println(mostrar);
            }
        }
    }

    public static void guardarFrases(ArrayList<String> list) {
        System.out.println("");
        
        if (list.isEmpty()) {
            System.out.println("No hay nada en la lista");
        } else {
            System.out.print("Nombre del fichero: ");
            String nombreFichero = pedirNombre();

            FileWriter fw = null;
            PrintWriter pw = null;

            try {
                fw = new FileWriter(nombreFichero, true);
                pw = new PrintWriter(fw);

                for (String frase : list) {
                    pw.println(frase);
                }
                System.out.println("Frases guardadas correctamente");
            } catch (FileNotFoundException e) {
                System.out.println("Archivo no encontrado");
            } catch (IOException e) {
                System.out.println("Error al guardar el fichero");
            } finally {
                try {
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

    public static void cargarFrases(ArrayList<String> list) {
        System.out.println("");
        
        if (list.isEmpty()) {
            System.out.println("No hay nada en la lista");
        } else {
            System.out.print("Nombre del fichero: ");
            String nombreFichero = pedirNombre();

            FileReader fr = null;
            BufferedReader br = null;
            
            try {
                fr = new FileReader(nombreFichero);
                br = new BufferedReader(fr);
                
                String linea = br.readLine();
                
                while (linea != null) {
                    list.add(linea);
                    linea = br.readLine();
                }
                System.out.println("Frases cargadas correctamente");
            } catch (FileNotFoundException e) {
                System.out.println("Archivo no encontrado");
            } catch (IOException e) {
                System.out.println("Error al leer el fichero");
            } catch (IllegalAccessError e) {
                System.out.println("Error");
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
    
    public static void mostrarEstadisticas(ArrayList<String> list) {
        System.out.println("");
        
        if (list.isEmpty()) {
            System.out.println("No hay nada en la lista");
        } else {
            int total = list.size();
            int sumaLongitudes = 0;
            String masLarga = list.get(0);
            String masCorta = list.get(0);
            
            for (String frase : list) {
                int lon = frase.length();
                sumaLongitudes += lon;
                
                if (lon > masLarga.length()) {
                    masLarga = frase;
                }
                if (lon < masCorta.length()) {
                    masCorta = frase;
                }
            }
            double media = (double)sumaLongitudes / total;
            
            System.out.println("--ESTADISTICAS--");
            System.out.println("Total de frases: " + total);
            System.out.println("Longitud media: " + media);
            System.out.println("Frase mas larga: " + masLarga);
            System.out.println("Frase mas corta: " + masCorta);
        }
    }
    
    
    public static String pedirFrase() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        return entrada.nextLine();
    }
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
}