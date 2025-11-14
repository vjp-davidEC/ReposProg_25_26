/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16tema5;

/**
 *
 * @author DAVID
 */
public class Alumno {
    //Atributos privados de la clase
    private String nombre;
    private int nota;
    
    //Constructor que inicializa el objeto
    public Alumno(){
        nombre = "";
        nota = 0;
    }
    
    public Alumno(String n, int no){
        nombre = n;
        nota = no;
    }
    
    //Métodos getters que devuelven el nombre del alumno y la nota
    public String getNombre(){
        return nombre;
    }
    
    public int getNota(){
        return nota;
    }
    
    //Método que clasifica la nota del alumno en categorías
    public void clasificar(){
        if (getNota() >= 0 && getNota() <= 4) {//Resultado suspenso
          System.out.println("Suspenso");
        } else if (getNota() >= 5 && getNota() <= 6) {//Resultado bien
          System.out.println("Bien");
        } else if (getNota() >= 7 && getNota() <= 8) {//Resultado notable
          System.out.println("Notable");
        } else if (getNota() >= 9 && getNota() <= 10) {//Resultado sobresaliente
          System.out.println("Sobresaliente");
        } else {
          System.out.println("Error: Nota invalida, debe estar entre 0 y 10");//Error
        }
    }
    
    //Método que muestra los datos del alumno
    public void mostrarAlumno(){
        System.out.println("Nombre: " + getNombre() + "\nNota: " + getNombre());
        clasificar();//Llamar al método para que muestro lo que ha sacado
    }
}