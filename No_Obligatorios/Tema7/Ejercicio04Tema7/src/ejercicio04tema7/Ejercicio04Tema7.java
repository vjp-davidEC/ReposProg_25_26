/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04tema7;

/**
 *
 * @author alumno
 */
public class Ejercicio04Tema7 {

    /**
     * @param args the command line arguments
     */
    //Constantes que sirve para ponerlas en vez de poner "matriz.length"
    public final static int FIL = 4;
    public final static int COL = 3;
    
    public static void main(String[] args) {
        int[][] matriz = new int[FIL][COL];
        
        numerosAleatorio(matriz);
        mostrarNumerosPares(matriz);
    }
    
    //Metodo que calcula los 12 numeros aleatorios entre 100 y 200
    public static void numerosAleatorio(int[][] matriz){
        for(int i = 0; i < FIL; i++){
            for(int j = 0; j < COL; j++){
                matriz[i][j] = (int)(Math.random() * 101) + 100;//Aleatorio entre 100 y 200
            }
        }
    }
    
    //Metodo que muestra los numeros pares de la matriz
    public static void mostrarNumerosPares(int[][] matriz){
        System.out.println("\n--NUMEROS PARES--");
        for(int i = 0; i < FIL; i++){
            for(int j = 0; j < COL; j++){
                if( matriz[i][j] % 2 == 0){//Se calcula para saber si es par = 0
                System.out.print(matriz[i][j] + "\n");
                }
            }
        }
    }
}
