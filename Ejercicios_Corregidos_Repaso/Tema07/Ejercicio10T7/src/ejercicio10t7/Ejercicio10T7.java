/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10t7;

/**
 *
 * @author Quique Pineda
 */
public class Ejercicio10T7 {

    final static int MAX = 10;
    
    //Generamos un entero aleatorio entre 1 y 8 y lo retornamos.
    public static int generarAleatorio(){
        int aleatorio;
        aleatorio = (int)(Math.floor((Math.random() * 8) + 1));
        return aleatorio;
    }

    //Rellena el vector que le llega por parámetros
    public static void rellenarVector(int vNum[]){
        int i;
        for(i = 0;i <vNum.length;i++){
            //Almacenamos el aleatorio en la celda i del vector vNum
            vNum[i] = generarAleatorio();
        }
    }
    
    //Muestra los valores que almacena el vector
    public static void mostrarVector(int vNum[]){
        int i;
        for(i = 0;i < vNum.length;i++){
            System.out.print("["+vNum[i]+"]");
        }
        System.out.print("\n");  //Para salto de línea
    }
    
    public static boolean buscarRepetido(int vNum[], int num, int pos){
        int i;
        boolean enc = false;
        i = pos;
        //Mientras no llegue al final y no haya encontrado ningún repetido, sigue buscando
        while((i < vNum.length)&&(!enc)){
            if  (vNum[i] == num){  //Si el valor de la celda es igual al número que estamos buscando
                enc = true;
            }
            i++;
        }
        return enc;
    }
    
    //Método que sustituye los valores repetidos por 0
    public static void cambiarPorCeros(int vNum[]){
        int i, j, num;
        boolean repetido;
        for(i = 0;i < vNum.length;i++){
            if  (vNum[i] != 0){
                num = vNum[i];
                //Llamo al buscarRepetido con el vector y el número a buscar
                repetido = buscarRepetido(vNum, num, i + 1);
                if  (repetido){
                    for(j = i;j < vNum.length;j++){
                        if  (vNum[j] == num){
                            vNum[j] = 0;
                        }
                    }
                }
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vNum = new int[MAX];
        rellenarVector(vNum);
        mostrarVector(vNum);
        cambiarPorCeros(vNum);
        mostrarVector(vNum);
    }
    
}
