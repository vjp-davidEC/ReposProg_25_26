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
        Pelicula[] peliculas = new Pelicula[5];
        
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
    public static void rellenarPeliculas(Pelicula[] peliculas){
        System.out.println("");
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0; i < peliculas.length; i++){
            System.out.println("--PELICULA " + (i + 1) + "--");
            
            System.out.print("Titulo: ");
            String titulo = entrada.nextLine();
            System.out.print("Coste de licencica: ");
            float coste = entrada.nextFloat();
            entrada.nextLine();
            
            //Se crea la película con su título y coste
            Pelicula p = new Pelicula(titulo, coste);
            
            System.out.println("Introduce los 4 socios que han asistido: ");
            Socios[] socios = new Socios[4];
            
            for(int j = 0; j < socios.length; j++){
                System.out.print("Nombre socio " + (j + 1) + ": ");
                String nombre = entrada.nextLine();
                System.out.print("Precio abonado: ");
                float precio = entrada.nextFloat();
                entrada.nextLine();
                
                //Se crea cada socio
                socios[j] = new Socios(nombre, precio);
            }
            p.setSocios(socios);//Se asignan los socios a la película
            peliculas[i] = p;//Se guarda la película en el array
        }
    }
    
    //Metodo que muestra las peliculas y los socios
    public static void mostrarPeliculasYSocios(Pelicula[] peliculas){
        System.out.println("");
        
        //Se recorre todas las películas y muestra sus datos
        for(int i = 0; i < peliculas.length; i++){
            if(peliculas[i] != null){
                System.out.println("--PELICULA " + (i + 1) + "--");
                System.out.println("Titulo: " + peliculas[i].getTitulo());
                System.out.println("Coste licencia: " + peliculas[i].getCosteLicencia());
                
                //Muestra los socios asociados a esa película
                System.out.println("Socios: ");
                for(Socios s : peliculas[i].getSocios()){
                    System.out.println(s.toString());
                }
            }
        }
    }
    
    //Metodo que muestra la pelicula mas rentable de ver
    public static void mostrarPeliculaMasRentable(Pelicula[] peliculas){
        System.out.println("");
        Pelicula mejor = peliculas[0];
        float maxBeneficio = 0f;
        float beneficio = 0f;
        
        //Se calcula el beneficio de la primera película
        for(int i = 0; i < mejor.getSocios().length; i++){
            maxBeneficio += mejor.getSocios()[i].getPrecioAbonado();
        }
        maxBeneficio -= mejor.getCosteLicencia();
        //Se comparan las demás películas
        for(int i = 1; i < peliculas.length; i++){
            for(int j = 0; j < peliculas[i].getSocios().length; j++){
                beneficio += peliculas[i].getSocios()[j].getPrecioAbonado();
            }
            beneficio -= peliculas[i].getCosteLicencia();
            
            //Si esta película tiene más beneficio, se actualiza la mejor
            if(beneficio > maxBeneficio){
                maxBeneficio = beneficio;
                mejor = peliculas[i];
            }
        }
        System.out.println("La pelicula mas rentable es: " + mejor.getTitulo() + " con beneficio: " + maxBeneficio);
    }
    
    //Metodo que muestra la pelicula menos rentable de ver
    public static void mostrarPeliculaMenosRentable(Pelicula[] peliculas){
        System.out.println("");
        Pelicula peor = peliculas[0];
        float minBeneficio = 0f;
        float beneficio = 0f;
        
        //Se calcula el beneficio de la primera película
        for(int i = 0; i < peor.getSocios().length; i++){
            minBeneficio += peor.getSocios()[i].getPrecioAbonado();
        }
        minBeneficio -= peor.getCosteLicencia();
        //Se comparan las demás películas
        for(int i = 1; i < peliculas.length; i++){
            for(int j = 0; j < peliculas[i].getSocios().length; j++){
                beneficio += peliculas[i].getSocios()[j].getPrecioAbonado();
            }
            beneficio -= peliculas[i].getCosteLicencia();
            
            //Si esta película tiene menos beneficio, se actualiza la peor
            if(beneficio < minBeneficio){
                minBeneficio = beneficio;
                peor = peliculas[i];
            }
        }
        System.out.println("La pelicula menos rentable es: " + peor.getTitulo() + " con beneficio: " + minBeneficio);
    }
    
    //Metodo que pide el nombre de la pelicula y muestra los beneficios y los socios
    public static void pedirNombrePelicula(Pelicula[] peliculas){
        System.out.println("");
        Scanner entrada = new Scanner(System.in);
        
        //Se pide el título a buscar
        System.out.print("Introduce el titulo a buscar: ");
        String titulo = entrada.nextLine();
        
        boolean encontrado = false;
        float suma;
        
        //Se busca la película por título
        for(Pelicula p: peliculas){
            if(p != null && p.getTitulo().equalsIgnoreCase(titulo)){
                //Se calcula el beneficio sumando los precios abonados
                suma = 0f;
                for(Socios s : p.getSocios()){
                    suma += s.getPrecioAbonado();
                }
                float beneficio = suma - p.getCosteLicencia();
                
                System.out.println("Beneficio neto: " + beneficio);
                System.out.println("Socios: ");
                //Se muestran los socios de esa película
                for(Socios s: p.getSocios()){
                    System.out.println(s.toString());
                }
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("No existe esa pelicula");
        }
    }
    
    //Metodo que cuenta los numeros de socios que han abonado mas que el introducido
    public static void contarNumeroSocios(Pelicula[] peliculas){
        System.out.println("");
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        
        //Se pide el precio mínimo
        System.out.print("Introduce precio minimo: ");
        float minimo = entrada.nextFloat();
        
        //Se cuentan los socios cuyo precio abonado supera el mínimo
        for(Pelicula p: peliculas){
            if(p != null){
                for(Socios s : p.getSocios()){
                    if(s.getPrecioAbonado() > minimo){
                        contador++;
                    }
                }
            }
        }
        System.out.println("Hay " + contador + " socios que han abonado mas de " + minimo);
    }
    
    //Metodo que muestra los socios por la letra
    public static void mostrarSociosPorLetra(Pelicula[] peliculas){
        System.out.println("");
        Scanner entrada = new Scanner(System.in);
        
        //Se pide la letra inicial
        System.out.print("Introduce una letra: ");
        char letra = Character.toLowerCase(entrada.nextLine().charAt(0));
        
        //Se recorren todas las películas y sus socios
        for(int i = 0; i < peliculas.length; i++){
            if(peliculas != null){
                Socios[] socios = peliculas[i].getSocios();
                for(int j = 0; j < socios.length; j++){
                    String nombre = socios[j].getNombreSocio().toLowerCase();
                    //Si el nombre empieza por la letra indicada, se muestra
                    if(nombre.charAt(0) == letra){
                        System.out.println(socios[j].toString());
                    }
                }
            }
        }
    }
    
    //Metodo que muestra las peliculas por texto
    public static void mostrarPeliculasPorTexto(Pelicula[] peliculas){
        System.out.println("");
        Scanner entrada = new Scanner(System.in);
        int iguales = 0;
        
        //Se pide el texto inicial
        System.out.print("Introduce texto inicial: ");
        String texto = entrada.nextLine().toLowerCase();
        
        //Se recorren todas las películas
        for(int i = 0; i < peliculas.length; i++){
            if(peliculas[i] != null){
                String titulo = peliculas[i].getTitulo().toLowerCase();
                //Se comparan las letras una a una
                for(int j = 0; j < texto.length(); j++){
                    if(j < titulo.length() && titulo.charAt(j) == texto.charAt(j)){
                        iguales++;
                    }
                }
                //Si todas las letras coinciden, la película empieza por ese texto
                if(iguales == texto.length()){
                    System.out.println(peliculas[i].getTitulo());
                }
            }
        }
    }
    
    //Metodo que cambia la letra 'a' por la 'e'
    public static void cambiarAporE(Pelicula[] peliculas){
        System.out.println("");
        Pelicula ultima = peliculas[peliculas.length - 1];
        
        //Se toma la última película del array
        if(ultima != null){
            String titulo = ultima.getTitulo();
            String nuevo = "";
            //Se recorre el título y se sustituyen las 'a' por 'e'
            for(int i = 0; i < titulo.length(); i++){
                char c = titulo.charAt(i);
                if(c == 'a'){
                    nuevo += 'e';
                }else{
                    nuevo += c;
                }
            }
            ultima.setTitulo(nuevo);//Se actualiza el título
            System.out.println("Nuevo titulo: " + nuevo);
        }
    }
    
    //Metodo que muestra los titulos en mayusculas
    public static void convertirTitulosMayusculas(Pelicula[] peliculas){
        System.out.println("");
        //Se recorren todas las películas y se pasa su título a mayúsculas
        for(int i = 0; i < peliculas.length; i++){
            if(peliculas[i] != null){
                String nuevo = peliculas[i].getTitulo().toUpperCase();
                peliculas[i].setTitulo(nuevo);
                System.out.println("Nuevo titulo: " + nuevo);
            }
        }
        System.out.println("-Titulos convertidos a mayusculas-");
    }
}