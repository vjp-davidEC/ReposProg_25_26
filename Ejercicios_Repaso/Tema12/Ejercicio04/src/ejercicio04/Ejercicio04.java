package ejercicio04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        ArrayList<Estudiante> listEstudiantes = new ArrayList<>();
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = pedirOpcion();
                switch (opcion) {
                    case 1 ->
                        aniadirEstudiantes(listEstudiantes);
                    case 2 -> 
                        mostrarEstudiantes(listEstudiantes);
                    case 3 -> 
                        guardarFichero(listEstudiantes);
                    case 4 -> 
                        cargarFichero(listEstudiantes);
                    case 5 -> 
                        estadisticas(listEstudiantes);
                    case 6 ->
                        System.out.println("Saliendo del programa...");
                    default ->
                        System.out.println("Opcion no valida, intentelo de nuevo");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, debes introducir un numero entero");
            } catch (IllegalArgumentException e) {
                System.out.println("Error");
            }
        } while (opcion != 6);
    }

    public static void mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. ANIADIR ESTUDIANTE");
        System.out.println("2. MOSTRAR ESTUDIANTES");
        System.out.println("3. GUARDAR EN FICHERO");
        System.out.println("4. CARGAR DESDE FICHERO");
        System.out.println("5. ESTADISTICAS");
        System.out.println("6. SALIR DEL PROGRAMA");
        System.out.print("INTRODUCE UNA OPCION: ");
    }

    public static void aniadirEstudiantes(ArrayList<Estudiante> list) throws IllegalArgumentException {
        System.out.println("");

        try {
            list.add(new Estudiante(pedirNombre(), pedirNota()));
            System.out.println("Estudiante aniadido");
        } catch (NumberFormatException e) {
            System.out.println("Error");
        }
    }

    public static void mostrarEstudiantes(ArrayList<Estudiante> list) {
        System.out.println("");

        if (list.isEmpty()) {
            System.out.println("No hay estudiantes");
        } else {
            for (Estudiante estu : list) {
                System.out.println(estu);
            }
        }
    }

    public static void guardarFichero(ArrayList<Estudiante> list) {
        System.out.println("");

        if (list.isEmpty()) {
            System.out.println("No hay estudiantes para guardar");
        } else {
            FileWriter fw = null;
            PrintWriter pw = null;

            System.out.println("Introduzca el nombre del fichero");
            String nombreFichero = pedirNombre();

            try {
                fw = new FileWriter(nombreFichero);
                pw = new PrintWriter(fw);

                for (Estudiante e : list) {
                    pw.println(e.getNombre() + ";" + e.getNota());
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

    public static void cargarFichero(ArrayList<Estudiante> list) throws IllegalArgumentException {
        System.out.println("");

        if (list.isEmpty()) {
            System.out.println("No hay nada en la lista");
        } else {
            FileReader fr = null;
            BufferedReader br = null;

            System.out.println("Introduzca el nombre del fichero");
            String nombreFichero = pedirNombre();

            try {
                fr = new FileReader(nombreFichero);
                br = new BufferedReader(fr);

                String linea = br.readLine();

                while (linea != null) {
                    boolean lineaValida = true;

                    if (linea.equals("")) {
                        System.out.println("Linea vacia ignorada");
                        lineaValida = false;
                    }

                    String[] partes = linea.split(";");

                    if (lineaValida && partes.length != 2) {
                        System.out.println("Linea corrupta ignorada: " + linea);
                        lineaValida = false;
                    }

                    String nombreEstu = "";
                    double notaEstu = 0;

                    if (lineaValida) {
                        nombreEstu = partes[0];
                        String notaTexto = partes[1];
                        if (nombreEstu.equals("")) {
                            System.out.println("Nombre vacio ignorado: " + linea);
                            lineaValida = false;
                        }
                        if (lineaValida) {
                            try {
                                notaEstu = Double.parseDouble(notaTexto);
                            } catch (NumberFormatException e) {
                                System.out.println("Nota invalida ignorada: " + linea);
                                lineaValida = false;
                            }
                        }
                        if (lineaValida) {
                            if (notaEstu < 0 || notaEstu > 10) {
                                System.out.println("Nota fuera de rango ignorada: " + linea);
                                lineaValida = false;
                            }
                        }
                    }
                    if (lineaValida) {
                        list.add(new Estudiante(nombreEstu, notaEstu));
                    }
                    linea = br.readLine();
                }
                System.out.println("Cargado correctamente");
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
    
    public static void estadisticas(ArrayList<Estudiante> list) {
        System.out.println("");
        
        if (list.isEmpty()) {
            System.out.println("No hay estudiantes");
        } else {
            double suma = 0;
            double max = list.get(0).getNota();
            double min = list.get(0).getNota();
            
            for (Estudiante e : list) {
                double nota = e.getNota();
                suma += nota;
                if (nota > max) {
                    max = nota;
                }
                if (nota < min) {
                    min = nota;
                }
            }
            System.out.println("Media: " + (suma/list.size()));
            System.out.println("Maxima: " + max);
            System.out.println("Minima: " + min);
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

    public static double pedirNota() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota: ");
        return entrada.nextDouble();
    }
}
