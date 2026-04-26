package ejercicio08;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        ArrayList<String> listNombres = new ArrayList<>();
        ArrayList<Double> listPrecios = new ArrayList<>();
        ArrayList<Integer> listCantidades = new ArrayList<>();
        int opcion = 0;
        
        do {
            try {
                mostrarMenu();
                opcion = pedirOpcion();
                switch (opcion) {
                    case 1 -> aniadirProducto(listNombres, listPrecios, listCantidades);
                    case 2 -> mostrarProductos(listNombres, listPrecios, listCantidades);
                    case 3 -> guardarFichero(listNombres, listPrecios, listCantidades);
                    case 4 -> cargarFichero(listNombres, listPrecios, listCantidades);
                    case 5 -> buscarPorNombre(listNombres, listPrecios, listCantidades);
                    case 6 -> valorTotal(listPrecios, listCantidades);
                    case 7 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opcion no valida, intentelo de nuevo");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR, debe ser un numero entero");
            } catch (Exception e) {
                System.out.println("ERROR");
            }
        } while (opcion != 7);
    }
    
    public static void mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. ANIADIR PRODUCTO");
        System.out.println("2. MOSTRAR PRODUCTOS");
        System.out.println("3. GUARDAR FICHERO");
        System.out.println("4. CARGAR FICHERO");
        System.out.println("5. BUSCAR POR NOMBRE");
        System.out.println("6. VALOR TOTAL");
        System.out.println("7. SALIR DEL PROGRAMA");
        System.out.print("INTRODUCE UNA OPCION: ");
    }
    
    public static void aniadirProducto(ArrayList<String> listNombres, ArrayList<Double> listPrecios, ArrayList<Integer> listCantidades) {
        System.out.println("");
        
        listNombres.add(pedirNombre());
        listPrecios.add(pedirPrecio());
        listCantidades.add(pedirCantidad());
    }
    
    public static void mostrarProductos(ArrayList<String> listNombres, ArrayList<Double> listPrecios, ArrayList<Integer> listCantidades) {
        System.out.println("");
        
        if (listNombres.isEmpty()) {
            System.out.println("No hay productos");
        } else {
            for (int i = 0; i < listNombres.size(); i++) {
                System.out.println(listNombres.get(i) + " - " + listPrecios.get(i) + " Euros - x" + listCantidades.get(i));
            }
        }
    }
    
    public static void guardarFichero(ArrayList<String> listNombres, ArrayList<Double> listPrecios, ArrayList<Integer> listCantidades) {
        System.out.println("");
        
        if (listNombres.isEmpty()) {
            System.out.println("No hay productos");
        } else {
            FileWriter fw = null;
            PrintWriter pw = null;
            
            System.out.println("Introduce el nombre del fichero");
            String nombreFichero = pedirNombreFichero();
            
            try {
                fw = new FileWriter(nombreFichero);
                pw = new PrintWriter(fw);
                
                for (int i = 0; i < listNombres.size(); i++) {
                    pw.println(listNombres.get(i) + ";" + listPrecios.get(i) + ";" + listCantidades.get(i));
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
    
    public static void cargarFichero(ArrayList<String> listNombres, ArrayList<Double> listPrecios, ArrayList<Integer> listCantidades) throws Exception {
        System.out.println("");
        
        if (listNombres.isEmpty()) {
            System.out.println("No hay productos");
        } else {
            FileReader fr = null;
            BufferedReader br = null;
            
            System.out.println("Introduce el nombre del fichero");
            String nombreFichero = pedirNombreFichero();
            
            try {
                fr = new FileReader(nombreFichero);
                br = new BufferedReader(fr);
                
                String linea = br.readLine();
                
                while (linea != null) {
                    String[] partes = linea.split(";");
                    
                    listNombres.add(partes[0]);
                    listPrecios.add(Double.valueOf(partes[1]));
                    listCantidades.add(Integer.valueOf(partes[2]));
                    
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
    
    public static void buscarPorNombre(ArrayList<String> listNombres, ArrayList<Double> listPrecios, ArrayList<Integer> listCantidades) {
        System.out.println("");
        
        if (listNombres.isEmpty()) {
            System.out.println("No hay productos");
        } else {
            System.out.println("Nombre a buscar");
            String nombreBuscar = pedirNombre();
            
            boolean encontrado = false;
            int i = 0;
            
            while (i < listNombres.size() && !encontrado) {
                if (listNombres.get(i).equalsIgnoreCase(nombreBuscar)) {
                    encontrado = true;
                    System.out.println(listNombres.get(i) + " - " + listPrecios.get(i) + " Euros - x" + listCantidades.get(i));
                }
                i++;
            }
            if (!encontrado) {
                System.out.println("No existe el producto con el nombre: " + nombreBuscar);
            }
        }
    }
    
    public static void valorTotal(ArrayList<Double> listPrecios, ArrayList<Integer> listCantidades) {
        System.out.println("");
        
        if (listPrecios.isEmpty()) {
            System.out.println("No hay productos");
        } else {
            double total = 0;
            
            for (int i = 0; i < listPrecios.size(); i++) {
                total += listPrecios.get(i) * listCantidades.get(i);
            }
            System.out.println("Valor total del inventerio: " + total + " Euros");
        }
    }
    
    
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }
    public static double pedirPrecio() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Precio: ");
        return entrada.nextDouble();
    }
    public static int pedirCantidad() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cantidad: ");
        return entrada.nextInt();
    }
    public static String pedirNombreFichero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del fichero: ");
        return entrada.nextLine();
    }
}