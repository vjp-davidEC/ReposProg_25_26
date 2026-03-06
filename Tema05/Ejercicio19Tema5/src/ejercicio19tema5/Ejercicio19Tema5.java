/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19tema5;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio19Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Pedir al usuario que introduzca el nombre, las horas y la tarifa y luego se crea los objetos de la clase Empleado con los datos introducidos
        Empleado emp1 = new Empleado(pedirNombre(), pedirHoras(), pedirTarifa());
        Empleado emp2 = new Empleado(pedirNombre(), pedirHoras(), pedirTarifa());
        Empleado emp3 = new Empleado(pedirNombre(), pedirHoras(), pedirTarifa());
        
        //Mostrar los datos y el suedo de cada empleado
        System.out.println("");
        emp1.mostrarEmpleado();
        System.out.println("");
        emp2.mostrarEmpleado();
        System.out.println("");
        emp3.mostrarEmpleado();
    }
    
    public static String pedirNombre(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
        return entrada.nextLine();
    }
    
    public static int pedirHoras(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce las horas trabajadas: ");
        return entrada.nextInt();
    }
    
    public static double pedirTarifa(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el salario: ");
        return entrada.nextDouble();
    }
}