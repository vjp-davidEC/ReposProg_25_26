/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examentema10y11;

/**
 *
 * @author alumno
 */
public class Equipo implements Comparable<Equipo>{
    //Atributos
    private int codigoEquipo;
    private String nombre;
    private int numeroTrofeosGanados;
    
    //Constructores
    public Equipo() {
        codigoEquipo = 0;
        nombre = "";
        numeroTrofeosGanados = 0;
    }

    public Equipo(int codigoEquipo, String nombre, int numeroTrofeosGanados) {
        this.codigoEquipo = codigoEquipo;
        this.nombre = nombre;
        this.numeroTrofeosGanados = numeroTrofeosGanados;
    }

    //Getters/Setters
    public int getCodigoEquipo() {
        return codigoEquipo;
    }

    public void setCodigoEquipo(int codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTrofeosGanados() {
        return numeroTrofeosGanados;
    }

    public void setNumeroTrofeosGanados(int numeroTrofeosGanados) {
        this.numeroTrofeosGanados = numeroTrofeosGanados;
    }

    //Mostrar
    @Override
    public String toString() {
        return "El equipo con codigo " + codigoEquipo + " tiene el nombre " + nombre + " ha ganado " + numeroTrofeosGanados + " trofeos";
    }
    
    @Override
    public int compareTo(Equipo e) {
        if (this.numeroTrofeosGanados > e.numeroTrofeosGanados) {
            return 1;
        } else if (this.numeroTrofeosGanados < e.numeroTrofeosGanados) {
            return -1;
        } else {
            return 0;
        }
    }
}