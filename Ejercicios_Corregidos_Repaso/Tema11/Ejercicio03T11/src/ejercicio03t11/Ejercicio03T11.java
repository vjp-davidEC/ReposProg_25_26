/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03t11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Quique Pineda
 */
public class Ejercicio03T11 {

    private final static int MAX = 6;
    
    public static int pedirPosicion(){
        Scanner teclado = new Scanner(System.in);
        int pos = -1;
        boolean error;
        do{
            error = false;
            try{
                System.out.println("Posición: ");
                pos = teclado.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Debe introducir un número.");
                teclado.next();  //Limpiar buffer
                error = true;
            }
            //Si nos salimos del rango del vector
            if  ((pos < 0)||(pos >= MAX)){
                error = true;
            }
        }while(error == true);
        return pos;
    }
    
    public static Autobus pedirAutobus(){
        Scanner teclado = new Scanner(System.in);
        String mat;
        Autobus nAutobus;
        System.out.print("Matrícula: ");
        mat = teclado.nextLine();
        nAutobus = new Autobus(mat);
        nAutobus.insertarConductores();
        return nAutobus;
    }
    
    public static void aparcar(Autobus[] vAutobuses){
        int pos;
        Autobus nAutobus;
        do{
            pos = pedirPosicion();
            if  (vAutobuses[pos] != null){
                System.out.println("Posición "+pos+" ocupada");
            }
        }while(vAutobuses[pos] != null);
        nAutobus = pedirAutobus();
        vAutobuses[pos] = nAutobus;
    }
    
    public static void mostrarLibres(Autobus[] vAutobuses){
        System.out.println("Dársenas libres: ");
        for(int i = 0; i < vAutobuses.length;i++){
            if  (vAutobuses[i] == null){
                System.out.print("["+i+"]");
            }
        }
        System.out.print("\n");  //Salto de línea
    }
    
    public static void buscarAutobus(String matricula, Autobus[] vAutobuses){
        int i = 0;
        boolean enc = false;
        while((!enc)&&(i < vAutobuses.length)){
            if (vAutobuses[i] != null){  //Si está ocupada la celda
                if  (matricula.equalsIgnoreCase(vAutobuses[i].getMatricula())){
                    enc = true;
                }
            }
            i++;
        }
        if  (enc){
            vAutobuses[i-1].mostrarAutobus();
        }
        else{
            System.out.println("No existe autobús con la matrícula "+matricula);
        }
    }
    
    //Muestra la matrícula del autobús que tenga asignado el conductor con dni "dni"
    public static void mostrarMatriculaSegunConductor(Autobus[] vAutobuses, String dni){
        int i = 0;
        boolean enc = false;
        while((!enc)&&(i < vAutobuses.length)){
            try{
                enc = vAutobuses[i].buscarConductor(dni);
                if  (enc){
                    System.out.println("El conductor con dni "+dni+" tiene asignado el autobús "+vAutobuses[i].getMatricula());
                }
            }
            catch(NullPointerException e){
                System.out.println("No hay ningún autobús aparcado en la celda " + i);
            }
            finally{
                i++;  //Pasamos a la siguiente celda siempre: tanto haya como no haya excepción
            }
        }
        if  (!enc){
            System.out.println("No existe el conductor con DNI: "+dni);
        }
    }
    
    //Retorna la posición en el vector del autobús con mayor número de conductores asignados
    public static int getPosicionBusMasConductores(Autobus[] vAutobuses){
        int mayor, pos = 0;
        try{
            mayor = vAutobuses[0].getNumConductores();
        }
        catch(NullPointerException e){
            mayor = 0;  
            //Lo correcto sería BUSCAR la primera posición ocupada para llamar al getNumConductores() para esa posición
        }
        for(int i = 1;i < vAutobuses.length;i++){
            if  (vAutobuses[i] != null){
                if  (vAutobuses[i].getNumConductores() > mayor){
                    mayor = vAutobuses[i].getNumConductores();
                    pos = i;
                }
            }
        }
        return pos;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecladoI = new Scanner(System.in);
        Scanner tecladoS = new Scanner(System.in);
        Autobus[] vAutobuses = new Autobus[MAX];
        int opc;
        String mat, dni;
        do{
            System.out.println("1. Aparcar.");
            System.out.println("2. Mostrar dársenas libres.");
            System.out.println("3. Buscar autobús.");
            System.out.println("4. Buscar conductor.");
            System.out.println("5. Mas conductores.");
            System.out.println("6. Salir");
            System.out.print("   Opción: ");
            opc = tecladoI.nextInt();
            switch(opc){
                case 1:
                    aparcar(vAutobuses);
                    break;
                case 2:
                    mostrarLibres(vAutobuses);
                    break;
                case 3:
                    System.out.print("Matrícula: ");
                    mat = tecladoS.nextLine();
                    buscarAutobus(mat, vAutobuses);
                    break;
                case 4:
                    System.out.print("DNI: ");
                    dni = tecladoS.nextLine();
                    mostrarMatriculaSegunConductor(vAutobuses, dni);
                    break;
                case 5:
                    System.out.println("Posición del autobús con más conductores: "+getPosicionBusMasConductores(vAutobuses));
                    break;
            }
        }while(opc != 6);
    }
    
}
