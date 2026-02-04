/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07t7;

/**
 *
 * @author admin
 */
public class Ejercicio07T7 {

    //Inicializa el vector a -1
    public static void inicializarVector(int[] vMayores){
        for(int i = 0;i < vMayores.length;i++){
            vMayores[i] = -1;
        }
    }
    
    //Inserta num en el vector, en caso de ser mayor que todos los elementos
    public static void insertarVector(int[] vMayores, int num){
        boolean enc = false;
        int pos = 0, i = 0;
        //Mientras no encuentre sitio donde insertarlo y no llegue al final
        while(!enc && i < vMayores.length){  
            if  (num > vMayores[i]){
                pos = i;
                enc = true;
            }
            i++;
        }
        //Si hemos encontrado la posición donde insertar el dato
        if (enc){
            //Desplazo una posición a la derecha los valores de las celdas
            //para dejar hueco en la posición donde tenemos que insertar num           
            //Lo hacemos de atrás hacia adelante para no sobrepasar las dimensiones
            //del vector
            for(i = vMayores.length - 1;i > pos; i--){
                vMayores[i] = vMayores[i - 1];
            }
            vMayores[pos] = num;
        }
    }
    
    public static void mostrarMayores(int[] vMayores){
        System.out.println("10 MAYORES NÚMEROS ALMACENADOS: ");
        for(int i = 0;i < 10;i++){
            System.out.print("["+vMayores[i]+"]");
        }
    }
    

    public static void main(String[] args) {
        int[] vMayores = new int[15];
        int aleatorio;
        inicializarVector(vMayores);
        //Generamos 15 aleatorios
        for(int i = 0;i < 15;i++){
            aleatorio = (int) (Math.floor((Math.random()*51)));
            System.out.println("Insertando... "+aleatorio);
            insertarVector(vMayores, aleatorio);
        }
        mostrarMayores(vMayores);
    }
    
}
