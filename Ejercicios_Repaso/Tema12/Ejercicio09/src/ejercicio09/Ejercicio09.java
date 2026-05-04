package ejercicio09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        ArrayList<Registro> listRegistros = new ArrayList<>();
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = pedirOpcion();
                switch (opcion) {
                    case 1 ->
                        aniadirRegistro(listRegistros);
                    case 2 ->
                        mostrarRegistros(listRegistros);
                    case 3 ->
                        guardarRegistros(listRegistros);
                    case 4 ->
                        cargarRegistros(listRegistros);
                    case 5 ->
                        volcarParesAFichero();
                    case 6 ->
                        invertirFichero();
                    case 7 ->
                        sumarNumerosFichero();
                    case 8 ->
                        System.out.println("Saliendo del programa...");
                    default ->
                        System.out.println("Opcion no valida, intentelo de nuevo");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Debes introducir un numero entero");
            }
        } while (opcion != 8);
    }

    public static void mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. ANIADIR REGISTRO");
        System.out.println("2. MOSTRAR REGISTROS");
        System.out.println("3. GUARDAR REGISTROS EN FICHERO");
        System.out.println("4. CARGAR REGISTROS DESDE FICHERO");
        System.out.println("5. VOLCAR 100 PARES A FICHERO");
        System.out.println("6. INVERTIR TEXTO DE UN FICHERO");
        System.out.println("7. SUMAR NUMEROS DE UN FICHERO");
        System.out.println("8. SALIR DEL PROGRAMA");
        System.out.print("INTRODUCE UNA OPCION: ");
    }

    public static void aniadirRegistro(ArrayList<Registro> listRegistros) throws InputMismatchException {
        System.out.println("");

        System.out.println("Introduciendo datos...");
        listRegistros.add(new Registro(pedirNombre(), pedirEdad(), pedirTelefono()));
        System.out.println("Registro aniadido correctamente");
    }

    public static void mostrarRegistros(ArrayList<Registro> listRegistros) {
        System.out.println("");

        if (listRegistros.isEmpty()) {
            System.out.println("No hay registros");
        } else {
            for (Registro r : listRegistros) {
                System.out.println(r);
            }
        }
    }

    public static void guardarRegistros(ArrayList<Registro> listRegistros) {
        System.out.println();

        if (listRegistros.isEmpty()) {
            System.out.println("No hay registros para guardar");
        } else {
            FileWriter fw = null;
            PrintWriter pw = null;

            try {
                System.out.println("Introduce el nombre del fichero");
                String nombreFichero = pedirNombre();

                fw = new FileWriter(nombreFichero);
                pw = new PrintWriter(fw);

                for (Registro r : listRegistros) {
                    pw.println(r.getNombre() + ";" + r.getEdad() + ";" + r.getTelefono());
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

    public static void cargarRegistros(ArrayList<Registro> listRegistros) {
        System.out.println();

        if (listRegistros.isEmpty()) {
            System.out.println("No hay registros para guardar");
        } else {
            FileReader fr = null;
            BufferedReader br = null;

            try {
                System.out.println("Introduce el nombre del fichero");
                String nombreFichero = pedirNombre();

                fr = new FileReader(nombreFichero);
                br = new BufferedReader(fr);

                String linea = br.readLine();

                while (linea != null) {
                    boolean valida = true;

                    if (linea.equals("")) {
                        System.out.println("Linea vacia ignorada");
                        valida = false;
                    }

                    String[] partes = linea.split(";");

                    if (valida && partes.length != 3) {
                        System.out.println("Linea corrupta ignorada: " + linea);
                        valida = false;
                    }

                    if (valida) {
                        try {
                            String nombre = partes[0];
                            int edad = Integer.parseInt(partes[1]);
                            int telefono = Integer.parseInt(partes[2]);

                            listRegistros.add(new Registro(nombre, edad, telefono));

                        } catch (NumberFormatException e) {
                            System.out.println("Número inválido ignorado: " + linea);
                        }
                    }
                    linea = br.readLine();
                }
                System.out.println("Guardado correctamente");
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

    public static void volcarParesAFichero() {
        System.out.println();

        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            System.out.println("Introduce el nombre del fichero");
            String nombreFichero = pedirNombre();

            fw = new FileWriter(nombreFichero);
            pw = new PrintWriter(fw);

            for (int i = 1; i <= 100; i++) {
                pw.println(i * 2);
            }
            System.out.println("Fichero creado correctamente");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("ERROR al escribir en el fichero");
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

    public static void invertirFichero() {
        System.out.println();

        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            System.out.println("Introduce el fichero a leer");
            String origen = pedirNombre();

            System.out.println("Introduce el fichero a salir");
            String destino = pedirNombre();

            fr = new FileReader(origen);
            br = new BufferedReader(fr);

            fw = new FileWriter(destino);
            pw = new PrintWriter(fw);

            String texto = "";
            String linea = br.readLine();

            while (linea != null) {
                texto += linea;
                linea = br.readLine();
            }

            String invertido = "";
            for (int i = texto.length() - 1; i >= 0; i--) {
                invertido += texto.charAt(i);
            }
            pw.println(invertido);
            System.out.println("Texto invertido correctamente");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("ERROR al procesar los ficheros");
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

    public static void sumarNumerosFichero() {
        System.out.println();

        FileReader fr = null;
        BufferedReader br = null;

        try {
            System.out.println("Introduce el nombre del fichero");
            String nombreFichero = pedirNombre();

            fr = new FileReader(nombreFichero);
            br = new BufferedReader(fr);

            String linea = br.readLine();
            int suma = 0;

            while (linea != null) {
                String[] partes = linea.split(";");
                for (String num : partes) {
                    suma += Integer.parseInt(num);
                }
                linea = br.readLine();
            }
            System.out.println("La suma total es: " + suma);
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("ERROR al leer el fichero");
        } catch (NumberFormatException e) {
            System.out.println("Numero invalido en el fichero");
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


    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }

    public static int pedirEdad() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Edad: ");
        return entrada.nextInt();
    }

    public static int pedirTelefono() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Telefono: ");
        return entrada.nextInt();
    }
}