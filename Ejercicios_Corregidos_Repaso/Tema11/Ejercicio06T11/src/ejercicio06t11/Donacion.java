/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06t11;

/**
 *
 * @author Quique Pineda
 */
public class Donacion {
    /*** Atributos ***/
    private String donante;
    private int importeDonacion;

    /*** Métodos ***/

    /* Constructor por defecto */
    public Donacion() {
        this.donante = "";
        this.importeDonacion = 0;
    }
    
    /* Constructor parametrizado */
    public Donacion(String donante, int importeDonacion) {
        this.donante = donante;
        this.importeDonacion = importeDonacion;
    }

    /* Retorna el nombre del donante */
    public String getDonante() {
        return donante;
    }

    /* Actualiza el nombre del donante */
    public void setDonante(String donante) {
        this.donante = donante;
    }

    /* Retorna el importe de la donación */
    public int getImporteDonacion() {
        return importeDonacion;
    }

    /* Actualiza el importe de la donación */
    public void setImporteDonacion(int importeDonacion) {
        this.importeDonacion = importeDonacion;
    }
        
    /* Muestra la información de la donación */
    public void mostrarDonacion(){
        System.out.println("    Donante: "+this.donante);
        System.out.println("    Importe: "+this.importeDonacion);
    }
    
}
