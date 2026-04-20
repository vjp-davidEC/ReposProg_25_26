/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examentema10y11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Deportes {
    //Atributos
    private String nombre;
    private HashSet<Equipo> conjuntoEquipos;
    
    //Constructores
    public Deportes() {
        nombre = "";
        conjuntoEquipos = new HashSet<>();
    }

    public Deportes(String nombre, HashSet<Equipo> conjuntoEquipos) {
        this.nombre = nombre;
        this.conjuntoEquipos = conjuntoEquipos;
    }
    
    public Deportes(String nombre) {
        this.nombre = nombre;
        conjuntoEquipos = new HashSet<>();
    }

    //Getters/Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Equipo> getConjuntoEquipos() {
        return conjuntoEquipos;
    }

    public void setConjuntoEquipos(HashSet<Equipo> conjuntoEquipos) {
        this.conjuntoEquipos = conjuntoEquipos;
    }

    //Mostrar
    @Override
    public String toString() {
        return "El nombre del deporte es " + nombre + " y tiene un conjunto de equipos de " + conjuntoEquipos;
    }
    
    //Metodos
    public void aniadirEquipos() {
        do {
            Equipo equipo = new Equipo(pedirCodigo(), pedirNombre(), pedirTrofeos());
        } while (pedirSeguir().equalsIgnoreCase("s"));
    }
    
    public void mostrarEquipos() {
        for (Equipo e : conjuntoEquipos) {
            System.out.println(e);
        }
    }
    
    public void mostrarMapaEquipos() {
        HashMap<Integer, Equipo> mapaEquipo = new HashMap<>();
    }
    
    public void buscarEquipo () {
        System.out.println("Introduce un equipo a buscar para su deporte");
        String nombre = pedirNombre();
        
        boolean encontrado = false;
        int i = 0;
        
        while (i < conjuntoEquipos.size() && !encontrado) {
            if (conjuntoEquipos.contains(nombre)) {
                encontrado = true;
                System.out.println("Pertenece a: " + this.nombre);
            }
        }
    }
    
    public void mostrarTodosLosEquiposOrdenadorPorTrofeos() {
        ArrayList<Equipo> list = new ArrayList<>(conjuntoEquipos);
        
        Collections.sort(list);
        
        for (Equipo equipo : list) {
            System.out.println(equipo);
        }
    }
    
    //Metodos pedir
    public static int pedirCodigo() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Codigo del equipo: ");
        return entrada.nextInt();
    }
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del equipo: ");
        return entrada.nextLine();
    }
    public static int pedirTrofeos() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Trofeos ganados: ");
        return entrada.nextInt();
    }
    public static String pedirSeguir() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Deseas introducir otro equipo (s/n): ");
        return entrada.nextLine();
    }
}