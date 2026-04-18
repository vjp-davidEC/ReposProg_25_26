package ejercicio24repaso07tema11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
    //Metodo que añade una nueva donacion al conjunto de donaciones
    public void aniadirDonacion() {
        donaciones.add(new Donacion(pedirNombre(), pedirCantidad()));
    }
    
    //Metodo que muestra todas las donaciones registradas
    public void mostrarDonaciones() {
        if(donaciones.isEmpty()) {
            System.out.println("No hay donaciones registradas");
        } else {
            for(Donacion dona : donaciones) {
                System.out.println(dona.toString());
            }
        }
    }
    
    //Metodo que muestra el total recaudado sumando todas las donaciones
    public float totalRecaudado() {
        float total = 0;
        for(Donacion dona : donaciones) {
            total += dona.getCantidad();
        }
        return total;
    }
    
    //Metodo que muestra la donacion con mayor cantidad aportada
    public Donacion mostrarMayorDonacion() {
        Donacion mayor = null;
        for (Donacion dona : donaciones) {
            //Si es la primera o supera a la mayor actual, se actualiza
            if (mayor == null || dona.getCantidad() > mayor.getCantidad()) {
                mayor = dona;
            }
        }
        return mayor;
    }
    
    
    //Metodos que pide al usuario el nombre y la cantidad
    public String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del donante: ");
        return entrada.nextLine();
    }
    
    public float pedirCantidad() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cantidad a donar: ");
        return entrada.nextFloat();
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Donaciones: " + donaciones + "\nNombre: " + nombre;
    }
}