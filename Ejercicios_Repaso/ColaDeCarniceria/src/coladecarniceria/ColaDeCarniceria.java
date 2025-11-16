/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coladecarniceria;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class ColaDeCarniceria {

    /**
     */
    //Constantes y variables
    public static final char LETRA_INICIAL = 'A';
    public static final char LETRA_FINAL = 'C';
    public static int numeroCompra = 1;
    public static int numeroPedido = 1;
    public static void main(String[] args) {
        int opcion;
        
        
        do {//Bucle que pide tantas veces hasta qu el usuario de al numero 3
            mostrarMenu();
            opcion = pedirOpcion();
            switch (opcion){//Ejecutar segun la opcion deseada
                case 1:
                    generarNumeroEsperaCompra();
                    System.out.println("Mostrar: " + generarLetraAleatoria(LETRA_INICIAL, LETRA_FINAL));
                    break;
                case 2:
                    generarNumeroEsperaPedido();
                    System.out.println("Mostrar: " + generarLetraAleatoria(LETRA_INICIAL, LETRA_FINAL));
                    break;
                case 3:
                    System.out.println("Muchas graciasss, que tengas un buen dia");
                    break;
                default:
                    System.out.println("Opcion invalida. Intentalo de nuevoo...");
            }
        } while (opcion !=3);//Termina cuando el usuario ponga la opcion 3
    }
    public static void mostrarMenu(){//Metodo que muestra el menu
            System.out.println("---CARNICERIA---");
            System.out.println("1. Comprar");
            System.out.println("2. Recoger pedido");
            System.out.println("3. Salir");
            System.out.print("Elegir opcion: ");
    }
    public static int pedirOpcion(){//Metodo para pedir el numero al usuario y si se equivoca dar un error y devolverselo
        Scanner entrada = new Scanner(System.in);
        int numero = -1;
        try {
            numero = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe de ser un numero");
        }
        return numero;
    }
    public static char generarLetraAleatoria(char letraInicial, char letraFinal){//Metodo para generar una letra aleatoria
        return (char) (letraInicial + (int)(Math.random() * (letraFinal - letraInicial + 1)));
    }
    public static void incrementarNumeroCompra(){//Incrementrar numero de compra
        numeroCompra++;
    }
    public static void incrementarNumeroPedido(){//Incrementrar numero de pedido
        numeroPedido++;
    }
    public static void generarNumeroEsperaCompra(){//Decirle el numero e incrementrar ese numero
        System.out.println("Tu numero de compra es: C-" + numeroCompra);
        incrementarNumeroCompra();
    }
    public static void generarNumeroEsperaPedido(){//Decirle el numero e incrementrar ese numero
        System.out.println("Tu numero de pedido es: P-" + numeroPedido);
        incrementarNumeroPedido();
    }
}