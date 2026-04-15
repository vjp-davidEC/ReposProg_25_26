/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11t11;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class Ejercicio11T11 {

    public static Alumno pedirAlumno(){
        Scanner tecladoS = new Scanner(System.in);
        Scanner tecladoI = new Scanner(System.in);
        Scanner tecladoF = new Scanner(System.in);
        String dni;
        int numExpediente;
        float notaMedia;
        Alumno nAlumno;
        System.out.println("DNI: ");
        dni = tecladoS.nextLine();
        System.out.println("nº expediente: ");
        numExpediente = tecladoI.nextInt();
        System.out.println("Nota media: ");
        notaMedia = tecladoF.nextFloat();
        nAlumno = new Alumno(dni, numExpediente, notaMedia);
        return nAlumno;
    }
    
    public static int pedirExpediente(){
        Scanner teclado = new Scanner(System.in);
        int numExpediente;
        System.out.println("nº expediente: ");
        numExpediente = teclado.nextInt();
        return numExpediente;
    }
    
    public static float pedirNota(){
        Scanner teclado = new Scanner(System.in);
        float nota;
        System.out.println("Nota media: ");
        nota = teclado.nextFloat();
        return nota;
    }
    
    public static void insAlumno(Set<Alumno> cAlumnos, Alumno nAlumno){
        cAlumnos.add(nAlumno);
        System.out.println("-- Alumno insertado correctamente --");
    }
    
    public static void mostrarAlumnos(Set<Alumno> cAlumnos){
        for(Alumno alumnoAct:cAlumnos){
            System.out.println(alumnoAct.toString());
        }
    }
    
    public static boolean buscarAlumno(Set<Alumno> cAlumnos, int exp){
        Iterator<Alumno> it = cAlumnos.iterator();
        boolean enc = false;
        Alumno alumnoAct;
        while(it.hasNext() && !enc){
            alumnoAct = it.next();
            if  (alumnoAct.getNumExpediente() == exp){
                enc = true;
                System.out.println(alumnoAct.toString());
            }
        }
        return enc;
    }
    
    public static void buscarPorNota(Set<Alumno> cAlumnos, float nota){
        for(Alumno alumnoAct:cAlumnos){
            if  (alumnoAct.getNotaMedia() == nota){
                System.out.println(alumnoAct.toString());
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Set<Alumno> cAlumnos = new TreeSet<>();
        int numExp;
        Alumno nAlumno;
        float nota;
        int opc;
        do{
            System.out.println("1. Añadir alumno");
            System.out.println("2. Mostrar alumnos");
            System.out.println("3. Buscar por expediente");
            System.out.println("4. Buscar por nota");
            System.out.println("5. Salir");
            System.out.print("   Opción: ");
            opc = teclado.nextInt();
            switch(opc){
                case 1:
                    nAlumno = pedirAlumno();
                    insAlumno(cAlumnos, nAlumno);
                    break;
                case 2:
                    mostrarAlumnos(cAlumnos);
                    break;
                case 3:
                    numExp = pedirExpediente();
                    if  (!buscarAlumno(cAlumnos, numExp)){
                        System.out.println("Número de expediente no encontrado.");
                    }
                    break;
                case 4:
                    nota = pedirNota();
                    buscarPorNota(cAlumnos, nota);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        }while(opc != 5);
    }
    
}
