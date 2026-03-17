/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15t10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Empresa {
    // ATRIBUTOS
    private String nombreEmpresa;
    private ArrayList<Empleado> lEmpleados;
    
    // CONSTRUCTORES
    public Empresa(){
        this.nombreEmpresa = "";
        this.lEmpleados = new ArrayList<>();
    }
    
    public Empresa(String nombre){
        this.nombreEmpresa = nombre;
        this.lEmpleados = new ArrayList<>();
    }
    
    public Empresa(String nombre, ArrayList<Empleado> lEmpleados){
        this.nombreEmpresa = nombre;
        this.lEmpleados = lEmpleados;
    }

    // GETTER Y SETTER
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public ArrayList<Empleado> getlEmpleados() {
        return lEmpleados;
    }

    public void setlEmpleados(ArrayList<Empleado> lEmpleados) {
        this.lEmpleados = lEmpleados;
    }

    // MÉTODOS
    /**
     * Método que pide el sueldo al usuario.
     * 
     * @return el sueldo introducido.
     */
    public static int pedirSueldo(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Sueldo: ");
        return entrada.nextInt();        
    }
    
    /**
     * Método que pide un nombre al usuario.
     * 
     * @return el nombre introducido.
     */
    public static String pedirNombre(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();        
    }
    
    /**
     * Método que pregunta al usuario si quiere 
     * insertar otro empleado en la lista.
     * 
     * @return s para sí o n para no.
     */
    public static String pedirRespuesta(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Desea insertar más empleados? (s/n): ");
        return entrada.nextLine();        
    }
    
    /**
     * Método que inserta empleados en la lista
     * hasta que el usuario quiera.
     */
    public void insertarEmpleados(){
        do{            
            this.lEmpleados.add(new Empleado(pedirNombre(), pedirSueldo()));            
        } while(pedirRespuesta().equalsIgnoreCase("s"));
    }
    
    /**
     * Método que muestra el nombre de 
     * la empresa junto con sus empleados.
     */
    public void mostrarEmpresa(){
        System.out.println("Nombre: "+this.nombreEmpresa);
        for(int i = 0;i < this.lEmpleados.size();i++){
            this.lEmpleados.get(i).mostrarEmpleado();
        }
    }
    
    /**
     * Método que recorre todos los empleados 
     * comprobando cuál contiene una X en su nombre
     * y los muestra.
     */
    public void mostrarEmpleadosDeEmpresaConX(){
        for(int i = 0;i < this.lEmpleados.size();i++){
            if(this.lEmpleados.get(i).getNombreEmpleado().toLowerCase().contains("x")){  
                this.lEmpleados.get(i).mostrarEmpleado();
            }
        }
    }
    
}
