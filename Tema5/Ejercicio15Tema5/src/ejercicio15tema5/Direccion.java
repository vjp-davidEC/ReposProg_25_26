/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15tema5;

/**
 *
 * @author DAVID
 */
public class Direccion {
    //Atributos privados de la clase
    private String calle;
    private int numero;
    private String puerta;
    private String ciudad;
    
    //Constructor que inicializa los atributos con los valores recibidos como parámetros
    public Direccion(String c, int n, String p, String ciu){
        calle = c;
        numero = n;
        puerta = p;
        ciudad = ciu;
    }
    
    //Métodos getters que devuelve el nombre de la calle, el numero, la puerta y la ciudad
    public String getCalle(){
        return calle;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public String getPuerta(){
        return puerta;
    }
    
    public String getCiudad(){
        return ciudad;
    }
}