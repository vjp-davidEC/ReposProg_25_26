
package ejercicio09t7;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ejercicio09T7 {   
    
    public static int pedirNumero(){
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Introduce un número:");
        num = teclado.nextInt();
        return num;
    }
    
    public static int calcularCifrasNumero(int num){
        int contador = 0;
        while(num > 0){
            num = num/10;
            contador++;
        }
        return contador;
    }
    
    public static void rellenarVector(int vNum[], int num){
        int i, resto;
        for(i = 0;i < vNum.length;i++){
            resto = num % 10;
            vNum[i] = resto; 
            num = num / 10;
        }
    }
    
    public static void mostrarVector(int vNum[]){
        int i;
        for(i = 0;i < vNum.length;i++){
            System.out.print(vNum[i]);
        }
        System.out.println("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = pedirNumero();
        int tamanio = calcularCifrasNumero(num);
        int[] vNum = new int [tamanio];
        rellenarVector(vNum, num);
        mostrarVector(vNum);
    }

}
