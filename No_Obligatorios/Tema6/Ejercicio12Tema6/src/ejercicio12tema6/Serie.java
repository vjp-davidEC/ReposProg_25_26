/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12tema6;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public final class Serie extends Contenido {
    //Atributo
    private int temporadas;
    private String creador;
    
    //Constructores
    public Serie() {
        super("Sin título", "Sin género");
        temporadas = 3;
        creador = "Desconocido";
    }

    public Serie(String titulo, String creador) {
        super(titulo, "Sin género");
        this.temporadas = 3;
        this.creador = creador;
    }

    public Serie(String titulo, String genero, int temporadas, String creador) {
        super(titulo, genero);
        this.temporadas = temporadas;
        this.creador = creador;
    }
    
    //Getters/Setters
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return super.toString() + "Serie{" + "temporadas=" + temporadas + ", creador=" + creador + '}';
    }
    
    //Métodos abtractis de la clase Contenido
    @Override
    //Solicitar al usuario que valore distintos aspectos de la serie
    public float valorar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nValora la serie '" + getTitulo() + "' de " + creador);
        System.out.print("Guion del 1-5: ");
        int guion = entrada.nextInt();
        System.out.print("Interpretacion del 1-5: ");
        int interpretacion = entrada.nextInt();
        System.out.print("Fotografia del 1-5: ");
        int fotografia = entrada.nextInt();
        float media = (guion + interpretacion + fotografia) / 3f;
        System.out.println("Valoracion media: " + media);
        return media;
    }

    @Override
    //Verificar si la serie ya está entregada
    public void entregar() {
        if (!esEntregado()) {
            super.entregar();
            System.out.println("'Has alquilado " + getTitulo() + " de " + creador + "'");
        } else {
            System.out.println("La serie ya está entregada");
        }
    }

    @Override
    //Verificar si la serie está entregada antes de devolverla
    public void devolver() {
        if (esEntregado()) {
            super.devolver();
            System.out.println("'" + getTitulo() + " de " + creador + " devuelta correctamente'");
        } else {
            System.out.println("La serie no está entregada");
        }
    }
}