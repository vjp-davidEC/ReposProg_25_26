/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12tema6;

/**
 *
 * @author DAVID
 */
public abstract class Contenido implements Alquilabre {
    //Atributo
    private String titulo;
    private String genero;
    private boolean entregado;
    
    //Constructores
    public Contenido(){
        titulo = "";
        genero = "";
        entregado = false;
    }

    public Contenido(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.entregado = false;
    }
    
    //Geterrs/Setter--MENOS LO DEL ATRIBUTO ENTREGADO--
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Contenido{" + "titulo=" + titulo + ", genero=" + genero + ", entregado=" + entregado + '}';
    }
    
    //Métodos abtractos de la interfaz Alquilable
    public abstract float valorar();//Método para valorar el contenido

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean esEntregado() {
        return entregado;
    }
}