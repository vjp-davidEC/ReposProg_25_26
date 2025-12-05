/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicio11tema6;

/**
 *
 * @author DAVID
 */
public interface Pagable {
    public float pagoTarjeta();//Método abstracto para realizar un pago con tarjeta
    public float pagoEfectivo();//Método abstracto para realizar un pago en efectivo
    public float pagoPaypal();//Método abstracto para realizar un pago mediante PayPal
    public void procesarPago();//Método abstracto para procesar el pago en general
}