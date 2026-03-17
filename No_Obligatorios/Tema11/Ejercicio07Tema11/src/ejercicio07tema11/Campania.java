/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07tema11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author DAVID
 */
public class Campania {
    //Atributos
    private Set<Donacion> donaciones;
    private String nombre;
    
    //Constructores
    public Campania() {
        donaciones = new HashSet<>();
        nombre = "";
    }

    public Campania(Set<Donacion> donaciones, String nombre) {
        this.donaciones = donaciones;
        this.nombre = nombre;
    }
    
    public Campania(String nombre) {
        this.nombre = nombre;
        donaciones = new HashSet<>();
    }
    
    //Getters/Setters
    public Set<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(Set<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodos
    //
    public void aniadirDonacion() {
        System.out.println();
        String nombre = pedirNombre();
        float cantidad = pedirCantidad();
        donaciones.add(new Donacion(nombre, cantidad));
    }
    
    //
    public void mostrarDonaciones() {
        System.out.println();
        if(donaciones.isEmpty()) {
            System.out.println("No hay donaciones registradas");
        } else {
            for(Donacion dona : donaciones) {
                System.out.println(dona.toString());
            }
        }
    }
    
    //
    public float totalRecaudado() {
        float total = 0;
        for(Donacion dona : donaciones) {
            total += dona.getCantidad();
        }
        return total;
    }
    
    //
    public Donacion mostrarMayorDonacion() {
        System.out.println();
        Donacion mayor = null;
        for (Donacion dona : donaciones) {
            if (mayor == null || dona.getCantidad() > mayor.getCantidad()) {
                mayor = dona;
            }
        }
        return mayor;
    }
    
    
    //
    public String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del donante: ");
        String nombre = entrada.nextLine();
        return nombre;
    }
    
    public float pedirCantidad() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cantidad a donar: ");
        float cantidad = entrada.nextFloat();
        return cantidad;
    }
    
    public String nombreABuscar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre a buscar: ");
        String nombre = entrada.nextLine();
        return nombre;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Donaciones: " + donaciones + "\nNombre: " + nombre;
    }
}
