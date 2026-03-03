/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11tema6;

/**
 *
 * @author DAVID
 */
public class SuscripcionPeriodico extends Suscripcion{
    //Constructores
    public SuscripcionPeriodico(){
        super();
    }
    
    public SuscripcionPeriodico(float precioBase){
        super(precioBase);
    }
    
    //Mostrar
    public void mostrarDatos(){
        super.toString();
    }
    
    //Método
    @Override
    //Calcular el precio con el IVA
    public float calcularPrecio(){
        return getPrecioBase() * 1.10f;
    }
}