/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07tema11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author DAVID
 */
public class Ejercicio07Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Conjunto donde se guarda todas las campañas
        Set<Campania> campania = new HashSet<>();

        int opcion;

        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> aniadirCampania(campania);
                case 2 -> aniadirDonacion(campania);
                case 3 -> mostrarCampaniaConDonaciones(campania);
                case 4 -> mostrarCampaniaPorNombre(campania);
                case 5 -> mostrarTotalRecaudado(campania);
                case 6 -> mostrarMayorDonacion(campania);
                case 7 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentelo de nuevo");
            }
        } while (opcion != 7);
    }

    //Metodo que muestra por pantalla el menu
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. Anadir campania");
        System.out.println("2. Anadir donacion");
        System.out.println("3. Mostrar campanias junto con donaciones");
        System.out.println("4. Mostrar campania por nombre");
        System.out.println("5. Mostrar total dinero recaudado");
        System.out.println("6. Mostrar mayor donacion");
        System.out.println("7. Salir del programa");
        System.out.print("Elige opcion: ");
    }

    //Metodo que añade una nueva campaña al conjunto
    public static void aniadirCampania(Set<Campania> campania) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Nombre de la campania: ");
        String nombreCampania = entrada.nextLine();
        campania.add(new Campania(nombreCampania));
    }

    //Metodo que añade una donacion a una campaña concreta
    public static void aniadirDonacion(Set<Campania> campania) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        
        if (campania.isEmpty()) {
            System.out.println("No hay campanias registradas");
        } else {
            System.out.print("A que campania aniadir la donacion: ");
            String nombreCampania = entrada.nextLine();

            boolean encontrado = false;
            Campania campaniaObjetivo = null;
            Iterator<Campania> it = campania.iterator();//Sirve para recorrer una coleccion elemento a elemento

            while (it.hasNext() && !encontrado) {//Sirve para poder detener el recorrido cuando se quiera
                Campania camp = it.next();
                if (camp.getNombre().equalsIgnoreCase(nombreCampania)) {
                    encontrado = true;
                    campaniaObjetivo = camp;
                }
            }
            if (!encontrado) {
                System.out.println("No existe esa campania");
            } else {
                campaniaObjetivo.aniadirDonacion();
            }
        }
    }

    //Metodo que muestra todas las campañas con sus donaciones
    public static void mostrarCampaniaConDonaciones(Set<Campania> campania) {
        System.out.println();
        
        if (campania.isEmpty()) {
            System.out.println("No hay campanias registradas");
        } else {
            for (Campania camp : campania) {
                System.out.println("--" + camp.getNombre() + "--");
                camp.mostrarDonaciones();
            }
        }
    }

    //Metodo que muestra una campaña concreta buscandola por su nombre
    public static void mostrarCampaniaPorNombre(Set<Campania> campania) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        
        if (campania.isEmpty()) {
            System.out.println("No hay campanias registradas");
        } else {
            System.out.print("Nombre de la campania a mostrar: ");
            String nombre = entrada.nextLine();

            boolean encontrado = false;
            Campania campaniaObjetivo = null;
            Iterator<Campania> it = campania.iterator();//Sirve para recorrer una coleccion elemento a elemento

            while (it.hasNext() && !encontrado) {//Sirve para poder detener el recorrido cuando se quiera
                Campania camp = it.next();
                if (camp.getNombre().equalsIgnoreCase(nombre)) {
                    encontrado = true;
                    campaniaObjetivo = camp;
                }
            }
            if (!encontrado) {
                System.out.println("No existe esa campania");
            } else {
                campaniaObjetivo.mostrarDonaciones();
            }
        }
    }

    //Metodo que muestra el total recaudado entre todas las campañas
    public static void mostrarTotalRecaudado(Set<Campania> campania) {
        System.out.println();
        
        float total = 0;
        for (Campania c : campania) {
            total += c.totalRecaudado();
        }
        System.out.println("Total recaudado: " + total + " Euro");
    }

    //Metodo que muestra la mayor donacion entre todas las campañas
    public static void mostrarMayorDonacion(Set<Campania> campania) {
        System.out.println();

        Donacion mayor = null;

        for (Campania camp : campania) {
            Donacion mayorCampania = camp.mostrarMayorDonacion();
            if (mayorCampania != null) {
                if (mayor == null || mayorCampania.getCantidad() > mayor.getCantidad()) {
                    mayor = mayorCampania;
                }
            }
        }
        if (mayor == null) {
            System.out.println("No hay donaciones registradas.");
        } else {
            System.out.println("Mayor donacion:\n" + mayor);
        }
    }
}