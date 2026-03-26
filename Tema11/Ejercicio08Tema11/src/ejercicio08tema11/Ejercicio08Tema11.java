/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08tema11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio08Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Lista donde se guarda todas las ciudades
        ArrayList<Ciudad> ciudades = new ArrayList<>();

        int opcion;

        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 ->
                    aniadirCiudad(ciudades);
                case 2 ->
                    mostrarCiudades(ciudades);
                case 3 ->
                    mostrarSedesSuperioresMedia(ciudades);
                case 4 ->
                    buscarSede(ciudades);
                case 5 ->
                    aniadirSede(ciudades);
                case 6 ->
                    mostrarTodasLasSedesOrdenadas(ciudades);
                case 7 ->
                    System.out.println("Saliendo del programa...");
                default ->
                    System.out.println("Opcion no valida, intentelo de nuevo");
            }
        } while (opcion != 7);
    }

    //Metodo que muestra el menu por pantalla
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. Aniadir ciudad");
        System.out.println("2. Mostrar ciudades con sus sedes");
        System.out.println("3. Mostrar sedes con ingresos superiores a la media");
        System.out.println("4. Buscar sede por nombre");
        System.out.println("5. Aniadir sede a una ciudad");
        System.out.println("6. Mostrar todas las sedes ordenadas por ingresos");
        System.out.println("7. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }

    //Metodo que añade una nueva ciudad y se puede añadir mas de una sede
    public static void aniadirCiudad(ArrayList<Ciudad> ciudades) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nombre de la ciudad: ");
        String nombreCiudad = entrada.nextLine();
        Ciudad ciudad = new Ciudad(nombreCiudad);

        String continuar;
        do {
            ciudad.aniadirSede();
            System.out.print("Aniadir otra sede - Si/No: ");
            continuar = entrada.nextLine();
        } while (continuar.equalsIgnoreCase("si"));
        ciudades.add(ciudad);
    }

    //Metodo que muestra las ciudades con sus sedes
    public static void mostrarCiudades(ArrayList<Ciudad> ciudades) {
        System.out.println();

        if (ciudades.isEmpty()) {
            System.out.println("No hay ciudades registradas");
        } else {
            for (Ciudad ciudad : ciudades) {
                System.out.println("Ciudad: " + ciudad.getNombre());
                ciudad.mostrarSedes();
            }
        }
    }

    //Metodo que muestra las sedes que superan la media de ingresos en cada ciudad
    public static void mostrarSedesSuperioresMedia(ArrayList<Ciudad> ciudades) {
        System.out.println();

        for (Ciudad ciudad : ciudades) {
            ciudad.mostrarSedeSuperioresMedia();
        }
    }

    //Metodo que busca una sede por nombre en todas las ciudades
    public static void buscarSede(ArrayList<Ciudad> ciudades) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nombre de la sede a buscar: ");
        String nombreSede = entrada.nextLine();

        boolean encontrado = false;

        for (Ciudad ciudad : ciudades) {
            if (ciudad.buscarSede(nombreSede)) {
                //Se recorre las sedes de esa ciudad para obtener los ingresos
                for (Sede sede : ciudad.getSedes()) {
                    if (sede.getNombreSede().equalsIgnoreCase(nombreSede)) {
                        System.out.println("La sede \"" + nombreSede + "\" con ingresos " + sede.getIngresos()
                                + " esta en " + ciudad.getNombre());
                        encontrado = true;
                    }
                }
            }
        }
        if(!encontrado) {
            System.out.println("La sede no existe");
        }
    }

    //Metodo que añade una sede a una ciudad ya creada
    public static void aniadirSede(ArrayList<Ciudad> ciudades) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nombre de la ciudad donde aniadir la sede: ");
        String nombreCiudad = entrada.nextLine();

        Ciudad encontrada = null;
        boolean encontrado = false;
        Iterator<Ciudad> it = ciudades.iterator();//Sirve para recorrer una coleccion elemento a elemento

        while (it.hasNext() && !encontrado) {//Sirve para poder detener el recorrido cuando se quiera
            Ciudad ciudad = it.next();
            if (ciudad.getNombre().equalsIgnoreCase(nombreCiudad)) {
                encontrada = ciudad;
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No existe esa ciudad");
        } else {
            encontrada.aniadirSede();
        }
    }

    //Metodo que muestra todas las sedes de todas las ciudades ordenadas de mayor a menor ingresos
    public static void mostrarTodasLasSedesOrdenadas(ArrayList<Ciudad> ciudades) {
        System.out.println();

        System.out.println("\n--TODAS LAS SEDES ORDENADAS--");
        ArrayList<Sede> sedes = new ArrayList<>();

        //Se mezcla todas las sedes de todas las ciudades
        for (Ciudad ciudad : ciudades) {
            sedes.addAll(ciudad.getSedes());
        }
        //Ordenacion burbuja
        for (int i = 0; i < sedes.size() - 1; i++) {
            for (int j = 0; j < sedes.size() - 1 - i; j++) {

                if (sedes.get(j).getIngresos() < sedes.get(j + 1).getIngresos()) {
                    Sede aux = sedes.get(j);
                    sedes.set(j, sedes.get(j + 1));
                    sedes.set(j + 1, aux);
                }
            }
        }
        for (Sede sede : sedes) {
            System.out.println(sede.toString());
        }
    }
}