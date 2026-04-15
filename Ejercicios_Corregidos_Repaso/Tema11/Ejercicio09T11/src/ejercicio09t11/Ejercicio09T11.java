/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09t11;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Usuario
 */
public class Ejercicio09T11 {

    public static LocalDate pedirFecha(){
        Scanner teclado = new Scanner(System.in);
        LocalDate fecha;
        int dia, mes, anio;
        System.out.print("Día: ");
        dia = teclado.nextInt();
        System.out.print("Mes: ");
        mes = teclado.nextInt();
        System.out.print("Año: ");
        anio = teclado.nextInt();
        fecha = LocalDate.of(anio, mes, dia);
        return fecha;
    }
    
    /* Podemos reutilizar el método para realizar el sorteo y repetir el sorteo, puesto que no es necesario borrar el 
       sorteo anterior, ya que el put "machaca" el elemento si éste tiene una clave ya existente */
    public static void realizarSorteo(Map<LocalDate, Sorteo> mSorteos){
        //Creamos un sorteo con la fecha actual y números ganadores entre 1 y 100.
        Sorteo nSorteo = new Sorteo();  
        mSorteos.put(nSorteo.getFechaSorteo(), nSorteo);
        //Mostramos por pantalla el sorteo 
        System.out.println(nSorteo);
    }
    
    public static void mostrarSorteosMesActual(Map<LocalDate, Sorteo> mSorteos){
        LocalDate fechaActual = LocalDate.now();
        Sorteo sorteoAct;
        System.out.println(" -- Sorteos "+fechaActual.getMonthValue()+"/"+fechaActual.getYear()+" --");
        for(LocalDate fSorteo:mSorteos.keySet()){
            sorteoAct = mSorteos.get(fSorteo);
            if  (sorteoAct.getFechaSorteo().getMonthValue() == fechaActual.getMonthValue()){
                System.out.println(sorteoAct);
            }
        }
    }
    
    public static void mostrarSorteoSegunFecha(Map<LocalDate, Sorteo> mSorteos, LocalDate fecha){
        //Comprobamos que no haya ya un sorteo para esa fecha
        if  (mSorteos.containsKey(fecha)){
            System.out.println(mSorteos.get(fecha));
        }
        else{
            System.out.println("No hay sorteo para la fecha indicada ("+fecha+")");
        }
    }
    
    public static void realizarSorteoPorFecha(Map<LocalDate, Sorteo> mSorteos, LocalDate fecha){
        Sorteo nSorteo;
        if  (mSorteos.containsKey(fecha)){
            System.out.println("El día "+fecha+" ya tiene un sorteo realizado");
        }
        else{
            //Creamos un sorteo con la fecha recibida por parámetros y números ganadores entre 1 y 100.
            nSorteo = new Sorteo(fecha);  
            mSorteos.put(fecha, nSorteo);
            //Mostramos por pantalla el sorteo 
            System.out.println(nSorteo);
        }
    }
    
    public static void mostrarSorteos(Map<LocalDate, Sorteo> mSorteos){
        Sorteo sorteoAct;
        for(LocalDate fechaSorteo:mSorteos.keySet()){
            sorteoAct = mSorteos.get(fechaSorteo);
            System.out.println(sorteoAct);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<LocalDate, Sorteo> mSorteos = new TreeMap<>();
        LocalDate fecha;
        int opc;
        do{
            System.out.println("1. Realizar sorteo");
            System.out.println("2. Repetir sorteo");
            System.out.println("3. Mostrar sorteos del mes actual");
            System.out.println("4. Mostrar sorteo dada una fecha");
            System.out.println("5. Realizar sorteo por fecha");
            System.out.println("6. Mostrar todos los sorteos");
            System.out.println("7. Salir");
            System.out.print("   Opción: ");
            opc = teclado.nextInt();
            switch(opc){
                case 1:
                case 2:
                    realizarSorteo(mSorteos);
                    break;
                case 3:
                    mostrarSorteosMesActual(mSorteos);
                    break;
                case 4:
                    fecha = pedirFecha();
                    mostrarSorteoSegunFecha(mSorteos, fecha);
                    break;
                case 5:
                    fecha = pedirFecha();
                    realizarSorteoPorFecha(mSorteos, fecha);
                    break;
                case 6:
                    mostrarSorteos(mSorteos);
                    break;
            }
        }while(opc != 7);
    }
}
