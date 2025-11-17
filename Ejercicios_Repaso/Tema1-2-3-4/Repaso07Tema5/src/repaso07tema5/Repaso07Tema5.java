/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso07tema5;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author DAVID
 */
public class Repaso07Tema5 {

    /**
     */
    //Constantes 
    public static int numeroHamburguesa = 1;
    public static int numeroPizza = 1;
    public static void main(String[] args) {
        
        //Variable
        int opcion;
        do {//Bucle que se repite hasta que el usuario elija salir
            mostrarMenu();//Mostrar el menú en pantalla 
            opcion = pedirOpcion();//Pedir la opción al usuario 
            switch(opcion){//Evaluar la opción 
                case 1:
                    generarNumeroHamburguesa();//Generar número de pedido de hamburguesa 
                    break;
                case 2:
                    generarNumeroPizza();//General número de pedidos de pizza 
                    break;
                case 3:
                    System.out.println("Gracias por tu pedido!");
                    break;
                default:
                    System.out.println("Opción inválida. Intentelo de nuevoo...");
                    System.out.println("");
            }
        } while(opcion != 3);//Condición de salida 
    }

    public static void mostrarMenu(){//Método que muestra el menú principal 
        System.out.println("---FAST FOOD---");
        System.out.println("1. Hamburguesa");
        System.out.println("2. Pizza");
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

    public static void generarNumeroHamburguesa(){//Método para generar un número de pedido de hamburguesa 
        System.out.println("Tu numero de hamburguesa es: H-" + numeroHamburguesa);
        System.out.println("");
        numeroHamburguesa++;//Incrementar el contador para el siguiente pedido 
    }

    public static void generarNumeroPizza(){//Método para generar un número de pedido de pizza 
        System.out.println("Tu numero de pizza es: P-" + numeroPizza);
        System.out.println("");
        numeroPizza++;//Incrementar el contador para el siguiente pedido 
    }
}
/*
    Constantes:
        numeroHamburguesa y numeroPizza empiezan en 1 y se van incrementando cada vez que se genera un pedido.
        Se usan como contadores globales accesibles desde cualquier método.
    do...while: mantiene el programa en ejecución hasta que el usuario elija la opción 3 (salir).
    mostrarMenu(): imprime el menú con las opciones disponibles.
    pedirOpcion(): lee la opción del usuario y controla errores si no introduce un número.
    switch (opcion): ejecuta la acción correspondiente:
        case 1: genera un número de hamburguesa (ejemplo: H-1, H-2, H-3…).
        case 2: genera un número de pizza (ejemplo: P-1, P-2, P-3…).
        case 3: termina el programa con un mensaje de despedida.
        default: muestra un mensaje de error si la opción no es válida.
    Métodos de generación: cada uno imprime el número correspondiente y luego incrementa el contador para el siguiente pedido.
*/