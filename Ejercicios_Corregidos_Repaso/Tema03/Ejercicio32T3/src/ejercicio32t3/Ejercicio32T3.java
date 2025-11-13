
package ejercicio32t3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio32T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int diaAct, mesAct, anioAct;
        int dia, mes, anio, anios, meses, dias;
        
        //Pedimos las fechas
        System.out.print("Día actual: ");
        diaAct = teclado.nextInt();
        System.out.print("Mes actual: ");
        mesAct = teclado.nextInt();
        System.out.print("Año actual: ");
        anioAct = teclado.nextInt();
        
        System.out.print("Día cumpleaños: ");
        dia = teclado.nextInt();
        System.out.print("Mes cumpleaños: ");
        mes = teclado.nextInt();
        System.out.print("Año cumpleaños: ");
        anio = teclado.nextInt();
        
        anios = anioAct - anio;  
        meses = mesAct - mes;    
        dias = diaAct - dia;     
        
        if  (dias < 0){
            dias = dias + 30;
            meses = meses - 1;
        }
        
        if  (meses < 0){
            meses = meses + 12;
            anios = anios - 1;
        }
        
        if  (anios < 0){
            System.out.println("Error. Fecha introducida incorrecta");
        }
        else{
            System.out.println("Su edad exacta es "+anios+" años, "+meses+" meses y "+dias+" dias");
        }
    }
    
}
