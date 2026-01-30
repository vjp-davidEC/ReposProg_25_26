/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15y16tema8;

/**
 *
 * @author alumno
 */
public class Pelicula {
    private String titulo;
    private float costeLicencia;
    private Socios[] socios;
    
    public Pelicula(){
        titulo = "";
        costeLicencia = 0f;
        socios = new Socios[4];
    }

    public Pelicula(String titulo, float costeLicencia, Socios[] socios) {
        this.titulo = titulo;
        this.costeLicencia = costeLicencia;
        this.socios = socios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getCosteLicencia() {
        return costeLicencia;
    }

    public void setCosteLicencia(float costeLicencia) {
        this.costeLicencia = costeLicencia;
    }

    public Socios[] getSocios() {
        return socios;
    }

    public void setSocios(Socios[] socios) {
        this.socios = socios;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\nCosteLicencia: " + costeLicencia + "\nSocios: " + socios;
    }
}