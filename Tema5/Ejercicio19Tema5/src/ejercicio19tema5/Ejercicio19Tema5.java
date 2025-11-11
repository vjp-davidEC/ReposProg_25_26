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
        System.out.print("Introduzca el nombre, las horas trabajadas y la tarifa por hora del primer empleado: ");
        Empleado emp1 = new Empleado(entrada.nextLine(), entrada.nextInt(), entrada.nextDouble());
        entrada.nextLine();
        System.out.print("Introduzca el nombre, las horas trabajadas y la tarifa por hora del segundo empleado: ");
        Empleado emp2 = new Empleado(entrada.nextLine(), entrada.nextInt(), entrada.nextDouble());
        entrada.nextLine();
        System.out.print("Introduzca el nombre, las horas trabajadas y la tarifa por hora del tercer empleado: ");
        Empleado emp3 = new Empleado(entrada.nextLine(), entrada.nextInt(), entrada.nextDouble());
        
        //Mostrar los datos y el suedo de cada empleado
        emp1.mostrar();
        emp2.mostrar();
        emp3.mostrar();
    }
}