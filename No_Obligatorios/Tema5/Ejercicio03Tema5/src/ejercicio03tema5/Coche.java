/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03tema5;

/**
 *
 * @author DAVID
 */
public class Coche {
    //Los atributos privados del coche
    private String marca;
    private String modelo;
    private Rueda ruedas;
    
    //Método para establecer{Marca-Modelo-Rueda}
    public void establecerMarca(String m){
        marca = m;
    }
    
    public void establecerModelo(String mo){
        modelo = mo;
    }
    
    public void establecerRueda(Rueda r){
        ruedas = r;
    }
    
    //Método para obtener{Marca-Modelo-Rueda}
    public String obtenerMarca(){
        return marca;
    }
    
    public String obtenerModelo(){
        return modelo;
    }
    
    public Rueda obtenerRueda(){
        return ruedas;
    }
    
    //Método para mostrar los datos completo del coche
    public void mostrarCoche(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Material de la rueda: " + ruedas.obtenerMaterial());
        System.out.println("Pulgadas de la rueda: " + ruedas.obtenerPulgadas());
    }
}