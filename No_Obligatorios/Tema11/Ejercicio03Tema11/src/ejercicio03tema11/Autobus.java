/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03tema11;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DAVID
 */
public class Autobus {
    //Atributos
    private String matricula;
    private Map<String, String> conductores;
    
    //Constructores
    public Autobus() {
        matricula = "";
        conductores = new HashMap<>();
    }

    public Autobus(String matricula, Map<String, String> conductores) {
        this.matricula = matricula;
        this.conductores = conductores;
    }
    
    public Autobus(String matricula) {
        this.matricula = matricula;
        conductores = new HashMap<>();
    }
    
    //Getters/Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Map<String, String> getConductores() {
        return conductores;
    }

    public void setConductores(Map<String, String> conductores) {
        this.conductores = conductores;
    }
    
    //Metodo
    //Metodo que añade un conductor al autobus con su DNI como clave y su nombre como valor
    public void addConductor(String DNI, String nombre) {
        conductores.put(DNI, nombre);
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Matricula: " + matricula + "\nConductores: " + conductores;
    }
}