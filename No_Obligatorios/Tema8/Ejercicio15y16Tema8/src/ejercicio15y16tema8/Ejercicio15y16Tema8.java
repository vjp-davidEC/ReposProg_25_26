/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15y16tema8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio15y16Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Se crea un array de 5 peliculas
        Pelicula[] peliculas = new Pelicula[1];
        
        int opcion;
        
        do {            
            mostrarMenu();
            opcion = entrada.nextInt();
            
            switch(opcion){//Se ejecuta la opción elegida
                case 1 -> rellenarPeliculas(peliculas);
                case 2 -> mostrarPeliculasYSocios(peliculas);
                case 3 -> mostrarPeliculaMasRentable(peliculas);
                case 4 -> mostrarPeliculaMenosRentable(peliculas);
                case 5 -> pedirNombrePelicula(peliculas);
                case 6 -> contarNumeroSocios(peliculas);
                case 7 -> mostrarSociosPorLetra(peliculas);
                case 8 -> mostrarPeliculasPorTexto(peliculas);
                case 9 -> cambiarAporE(peliculas);
                case 10 -> convertirTitulosMayusculas(peliculas);
                case 11 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while (opcion != 11);//No termina hasta que elija el 11
    }
    
    //Metodo que muestra el menu
    public static void mostrarMenu(){
        System.out.println("\n--MENU--");
        System.out.println("1. Rellenar peliculas y socios");
        System.out.println("2. Mostrar peliculas y socios");
        System.out.println("3. Mostrar la pelicula mas rentable");
        System.out.println("4. Mostrar la pelicula menos rentable");
        System.out.println("5. Buscar pelicula y mostrar beneficio + socios");
        System.out.println("6. Contar socios con precio abonado mayor al indicado");
        System.out.println("7. Mostrar socios con empiecen por una letra");
        System.out.println("8. Mostrar peliculas que empiecen por un texto");
        System.out.println("9. Cambiar 'a' por 'e' en la ultima pelicula");
        System.out.println("10. Convertir titulos a mayusculas");
        System.out.println("11. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    //Metodo que rellena los datos de las peliculas y los socios
    public static void rellenarPeliculas(Pelicula[] peliculas) {
        System.out.println("");
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < peliculas.length; i++) {
            System.out.println("--PELICULA " + (i + 1) + "--");
            System.out.print("Titulo: ");
            String titulo = entrada.nextLine();
            System.out.print("Coste de licencia: ");
            float coste = entrada.nextFloat();
            entrada.nextLine();
            Pelicula p = new Pelicula(titulo, coste);
            p.rellenarSocios();
            peliculas[i] = p;
        }
    }
    
    //Metodo que muestra las peliculas y los socios
    public static void mostrarPeliculasYSocios(Pelicula[] peliculas) {
        System.out.println("");
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i] != null) {
                System.out.println("--PELICULA " + (i + 1) + "--");
                System.out.println("Titulo: " + peliculas[i].getTitulo());
                System.out.println("Coste licencia: " + peliculas[i].getCosteLicencia());
                System.out.println("--Socios--");
                peliculas[i].mostrarSocios();
            }
        }
    }
    
    //Metodo que muestra la pelicula mas rentable de ver
    public static void mostrarPeliculaMasRentable(Pelicula[] peliculas) {
        System.out.println("");
        Pelicula mejor = peliculas[0];
        float max = mejor.calcularBeneficioNeto();

        for (int i = 1; i < peliculas.length; i++) {
            float beneficio = peliculas[i].calcularBeneficioNeto();
            if (beneficio > max) {
                max = beneficio;
                mejor = peliculas[i];
            }
        }

        System.out.println("La pelicula mas rentable es: " + mejor.getTitulo() + " con beneficio: " + max);
    }
    
    //Metodo que muestra la pelicula menos rentable de ver
    public static void mostrarPeliculaMenosRentable(Pelicula[] peliculas) {
        System.out.println("");
        Pelicula peor = peliculas[0];
        float min = peor.calcularBeneficioNeto();

        for (int i = 1; i < peliculas.length; i++) {
            float beneficio = peliculas[i].calcularBeneficioNeto();
            if (beneficio < min) {
                min = beneficio;
                peor = peliculas[i];
            }
        }
        System.out.println("La pelicula menos rentable es: " + peor.getTitulo() + " con beneficio: " + min);
    }
    
    //Metodo que pide el nombre de la pelicula y muestra los beneficios y los socios
    public static void pedirNombrePelicula(Pelicula[] peliculas) {
        System.out.println("");
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el titulo a buscar: ");
        String titulo = entrada.nextLine();

        boolean encontrado = false;

        //Se busca la película por título
        for (Pelicula p : peliculas) {
            if (p != null && p.getTitulo().equalsIgnoreCase(titulo)) {

                //Se usa los métodos de la clase Pelicula
                float beneficio = p.calcularBeneficioNeto();

                System.out.println("Beneficio neto: " + beneficio);
                System.out.println("--Socios--");
                p.mostrarSocios();

                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No existe esa pelicula");
        }
    }
    
    //Metodo que cuenta los numeros de socios que han abonado mas que el introducido
    public static void contarNumeroSocios(Pelicula[] peliculas) {
        System.out.println("");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce precio minimo: ");
        float minimo = entrada.nextFloat();
        int total = 0;

        for (Pelicula p : peliculas) {
            if (p != null) {
                total += p.contarSociosConPrecioMayor(minimo);
            }
        }
        System.out.println("Hay " + total + " socios que han abonado mas de " + minimo);
    }
    
    //Metodo que muestra los socios por la letra
    public static void mostrarSociosPorLetra(Pelicula[] peliculas) {
        System.out.println("");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una letra: ");
        char letra = entrada.nextLine().charAt(0);

        for (Pelicula p : peliculas) {
            if (p != null) {
                p.mostrarSociosPorLetra(letra);
            }
        }
    }
    
    //Metodo que muestra las peliculas por texto
    public static void mostrarPeliculasPorTexto(Pelicula[] peliculas){
        System.out.println("");
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce texto inicial: ");
        String texto = entrada.nextLine();

        for(Pelicula p : peliculas){
            if(p != null && p.empiezaPorTexto(texto)){
                System.out.println(p.getTitulo());
            }
        }
    }
    
    //Metodo que cambia la letra 'a' por la 'e'
    public static void cambiarAporE(Pelicula[] peliculas) {
        System.out.println("");
        Pelicula ultima = peliculas[peliculas.length - 1];
        if (ultima != null) {
            ultima.cambiarAporE();
        }
    }
    
    //Metodo que muestra los titulos en mayusculas
    public static void convertirTitulosMayusculas(Pelicula[] peliculas) {
        System.out.println("");
        for (Pelicula p : peliculas) {
            if (p != null) {
                p.convertirTituloMayusculas();
                System.out.println("Nuevo titulo: " + p.getTitulo());
            }
        }
    }
}