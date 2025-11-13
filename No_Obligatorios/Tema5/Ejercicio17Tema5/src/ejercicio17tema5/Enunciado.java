/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio17tema5;

/**
 *
 * @author DAVID
 */
public class Enunciado {
    //Atributos privados de la clase
    private String pregunta;
    private String respuesta;
    
    //Constructor que inicializa los atributos con los valores recibidos
    public Enunciado(){
        pregunta = "";
        respuesta = "";
    }
    
    public Enunciado(String p, String r){
        pregunta = p;
        respuesta = r;
    }
    
    //Método que comprueba si la respuesta del usuario y se hace con un if
    public void comprobar(String r){
        if (r.equalsIgnoreCase(respuesta)){
            System.out.println("Corectooo");
        } else {
            System.out.println("Incorrecto, la respuesta corecta es: " + respuesta);
        }
    }
    
    //Método getter que devuelve el texto de la pregunta
    public String getPregunta(){
        return pregunta;
    }
    
    //Mostrar
    public void mostrarEnunciado(){
        System.out.println(pregunta);
        System.out.println(respuesta);
    }
}