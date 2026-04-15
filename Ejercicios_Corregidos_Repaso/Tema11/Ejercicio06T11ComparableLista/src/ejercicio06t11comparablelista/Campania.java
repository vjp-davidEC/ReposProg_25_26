
package ejercicio06t11comparablelista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Clase Campania
 * 
 * @author Usuario
 */
public class Campania {
    
    //ATRIBUTOS
    private String nombre;
    private Set<Donacion> donaciones;

    //CONSTRUCTORES  
    public Campania() {
        this.nombre = "";
        this.donaciones = new HashSet<>();
    }
    
    public Campania(String nombre, HashSet<Donacion> donaciones) {
        this.nombre = nombre;
        this.donaciones = donaciones;
    }
    
    public Campania(String nombre) {
        this.nombre = nombre;
        this.donaciones = new HashSet<>();
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Donacion> getDonaciones() {
        return donaciones;
    }   

    public void setDonaciones(Set<Donacion> donaciones) {
        this.donaciones = donaciones;
    }
    
    //MÉTODOS
    public static String pedirNombreDonante(){
        Scanner teclado = new Scanner(System.in);
        String nombre;
        System.out.print("Nombre del donante: ");
        nombre = teclado.nextLine();
        return nombre;
    }

    public static int pedirImporteDonacion(){
        Scanner teclado = new Scanner(System.in);
        int importe;
        System.out.print("Importe de la donación: ");
        importe = teclado.nextInt();
        return importe;
    }
    
    public void insertarDonacion(){
        Donacion donacion = new Donacion(pedirNombreDonante(), pedirImporteDonacion());
        this.donaciones.add(donacion);
    }
    
    public void mostrarDonaciones(){
        Iterator<Donacion> it = this.donaciones.iterator();
        Donacion aux;
        while(it.hasNext()){
            aux = it.next();
            aux.mostrarDonacion();
        }
    }
    
    public void mostrarDonacionesPorNombre(){
        String nombreDonante = pedirNombreDonante();
        
        Iterator<Donacion> it = this.donaciones.iterator();
        Donacion aux;
        boolean enc = false;
        while(it.hasNext()){
            aux = it.next();
            if  (aux.getDonante().equalsIgnoreCase(nombreDonante)){
                aux.mostrarDonacion();
                enc = true;
            }
        }
        
        if(!enc){
            System.out.println("Ninguna donación para el donante " + nombreDonante);
        }
    }
    
    public void mostrarNumeroDonaciones(){
        System.out.println("Número de donaciones: " + donaciones.size());
    }
    
    
    public void mostrarTotalRecaudado(){
        Iterator<Donacion> it = donaciones.iterator();
        Donacion aux;
        int total = 0;
        while(it.hasNext()){
            aux = it.next();
            total = total + aux.getImporteDonacion();
        }
        
        System.out.println("Total de dinero recaudado: " + total);
    }
    
    public void ordenarDonaciones(){
        //Creamos un ArrayList con las donaciones del conjunto "donaciones"
        List<Donacion> listaOrdenada = new ArrayList<>(donaciones);
        
        //Ordeno el ArrayList de donaciones (¡Ojo! La clase Donacion debe implementar la interfaz Comparable y sobrescribir el método
        //compareTo
        Collections.sort(listaOrdenada);
        
        //Muestro el ArrayList con las donaciones ordenadas
        for (Donacion donacion : listaOrdenada) {
            donacion.mostrarDonacion();
        }
    }
}
