/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07t11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class Campania {
    /*** Atributos ***/
    private String nombre;
    private Set<Donacion> cDonaciones;

    /*** Métodos ***/

    /* Constructor por defecto */
    public Campania() {
        this.nombre = "";
        //Reservamos memoria para el conjunto
        this.cDonaciones = new HashSet<>();
    }
    
    /* Constructor parametrizado */
    public Campania(String nombre) {
        this.nombre = nombre;
        //Reservamos memoria para el conjunto
        this.cDonaciones = new HashSet<>();
    }

    /* Retorna el nombre de la Campaña */
    public String getNombre() {
        return nombre;
    }

    /* Actualiza el nombre de la campaña */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /* Retorna el conjunto de donaciones */
    public Set<Donacion> getcDonaciones() {
        return cDonaciones;
    }

    /* Actualiza el conjunto de donaciones */
    public void setcDonaciones(Set<Donacion> cDonaciones) {
        this.cDonaciones = cDonaciones;
    }
    
    /* Inserta la donación recibida por parámetros en la campaña */
    public void insDonacion(Donacion nDonacion){
        this.cDonaciones.add(nDonacion);
    }
    
    /* Muestra las donaciones de la campaña */
    public void mostrarCampania(){
        Iterator<Donacion> it = this.cDonaciones.iterator();
        System.out.println("Campaña: "+this.nombre);
        Donacion aux;
        while(it.hasNext()){
            aux = it.next();
            aux.mostrarDonacion();
        }
    }
    
    /* Muestra las donaciones que haya hecho el donante "nombre" */
    public void mostrarDonacionesPorNombre(String nombre){
        Iterator<Donacion> it = this.cDonaciones.iterator();
        Donacion aux;
        while(it.hasNext()){
            aux = it.next();
            if  (aux.getDonante().equalsIgnoreCase(nombre)){
                aux.mostrarDonacion();
            }
        }
    }
    
    /* Retorna el total del dinero recaudado */
    public int getTotalRecaudadoEnCampania(){
        Iterator<Donacion> it = this.cDonaciones.iterator();
        Donacion aux;
        int total = 0;
        while(it.hasNext()){
            aux = it.next();
            total = total + aux.getImporteDonacion();
        }
        return total;
    }
    
    /* Retorna la mayor donación de la campaña */
    public Donacion getMayorDonacionEnCampania(){
        Donacion auxDonacion, mayDonacion = null;
        int importeMayorDonacion = 0;
        Iterator<Donacion> it = this.cDonaciones.iterator();
        while(it.hasNext()){
            auxDonacion = it.next();
            if  (auxDonacion.getImporteDonacion() > importeMayorDonacion){
                importeMayorDonacion = auxDonacion.getImporteDonacion();
                mayDonacion = auxDonacion;
            }
        }
        return mayDonacion;
    }
}
