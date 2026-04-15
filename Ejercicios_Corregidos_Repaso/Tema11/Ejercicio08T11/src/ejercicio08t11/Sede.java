/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08t11;

/**
 *
 * @author Quique Pineda
 */
public class Sede {
    private String nomSede;
    private int ingresosAnuales;

    public Sede(){
        this.nomSede = "";
        this.ingresosAnuales = 0;
    }
    
    public Sede(String nomSede, int ingresosAnuales) {
        this.nomSede = nomSede;
        this.ingresosAnuales = ingresosAnuales;
    }

    public String getNomSede() {
        return nomSede;
    }

    public void setNomSede(String nomSede) {
        this.nomSede = nomSede;
    }

    public int getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(int ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }

    @Override
    public String toString() {
        return "    Sede{" + "nomSede=" + nomSede + ", ingresosAnuales=" + ingresosAnuales + '}';
    }
    
    
}
