/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14tema6;

/**
 *
 * @author DAVID
 */
public class Libro extends Publicacion implements Prestable {
    //Atributo
    private boolean prestado;

    //Constructores
    public Libro(){
        super();
        prestado = false;
    }
    
    public Libro(String codigo, String titulo, int anioPublicacion) {
        super(codigo, titulo, anioPublicacion);
        this.prestado = false; // Por defecto, no está prestado
    }
    
    //Getter/Setter
    public boolean getPrestado() {
        return prestado;
    }
    
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
    //Mostrar
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        mostrarPrestado();
    }
    
    //Métodos abtractos de la clase Publicacion de la interfaz Prestable
    @Override
    public void prestar() {
        System.out.println("\n'Prestando libro...'");
        prestado = true;
    }

    @Override
    public void devolver() {
        System.out.println("\n'Devolviendo libro...'");
        prestado = false;
    }

    @Override
    public void mostrarPrestado() {
        if (prestado) {
            System.out.println("\n'El libro esta prestado'");
        } else {
            System.out.println("\n'El libro no esta prestado'");
        }
    }
}