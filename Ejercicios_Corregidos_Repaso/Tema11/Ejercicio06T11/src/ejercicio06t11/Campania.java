/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06t11;

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
    public void mostrarDonaciones(){
        Iterator<Donacion> it = this.cDonaciones.iterator();
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
        boolean enc = false;
        while(it.hasNext() ){
            aux = it.next();
            if  (aux.getDonante().equalsIgnoreCase(nombre)){
                aux.mostrarDonacion();
                enc = true;
            }
        }
        if  (!enc){
            System.out.println("Ninguna donación para el donante "+nombre);
        }
    }
    
    /* Retorna el número de donaciones de la campaña */
    public int getNumeroDonaciones(){
        return this.cDonaciones.size();
    }
    
    /* Retorna el total del dinero recaudado */
    public int getTotalRecaudado(){
        Iterator<Donacion> it = this.cDonaciones.iterator();
        Donacion aux;
        int total = 0;
        while(it.hasNext()){
            aux = it.next();
            total = total + aux.getImporteDonacion();
        }
        return total;
    }
    
    /* Muestra las donaciones ordenadas de mayor a menor importe */
    public void ordenarDonaciones(){
        /* Creamos un vector de donaciones, donde vamos a ir insertando
           todas las donaciones de manera ordenada */
        Donacion[] vDonaciones = new Donacion[this.cDonaciones.size()];
        
        Iterator<Donacion> it = this.cDonaciones.iterator();
        Donacion aux;
        while(it.hasNext()){
            aux = it.next();
            insertarDonacionEnOrden(vDonaciones, aux);
        }
        //Mostramos las donaciones ordenadas
        for(int i = 0;i < vDonaciones.length;i++){
            vDonaciones[i].mostrarDonacion();
        }
    }

    /* Inserta la donación, de manera ordenada, en el vector 
       El método es privado porque sólo se llama desde el método 
       "ordenarDonaciones" */
    private void insertarDonacionEnOrden(Donacion[] vDonaciones, Donacion nDonacion){
        int i = 0;
        boolean enc = false;
        //Mientras no haya hueco y no haya encontrado donde insertar
        while((vDonaciones[i] != null)&&(!enc)){
            if  (nDonacion.getImporteDonacion() > vDonaciones[i].getImporteDonacion()){
                enc = true;
            }
            else{
                i++;
            }
        }
        //Si no hay hueco, lo abrimos para la nueva donación
        if  (vDonaciones[i] != null){
            for(int j = vDonaciones.length - 1; j > i;j--){
                vDonaciones[j] = vDonaciones[j-1];
            }
        }
        //Insertamos la nueva donación
        vDonaciones[i] = nDonacion;
    }
}
