/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testparking;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Parking {
    //Atributos
    private Coche[] plazas;
    
    //Constructores
    public Parking(int longitud) {
        plazas = new Coche[longitud];
    }
    
    public Parking(Coche[] plazas) {
        this.plazas = plazas;
    }
    
    //Getters/Setters
    public Coche[] getPlazas() {
        return plazas;
    }

    public void setPlazas(Coche[] plazas) {
        this.plazas = plazas;
    }
    
    //Metodos
    public void introducirCoches() {
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0; i < plazas.length; i++) {
            if (plazas[i] == null) {
                System.out.println("--Coche " + (i+1) + "--");

                System.out.print("Matricula: ");
                String matri = entrada.nextLine();
                System.out.print("Marca: ");
                String marca = entrada.nextLine();
                System.out.print("Color: ");
                String color = entrada.nextLine();

                plazas[i] = new Coche(matri, marca, color);
            }
        }
        System.out.println("Parking esta lleno");
    }
    
    public void mostrarCoches() {
        System.out.println("--COCHES--");
        for(Coche coche : plazas) {
            if(coche != null) {
                System.out.println(coche.toString());
            }
        }
    }
    
    public void aparcarCoches(int plaza) {
        if(plaza < 0 || plaza >= plazas.length) {
            System.out.println("Error: Plaza no valida");
        } else if (plazas[plaza] == null) {
            System.out.println("La plaza " + plaza + " esta libre. Introduciendo coche");
            introducirCoches();
        } else {
            System.out.println("Error: La plaza ya está opcupada");
        }
    }
    
    public void retirarCoches(int plaza) {
        if(plaza < 0 || plaza > plazas.length) {
            System.out.println("Error: Plaza no valida");
        } else if(plazas[plaza] != null) {
            plazas[plaza] = null;
            System.out.println("Coche retirado");
        } else {
            System.out.println("Esta plaza ya estaba vacia");
        }
    }
    
    public void buscarPorMatricula() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la matricula del coche a buscar: ");
        String matri = entrada.nextLine();
        
        boolean encontrado = false;
        
        for(int i = 0; i < plazas.length; i++) {
            if(plazas[i] != null && plazas[i].getMatricula().equalsIgnoreCase(matri)) {
                System.out.println("El coche esta en la plaza " + i);
                encontrado = true;
            }
        }
        if(!encontrado) {
            System.out.println("No existe ningun coche con esa matricula");
        }
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Parking{" + "plazas=" + plazas + '}';
    }
}