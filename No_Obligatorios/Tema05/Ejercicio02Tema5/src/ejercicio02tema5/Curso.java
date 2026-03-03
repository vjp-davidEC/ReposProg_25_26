/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02tema5;

/**
 *
 * @author DAVID
 */
public class Curso {
    //Los atributos privados de cada curso
    private String nombre;
    private int numeroHoras;
    
    private static int numeroDeCursos = 0;//Sirve para cntar cuantos cursos se han creado en total
    
    //Método para establecer nombre y horas del curso
    public void establecerNombreyHoras(String n, int nh){
        nombre = n;
        numeroHoras = nh;
    }
    
    //Método para obtener{Nombre-Horas}
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerHoras(){
        return numeroHoras;
    }
    
    //Método para incrementar el contador de cursos
    public static void sumarCursos(){
        numeroDeCursos++;
    }
    
    //Método para ver cuantos cursos se han creado
    public static int verNumeroCursos(){
        return numeroDeCursos;
    }
    
    //Método para mostrar los datos del curso
    public void mostrarCurso(){
        System.out.println("Nombre del curso: " + nombre);
        System.out.println("Numero de horas: " + numeroHoras);
    }
}