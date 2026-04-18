package ejercicio23repaso06tema11;

import java.util.Scanner;

public class Ejercicio23Repaso06Tema11 {

    public static void main(String[] args) {
        Campania camp = new Campania();

        int opcion;

        do {
            mostrarMenu();
            opcion = pedirOpcion();
            switch (opcion) {
                case 1 -> camp.aniadirDonacion();//Añadir donacion
                case 2 -> camp.mostrarDonaciones();//Mostrar todas las donaciones
                case 3 -> camp.buscarPorNombre();//Buscar por el nombre
                case 4 -> System.out.print("\nNumero de donaciones: " + camp.numeroDonaciones() + "\n");//Total de donaciones
                case 5 -> System.out.print("\nTotal recaudado: " + camp.totalRecaudado() + " Euros" + "\n");//Total recaudado
                case 6 -> camp.ordenarDonaciones();//Ordenacion
                case 7 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentelo de nuevo");
            }
        } while (opcion != 7);
    }

    //Metodo que muestra por pantalla el menu
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. Aniadir donacion");
        System.out.println("2. Mostrar donaciones");
        System.out.println("3. Buscar por nombre");
        System.out.println("4. Numero de donaciones");
        System.out.println("5. Total recaudado");
        System.out.println("6. Ordenar donaciones");
        System.out.println("7. Salir del programa");
        System.out.print("Elige una opcion: ");
    }
    
    
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
}