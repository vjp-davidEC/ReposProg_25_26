/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06tema11;

import java.util.HashSet;
import java.util.Iterator;
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
    //Metodo que añade una nueva donacion al conjunto
    public void aniadirDonacion() {
        System.out.println();
        String nombre = pedirNombre();
        float cantidad = pedirCantidad();
        donaciones.add(new Donacion(nombre, cantidad));
    }
    
    //Metodo que muestra las donaciones registradas
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
    
    //Metodo que busca una donacion por el nombre del donante
    public void buscarPorNombre() {
        System.out.println();
        String nombreBuscado = nombreABuscar();
        
        Iterator<Donacion> it = donaciones.iterator();//Sirve para recorrer una coleccion elemento a elemento
        boolean encontrado = false;
        
        while(it.hasNext() && !encontrado) {//Sirve para poder detener el recorrido cuando se quiera
            Donacion dona = it.next();
            if(dona.getNombrePersona().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("La cantidad es de " + dona.getCantidad());
                encontrado = true;
            }
        }
        if(!encontrado) {
            System.out.println("No existe ninguna donacion con ese nombre");
        }
    }
    
    //Metodo que devuelve el numero total de donaciones
    public int numeroDonaciones() {
        return donaciones.size();
    }
    
    //Metodo que calcula el total recaudado sumando todas las donaciones
    public float totalRecaudado() {
        float total = 0;
        for(Donacion dona : donaciones) {
            total += dona.getCantidad();
        }
        return total;
    }
    
    //Metodo que ordena las donaciones de mayor a menor cantidad
    public void ordenarDonaciones() {
        System.out.println();
        if(donaciones.isEmpty()) {
            System.out.println("No hay donaciones registradas");
        } else {
            //Convierto el conjunto en un array para poder ordenarlo
            Donacion[] vDonacion = donaciones.toArray(new Donacion[0]);
            
            //Ordenación de mayor a menor
            for(int i = 1; i < vDonacion.length; i++) {
                Donacion actual = vDonacion[i];
                int j = i - 1;
                
                //Desplazar los elementos menores hacia la derecha
                while(j >= 0 && vDonacion[j].getCantidad() < actual.getCantidad()) {
                    vDonacion[j + 1] = vDonacion[j];
                    j--;
                }
                //Insertar la donacion en su posicion correcta
                vDonacion[j + 1] = actual;
            }
            System.out.print("--DONACIONES ORDENADAS--\n");
            for(int i = 0; i < vDonacion.length; i++) {
                System.out.println(vDonacion[i].toString());
            }
        }
    }
    
    
    //Pedir al usuario el nombre, cantidad y el nombre a buscar
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