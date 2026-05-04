package ejercicio05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        ArrayList<Tarea> listTareas = new ArrayList<>();
        int opcion = 0;
        
        do {
            try {
                mostrarMenu();
                opcion = pedirOpcion();
                switch (opcion) {
                    case 1 -> aniadirTarea(listTareas);
                    case 2 -> completarTarea(listTareas);
                    case 3 -> mostrarTareas(listTareas);
                    case 4 -> guardarFichero(listTareas);
                    case 5 -> cargarFichero(listTareas);
                    case 6 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opcion no valida, intentelo de nuevo");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un numero entero");
            }
        } while (opcion != 6);
    }
    
    public static void mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. ANIADIR TAREA");
        System.out.println("2. MARCAR TAREA COMO COMPLETADA");
        System.out.println("3. MOSTRAR TAREAS");
        System.out.println("4. GUARDAR TAREAS");
        System.out.println("5. CARGAR TAREAS");
        System.out.println("6. SALIENDO DEL PROGRAMA");
        System.out.print("INTRODUCE UNA OPCION: ");
    }
    
    public static void aniadirTarea(ArrayList<Tarea> listTareas) {
        System.out.println("");
        
        try {
            listTareas.add(new Tarea(pedirDescripcion()));
        } catch (IllegalArgumentException e) {
            System.out.println("Error");
        }
    }
    
    public static void completarTarea(ArrayList<Tarea> listTareas) {
        System.out.println("");
        
        try {
            System.out.print("Indice de tarea: ");
            int i = pedirOpcion();
            listTareas.get(i).completar();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indice no valido");
        } catch (NumberFormatException e) {
            System.out.println("ERROR, debe ser un numero");
        }
    }
    
    public static void mostrarTareas(ArrayList<Tarea> listTareas) {
        System.out.println("");
        
        if (listTareas.isEmpty()) {
            System.out.println("No hay tareas");
        } else {
            for (int i = 0; i < listTareas.size(); i++) {
                System.out.println(i + ". " + listTareas.get(i));
            }
        }
    }
    
    public static void guardarFichero(ArrayList<Tarea> listTareas) {
        System.out.println("");
        
        if (listTareas.isEmpty()) {
            System.out.println("No hay tareas");
        } else {
            FileWriter fw = null;
            PrintWriter pw = null;
            
            System.out.println("Introduce el nombre del fichero");
            String nombreFichero = pedirNombre();
            
            try {
                fw = new FileWriter(nombreFichero);
                pw = new PrintWriter(fw);
                
                for (Tarea t : listTareas) {
                    pw.println(t.toString());
                }
                System.out.println("Guardado correctamente");
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
    
    public static void cargarFichero(ArrayList<Tarea> listTareas) {
        System.out.println("");
        
        if (listTareas.isEmpty()) {
            System.out.println("No hay tareas");
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
                    String desc = linea.split(" - ")[0];
                    Tarea t = new Tarea(desc);
                    
                    if (linea.contains("Completada")) {
                        t.completar();
                    }
                    listTareas.add(t);
                    linea = br.readLine();
                }
                System.out.println("Cargado correctamente");
            } catch (FileNotFoundException e) {
                System.out.println("Archivo no encontrado");
            } catch (IOException e) {
                System.out.println("Error al cargar el fichero");
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
    
    
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    public static String pedirDescripcion() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Descripcion: ");
        return entrada.nextLine();
    }
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del fichero: ");
        return entrada.nextLine();
    }
}