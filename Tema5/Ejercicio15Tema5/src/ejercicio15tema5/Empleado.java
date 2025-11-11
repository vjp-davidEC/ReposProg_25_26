/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15tema5;

/**
 *
 * @author DAVID
 */
public class Empleado {
    //Atributos privados de la clase
    private String nombre;
    private int salario;
    private Direccion direccion;
    
    //Constructor que inicializa los atributos con los valores recibidos
    public Empleado(String nom, int s, Direccion dir){
        nombre = nom;
        salario = s;
        direccion = dir;
    }
    
    //Método que muestra los datos del empleado con los métodos de la clase Direccion
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Direccion: " + direccion.getCalle() + ", " + direccion.getNumero() + ", " + direccion.getPuerta() + ", " + direccion.getCiudad());
    }
}