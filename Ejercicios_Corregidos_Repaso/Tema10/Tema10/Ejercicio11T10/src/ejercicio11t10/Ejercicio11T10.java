/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11t10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio11T10 {

    /* Pide y retorna el nombre */
    public static String pedirNombre(){
        Scanner entrada = new Scanner(System.in);               
        System.out.print("Nombre: ");        
        return entrada.nextLine();
    }
    
    /* Pide y retorna las horas */
    public static int pedirHoras(){
        Scanner entrada = new Scanner(System.in);        
        System.out.print("Horas: ");        
        return entrada.nextInt();
    }
    
    /* Pide y retorna la tarifa */
    public static int pedirTarifa(){
        Scanner entrada = new Scanner(System.in);                
        System.out.print("Tarifa: ");        
        return entrada.nextInt();
    }
    
    public static String pedirSeguir(){
        Scanner entrada = new Scanner(System.in);                
        System.out.println("¿Desea introducir otro empleado?");    
        return entrada.nextLine();
    }
    
    /* Rellena la lista de Empleados */
    public static void rellenarListaEmpleados(ArrayList<Empleado> lEmpleados){        
        int cont = 1;
        System.out.println("*** Se procede a rellenar la lista de empleados: ***");
        
        do{
            System.out.println("- EMPLEADO "+cont+"-");                                                
            lEmpleados.add(new Empleado(pedirNombre(), pedirHoras(), pedirTarifa()));
            cont++;                        
        }while(pedirSeguir().equalsIgnoreCase("s"));
    }
    
    /* Recorre la lista de empleados mostrandolos */
    public static void mostrarListaEmpleados(ArrayList<Empleado> lEmpleados){
        Iterator<Empleado> it = lEmpleados.iterator();  //Declaramos e inicializamos el iterador
        Empleado empleado;
        while(it.hasNext()){
            empleado = it.next();
            System.out.print(empleado);           
        }
    }
    
    /* Recorre la lista de empleados calculando y mostrando su sueldo bruto*/
    public static void mostrarSueldosEmpleados(ArrayList<Empleado> lEmpleados){
        Iterator<Empleado> it = lEmpleados.iterator();  //Declaramos e inicializamos el iterador
        Empleado empleado;
        System.out.println("** SUELDO BRUTO DE LOS EMPLEADOS **");
        while(it.hasNext()){
            empleado = it.next();
            System.out.print("\n");  //Salto de línea
            System.out.print(empleado);
            System.out.println("Susueldo es: " + Empleado.calcularSueldoBruto(empleado));
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleado> lEmpleados = new ArrayList<>();
        rellenarListaEmpleados(lEmpleados);
        mostrarListaEmpleados(lEmpleados);
        mostrarSueldosEmpleados(lEmpleados);
    }
    
}
