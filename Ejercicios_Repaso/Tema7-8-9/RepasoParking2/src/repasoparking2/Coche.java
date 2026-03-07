/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoparking2;

/**
 *
 * @author DAVID
 */
public class Coche {
    //Atributos
    private String matricula;
    private String marca;
    private String color;
    
    //Constructores
    public Coche() {
        matricula = "";
        marca = "";
        color = "";
    }
    
    public Coche(String matricula, String marca, String color) {
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
    }
    
    //Getters/Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "El coche tiene la matricula " + matricula + ", su marca es " + marca + " y el color es " + color;
    }
}