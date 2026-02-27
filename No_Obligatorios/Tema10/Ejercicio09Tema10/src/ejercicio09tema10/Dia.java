/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09tema10;

/**
 *
 * @author alumno
 */
public class Dia {
    //Atributos
    private String nombreDia;
    private int temperatura;
    
    //Constructores
    public Dia() {
        nombreDia = "";
        temperatura = 0;
    }

    public Dia(String nombreDia, int temperatura) {
        this.nombreDia = nombreDia;
        this.temperatura = temperatura;
    }

    //Getters/Setters
    public String getNombreDia() {
        return nombreDia;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    //Mostrar
    @Override
    public String toString() {
        return "El dia " + nombreDia + " hace una temperatura de " + temperatura + "C";
    }
}