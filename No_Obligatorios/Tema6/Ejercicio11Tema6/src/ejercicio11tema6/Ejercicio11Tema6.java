/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11tema6;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio11Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objetos que se crean de las clases {SuscripcionPeriodico y SuscripcionTv} con los atributos
        SuscripcionPeriodico sp = new SuscripcionPeriodico(40);
        SuscripcionTv stv = new SuscripcionTv(60);
        
        //Mostrar los precios base y los precios finales con IVA
        System.out.println("1. Periodico - Precio base: 40 euros - Precio con IVA: " + sp.calcularPrecio() + " euros");
        System.out.println("2. Television - Precio base: 60 euros - Precio con IVA: " + stv.calcularPrecio() + " euros");

        //Pedir al usuario que ponga 1 o 2
        Scanner sc = new Scanner(System.in);
        System.out.print("\nSelecciona una suscripcion (1 o 2): ");
        int opcion = sc.nextInt();

        Carrito carrito;//Se declara un objeto carrito que almacenará la suscripción seleccionada
        switch (opcion) {//Se usa switch para decidir qué suscripción añadir al carrito
            case 1 -> carrito = new Carrito(sp.calcularPrecio());
            case 2 -> carrito = new Carrito(stv.calcularPrecio());
            default -> {
                System.out.println("Opción invalida.");
                return;
            }
        }
        //Se procesa el pago del carrito
        carrito.procesarPago();
    }
}