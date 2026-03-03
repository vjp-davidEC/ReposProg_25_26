/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11tema6;

/**
 *
 * @author DAVID
 */
public class SuscripcionTv extends Suscripcion{
    //Constructores
    public SuscripcionTv(){
        super();
    }
    
    public SuscripcionTv(float precioBase){
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
        return getPrecioBase() * 1.21f;
    }
}