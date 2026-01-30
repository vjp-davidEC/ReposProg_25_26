/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15y16tema8;

/**
 *
 * @author alumno
 */
public class Socios {
    private String nombreSocio;
    private float precioAbonado;
    
    public Socios(){
        nombreSocio = "";
        precioAbonado = 0f;
    }

    public Socios(String nombreSocio, float precioAbonado) {
        this.nombreSocio = nombreSocio;
        this.precioAbonado = precioAbonado;
    }

    public String getNombreSocio() {
        return nombreSocio;
    }

    public void setNombreSocio(String nombreSocio) {
        this.nombreSocio = nombreSocio;
    }

    public float getPrecioAbonado() {
        return precioAbonado;
    }

    public void setPrecioAbonado(float precioAbonado) {
        this.precioAbonado = precioAbonado;
    }

    @Override
    public String toString() {
        return "NombreSocio: " + nombreSocio + "\nPrecioAbonado: " + precioAbonado;
    }
}