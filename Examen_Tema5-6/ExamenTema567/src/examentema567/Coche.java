/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examentema567;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Coche {
    //Atributos
    private String nombreTitular;
    private String matricula;
    
    //Constructores
    public Coche() {
        nombreTitular = "";
        matricula = "";
    }

    public Coche(String nombreTitular, String matricula) {
        this.nombreTitular = nombreTitular;
        this.matricula = matricula;
    }

    //Getters/Setters
    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Coche de " + nombreTitular + " con matricula " + matricula;
    }
}