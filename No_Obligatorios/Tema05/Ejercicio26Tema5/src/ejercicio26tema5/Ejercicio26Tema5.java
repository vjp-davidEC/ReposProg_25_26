/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26tema5;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio26Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int papas, chocos;
        int TotalPapas, TotalChocos, clientes;
        
        System.out.println("Bienvenido a Mr. Fajitas");
        System.out.print("Introduce los kilos de papas disponibles: ");//Pedir al usuario la cantidad de papas
        papas = pedirNumero();
        
        System.out.print("Introduce los kilos de chocos disponibles: ");//Pedir al usuario la cantidad de chocos
        chocos = pedirNumero();
        
        TotalPapas = papas * 3;//Calcular el total de papas que permite atender a 3 clientes
        TotalChocos = chocos * 6;//Calcular el total de chocos que permite atender a 6 clientes
        clientes = Math.min(TotalPapas, TotalChocos);//Saber cuantos clientes se pueden atender
        
        System.out.println("Con los ingredientes que nos quedan podemos atender a " + clientes + " clientes");//Resultado
    }
    
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
}