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
    public Empleado(){
        nombre = "";
        salario = 0;
        direccion = new Direccion();
    }
    public Empleado(String nom, int s, String calleDirecc, int numeroDirecc, String puertaDirecc, String ciudadDirecc){
        nombre = nom;
        salario = s;
        direccion = new Direccion(calleDirecc, numeroDirecc, puertaDirecc, ciudadDirecc);
    }
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    //Método que muestra los datos del empleado con los métodos de la clase Direccion
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Salario: " + getSalario());
        System.out.println("Direccion: ");
        direccion.mostrarDireccion();
    }
}