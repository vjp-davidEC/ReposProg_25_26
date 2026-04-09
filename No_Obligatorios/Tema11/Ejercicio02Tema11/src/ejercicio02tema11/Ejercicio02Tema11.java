/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02tema11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio02Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Mapa donde se guardan los productos
        Map<String, Producto> mapaProductos = new HashMap<>();

        int opcion;

        do {//Bucle principal
            mostrarMenu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> menuAdministracion(mapaProductos);
                case 2 -> menuCompra(mapaProductos);
                case 3 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while (opcion != 3);
    }

    //Submenu Administracion
    public static void menuAdministracion(Map<String, Producto> mapa) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {//Bucle secundario
            mostrarMenuAdministracion();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> introducirProductos(mapa);
                case 2 -> visualizarProductos(mapa);
                case 3 -> eliminarProductos(mapa);
                case 4 -> System.out.println("Saliendo del menu de administracion...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while (opcion != 4);
    }

    //Submenu Compra
    public static void menuCompra(Map<String, Producto> mapa) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {//Bucle secundario
            mostrarMenuCompra();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> comprarProductos(mapa);
                case 2 -> System.out.println("Saliendo del menu de compra...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while (opcion != 2);
    }

    //Metodo que muestra el menu principal
    public static void mostrarMenu() {
        System.out.println("\n--MENU OPCIONES--");
        System.out.println("1. MENU DE ADMINISTRACION");
        System.out.println("2. MENU DE COMPRA");
        System.out.println("3. SALIR DEL PROGRAMA");
        System.out.print("Introduce una opcion: ");
    }

    //Metodo que muestra el menu de administracion
    public static void mostrarMenuAdministracion() {
        System.out.println("\n--MENU ADMINISTRACION--");
        System.out.println("1. INTRODUCIR PRODUCTOS");
        System.out.println("2. VISUALIZAR PRODUCTOS");
        System.out.println("3. ELIMINAR PRODUCTOS");
        System.out.println("4. SALIR DEL MENU");
        System.out.print("Introduce una opcion: ");
    }

    //Metodo que muestra el menu de compra
    public static void mostrarMenuCompra() {
        System.out.println("\n--MENU COMPRA--");
        System.out.println("1. COMPRAR PRODUCTOS");
        System.out.println("2. SALIR DEL MENU");
        System.out.print("Introduce una opcion: ");
    }

    //--ADMINISTRACION--
    //Metodo que introduce un producto en el mapa
    public static void introducirProductos(Map<String, Producto> mapa) {
        System.out.println();
        System.out.println("Introduce los datos de un producto");
        //Se crea un nuevo producto y se guarda usando el codigo como clave
        mapa.put(pedirCodigo(), new Producto(pedirNombreProducto(), pedirPrecio(), pedirStock()));
    }

    //Metodo que visualiza los productos creados que hay en el mapa
    public static void visualizarProductos(Map<String, Producto> mapa) {
        System.out.println();

        if (mapa.isEmpty()) {
            System.out.println("No hay productos en la lista");
        } else {
            //Se recorre todas las claves del mapa
            System.out.println("--LISTA DE PRODUCTOS--");
            for (String codigo : mapa.keySet()) {
                System.out.println("Codigo: " + codigo + "\n" + mapa.get(codigo));
            }
        }
    }

    //Metodo que elimina un producto por su codigo
    public static void eliminarProductos(Map<String, Producto> mapa) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el codigo del producto que deseas eliminar: ");
        String codigo = entrada.nextLine();

        if (mapa.containsKey(codigo)) {
            mapa.remove(codigo);
        } else {
            System.out.println("No se encontro el producto");
        }
    }

    //--COMPRA--
    //Metodo que compra el producto que haya en el mapa
    public static void comprarProductos(Map<String, Producto> mapa) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);

        if (mapa.isEmpty()) {
            System.out.println("No hay productos disponibles");
        } else {
            float total = 0f;
            String seguir = "";

            do {
                System.out.println("--PRODUCTOS DISPONIBLES--");
                visualizarProductos(mapa);
                String codigo = pedirCodigo();

                if (!mapa.containsKey(codigo)) {
                    System.out.println("Producto no valido");
                } else {
                    Producto producto = mapa.get(codigo);
                    System.out.print("Cuantas unidades quieres: ");
                    int unidades = entrada.nextInt();

                    if (unidades > producto.getStock()) {
                        System.out.println("No hay suficiente stock. Quedan : " + producto.getStock());
                    } else {
                        total += unidades * producto.getPrecio();
                        producto.setStock(producto.getStock() - unidades);
                        System.out.println("Producto aniadido a la compra");
                    }
                }
                seguir = pedirConfirmacion();
            } while (seguir.equalsIgnoreCase("si"));
            System.out.println("El total de la compra es: " + total + " Euros");
        }
    }

    //Metodos que piden informacion al usuario y cada uno de lo que se quiera hacer
    public static String pedirCodigo() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el codigo del producto: ");
        String codigo = entrada.nextLine();
        return codigo;
    }

    public static String pedirNombreProducto() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el nombre del producto: ");
        String nombreProducto = entrada.nextLine();
        return nombreProducto;
    }

    public static float pedirPrecio() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el precio del producto: ");
        float precio = entrada.nextFloat();
        return precio;
    }

    public static int pedirStock() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el stock del producto: ");
        int stock = entrada.nextInt();
        return stock;
    }

    public static String pedirConfirmacion() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Deseas comprar otro producto (si/no): ");
        String seguir = entrada.nextLine();
        return seguir;
    }
}