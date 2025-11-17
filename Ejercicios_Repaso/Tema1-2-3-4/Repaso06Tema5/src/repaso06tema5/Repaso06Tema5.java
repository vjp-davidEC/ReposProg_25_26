/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso06tema5;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Repaso06Tema5 {

    /**
     */
    //Constantes 
    public static int numeroGeneral = 1;
    public static int numeroPreferente = 1;
    public static void main(String[] args) {
        
        //Variable 
        int opcion;
        do {//Bucle que se repite hasta que el usuario elija salir 
            mostrarMenu();//Mostrar el menú en pantalla 
            opcion = pedirOpcion();//Pedir la opción al usuario 
            switch(opcion){//Evaluar la opción 
                case 1:
                    generarNumeroGeneral();//Generar número de atención general 
                    break;
                case 2:
                    generarNumeroPreferente();//Generar número de atención preferente 
                    break;
                case 3:
                    System.out.println("Gracias por usar el sistema del banco");
                    break;
                default:
                    System.out.println("Opcion invalida, intentalo de nuevoo...");
                    System.out.println("");
            }
        } while(opcion != 3);//Condición de salida 
    }

    public static void mostrarMenu(){//Método que muestra el menú principal 
        System.out.println("--- BANCO ---");
        System.out.println("1. Atencion general");
        System.out.println("2. Atencion preferente");
        System.out.println("3. Salir");
        System.out.print("Elige opcion: ");
    }

    public static int pedirOpcion(){//Método para pedir la opción al usuario con control de errores 
        Scanner entrada = new Scanner(System.in);
        int numero = -1;
        try {
            numero = entrada.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Error: Debe ser un numero");
        }
        return numero;
    }

    public static void generarNumeroGeneral(){//Método para generar un número de atención general 
        System.out.println("Tu numero general es: G-" + numeroGeneral);
        System.out.println("");
        numeroGeneral++;//Incrementar el contador para el siguiente turno 
    }

    public static void generarNumeroPreferente(){//Método para generar un número de atención preferente 
        System.out.println("Tu numero preferente es: P-" + numeroPreferente);
        System.out.println("");
        numeroPreferente++;//Incrementar el contador para el siguiente turno 
    }
}
/*
    Constantes:
        numeroGeneral y numeroPreferente empiezan en 1 y se van incrementando cada vez que se genera un turno.
        Se usan como contadores globales accesibles desde cualquier método.
    do...while: mantiene el programa en ejecución hasta que el usuario elija la opción 3 (salir).
    mostrarMenu(): imprime el menú con las opciones disponibles.
    pedirOpcion(): lee la opción del usuario y controla errores si no introduce un número.
    switch (opcion): ejecuta la acción correspondiente:
        case 1: genera un número general (ejemplo: G-1, G-2, G-3…).
        case 2: genera un número preferente (ejemplo: P-1, P-2, P-3…).
        case 3: termina el programa con un mensaje de despedida.
        default: muestra un mensaje de error si la opción no es válida.
    Métodos de generación: cada uno imprime el número correspondiente y luego incrementa el contador para el siguiente turno.
*/