/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioampliacioni10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Vivienda {

    //Atributos
    private String direccion;
    private ArrayList<Actividad> actividades;

    //Constructores
    public Vivienda() {
        direccion = "";
        actividades = new ArrayList<>();
    }

    public Vivienda(String direccion, ArrayList<Actividad> actividades) {
        this.direccion = direccion;
        this.actividades = actividades;
    }

    //Getters/Setters
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(ArrayList<Actividad> actividades) {
        this.actividades = actividades;
    }

    //Metodos
    //
    public void introducirActividad() {
        Scanner entrada = new Scanner(System.in);
        String respuesta;

        do {
            System.out.println("--NUEVA ACTIVIDAD--");
            System.out.println("Nombre: ");
            String nombre = entrada.nextLine();
            System.out.println("Tipo: ");
            String tipo = entrada.nextLine();
            System.out.println("Recomendable para toda la familia, (Si/No): ");
            respuesta = entrada.nextLine();
        }
    }
    
    //
    public void mostrarActividades() {
        for(int i = 0; actividades.size(); i++) {
            System.out.println("ACTIVIDAD " + (i+1) + ":");
            System.out.println("");
        }
    }
    
    //
    public void mostrarActividadesFamilia() {
        
    }
    
    //
    public void mostrarActividadesTipo() {
        
    }
    
    //
    public void mostrarNumeroActividades() {
        
    }

    //Mostrar
    @Override
    public String toString() {
        return "- Direccion: " + direccion + "\n- Actividades: " + actividades;
    }
}
