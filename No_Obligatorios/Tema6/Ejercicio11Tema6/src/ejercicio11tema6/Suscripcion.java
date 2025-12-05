/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11tema6;

/**
 *
 * @author DAVID
 */
public abstract class Suscripcion {
    //Atributo
    private float precioBase;
    
    //Constructores
    public Suscripcion(){
        precioBase = 0;
    }

    public Suscripcion(float precioBase) {
        this.precioBase = precioBase;
    }

    //Getter/Setter
    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    //Mostrar
    @Override
    public String toString() {
        return "Suscripcion{" + "precioBase=" + precioBase + '}';
    }
    
    //Método abtracto
    public abstract float calcularPrecio();
}