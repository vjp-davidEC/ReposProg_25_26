/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04t7;

/**
 *
 * @author admin
 */
public class Ejercicio04T7 {

    //Declaración de constantes
    final static int FIL = 4;
    final static int COL = 3;
    
    //Retorna un número entre 100 y 200 generado aleatoriamente
    public static int generarAleatorio(){
        double aleatorioDouble = Math.floor((Math.random()*101) + 100);  //Aleatorio entre 100 y 200
        int aleatorio = (int)aleatorioDouble;
        return aleatorio;
    }
    
    //Muestra los números pares que se encuentren en la matriz
    public static void mostrarPares(int M[][]){
        System.out.println("\nNÚMEROS PARES: ");
        for(int i = 0;i < M.length;i++){ //Tamaño filas
            for(int j = 0; j < M[i].length;j++){  //Tamaño columnas en la fila 0
                if  ((M[i][j] % 2) == 0){
                    System.out.println(M[i][j]);
                }
            }
        }
    }
    
    //Muestra la matriz
    public static void mostrarMatriz(int M[][]){
        for(int i = 0;i < M.length;i++){ //Tamaño filas
            for(int j = 0; j < M[0].length;j++){  //Tamaño columnas en la fila 0
                System.out.print("["+M[i][j]+"]");
            }
            System.out.print("\n");
        }
    }
    
    //Rellena las celdas de la Matriz
    public static void rellenarMatriz(int M[][]){
        for(int i = 0;i < M.length;i++){
            for(int j = 0; j < M[i].length;j++){
                M[i][j] = generarAleatorio();
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] M = new int[FIL][COL];
        rellenarMatriz(M);
        mostrarMatriz(M);
        mostrarPares(M);
    }
    
}
