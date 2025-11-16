/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso01tema5;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Repaso01Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double saldo = 0; 
        int opcion = 0;
        double ingreso;
        double retiro;
        
        while (opcion != 4) {
            System.out.println("--- Cajero Automatico ---");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: "); 
            opcion = entrada.nextInt();
            System.out.println("");
            
            switch (opcion) {
                case 1:
                    System.out.print("Cantidad a ingresar: ");
                    ingreso = entrada.nextDouble();
                    if(ingreso > 0){
                        saldo = saldo + ingreso;
                        System.out.println("Dinero ingresado correctamente");
                    }else{
                        System.out.println("Cantidad inválida");
                    }System.out.println("");       
                    break;
                case 2:
                    System.out.print("Cantidad a retirar: ");
                    retiro = entrada.nextDouble();
                    if(retiro > 0 && retiro <= saldo){
                        saldo = saldo - retiro;
                        System.out.println("Dinero retirado correctamente");
                    }else{
                        System.out.println("Cantidad invalida o saldo insuficiente");
                    }System.out.println("");       
                    break;
                case 3:
                    System.out.println("Saldo actual: " + saldo);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    System.out.println("");
                    break;
            }
        }
    }
    
}
