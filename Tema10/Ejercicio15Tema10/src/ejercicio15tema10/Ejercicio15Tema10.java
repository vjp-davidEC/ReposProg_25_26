/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15tema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio15Tema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Lista donde se guardan todas las empresas creadas
        ArrayList<Empresa> listaEmpresas = new ArrayList<>();
        
        int opcion;
        
        do {//Bucle principal
            mostrarMenu();
            opcion = entrada.nextInt();
            switch(opcion) {//Se selecciona el caso que se quiera realizar
                case 1 -> introducirEmpresas(listaEmpresas);
                case 2 -> mostrarEmpresas(listaEmpresas);
                case 3 -> mostrarEmpleadosConA(listaEmpresas);
                case 4 -> mostrarEmpleadosOrdenados(listaEmpresas);
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while (opcion !=5);//Hasta que no sea 5 no se sale
    }
    
    //Metodo que muestra el menu principal
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. Introducir empresas y empleados");
        System.out.println("2. Mostrar empresas y empleados");
        System.out.println("3. Mostrar empleados cuyo nombre contiene 'A'");
        System.out.println("4. Mostrar empleados ordenados por sueldo");
        System.out.println("5. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    //Metodo que permite introducir empresas en la lista
    public static void introducirEmpresas(ArrayList<Empresa> listaEmpresas) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        
        do {
            System.out.print("Nombre de la empresa: ");
            String nombre = entrada.nextLine();

            //Se crea la empresa y se añade sus empleados
            Empresa empre = new Empresa(nombre);
            empre.introducirEmpleados();
            //Se añade la empresa a la lista
            listaEmpresas.add(empre);

            //Se pregunta si quiere introducir mas empresas
            System.out.print("Deseas introducir mas empresas - Si/No: ");
            respuesta = entrada.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));//Hasta que no sea si, no se añade otra empresa
    }
    
    //Metodo que muestra todas las empresas y sus empleados
    public static void mostrarEmpresas(ArrayList<Empresa> listaEmpresas) {
        System.out.println();
        if (listaEmpresas.isEmpty()) {
            System.out.println("No hay empresas registradas");
        } else {
            System.out.println("--LISTA DE EMPRESAS--");
            for (Empresa empre : listaEmpresas) {
                empre.mostrarEmpleados();
            }
        }
    }
    
    //Metodo que muestra los empleados cuyo nombre contiene la letra 'a'
    public static void mostrarEmpleadosConA(ArrayList<Empresa> listaEmpresas) {
        System.out.println();
        for (Empresa empre : listaEmpresas) {
            empre.empleadosConA();
        }
        System.out.println();
    }
    
    //Metodo que muestra todos los empleados de todas las empresas ordenados por sueldo
    public static void mostrarEmpleadosOrdenados(ArrayList<Empresa> listaEmpresas) {
        //Lista en la que se guarda todos los empleados de todas las empresas
        ArrayList<Empleados> emplea = new ArrayList<>();
        //Se recorre cada empresa y se añade sus empleados uno a uno
        for (Empresa empre : listaEmpresas) {
            for (Empleados emple : empre.getEmpleados()) {
                emplea.add(emple);
            }
        }
        //Se llama al metodo de Empresa que ordena y muestra los empleados
        Empresa.empleadosOrdenados(emplea);
    }
}