package ejercicio07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        int opcion = 0;
        
        do {
            try {
                mostrarMenu();
                opcion = pedirOpcion();
                switch (opcion) {
                    case 1 -> aniadirLectura(list);
                    case 2 -> mostrarLecturas(list);
                    case 3 -> guardarFichero(list);
                    case 4 -> cargarFichero(list);
                    case 5 -> estadisticas(list);
                    case 6 -> detectarAnomalias(list);
                    case 7 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opcion no valida, intentelo de nuevo");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR, debe ser un numero entero");
            } catch (NumberFormatException e) {
                System.out.println("ERROR");
            }
        } while (opcion != 7);
    }
    
    public static void mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. ANIADIR LECTURA");
        System.out.println("2. MOSTRAR LECTURAS");
        System.out.println("3. GUARDAR LECTURAS");
        System.out.println("4. CARGAR LECTURAS");
        System.out.println("5. ESTADISTICAS");
        System.out.println("6. DETECTAR ANOMALIAS");
        System.out.println("7. SALIR DEL PROGRAMA");
        System.out.print("INTRODUCE UNA OPCION: ");
    }
    
    public static void aniadirLectura(ArrayList<Double> list) throws NumberFormatException {
        System.out.println("");
        
        list.add(pedirValor());
    }
    
    public static void mostrarLecturas(ArrayList<Double> list) {
        System.out.println("");
        
        if (list.isEmpty()) {
            System.out.println("No hay lectura");
        } else {
            System.out.println("-- LECTURAS --");
            for (double d : list) {
                System.out.println(" - " + d);
            }
        }
    }
    
    public static void guardarFichero(ArrayList<Double> list) {
        System.out.println("");
        
        if (list.isEmpty()) {
            System.out.println("No hay lecturas");
        } else {
            FileWriter fw = null;
            PrintWriter pw = null;
            
            System.out.print("Introduce el nombre del fichero: ");
            String nombreFichero = pedirNombre();
            
            try {
                fw = new FileWriter(nombreFichero);
                pw = new PrintWriter(fw);
                
                for (double d : list) {
                    pw.println(d);
                }
                System.out.println("Guardada correctamente");
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
    
    public static void cargarFichero(ArrayList<Double> list) throws NumberFormatException {
        System.out.println("");
        
        if (list.isEmpty()) {
            System.out.println("No hay lecturas");
        } else {
            FileReader fr = null;
            BufferedReader br = null;
            
            System.out.print("Introduce el nombre del fichero: ");
            String nombreFichero = pedirNombre();
            
            try {
                fr = new FileReader(nombreFichero);
                br = new BufferedReader(fr);
                
                String linea = br.readLine();
                
                while (linea != null) {
                    double valor = Double.parseDouble(linea);
                    list.add(valor);
                    
                    linea = br.readLine();
                }
                System.out.println("Cargada correctamente");
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
    
    public static void estadisticas(ArrayList<Double> list) {
        System.out.println("");
        
        if (list.isEmpty()) {
            System.out.println("No hay lecturas");
        } else {
            double max = list.get(0);
            double min = list.get(0);
            double suma = 0;
            
            for (double d : list) {
                suma += d;
                if (d > max) {
                    max = d;
                }
                if (d < min) {
                    min = d;
                }
            }
            double media = suma / list.size();
            
            System.out.println("MEDIA: " + media);
            System.out.println("MAXIMA: " + max);
            System.out.println("MINIMO: " + min);
        }
    }
    
    public static void detectarAnomalias(ArrayList<Double> list) {
        System.out.println("");
        
        if (list.isEmpty()) {
            System.out.println("No hay lecturas");
        } else {
            System.out.println("-- ANOMALIAS (fuera de -10 a 50) --");
            boolean hay = false;
            
            for (double d : list) {
                if (d < -10 || d > 50) {
                    hay = true;
                    System.out.println("Anomalia detectada: " + d);
                }
            }
            if (hay) {
                System.out.println("Se detectaron anteriormente");
            } else {
                System.out.println("No se detectaron anomalias");
            }
        }
    }
    
    
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    public static double pedirValor() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el valor: ");
        return entrada.nextInt();
    }
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
}