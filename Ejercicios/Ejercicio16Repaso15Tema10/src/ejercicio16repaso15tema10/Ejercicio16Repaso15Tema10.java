package ejercicio16repaso15tema10;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio16Repaso15Tema10 {

    public static void main(String[] args) {
        ArrayList<Empresa> empresas = new ArrayList<>();
        
        int opcion = 0;
        
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            switch (opcion) {
                case 1 -> insertarEmpresas(empresas);
                case 2 -> mostrarEmpresas(empresas);
                case 3 -> mostrarEmpleadosConA(empresas);
                case 4 -> mostrarEmpleadosOrdenados(empresas);
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentelo de nuevo");
            }
        } while (opcion != 5);
    }
    
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. Introducir empresas y empleados");
        System.out.println("2. Mostrar empresas y empleados");
        System.out.println("3. Mostrar empleados cuyo nombre contiene 'A'");
        System.out.println("4. Mostrar empleados ordenados por sueldo");
        System.out.println("5. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    public static void insertarEmpresas(ArrayList<Empresa> empresas) {
        System.out.println("");
        
        System.out.println("Insertando nueva empresa...");
        Empresa empre;
        do {
            empre = new Empresa(pedirNombreEmpresa());
            empre.introducirEmpleados();
            
            empresas.add(empre);
            System.out.println("\nEmpresa aniadida correctamente");
        } while (pedirSeguir().equalsIgnoreCase("s"));
    }
    
    public static void mostrarEmpresas(ArrayList<Empresa> empresas) {
        System.out.println("");
        
        if (empresas.isEmpty()) {
            System.out.println("No hay ninguna empresa en la lista");
        } else {
            System.out.println("Mostrando empresas con sus empleados");
            for (Empresa empre : empresas) {
                empre.mostrarEmpleados();
            }
        }
    }
    
    public static void mostrarEmpleadosConA(ArrayList<Empresa> empresas) {
        System.out.println("");
        
        if (empresas.isEmpty()) {
            System.out.println("No hay ningun empleado con A");
        } else {
            for (Empresa empre : empresas) {
                empre.empleadosConA();
            }
            System.out.println();
        }
    }
    
    public static void mostrarEmpleadosOrdenados(ArrayList<Empresa> empresas) {
        System.out.println("");
        ArrayList<Empleados> emplea = new ArrayList<>();
        
        for (Empresa empre : empresas) {
            for (Empleados emple : empre.getEmpleados()) {
                emplea.add(emple);
            }
        }
        Empresa.empleadosOrdenados(emplea);
    }
    
    
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    public static String pedirSeguir() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Desea introducir una empresa (s/n): ");
        return entrada.nextLine();
    }
    public static String pedirNombreEmpresa() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre empresa: ");
        return entrada.nextLine();
    }
}