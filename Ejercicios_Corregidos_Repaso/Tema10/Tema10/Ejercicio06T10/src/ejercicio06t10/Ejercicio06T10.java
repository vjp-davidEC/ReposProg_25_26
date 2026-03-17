/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06t10;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 *
 * @author admin
 */
public class Ejercicio06T10 {
    /**
     * Método que pide un número entero.
     * 
     * @return el número dado por el usuario
     */
    public static int pedirInt() {
        Scanner entrada = new Scanner(System.in);        
        return entrada.nextInt();        
    }

    /**
     * Método que rellena la lista con las ventas del mes.
     * 
     * @param lista
     * @param vMeses 
     */
    public static void rellenarLista(ArrayList<Integer> lista, String[] vMeses){
        for (String mes : vMeses) {
            System.out.print("Ventas " + mes + ": ");
            lista.add(pedirInt());
        }
    }
    
    /**
     * Método que muestra la lista de ventas del mes.
     * 
     * @param lista
     * @param vMeses 
     */
    public static void mostrarLista(ArrayList<Integer> lista, String[] vMeses){
        for(int i = 0;i < lista.size();i++){
            System.out.println("Ventas de " + vMeses[i] + ": " + lista.get(i));
        }
    }
    
    /**
     * Método que muestra la lista al revés.
     * 
     * @param lista
     * @param vMeses 
     */
    public static void mostrarListaAlReves(ArrayList<Integer> lista, String[] vMeses){
        for(int i = lista.size() - 1 ;i >= 0;i--){
            System.out.println("Ventas de " + vMeses[i] + ": " + lista.get(i));
        }
    }
    
    /**
     * Método que muestra el total de ventas del mes.
     * 
     * @param lista 
     */
    public static void mostrarTotalVentas(ArrayList<Integer> lista){
        int total = 0;
        
        for(int i = 0;i < lista.size();i++){
            total += lista.get(i);
        }
        
        System.out.println("Total de ventas: " + total);
        
    }
    
    /**
     * Método que muestra el total de ventas 
     * de los meses que contienen a.
     * 
     * @param lista
     * @param vMeses 
     */
    public static void mostrarTotalVentasMesesA(ArrayList<Integer> lista, String[] vMeses){        
        int suma = 0;
        for(int i = 0;i < lista.size();i++){
            //Si retorna negativo quiere decir que no están ni el caracter 'a' ni el 'A' en el mes
            if ((vMeses[i].toLowerCase().indexOf('a') >= 0)){  
                suma = suma + lista.get(i);
            }
        }
        System.out.println("Total ventas de meses con A: "+suma);
    }
    
    /**
     * Método que muestra las ventas del mes con mayores ventas.
     * 
     * @param lista
     * @param vMeses 
     */
    public static void mostrarMejoresMeses(ArrayList<Integer> lista, String[] vMeses){        
        int mayor = -1;
        for(Integer num : lista) {
            if(num > mayor) {
                mayor = num;
            }
        }

        System.out.println("Los mejores meses son: ");
        for(int i = 0;i < lista.size();i++){
            if  (lista.get(i) == mayor){
                System.out.println("-- "+vMeses[i]+" con "+mayor+" ventas --");
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] vMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        ArrayList<Integer> lista = new ArrayList<>();
        int opcion = -1; 
        
        do{
            try {
                System.out.println("1. Introducir ventas coches para cada año.");
                System.out.println("2. Mostrar ventas.");
                System.out.println("3. Mostrar ventas al revés.");
                System.out.println("4. Mostrar total de ventas.");
                System.out.println("5. Mostrar ventas de meses con 'a'.");
                System.out.println("6. Mostrar mes/meses con más ventas.");
                System.out.println("7. Salir.");
                System.out.print("   Opción: ");
                
                opcion = pedirInt();
                switch(opcion){
                    case 1:
                        rellenarLista(lista, vMeses);
                        break;
                    case 2:
                        mostrarLista(lista, vMeses);
                        break;
                    case 3:
                        mostrarListaAlReves(lista, vMeses);
                        break;
                    case 4:
                        mostrarTotalVentas(lista);
                        break;
                    case 5:
                        mostrarTotalVentasMesesA(lista, vMeses);
                        break;
                    case 6:
                        mostrarMejoresMeses(lista, vMeses);
                        break;
                    case 7:
                        System.out.println("¡Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }
            } catch(InputMismatchException e) {
                System.out.println("Error. Introduce un número, por favor.");
            }
        }while(opcion != 7);
    }
    
}
