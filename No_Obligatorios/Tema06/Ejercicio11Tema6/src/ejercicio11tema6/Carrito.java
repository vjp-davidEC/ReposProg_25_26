/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11tema6;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Carrito implements Descontable, Pagable{
    //Atributo
    private float total;
    
    //Constructores
    public Carrito(){
        total = 0;
    }
    
    public Carrito(float total){
        this.total = total;
    }
    
    //Getter/Setter
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Carrito{" + "total=" + total + '}';
    }
    
    //Métodos
    @Override
    //Método para aplicar el descuento cuando es mayor a 50€
    public void aplicarDescuento(float descuento) {
        if (total > 50) {
            total -= total * (descuento / 100);
            System.out.println("Descuento aplicado: " + descuento + "%");
        } else {
            System.out.println("No se aplica descuento al ser inferior de 50 euros");
        }
    }
    
    @Override
    //Método para que si se paga con Tarjeta tenga una comisión de 5€
    public float pagoTarjeta() {
        return total + 5;
    }

    @Override
    //Método para que si se paga en Efectivo no tenga comisión
    public float pagoEfectivo() {
        return total;
    }

    @Override
    //Método para que si se paga con PayPal tengo una comisión de 3%
    public float pagoPaypal() {
        return total * 1.03f;
    }
    
    @Override
    //Método para mostrar el menú con un switch y calcular con que lo va a pagar y si se aplica el descuento del 10%
    public void procesarPago() {
        aplicarDescuento(10);//Aplica 10% si corresponde

        Scanner sc = new Scanner(System.in);
        System.out.println("\n--SUSCRIPCION--");
        System.out.println("Selecciona metodo de pago:");
        System.out.println("1. Tarjeta");
        System.out.println("2. Efectivo");
        System.out.println("3. PayPal");
        System.out.print("Opcion: ");
        int opcion = sc.nextInt();

        float totalFinal = 0;
        switch (opcion) {
            case 1 -> totalFinal = pagoTarjeta();
            case 2 -> totalFinal = pagoEfectivo();
            case 3 -> totalFinal = pagoPaypal();
            default -> System.out.println("Opcion invalida");
        }

        System.out.println("Total a pagar: " + totalFinal + " euros");
    }
}