/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11t7;

/**
 *
 * @author Usuario
 */
public class Ejercicio11T7 {

    //Busca el número "n" en el vector. Si lo encuentra, retorna true. Si no, retorna false.
    public static boolean esRepetido(int[] vNum, int n){
        int i = 0;
        boolean enc = false;
        while((i < vNum.length)&&(!enc)){
            if  (vNum[i] == n){
                enc = true;
            }
            i++;
        }
        return enc;
    }
    
    //Genera un número aleatorio entre 0 y 9
    public static int generarAleatorio(){
        double aleatorioDouble;
        int aleatorio;
        aleatorioDouble = Math.floor((Math.random()*10));
        aleatorio = (int)aleatorioDouble;
        return aleatorio;
    }
    
    //Inicializa las celdas del vector con -1, puesto que por defecto las pone a 0 y 0 es uno de los posibles aleatorios generados.
    public static void inicializarArray(int[] vNum){
        for(int i = 0;i < vNum.length;i++){  //Para cada celda del vector
            vNum[i] = -1;
        } 
    }
    
    //Rellena un vector sin números repetidos
    public static void rellenarArraySinRepetidos(int[] vNum){
        int n;
        boolean repe;
        for(int i = 0;i < vNum.length;i++){  //Para cada celda del vector
            do{  //Generamos un número hasta que encontremos uno NO repetido
                n = generarAleatorio();
                repe = esRepetido(vNum, n);
            }while(repe);
            vNum[i] = n;
        } 
    }
    
    //Muestra el vector
    public static void mostrarVector(int[] vNum){
        for(int i = 0;i < vNum.length;i++){
            System.out.println("["+vNum[i]+"]");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vNum = new int[10];
        inicializarArray(vNum);
        rellenarArraySinRepetidos(vNum);
        mostrarVector(vNum);
    }
    
}
