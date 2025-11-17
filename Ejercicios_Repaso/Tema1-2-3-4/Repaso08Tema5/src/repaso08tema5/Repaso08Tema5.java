/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso08tema5;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author DAVID
 */
public class Repaso08Tema5 {

    /**
     */
    //Constantes 
    public static int numeroMedicamento = 1;
    public static int numeroReceta = 1;
    public static void main(String[] args) {
        
        //Variables 
        int opcion;
        do {//Bucle que se repite hasta que el usuario elija salir 
            mostrarMenu();//Mostrar el menú en pantalla 
            opcion = pedirOpcion();//Pedir la opción al usuario 
            switch(opcion){//Evaluar la opción 
                case 1:
                    generarNumeroMedicamento();//Generar número de turno para medicamento 
                    break;
                case 2:
                    generarNumeroReceta();//General número de turno para receta 
                    break;
                case 3:
                    System.out.println("Gracias por visitar la farmacia!");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while(opcion != 3);//Condición de salida 
    }

    public static void mostrarMenu(){//Método que muestra el menú principal 
        System.out.println("---FARMACIA---");
        System.out.println("1. Comprar medicamento");
        System.out.println("2. Recoger receta");
        System.out.println("3. Salir");
        System.out.print("Elige opcion: ");
    }

    public static int pedirOpcion(){//Método para pedir la acción al usuario con control de errores 
        Scanner entrada = new Scanner(System.in);
        int numero = -1;
        try {
            numero = entrada.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Error: Debe ser un numero");
        }
        return numero;
    }

    public static void generarNumeroMedicamento(){//Método para generar un número de turno de medicamento 
        System.out.println("Tu numero de medicamento es: M-" + numeroMedicamento);
        System.out.println("");
        numeroMedicamento++;//Incrementar el contador para el siguiente turno 
    }

    public static void generarNumeroReceta(){//Método para generar un número de turno de receta 
        System.out.println("Tu numero de receta es: R-" + numeroReceta);
        System.out.println("");
        numeroReceta++;//Incrementar el contador para el siguiente turno 
    }
}
/*
    Constantes:
        numeroMedicamento y numeroReceta empiezan en 1 y se van incrementando cada vez que se genera un turno.
        Se usan como contadores globales accesibles desde cualquier método.
    do...while: mantiene el programa en ejecución hasta que el usuario elija la opción 3 (salir).
    mostrarMenu(): imprime el menú con las opciones disponibles.
    pedirOpcion(): lee la opción del usuario y controla errores si no introduce un número.
    switch (opcion): ejecuta la acción correspondiente:
        case 1: genera un número de medicamento (ejemplo: M-1, M-2, M-3…).
        case 2: genera un número de receta (ejemplo: R-1, R-2, R-3…).
        case 3: termina el programa con un mensaje de despedida.
        default: muestra un mensaje de error si la opción no es válida.
    Métodos de generación: cada uno imprime el número correspondiente y luego incrementa el contador para el siguiente turno.
*/