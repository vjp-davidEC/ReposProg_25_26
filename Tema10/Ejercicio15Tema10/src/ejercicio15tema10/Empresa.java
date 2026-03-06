/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15tema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Empresa {
    //Atributos
    private String nombreEmpresa;
    private ArrayList<Empleados> empleados;
    
    //Constructores
    public Empresa() {
        nombreEmpresa = "";
        empleados = new ArrayList<>();
    }

    public Empresa(String nombreEmpresa, ArrayList<Empleados> empleados) {
        this.nombreEmpresa = nombreEmpresa;
        this.empleados = empleados;
    }
    
    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        empleados = new ArrayList<>();
    }

    //Getters/Setters
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public ArrayList<Empleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleados> empleados) {
        this.empleados = empleados;
    }

    //Metodos
    //Metodo que permite introducir empleados dentro de una empresa
    public void introducirEmpleados() {
        Scanner entrada = new Scanner(System.in);
        int contador = 1;//Contador para numerar a los empleados
        String respuesta;
        
        do {
            System.out.print("Nombre del empleado " + contador + ": ");
            String nombre = entrada.nextLine();
            System.out.print("Sueldo del empleado " + contador + ": ");
            int sueldo = entrada.nextInt();
            entrada.nextLine();//Limpiar buffer
            
            //Se añade el empleado con su nombre y su sueldo
            empleados.add(new Empleados(nombre, sueldo));
            contador++;//Se va aumentando el contador
            
            //Se pregunta si quiere introducir mas empleados
            System.out.print("Deseas introducir mas empleados - Si/No: ");
            respuesta = entrada.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));//Hasta que no sea si, no se añade otro empleado
    }
    
    //Metodo que muestra todos los empleados de una empresa
    public void mostrarEmpleados() {
        //Se muestra el nombre de la empresa a la que pertenecen
        System.out.println("Empresa: " + nombreEmpresa);
        if(empleados.isEmpty()) {
            System.out.println("No hay empleados registrados");
        } else {
            for (Empleados emple : empleados) {
                System.out.println(emple.toString());
            }
        }
    }
    
    //Metodo que muestra los empleados cuyo nombre contiene la letra 'a'
    public void empleadosConA() {
        boolean encontrado = false;
        
        for (Empleados emple : empleados) {
            //Se comprueba si el nombre contiene la letra 'a' 
            if (emple.getNombreEmpleado().toLowerCase().contains("a")) {
                System.out.print(emple.getNombreEmpleado() + " - ");
                encontrado = true;
            }
        }
        //Si no se encuentra, se muestra el mensaje
        if (!encontrado) {
            System.out.println("No hay empleados con A");
        }
    }
    
    //Metodo que ordena la lista de empleados por sueldo de mayor a menor
    public static void empleadosOrdenados(ArrayList<Empleados> listaEmpleados) {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados registrados");
        } else {
            for (int i = 0; i < listaEmpleados.size() - 1; i++) {
                for (int j = i + 1; j < listaEmpleados.size(); j++) {
                    //Si el sueldo del empleado j es mayor que el de i, se intercambian
                    if (listaEmpleados.get(j).getSueldo() > listaEmpleados.get(i).getSueldo()) {
                        Empleados aux = listaEmpleados.get(i);
                        listaEmpleados.set(i, listaEmpleados.get(j));
                        listaEmpleados.set(j, aux);
                    }
                }
            }
            //Se muestra la lista ya ordenada
            System.out.println("\n--Empleados ordenados por sueldo--");
            for (Empleados emple : listaEmpleados) {
                System.out.println(emple.toString());
            }
        }
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "El nombre de la empresa es " + nombreEmpresa + " y su/s empleado/s es o son " + empleados;
    }
}