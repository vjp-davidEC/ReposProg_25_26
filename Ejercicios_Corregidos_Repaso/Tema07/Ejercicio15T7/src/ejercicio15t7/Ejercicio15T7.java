/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15t7;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio15T7 {

    //Generamos un entero aleatorio entre 10 y 100 y lo retornamos.
    public static int generarAleatorio(){
        int aleatorio;
        aleatorio = (int)(Math.floor(Math.random() * 91) + 10);
        return aleatorio;
    }
    
    //Rellena el vector con números aleatorios
    public static void rellenarVentas(int vVentas[]){
        int i;
        for(i = 0;i < vVentas.length;i++){
            vVentas[i] = generarAleatorio();
        }
    }
    
    //Muestra el valor de las celdas del vector
    public static void mostrarVentas(int vVentas[]){
        int i;
        for(i = 0;i < vVentas.length;i++){
            System.out.print("["+vVentas[i]+"]");
        }
    }

    //Muestra el valor de las celdas del vector a la inversa: del final al principio
    public static void mostrarVentasInversa(int vVentas[]){
        int i;
        for(i = vVentas.length - 1;i >= 0;i--){
            System.out.print("["+vVentas[i]+"]");
        }
    }
    
    //Muestra el total de las ventas (La suma de todas las celdas del vector)
    public static void mostrarVentasTotales(int vVentas[]){
        int i, suma = 0;
        for(i = 0;i < vVentas.length;i++){
            suma = suma + vVentas[i];
        }
        System.out.print("\n Ventas totales: "+suma);
    }
    
    //Muestra el total de las ventas de los meses pares
    public static void mostrarVentasTotalesMesesPares(int vVentas[]){
        int i, suma = 0;
        for(i = 0;i < vVentas.length;i++){
            if  (((i + 1) % 2) == 0){
                suma = suma + vVentas[i];
            }
        }
        System.out.print("\n Ventas totales: "+suma);
    }
    
    //Muestra el mes con más ventas
    public static void mostrarMejorMes(int vVentas[]){
        //Declaramos un vector de Meses
        String[] vMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int i, mes = 0, mayor = vVentas[0];
        for(i = 1;i < vVentas.length;i++){
            if  (vVentas[i] > mayor){
                mayor = vVentas[i];
                mes = i;
            }
        }
        System.out.println("El mejor mes es "+vMeses[mes]+" con "+mayor+" ventas");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vVentas = new int[12];
        int opc;
        do{
            System.out.println("\n  MENU");
            System.out.println("1. Rellenar Ventas");
            System.out.println("2. Mostrar Ventas");
            System.out.println("3. Mostrar ventas al revés");
            System.out.println("4. Ventas totales");
            System.out.println("5. Ventas totales meses pares");
            System.out.println("6. Mes con más ventas");
            System.out.println("7. Salir");
            System.out.print("   Opción: ");
            opc = teclado.nextInt();
            switch(opc){
                case 1:
                    rellenarVentas(vVentas);
                    break;
                case 2:
                    mostrarVentas(vVentas);
                    break;
                case 3:
                    mostrarVentasInversa(vVentas);
                    break;
                case 4:
                    mostrarVentasTotales(vVentas);
                    break;
                case 5:
                    mostrarVentasTotalesMesesPares(vVentas);
                    break;
                case 6:
                    mostrarMejorMes(vVentas);
                    break;
                case 7:
                    System.out.print("¡Hasta la próxima!");
                    break;
                default:
                    System.out.print("Opción incorrecta");
            }
        }while(opc != 7);
        
    }
    
}
