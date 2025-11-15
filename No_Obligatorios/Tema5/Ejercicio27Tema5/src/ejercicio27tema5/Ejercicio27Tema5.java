/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27tema5;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio27Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int papas, chocos, comensales;//Variables
        
        Almacen almacen = new Almacen();//Objeto Almacen que se crea para gestionar los ingredientes disponibles
        
        System.out.print("Bienvenido a Mr. Fajitas");
        System.out.print("\nIntroduce los kilos de papas que quieres aniadir: ");//Pedir al usuario la cantidad de papas
        papas = entrada.nextInt();
        almacen.addPapas(papas);//Se aniade las papas al almacen
        
        System.out.print("Introduce los kilos de chocos que quieres aniadir: ");//Pedir al usuario la cantidad de chocos
        chocos = entrada.nextInt();
        almacen.addChocos(chocos);//Se aniade los chocos al almacen
        
        System.out.println("\nEstado del almacen: ");
        almacen.showChocos();//Muestra los kilos de chocos disponibles
        almacen.showPapas();//Muestra los kilos de papas disponibles
        
        comensales = almacen.getComersales();//Calcular cuantos comensales se pueden atender
        System.out.println("Con los ingredientes que nos quedan podemos atender a " + comensales + " clientes");//Resultado
    }
}