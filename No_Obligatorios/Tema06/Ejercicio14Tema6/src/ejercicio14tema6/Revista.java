/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14tema6;

/**
 *
 * @author DAVID
 */
public class Revista extends Publicacion {
    //Atributo
    private int numero;
    
    //Constructores
    public Revista(){
        super();
        numero = 0;
    }
    
    public Revista(String codigo, String titulo, int anioPublicacion, int numero) {
        super(codigo, titulo, anioPublicacion);
        this.numero = numero;
    }

    //Getter/Setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //Mostrar
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numero de revista: " + numero);
    }
}