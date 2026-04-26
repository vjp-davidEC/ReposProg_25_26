package ejercicio03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = pedirOpcion();
                switch (opcion) {
                    case 1 ->
                        aniadirNumeros(numeros);
                    case 2 ->
                        guardarNumerosFichero(numeros);
                    case 3 ->
                        cargarNumerosFichero(numeros);
                    case 4 ->
                        mostrarEstadisticas(numeros);
                    case 5 ->
                        System.out.println("Saliendo del programa...");
                    default ->
                        System.out.println("Opcion no valida, intentelo de nuevo");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, debes introducir un numero entero");
            }
        } while (opcion != 5);
    }

    public static void mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. ANIADIR NUMEROS");
        System.out.println("2. GUARDAR NUMEROS EN EL FICHERO");
        System.out.println("3. CARGAR NUMEROS EN EL FICHERO");
        System.out.println("4. MOSTRAR ESTADISTICAS");
        System.out.println("5. SALIR DEL PROGRAMA");
        System.out.print("INTRODUCE UNA OPCION: ");
    }

    public static void aniadirNumeros(ArrayList<Integer> list) {
        System.out.println("");

        do {
            try {
                int num = pedirNumero();
                list.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Error, debe ser un numero entero");
            }
            System.out.print("Deseas introducir otro numero (s/n): ");
        } while (pedirNombreOSeguir().equalsIgnoreCase("s"));
    }

    public static void guardarNumerosFichero(ArrayList<Integer> list) {
        System.out.println("");

        if (list.isEmpty()) {
            System.out.println("No hay numeros para guardar");
        } else {
            FileWriter fw = null;
            PrintWriter pw = null;

            System.out.print("Nombre del fichero: ");
            String nombreFichero = pedirNombreOSeguir();

            try {
                fw = new FileWriter(nombreFichero);
                pw = new PrintWriter(fw);

                for (int num : list) {
                    pw.println(num);
                }
                System.out.println("Numeros guardados correctamente");
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

    public static void cargarNumerosFichero(ArrayList<Integer> list) {
        System.out.println("");

        if (list.isEmpty()) {
            System.out.println("No hay numeros en la lista");
        } else {
            FileReader fr = null;
            BufferedReader br = null;

            System.out.print("Nombre del fichero: ");
            String nombreFichero = pedirNombreOSeguir();

            try {
                fr = new FileReader(nombreFichero);
                br = new BufferedReader(fr);
                
                String linea = br.readLine();

                while (linea != null) {
                    try {
                        int num = Integer.parseInt(linea);
                        list.add(num);
                    } catch (NumberFormatException e) {
                        System.out.println("Linea que no es un numero, ignorada: " + linea);
                    }
                    linea = br.readLine();
                }
                System.out.println("Numeros cargados correctamente");
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

    public static void mostrarEstadisticas(ArrayList<Integer> list) {
        System.out.println("");
        
        if (list.isEmpty()) {
            System.out.println("No hay numeros para analizar");
        } else {
            int total = list.size();
            int suma = 0;
            int max = list.get(0);
            int min = list.get(0);
            
            for (int num : list) {
                suma += num;
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
            double media = (double)suma / total;
            
            System.out.println("--ESTADISTICAS--");
            System.out.println("CANTIDAD: " + total);
            System.out.println("MEDIA: " + media);
            System.out.println("MAXIMO: " + max);
            System.out.println("MINIMO: " + min);
        }
    }

    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        return entrada.nextInt();
    }

    public static String pedirNombreOSeguir() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
}