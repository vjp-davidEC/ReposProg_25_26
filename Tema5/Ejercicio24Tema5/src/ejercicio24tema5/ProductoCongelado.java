/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24tema5;

/**
 *
 * @author DAVID
 */
public class ProductoCongelado extends Producto{//Clase que se hereda de Producto
    //Atributo
    private double temperaturaRecomendada;
    
    //Constructores
    public ProductoCongelado(){
        super();//Se pone para llamar al constructor de la clase Producto sin parámetros
        temperaturaRecomendada = 0;
    }
    
    public ProductoCongelado(String fc, int nl, double tr){
        super(fc, nl);//Se pone para llamar al constructor de la clase Producto con parámetros
        temperaturaRecomendada = tr;
    }
    
    //Getter y setter
    public double getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(double tr) {
        temperaturaRecomendada = tr;
    }
    
    //Mostrar
    public void mostrarDatosProductoCongelado(){
        super.mostrarDatosProducto();
        System.out.println("Temperatura recomendada: " + getTemperaturaRecomendada() + "C");
    }
}