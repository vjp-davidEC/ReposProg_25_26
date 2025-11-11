/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15tema5;

/**
 *
 * @author DAVID
 */
public class Ejercicio15Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objetos de la clase Direccion con diferentes valores
        Direccion dir1 = new Direccion("Avenida del Valle", 12, "B", "Plasencia");
        Direccion dir2 = new Direccion("Plaza Mayor", 5, "C", "Madrid");
        Direccion dir3 = new Direccion("Avenida Extremadura", 17, "A", "Sevilla");
        
        //Objetos de la clase Empleado con su nombre, salario y direccion
        Empleado emp1 = new Empleado("Luis", 1500, dir1);
        Empleado emp2 = new Empleado("Javier", 1300, dir2);
        Empleado emp3 = new Empleado("Daniel", 1700, dir3);
        
        //Mostrar los datos los empleados
        emp1.mostrarDatos();
        System.out.println("");
        emp2.mostrarDatos();
        System.out.println("");
        emp3.mostrarDatos();
    }
}