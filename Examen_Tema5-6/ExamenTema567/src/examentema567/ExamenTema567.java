/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examentema567;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ExamenTema567 {

    /**
     * @param args the command line arguments
     */
    public static final int FIL = 3;
    public static final int COL = 3;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Array donde guardo las 9 plazas
        Coche[] plazaGaraje = new Coche[9];

        int opcion;

        do {
            mostrarMenu();
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 ->
                    aparcarCoche(plazaGaraje);
                case 2 ->
                    mostrarPlazasLibres(plazaGaraje);
                case 3 ->
                    mostrarDatosCoches(plazaGaraje);
                case 4 ->
                    pedirTexto(plazaGaraje);
                case 5 ->
                    buscarMatricula(plazaGaraje);
                case 6 ->
                    recorrerYMostrar(plazaGaraje);
                case 7 ->
                    System.out.println("Saliendo del programaa...");
                default ->
                    System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while (opcion != 7);
    }

    //Metodo que muestra por pantalla el menu
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. Aparcar coche");
        System.out.println("2. Mostrar plazas de garaje libres");
        System.out.println("3. Mostrar los datos de todos los coches aparcados");
        System.out.println("4. Pedir texto y construir String");
        System.out.println("5. Buscar por matricula");
        System.out.println("6. Mostrar plazas libre y ocupadas");
        System.out.println("7. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }

    //Metodo que pide al usuario un dato y comprueba las cosas
    public static void aparcarCoche(Coche[] vector) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        int plaza;

        System.out.println("Introduce los datos de un coche");
        System.out.print("Nombre del titular: ");
        String nombre = entrada.nextLine();
        System.out.print("Matricula del coche: ");
        String matri = entrada.nextLine();
        Coche coche = new Coche(nombre, matri);

        do {
            System.out.print("Introduce la plaza en la que quieres aparcar: ");
            plaza = entrada.nextInt();
            try {
                if (plaza < 0 || plaza > 9) {
                    System.out.println("Error: La plaza introducida no existe");
                } else if (plaza != plaza) {
                    System.out.println("La plaza esta ocupada");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un numero no una letra");
            }
        } while (plaza < 0 || plaza > 9);

        vector[plaza] = coche;
    }

    //Metodo que muestra las plazas libres
    public static void mostrarPlazasLibres(Coche[] vector) {
        System.out.println();
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == null) {
                System.out.println("La plaza libre es la " + "[" + i + "]");
            }
        }
    }

    //Metodo que muestra los datos de los coches aparcados
    public static void mostrarDatosCoches(Coche[] vector) {
        System.out.println();
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] != null) {
                System.out.println("Coche de " + vector[i].getNombreTitular() + " con matricula " + vector[i].getMatricula());
            }
        }
    }

    public static void pedirTexto(Coche[] vector) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String texto = entrada.nextLine();
        
        
    }

    //Metodo que busca la matricula
    public static void buscarMatricula(Coche[] vector) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la matricula que deseas buscar: ");
        String matri = entrada.nextLine();

        boolean encontrado = false;
        int i = 0;
        int plaza;

        while (i < vector.length && !encontrado) {
            if (vector[i] != null && vector[i].getMatricula().equalsIgnoreCase(matri)) {
                plaza = i;
                System.out.println(vector[i].toString() + " en la plaza " + plaza);
                encontrado = true;
            }
            i++;
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado ninguna matricula con esa matricula");
        }
    }

    //Metodo que muestra por matriz
    public static void recorrerYMostrar(Coche[] vector) {
        System.out.println();
        Coche[][] coche = new Coche[FIL][COL];

        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                if (coche[i][j] != null) {
                    System.out.println("[X]");
                } else {
                    System.out.println("[L]");
                }
                System.out.println();
            }
        }
    }
}