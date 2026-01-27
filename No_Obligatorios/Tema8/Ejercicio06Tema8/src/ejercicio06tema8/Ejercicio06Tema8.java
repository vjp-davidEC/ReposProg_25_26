/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06tema8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio06Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Pedir al usuario cuantos empleados quiere introducir
        System.out.print("Cuantos empleados desea introducir?: ");
        int empleados = entrada.nextInt();
        entrada.nextLine();//Limpiar buffer

        //Se crea un array de objetos Empleado con el tamaño que introduzca el usuario
        Empleado[] emple = new Empleado[empleados];

        //Bucle para rellenar los datos de cada empleado
        for (int i = 0; i < emple.length; i++) {
            System.out.println("\n- EMPLEADO " + (i + 1) + " -");

            //Se pide al usuario el nombre, las horas y la tarifa
            System.out.print("Introduzca el nombre del empleado: ");
            String nombre = entrada.nextLine();

            System.out.print("Cuantas horas trabajo este mes?: ");
            int horas = entrada.nextInt();

            System.out.print("Cual es su tarifa por hora de trabajo?: ");
            double tarifa = entrada.nextDouble();
            entrada.nextLine();

            //Se crea el objeto Empleado y se guarda en el array
            emple[i] = new Empleado(nombre, horas, tarifa);

            System.out.println("EMPLEADO " + (i + 1) + " ALMACENADO CON EXITO");
        }
        System.out.println("\nSUELDO BRUTO DE LOS EMPLEADOS");
        //Se recorre el array con un for-each para mostrar la informacion
        for (Empleado empleado : emple) {
            double sueldo = empleado.calcularSueldo();
            System.out.println(empleado.getNombre() + " trabajo " + empleado.getHorasTrabajadas() + " horas, cobra "
                    + empleado.getTarifaHora() + " euros la hora por lo que le corresponde un sueldo de " + sueldo + " euros");
        }
    }
}