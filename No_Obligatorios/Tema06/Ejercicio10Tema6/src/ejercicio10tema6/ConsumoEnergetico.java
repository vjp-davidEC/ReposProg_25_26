/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicio10tema6;

/**
 *
 * @author DAVID
 */
public interface ConsumoEnergetico {
    public float calcularConsumo(float horasDeUso);//Método abstracto que calcula el consumo energético en función de las horas de uso
    public float calcularFactura(float horasDeUso);//Método abstracto que calcula el coste total de la factura energética
}