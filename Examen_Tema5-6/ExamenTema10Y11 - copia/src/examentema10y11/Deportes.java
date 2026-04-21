/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examentema10y11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
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
            conjuntoEquipos.add(equipo);
        } while (pedirSeguir().equalsIgnoreCase("s"));
    }
    
    public void mostrarEquipos() {
        for (Equipo e : conjuntoEquipos) {
            System.out.println(e);
        }
    }
    
    public boolean buscarEquipo (String nombreBuscado) {
        
        ArrayList<Equipo> aux = new ArrayList<>(conjuntoEquipos);
        
        boolean encontrado = false;
        int i = 0;
        
        while (i < aux.size() && !encontrado) {
            Equipo e = aux.get(i);
            
            if (e.getNombre().equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
            }
            i++;
        }
        return encontrado;
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