/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoparking1;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Parking {
    //Atributos
    private Coche[] plazas;
    
    //Constructores
    public Parking() {
        plazas = new Coche[5];
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
    public void aparcarCoche() {
        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < plazas.length; i++) {
            if (plazas[i] == null) {
                System.out.println("Aparcando en la plaza " + i);

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
    
    public void mostrarCochesColor() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce color a buscar: ");
        String color = entrada.nextLine();

        boolean encontrado = false;

        for (Coche coche : plazas) {
            if (coche != null && coche.getColor().equalsIgnoreCase(color)) {
                System.out.println(coche.toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay coches de ese color");
        }
    }
    
    public void mostrarPrimerCoche() {
        boolean primero = false;
        for (int i = 0; i < plazas.length && !primero; i++) {
            if (plazas[i] != null) {
                System.out.println("Primer coche aparcado:");
                System.out.println(plazas[i].toString() + " (Plaza " + i + ")");
                primero = true;
            }
        }
        if(!primero) {
            System.out.println("No hay coches aparcados");
        }
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "El parking tiene " + plazas;
    }
}