/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03t11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Quique Pineda
 */
public class Autobus {
    private String matricula;
    private Map<String, Conductor> mapaConductores;

    public Autobus() {
        this.matricula = "";
        this.mapaConductores = new HashMap<>(); 
    }

    public Autobus(String matricula, Map<String, Conductor> mapaConductores) {
        this.matricula = matricula;
        this.mapaConductores = mapaConductores;
    }
    
    public Autobus(String matricula) {
        this.matricula = matricula;
        this.mapaConductores = new HashMap<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Map getMapaConductores() {
        return mapaConductores;
    }

    public void setMapaConductores(Map mapaConductores) {
        this.mapaConductores = mapaConductores;
    }
    
    public void insertarConductores(){
        Scanner teclado = new Scanner(System.in);
        String dni, nom, resp;
        Conductor nConductor;
        System.out.println("--- Rellenando conductores ---");
        do{
            System.out.print("DNI: ");
            dni = teclado.nextLine();
            System.out.print("Nombre: ");
            nom = teclado.nextLine();
            nConductor = new Conductor(dni, nom);
            this.mapaConductores.put(dni, nConductor);
            System.out.println("¿Desea introducir más conductores?");
            resp = teclado.nextLine();
        }while(resp.equalsIgnoreCase("SI"));
    }
    
    public void mostrarAutobus(){
        Conductor c;
        System.out.println("Matrícula: "+this.matricula);
        for(String clave:mapaConductores.keySet()){
            c = mapaConductores.get(clave);
            System.out.println(c);
        }
    }
    
    public boolean buscarConductor(String dni){
        if  (this.mapaConductores.containsKey(dni)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getNumConductores(){
        return this.mapaConductores.size();
    }
}
