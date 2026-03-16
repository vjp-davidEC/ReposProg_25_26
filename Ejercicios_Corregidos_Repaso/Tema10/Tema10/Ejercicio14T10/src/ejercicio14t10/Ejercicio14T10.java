/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14t10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio14T10 {
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre alumno: ");
        return entrada.nextLine();
    }

    public static void insertarAlumno(ArrayList<Alumno> lista, String[] vNombresAsignaturas){               
        lista.add(new Alumno(pedirNombre()));
        
        //Relleno las notas del último alumno (que es el que acabo de insertar)
        lista.get(lista.size() - 1).rellenarAsignaturas(vNombresAsignaturas);
        
        /*
            OPCIÓN 2:
                alumnoNuevo = new Alumno(nombre);
                alumnoNuevo.rellenarAsignaturas(vNombresAsignaturas);
                lista.add(alumnoNuevo);
        */
    }
    
    public static void mostrarTodosLosAlumnos(ArrayList<Alumno> lista){
        int i;
        for(i = 0;i < lista.size();i++){
            lista.get(i).mostrarAlumno();
        }
    }

    public static void mejorAlumno(ArrayList<Alumno> lista){
        int i, mejorAlumno = 0;
        float mayor = lista.get(0).getTotalNotas();
        float suma;
        
        for(i = 0;i < lista.size();i++){
            suma = lista.get(i).getTotalNotas();
            
            if  (suma > mayor){
                mayor = suma;
                mejorAlumno = i;
            }
            
        }
        
        System.out.println("EL mejor alumno es "+lista.get(mejorAlumno).getNombre());
    }
    
    public static void asignaturaMasDificil(ArrayList<Alumno> lista, String[] vNombresAsignaturas){
        int asigMasDificil = 0;
        float suma, menorNotaAsignatura = 999;
        
        for(int j = 0;j < vNombresAsignaturas.length;j++){
            suma = 0;
            
            for(int i = 0;i < lista.size();i++){
                suma = suma + lista.get(i).getNotaPorPosicion(j);
            }
            
            if(suma < menorNotaAsignatura){
                menorNotaAsignatura = suma;
                asigMasDificil = j;
            }
            
        }
        
        System.out.println("La asignatura más dificil es " + vNombresAsignaturas[asigMasDificil]);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] vNombresAsignaturas = {"Lengua", "Mates", "Física"};
        ArrayList<Alumno> lista = new ArrayList<>();
        int opc;
        do{
            System.out.println("1. Añadir alumno y notas");
            System.out.println("2. Mostrar alumnos");
            System.out.println("3. Mejor alumno");
            System.out.println("4. Asignatura más difícil");
            System.out.println("5. Salir");
            System.out.print("   Opción: ");
            opc = entrada.nextInt();
            switch(opc){
                case 1:
                    insertarAlumno(lista, vNombresAsignaturas);
                    break;
                case 2:
                    mostrarTodosLosAlumnos(lista);
                    break;
                case 3:
                    mejorAlumno(lista);
                    break;
                case 4:
                    asignaturaMasDificil(lista, vNombresAsignaturas);
                    break;
            }
        }while(opc != 5);
    }
    
}
