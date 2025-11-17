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
        
        //Variables 
        double saldo = 0; 
        int opcion = 0;
        double ingreso;
        double retiro;
        
        while (opcion != 4) {//Bucle que se repite hasta que el usuario elija la opción 4 
            System.out.println("--- Cajero Automatico ---");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: "); 
            opcion = entrada.nextInt();
            System.out.println("");
            
            switch (opcion) {//Usamos switch para ejecutar la acción según la opción elegida 
                case 1:
                    System.out.print("Cantidad a ingresar: ");
                    ingreso = entrada.nextDouble();
                    if(ingreso > 0){//Validar que sea positivo 
                        saldo = saldo + ingreso;//Sumar el sueldo 
                        System.out.println("Dinero ingresado correctamente");
                    }else{
                        System.out.println("Cantidad invalida");
                    }System.out.println("");       
                    break;
                case 2:
                    System.out.print("Cantidad a retirar: ");
                    retiro = entrada.nextDouble();
                    if(retiro > 0 && retiro <= saldo){//Validar que el retiro sea positivo y no supere el sueldo 
                        saldo = saldo - retiro;//Resta el sueldo 
                        System.out.println("Dinero retirado correctamente");
                    }else{
                        System.out.println("Cantidad invalida o saldo insuficiente");
                    }System.out.println("");       
                    break;
                case 3://Consultar sueldo 
                    System.out.println("Saldo actual: " + saldo);
                    System.out.println("");
                    break;
                case 4://Salir 
                    System.out.println("Gracias por usar el cajero");
                    System.out.println("");
                    break;
                default://Opción invalida 
                    System.out.println("Opcion no valida");
                    System.out.println("");
                    break;
            }
        }
    }
}
/*
    Scanner entrada: sirve para leer lo que el usuario escribe en la consola.
    Variables:
        saldo empieza en 0 y se va actualizando con ingresos y retiros.
        opcion controla el menú.
        ingreso y retiro guardan las cantidades introducidas por el usuario.
    while (opcion != 4): mantiene el programa en ejecución hasta que el usuario elija salir.
    switch (opcion): evalúa la opción elegida y ejecuta el bloque correspondiente:
        case 1: ingresar dinero → suma al saldo si es válido.
        case 2: retirar dinero → resta del saldo si hay suficiente.
        case 3: muestra el saldo actual.
        case 4: termina el programa con un mensaje de despedida.
        default: controla errores si el usuario escribe un número que no está en el menú.
*/