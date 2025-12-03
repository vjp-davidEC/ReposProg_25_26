/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05tema6;

/**
 *
 * @author alumno
 */
public class Mamifero {
   //Atributos
   private String nombre;
   private String sexo;
   private String color;
   private int edad;
   
   //Constructores
   public Mamifero(){
       nombre = "";
       sexo = "";
       color = "";
       edad = 0;
   }
   
   public Mamifero(String nombre, String sexo, String color, int edad) {
       this.nombre = nombre;
       this.sexo = sexo;
       this.color = color;
       this.edad = edad;
   }
   
   //Getters/Setters
   public String getNombre() {
        return nombre;
   }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Mostrar
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sexo: " + sexo);
        System.out.println("Color: " + color);
        System.out.println("Edad: " + edad + " anios");
    }
}