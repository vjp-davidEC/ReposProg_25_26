/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18t7;

/**
 *
 * @author admin
 */
public class Ejercicio18T7 {

    //Inicializa el vetor con -1
    public static void inicializarVector(int vNum[]){
        int i;
        for(i = 0;i < vNum.length;i++){
            vNum[i] = -1;
        }
    }
    
    public static void insertarDato(int vNum[], int num){
        int i, j; 
        boolean enc;
        i = 0;
        enc = false;
        //Mientras no encuentre la posición y no llegue al final
        while((i < vNum.length)&&(!enc)){
            if  ((num < vNum[i])||(vNum[i] == -1)){
                enc = true;
            }
            else{
                i++;
            }
        }
        //Siempre que lleguemos a este punto es porque se ha encontrado la posición
        for(j = vNum.length-1;j > i;j--){
            vNum[j] = vNum[j-1];
        }
        vNum[i] = num;
    }
    
    //Rellena vNum con los valores de vNum1 y vNum2
    public static void fusionarVector(int vNum1[], int vNum2[], int vNum[]){
        int i;
        for(i = 0;i < 5;i++){
            insertarDato(vNum, vNum1[i]);
            insertarDato(vNum, vNum2[i]);
        }
    }
    
    //Muestra el contenido del vector
    public static void mostrarVector(int vNum[]){
        int i;
        for(i = 0;i < vNum.length;i++){
            System.out.print("["+vNum[i]+"]");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vNum = new int[10];
        int[] vNum1 = {4, 2, 5, 9, 0};
        int[] vNum2 = {7, 10, 12, 3, 1};
        inicializarVector(vNum);
        fusionarVector(vNum1, vNum2, vNum);
        mostrarVector(vNum);
    }
    
}
