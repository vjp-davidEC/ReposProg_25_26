package ejercicio13repaso11tema10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio13Repaso11Tema10 {

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        rellenarListaEmpleados(empleados);
        mostrarListaEmpleados(empleados);
        mostrarSueldoEmpleados(empleados);
    }
    
    public static void rellenarListaEmpleados(ArrayList<Empleado> empleados) {
        int contador = 1;
        System.out.println("*** Se procede a rellenar la lista de empleados: ***");
        
        do {
            System.out.println("- EMPLEADO " + contador + " -");
            empleados.add(new Empleado(pedirNombre(), pedirHoras(), pedirTarifa()));
            contador++;
        } while (pedirSeguir().equalsIgnoreCase("s"));
    }
    
    public static void mostrarListaEmpleados(ArrayList<Empleado> empleados) {
        System.out.println("");
        
        Iterator<Empleado> it = empleados.iterator();
        Empleado emple;
        while (it.hasNext()) {
            emple = it.next();
            System.out.println(emple);
        }
    }
    
    public static void mostrarSueldoEmpleados(ArrayList<Empleado> empleados) {
        System.out.println("");
        
        Iterator<Empleado> it = empleados.iterator();
        Empleado emple;
        System.out.println("** SULEDO BRUTO DE LOS EMPLEADOS **");
        while (it.hasNext()) {
            emple = it.next();
            System.out.println(emple);
            System.out.println("Su sueldo es: " + Empleado.calcularSueldoBruto(emple));
        }
    }
    
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }
    public static int pedirHoras() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Horas: ");
        return entrada.nextInt();
    }
    public static int pedirTarifa() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Tarifa: ");
        return entrada.nextInt();
    }
    public static String pedirSeguir() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Deseas introducir otro empleado: ");
        return entrada.nextLine();
    }
}