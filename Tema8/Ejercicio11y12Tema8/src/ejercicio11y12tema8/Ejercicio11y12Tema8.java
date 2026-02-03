/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11y12tema8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio11y12Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Se crea un mueble con el constructor por defecto
        Mueble mueble1 = new Mueble();
        mueble1.setDescripcion("Mesa de madera"); 
        mueble1.setPrecio(75.99);
        //Se crea un mueble con el constructor parametrizado
        Mueble mueble2 = new Mueble(167.75, "Sofa de color azul");
        
        //Se muestra la información de los muebles creados
        System.out.println("--MUEBLE-1--");
        System.out.println(mueble1.toString());
        System.out.println("--MUEBLE-2--");
        System.out.println(mueble2.toString());
        //Se modifica la descripción de ambos muebles
        mueble1.setDescripcion("Mesa de madera pequenia");
        mueble2.setDescripcion("Sofa de color negro");
        //Se vuelve a mostrar la información después de modificar
        System.out.println("\nDespues de modificar:"); 
        System.out.println(mueble1.toString());
        System.out.println(mueble2.toString());
        
        //Se crea un vector de 4 muebles
        Mueble[] vectorMueble = new Mueble[4];
        int opcion;
        
        do{
            mostrarMenu();
            opcion = entrada.nextInt();
            
            switch(opcion){//Selección de opción del menú
                case 1 -> rellenarMuebles(vectorMueble);
                case 2 -> mostrarMuebles(vectorMueble);
                case 3 -> mostrarPorPrecio(vectorMueble);
                case 4 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        }while(opcion != 4);//Repetir hasta que el usuario elija salir
    }
    
    //Método que muestra el menú por pantalla
    public static void mostrarMenu(){
        System.out.println("\n--MENU--");
        System.out.println("1. Rellenar muebles");
        System.out.println("2. Mostrar muebles");
        System.out.println("3. Mostrar muebles por precio");
        System.out.println("4. Salir");
        System.out.print("Elige una opcion: ");
    }
    
    //Método que permite rellenar los 4 muebles del vector
    public static void rellenarMuebles(Mueble[] vectorMueble){
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < vectorMueble.length; i++) {
            System.out.println("\nMueble " + (i+1));
            
            System.out.print("Descripcion: ");
            String descrip = entrada.nextLine();
            System.out.print("Precio: ");
            double precio = entrada.nextDouble();
            entrada.nextLine();//Limpiar buffer
            
            //Se crea el mueble y guardarlo en el vector
            vectorMueble[i] = new Mueble(precio, descrip);
        }
        System.out.println("Muebles rellenados correctamente");
    }
    
    //Método que muestra todos los muebles del vector
    public static void mostrarMuebles(Mueble[] vectorMueble){
        System.out.println();
        for (int i = 0; i < vectorMueble.length; i++) {
            //Si hay un mueble en esa posición, mostrarlo
            if(vectorMueble[i] != null){
                System.out.println("Mueble " + (i+1) + ": ");
                System.out.println(vectorMueble[i].toString());
            }else{
                //Si no hay mueble, indicar que está vacío
                System.out.println("Mueble " + (i+1) + ": vacio");
            }
        }
    }
    
    //Método que muestra los muebles cuyo precio es menor o igual al introducido
    public static void mostrarPorPrecio(Mueble[] vectorMueble){
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce un precio: ");
        double max = entrada.nextDouble();
        
        boolean encontrado = false;
        
        for(Mueble mueble : vectorMueble){
            //Comprobar que no sea null y que cumpla la condición
            if(mueble != null && mueble.getPrecio() <= max){
                System.out.println(mueble.toString());
                encontrado = true;
            }
        }
        //Si no se encontró ninguno, avisar
        if(!encontrado){
            System.out.println("No hay muebles con ese precio");
        }
    }
}