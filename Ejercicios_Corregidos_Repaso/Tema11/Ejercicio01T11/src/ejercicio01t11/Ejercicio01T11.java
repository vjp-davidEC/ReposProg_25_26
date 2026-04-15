/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01t11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio01T11 {
    
    private static final int MAX = 31;
    
    /* Rellena el mapa con las temperaturas */
    public static void rellenarTemperaturas(Map mapa){
        //Declaramos e inicializamos vector con los días de la semana
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        Dia diaAux;
        int i, j, temperatura;
        j = (int)(Math.random() * 7); //Aleatorio entre 0 y 6
        for(i = 1;i <= MAX;i++){
            temperatura = (int)(Math.random() * 45); //Aleatorio entre 0 y 44
            diaAux = new Dia(diasSemana[j], temperatura);
            mapa.put(i, diaAux);
            if  (j == 6){
                j = 0;
            }
            else{
                j++;
            }
        }
    }
    
    /* Muestra el contenido del mapa */
    public static void mostrarTemperaturas(Map mapa){
        Dia diaAux;
        int clave;
        Iterator it = mapa.keySet().iterator();
        while(it.hasNext()){
            clave = (int) it.next();
            diaAux = (Dia) mapa.get(clave);
            System.out.print("Clave: "+clave+" - "+diaAux.getNombreDia()+" - "+diaAux.getTemperatura()+" grados\n");
        }
    }
    
    /* Muestra la temperatura media del mes. Para ello, recorremos todos
       los días del mes sumando el total de sus temperaturas. */
    public static void mostrarMediaMes(Map mapa){
        float suma = 0;
        int clave;
        Dia diaAux;
        Iterator it = mapa.keySet().iterator();
        while(it.hasNext()){
            clave = (int) it.next();
            diaAux = (Dia) mapa.get(clave);
            suma = suma + diaAux.getTemperatura();
        }
        System.out.println("Media: "+(suma / mapa.size())+" grados");
    }
    
    /* Mostramos el día o días más caluroso/s */
    public static void diaMasCaluroso(Map mapa){
        Dia diaAux;
        int clave, mayor = 0;
        Iterator it = mapa.keySet().iterator();
        //Busco la temperatura mayor
        while(it.hasNext()){
            clave = (int) it.next();
            diaAux = (Dia) mapa.get(clave);
            if  (mayor < diaAux.getTemperatura()){
                mayor = diaAux.getTemperatura();
            }
        }
        System.out.println("Dia/s más caluroso/s: ");
        //Muestro todos aquellos días cuya temperatura coincide con la mayor
        //Inicializamos el iterador "it" para poder reutilizarlo
        it = mapa.keySet().iterator();
        while(it.hasNext()){
            clave = (int) it.next();
            diaAux = (Dia) mapa.get(clave);
            if  (mayor == diaAux.getTemperatura()){
                System.out.println("    "+diaAux.getNombreDia()+" dia "+clave+" con "+diaAux.getTemperatura()+" grados");
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<Integer, Dia> mapa = new HashMap<>();
        int opc;
        do{
            System.out.println("1. Rellenar temperaturas. ");
            System.out.println("2. Mostrar temperaturas. ");
            System.out.println("3. Mostrar temperatura media. ");
            System.out.println("4. Mostrar dia/s más caluroso/s. ");
            System.out.println("5. Salir. ");
            System.out.print("   Opción: ");
            opc = teclado.nextInt();
            switch(opc){
                case 1:
                    rellenarTemperaturas(mapa);
                    System.out.println("Temperaturas generadas correctamente");
                    break;
                case 2:
                    mostrarTemperaturas(mapa);
                    break;
                case 3:
                    mostrarMediaMes(mapa);
                    break;
                case 4:
                    diaMasCaluroso(mapa);
                    break;
                case 5:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        }while(opc != 5);
    }
    
}
