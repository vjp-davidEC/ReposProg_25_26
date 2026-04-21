/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examentema10y11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ExamenTema10Y11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Deportes> listaDeportes = new ArrayList<>();
        
        int opcion = 0;
        
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            switch (opcion) {
                case 1 -> aniadirDeporte(listaDeportes);
                case 2 -> mostrarDeportesEquipos(listaDeportes);
                case 3 -> buscarEquipoEnDeporte(listaDeportes);
                case 4 -> mostrarMapaEquipos(listaDeportes);
                case 5 -> mostrarTodosLosEquiposOrdenadorPorTrofeos(listaDeportes);
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentelo de nuevo");
            }
        } while (opcion != 6);
    }
    
    //Mostrar menu
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. ANIADIR UN DEPORTE");
        System.out.println("2. MOSTRAR DEPORTES Y EQUIPOS");
        System.out.println("3. BUSCAR EQUIPO EN DEPORTE");
        System.out.println("4. MOSTRAR MAPA DE EQUIPOS");
        System.out.println("5. MOSTRAR TODOS LOS EQUIPOS CON LOS TROFEOS GANADOS DE MAYOR A MENOR");
        System.out.println("6. SALIR DEL PROGRAMA");
        System.out.print("Introduce una opcion: ");
    }
    
    //Añadir deporte y equipos
    public static void aniadirDeporte(ArrayList<Deportes> listaDeportes) {
        System.out.println("");
        
        Deportes deportes = new Deportes(pedirNombre());
        deportes.aniadirEquipos();
        listaDeportes.add(deportes);
    }
    
    //Mostrar deportes y equipos
    public static void mostrarDeportesEquipos(ArrayList<Deportes> listaDeportes) {
        System.out.println("");
        
        if (listaDeportes.isEmpty()) {
            System.out.println("No haya nada en la lista");
        } else {
            for (Deportes deportes : listaDeportes) {
                System.out.println(deportes);
                deportes.mostrarEquipos();
            }
        }
    }
    
    //Mostrar la busqueda del equipo
    public static void buscarEquipoEnDeporte(ArrayList<Deportes> listaDeportes) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("");
        
        System.out.println("Introduce el nombre del equipo a buscar");
        String nombre = entrada.nextLine();
        
        boolean encontrado = false;
        int i = 0;
        
        while (i < listaDeportes.size() && !encontrado) {
            Deportes d = listaDeportes.get(i);
            
            if (d.buscarEquipo(nombre)) {
                encontrado = true;
                System.out.println("El equipo pertenece al deporte: " + d.getNombre());
            }
            i++;
        }
        if (!encontrado) {
            System.out.println("No se encontro el equipo");
        }
    }
    
    //Mostrar mapa de equipos
    public static void mostrarMapaEquipos(ArrayList<Deportes> listaDeportes) {
        HashMap<Integer, Equipo> mapaEquipos = new HashMap<>();
        
        for (Deportes d : listaDeportes) {
            for (Equipo e : d.getConjuntoEquipos()) {
                if (e.getNumeroTrofeosGanados() > 3) {
                    mapaEquipos.put(e.getCodigoEquipo(), e);
                }
            }
        }
        
        System.out.println("\nEquipos con mas de 3 trofeos");
        Iterator<Integer> it = mapaEquipos.keySet().iterator();
        
        while (it.hasNext()) {
            Integer clave = it.next();
            System.out.println(mapaEquipos.get(clave));
        }
    }
    
    //MostrarOrdenado
    public static void mostrarTodosLosEquiposOrdenadorPorTrofeos(ArrayList<Deportes> listaDeportes) {
        System.out.println("");
        
        if (listaDeportes.isEmpty()) {
            System.out.println("No hay nada en la lista");
        } else {
            for (Deportes d : listaDeportes) {
                for (Equipo e : d.getConjuntoEquipos()) {
                    System.out.println(e);
                }
            }
        }
    }
    
    //Metodos pedir
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del deporte: ");
        return entrada.nextLine();
    }
}