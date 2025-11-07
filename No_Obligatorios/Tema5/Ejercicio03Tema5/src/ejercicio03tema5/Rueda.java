/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03tema5;

/**
 *
 * @author DAVID
 */
public class Rueda {
    //Los atributos privados de cada rueda
    private String material;
    private int pulgadas;
    
    //Método para establecer{Material-Pulgadas}
    public void establecerMaterial(String m){
        material = m;
    }
    
    public void establecerPulgadas(int p){
        pulgadas = p;
    }
    
    //Método para obtner{Material-Pulgadas}
    public String obtenerMaterial(){
        return material;
    }
    
    public int obtenerPulgadas(){
        return pulgadas;
    }
    
    //Método para mostrar los datos de la rueda
    public void mostrarRueda(){
        System.out.println("Material: " + material);
        System.out.println("Pulgadas: " + pulgadas);
    }
}