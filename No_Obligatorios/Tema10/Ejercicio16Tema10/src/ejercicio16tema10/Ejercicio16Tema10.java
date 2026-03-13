/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16tema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio16Tema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Lista donde se guarda todos los productos
        ArrayList<Deporte> listaProductos = new ArrayList<>();

        int opcion;

        do {//Bucle principal
            mostrarMenu();
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 ->
                    menuAdimistracion(listaProductos);
                case 2 ->
                    menuCompra(listaProductos);
                case 3 ->
                    System.out.println("Saliendo del programa...");
                default ->
                    System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while (opcion != 3);
    }

    //Submenu
    public static void menuAdimistracion(ArrayList<Deporte> lista) {
        Scanner entrada = new Scanner(System.in);

        int opcion;

        do {
            mostrarMenuAdministracion();
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 ->
                    introducirProductos(lista);
                case 2 ->
                    visualizarProductos(lista);
                case 3 ->
                    eliminarProductos(lista);
                case 4 ->
                    System.out.println("Saliendo del menu de administracion...");
                default ->
                    System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while (opcion != 4);
    }

    //Submenu
    public static void menuCompra(ArrayList<Deporte> lista) {
        Scanner entrada = new Scanner(System.in);

        int opcion;

        do {
            mostrarMenuCompra();
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 ->
                    comprarProductos(lista);
                case 2 ->
                    System.out.println("Saliendo del menu de compra...");
                default ->
                    System.out.println("Opcion no valida, intentalo de nuevo");
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

    //Metodo que introduce los productos a la lista
    public static void introducirProductos(ArrayList<Deporte> lista) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce los datos de un producto");
        System.out.print(" - Introduce el nombre del producto: ");
        String nombreProducto = entrada.nextLine();
        System.out.print(" - Introduce el precio del producto: ");
        float precio = entrada.nextFloat();
        System.out.print(" - Introduce el stock del producto: ");
        int stock = entrada.nextInt();
        entrada.nextLine();

        lista.add(new Deporte(nombreProducto, precio, stock));
        System.out.println("Producto aniadido correctamente");
    }

    //Metodo que visualiza todos los productos de la lista
    public static void visualizarProductos(ArrayList<Deporte> lista) {
        System.out.println();

        if (lista.isEmpty()) {
            System.out.println("No hay productos en la lista");
        } else {
            System.out.println("--LISTA DE PRODUCTOS--");
            for (Deporte producto : lista) {
                System.out.println(producto);
            }
        }
    }

    //Metodo que elimina un producto de la lista
    public static void eliminarProductos(ArrayList<Deporte> lista) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el producto que deseas eliminar: ");
        String nombreEliminar = entrada.nextLine();

        boolean eliminado = false;
        int i = 0;

        while (i < lista.size() && !eliminado) {
            if (lista.get(i).getNombreProducto().equalsIgnoreCase(nombreEliminar)) {
                lista.remove(i);
                eliminado = true;
                System.out.println("Producto eliminado");
            } else {
                i++;
            }
        }
        if (!eliminado) {
            System.out.println("No se encontro el producto");
        }
    }

    //Metodo que compra los productos de la lista
    public static void comprarProductos(ArrayList<Deporte> lista) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);

        if (lista.isEmpty()) {
            System.out.println("No hay productos disponibles");
        } else {
            float total = 0;
            String seguir = "";

            do {
                System.out.println("--PRODUCTOS DISPONIBLES--");
                for (int i = 0; i < lista.size(); i++) {
                    System.out.println((i + 1) + "- " + lista.get(i));
                }
                System.out.print("Elige el numero del producto: ");
                int indice = entrada.nextInt();
                entrada.nextLine();

                if (indice < 1 || indice > lista.size()) {
                    System.out.println("Producto no valido");
                    continue;
                }
                Deporte producto = lista.get(indice - 1);

                System.out.print("Cuantas unidades quieres: ");
                int unidades = entrada.nextInt();
                entrada.nextLine();

                //Comprobar el stock
                if (unidades > producto.getStock()) {
                    System.out.println("No hay suficiente stock. Quedan: " + producto.getStock());
                } else {
                    total += unidades * producto.getPrecio();
                    producto.setStock(producto.getStock() - unidades);
                    System.out.println("Producto aniadido a la compra");
                }
                System.out.print("Deseas comprar otro producto (si/no): ");
                seguir = entrada.nextLine();
            } while (seguir.equalsIgnoreCase("si"));
            System.out.println("El total de la compra es: " + total + " Euros");
        }
    }
}
