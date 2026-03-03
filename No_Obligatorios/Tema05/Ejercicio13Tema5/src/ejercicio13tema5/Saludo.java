/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13tema5;

/**
 *
 * @author DAVID
 */
public class Saludo {
    //Atributo privado de la clase
    private String frase;
    
    //Constructor
    public Saludo() {
        frase = "";
    }
    
    public Saludo(String f){
        frase = f;
    }
    
    //Getter y Setter
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    //Método que muestra el saludo con un bucle for
    public void mostrarCincoSaludos(){
        for (int i = 0; i < 5; i++){
            System.out.println(getFrase());
        }
    }
}