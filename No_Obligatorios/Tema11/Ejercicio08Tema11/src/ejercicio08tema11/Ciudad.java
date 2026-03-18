/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08tema11;

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
    //Metodo que añade una sede
    public void aniadirSede() {
        String nombreSede = pedirNombreSede();
        Double ingresos = pedirIngresosSede();
        sedes.add(new Sede(nombreSede, ingresos));
    }

    //Metodo que muestra todas las sedes de la ciudad
    public void mostrarSedes() {
        if (sedes.isEmpty()) {
            System.out.println("No hay sedes registradas");
        } else {
            for (Sede sede : sedes) {
                System.out.println(sede.toString());
            }
        }
    }

    //Metodo que calcula la media de ingresos de todas las sedes de la ciudad
    public double ingresosMedios() {
        double total = 0;
        for (Sede sede : sedes) {
            total += sede.getIngresos();
        }
        return total / sedes.size();
    }

    //Metodo que muestra las sedes cuyos ingresos superan la media de la ciudad
    public void mostrarSedeSuperioresMedia() {
        if (sedes.isEmpty()) {
            System.out.println("No hay sedes registradas");
        } else {
            double media = ingresosMedios();
            System.out.println("La media de los ingresos es: " + media);

            boolean alguna = false;

            for (Sede sede : sedes) {
                if (sede.getIngresos() > media) {
                    System.out.println(" -" + sede.getNombreSede() + "\n -" + sede.getIngresos());
                    alguna = true;
                }
            }
            if (!alguna) {
                System.out.println("Ninguna sede supera la media");
            }
        }
    }

    //Metodo que busca si existe una sede con ese nombre
    public boolean buscarSede(String nombreSede) {
        boolean encontrado = false;
        Iterator<Sede> it = sedes.iterator();//Sirve para recorrer una coleccion elemento a elemento

        while (it.hasNext() && !encontrado) {//Sirve para poder detener el recorrido cuando se quiera
            Sede sede = it.next();
            if (sede.getNombreSede().equalsIgnoreCase(nombreSede)) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    //Metodos que pide al usuario el nombre de la sede y el ingreso de la sede
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
