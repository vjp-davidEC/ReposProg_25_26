/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08tema11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author DAVID
 */
public class Ciudad {
    //Atributos
    private String nombre;
    private Set<Sede> sedes;
    
    //Constructores
    public Ciudad() {
        nombre = "";
        sedes = new HashSet<>();
    }

    public Ciudad(String nombre, Set<Sede> sedes) {
        this.nombre = nombre;
        this.sedes = sedes;
    }
    
    public Ciudad(String nombre) {
        this.nombre = nombre;
        sedes = new HashSet<>();
    }
    
    //Getters/Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(Set<Sede> sedes) {
        this.sedes = sedes;
    }
    
    //Metodos
    public void aniadirSede() {
        String nombreSede = pedirNombreSede();
        Double ingresos = pedirIngresosSede();
        sedes.add(new Sede(nombreSede, ingresos));
    }
    
    public void mostrarSedes() {
        if (sedes.isEmpty()) {
            System.out.println("No hay sedes registradas");
        } else {
            for (Sede sede : sedes) {
                System.out.println(sede.toString());
            }
        }
    }
    
    public double ingresosMedios() {
        double total = 0;
        for (Sede sede : sedes) {
            total += sede.getIngresos();
        }
        return total / sedes.size();
    }
    
    public void mostrarSedeSuperioresMedia() {
        double media = ingresosMedios();
        System.out.println("La media de los ingresos es: " + media);
        for (Sede sede : sedes) {
            if (sede.getIngresos() > media) {
                System.out.println(sede.toString());
            }
        }
    }
    
    public boolean buscarSede(String nombreSede) {
        boolean encontrado = false;
        Iterator<Sede> it = sedes.iterator();
        
        while (it.hasNext() && !encontrado) {
            Sede sede = it.next();
            if (sede.getNombreSede().equalsIgnoreCase(nombreSede)) {
                encontrado = true;
            }
        }
        return encontrado;
    }
    
    public void mostrarSedesOrdenadas() {
        ArrayList<Sede> listaOrdenada = new ArrayList<>();
        
        for (Sede sede : sedes) {
            listaOrdenada.add(sede);
        }
        
        for (int i = 0; i < listaOrdenada.size() - 1; i++) {
            for (int j = 0; j < listaOrdenada.size() - 1 - i; j++) {
                if (listaOrdenada.get(i).getIngresos() < listaOrdenada.get(j + 1).getIngresos()) {
                    Sede aux = listaOrdenada.get(j);
                    listaOrdenada.set(j, listaOrdenada.get(j + 1));
                    listaOrdenada.set(j + 1, aux);
                }
            }
        }
        for (Sede sede : sedes) {
            System.out.println(sede.toString());
        }
    }
    
    //
    public String pedirNombreSede() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre de la sede: ");
        String nombreSede = entrada.nextLine();
        return nombreSede;
    }
    public Double pedirIngresosSede() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresos anuales: ");
        Double ingresos = entrada.nextDouble();
        return ingresos;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Nombre de la ciudad: " + nombre + "\nSedes: " + sedes;
    }
}