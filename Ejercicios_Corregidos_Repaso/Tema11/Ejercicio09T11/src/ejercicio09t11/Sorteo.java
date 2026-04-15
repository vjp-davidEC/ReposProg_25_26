/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09t11;

import java.time.LocalDate;

/**
 *
 * @author Quique Pineda
 */
public class Sorteo {
    private LocalDate fechaSorteo;
    private int[] vNumerosGanadores;
    
    public Sorteo(){
        this.fechaSorteo = LocalDate.now();
        this.vNumerosGanadores = new int[4];
        for(int i = 0;i < vNumerosGanadores.length;i++){
            vNumerosGanadores[i] = (int)(Math.random()*100)+1;
        }
    }
    
    public Sorteo(LocalDate fechaSorteo){
        this.fechaSorteo = fechaSorteo;
        this.vNumerosGanadores = new int[4];
        for(int i = 0;i < vNumerosGanadores.length;i++){
            vNumerosGanadores[i] = (int)(Math.random()*100)+1;
        }
    }

    public LocalDate getFechaSorteo() {
        return fechaSorteo;
    }

    public void setFechaSorteo(LocalDate fechaSorteo) {
        this.fechaSorteo = fechaSorteo;
    }

    public int[] getvNumerosGanadores() {
        return vNumerosGanadores;
    }

    public void setvNumerosGanadores(int[] vNumerosGanadores) {
        this.vNumerosGanadores = vNumerosGanadores;
    }

    @Override
    public String toString() {
        String cadena = "    Sorteo{" + fechaSorteo + ", Números ganadores: ";
        for(int i = 0;i < this.vNumerosGanadores.length;i++){
            cadena = cadena + vNumerosGanadores[i] + " ";
        }
        cadena = cadena + "}";
        return cadena;
    }
}
