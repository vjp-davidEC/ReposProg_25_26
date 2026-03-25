/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03tema11;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio03Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //
        Autobus[] darsenas = new Autobus[6];
        
        int opcion;
        
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> aparcarBus(darsenas);
                case 2 -> mostrarDarsenasLibres(darsenas);
                case 3 -> buscarAutobus(darsenas);
                case 4 -> buscarConductor(darsenas);
                case 5 -> busConMasConductores(darsenas);
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while (opcion != 6);
    }
    
    //
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. APARCAR AUTOBUS");
        System.out.println("2. MOSTRAR DARSENAS LIBRES");
        System.out.println("3. BUSCAR AUTOBUSES POR MATRICULA");
        System.out.println("4. BUSCAR CONDUCTOR");
        System.out.println("5. AUTOBUS CON MAS CONDUCTORES");
        System.out.println("6. SALIR DEL PROGRAMA");
        System.out.print("INTRODUCE UNA OPCION: ");
    }
    
    //
    public static void aparcarBus(Autobus[] darsenas) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        
        int pos;
        do {
            System.out.print("Introduce la posicion para aparcar el bus (0-5): ");
            pos = entrada.nextInt();
        } while (pos < 0 || pos > 5 || darsenas[pos] != null);
        
        Autobus bus = new Autobus(pedirMatricula());
        System.out.print("Cuantos conductores quieres aniadir: ");
        int num = entrada.nextInt();
        
        for (int i = 0; i < num; i++) {
            bus.addConductor(pedirDni(), pedirNombre());
        }
        darsenas[pos] = bus;
        System.out.println("Autobus aparcado correctamente");
    }
    
    //
    public static void mostrarDarsenasLibres(Autobus[] darsenas) {
        System.out.println();
        
        boolean libre = false;
        
        for (int i = 0; i < darsenas.length; i++) {
            if (darsenas[i] == null) {
                System.out.println("Darsena " + i + " libre");
                libre = true;
            }
        }
        if (!libre) {
            System.out.println("No hay darsenas libres");
        }
    }
    
    //
    public static void buscarAutobus(Autobus[] darsenas) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce la matricula a buscar: ");
        String matricula = entrada.nextLine();
        
        boolean encontrado = false;
        int i = 0;
        
        while (i < darsenas.length && !encontrado) {
            if (darsenas[i] != null && darsenas[i].getMatricula().equalsIgnoreCase(matricula)) {
                System.out.println("Autobus encontrado en darsena: " + i);
                System.out.println("Conductores asignados: " + darsenas[i].getConductores());
                encontrado = true;
            } else {
                i++;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro ningun autobus con esa matricula");
        }
    }
    
    //
    public static void buscarConductor(Autobus[] darsenas) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el DNI del conductor: ");
        String DNI = entrada.nextLine();
        
        boolean encontrado = false;
        int i = 0;
        
        while (i < darsenas.length && !encontrado) {
            if (darsenas[i] != null && darsenas[i].getConductores().containsKey(DNI)) {
                System.out.println("El conductor trabaja en el autobus con matricula: " + darsenas[i].getMatricula());
                encontrado = true;
            } else {
                i++;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro ningun conductor con ese DNI");
        }
    }
    
    //
    public static void busConMasConductores(Autobus[] darsenas) {
        System.out.println();
        
        int max = 0, posicion = 0;
        
        for (int i = 0; i < darsenas.length; i++) {
            if (darsenas[i] != null) {
                int cantidad = darsenas[i].getConductores().size();
                if (cantidad > max) {
                    max = cantidad;
                    posicion = i;
                }
            }
        }
        if (max == 0) {
            System.out.println("No hay autobuses aparcados o ninguno tiene conductores");
        } else {
            System.out.println("El autobus con mas conductores esta en la darsena " + posicion);
        }
    }
    
    
    //
    public static String pedirMatricula() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la matricula del autobus: ");
        String matricula = entrada.nextLine();
        return matricula;
    }
    public static String pedirDni() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("DNI del conductor: ");
        String DNI = entrada.nextLine();
        return DNI;
    }
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del conductor: ");
        String nombre = entrada.nextLine();
        return nombre;
    }
}