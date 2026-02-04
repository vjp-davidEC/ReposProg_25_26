/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14t7;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio14T7 {

    public static int pedirNumero(){
        Scanner teclado = new Scanner(System.in);
        int num;
        num = teclado.nextInt();
        return num;
    }
    
    //Rellena el vector que le llega por parámetros
    public static void rellenarMatriz(int mTemperaturas[][]){
        int i, j;
        for(i = 0;i < mTemperaturas.length;i++){
            for(j = 0;j < mTemperaturas[0].length;j++){
                System.out.print("Temperatura para semana "+(i+1)+", día "+(j+1));
                mTemperaturas[i][j] = pedirNumero();
            }
        }
    }

    //Muestra la matriz que le llega por parámetros
    public static void mostrarMatriz(int mTemperaturas[][]){
        int i, j;
        for(i = 0;i < mTemperaturas.length;i++){
            for(j = 0;j < mTemperaturas[0].length;j++){
                System.out.print("["+mTemperaturas[i][j]+"]");
            }
            System.out.print("\n");
        }
    }
    
    //Retorna la media del contenido de las celdas
    public static float calcularMedia(int mTemperaturas[][]){
        int i, j, suma = 0;
        float media = 0;
        for(i = 0;i < mTemperaturas.length;i++){
            for(j = 0;j < mTemperaturas[0].length;j++){
                suma = suma + mTemperaturas[i][j];
            }
        }
        media = (float) suma / (mTemperaturas.length * mTemperaturas[0].length);
        return media;
    }
    
    //Muestra los días más calurosos del mes (las celdas que tienen el número mayor)
    public static void diasMasCaluroso(int mTemperaturas[][]){
        String[] vNombres = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int i, j, max = mTemperaturas[0][0];
        //Buscamos la temperatura más alta
        for(i = 0;i < mTemperaturas.length;i++){
            for(j = 0;j < mTemperaturas[0].length;j++){
                if  (mTemperaturas[i][j] > max){
                    max = mTemperaturas[i][j];
                }
            }
        }
        //Mostramos los días con la temperatura más lata
        for(i = 0;i < mTemperaturas.length;i++){
            for(j = 0;j < mTemperaturas[0].length;j++){
                if  (mTemperaturas[i][j] == max){
                    System.out.println("    El "+vNombres[j]+" de la semana "+(i+1)+" con "+max+" grados.");
                }
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Nos creamos un vector de 4 filas (semanas) y 7 columnas (dias de la semana)
        int[][] mTemperaturas = new int[4][7];
        Scanner teclado = new Scanner(System.in);
        int opc;
        do{
            System.out.println("   MENÚ");
            System.out.println("1. Rellenar temperaturas");
            System.out.println("2. Mostrar temperaturas");
            System.out.println("3. Temperatura media");
            System.out.println("4. Día más caluroso");
            System.out.println("5. Salir");
            System.out.print("   Opción: ");
            opc = teclado.nextInt();
            switch(opc){
                case 1:
                    rellenarMatriz(mTemperaturas);
                    break;
                case 2:
                    mostrarMatriz(mTemperaturas);
                    break;
                case 3:
                    System.out.println("Media: "+calcularMedia(mTemperaturas));
                    break;
                case 4:
                    diasMasCaluroso(mTemperaturas);
                    break;
                case 5:
                    System.out.println("Gracias por su visita.");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        }while(opc != 5);
    }
    
}
