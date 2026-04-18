package ejercicio17repaso16tema10;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio17Repaso16Tema10 {

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        
        int opcion;

        do {//Bucle principal
            mostrarMenu();
            opcion = pedirOpcion();

            switch (opcion) {
                case 1 ->
                    menuAdimistracion(productos);
                case 2 ->
                    menuCompra(productos);
                case 3 ->
                    System.out.println("Saliendo del programa...");
                default ->
                    System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while (opcion != 3);
    }

    //Submenu
    public static void menuAdimistracion(ArrayList<Producto> productos) {
        int opcion;

        do {
            mostrarMenuAdministracion();
            opcion = pedirOpcion();

            switch (opcion) {
                case 1 ->
                    introducirProductos(productos);
                case 2 ->
                    visualizarProductos(productos);
                case 3 ->
                    eliminarProductos(productos);
                case 4 ->
                    System.out.println("Saliendo del menu de administracion...");
                default ->
                    System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while (opcion != 4);
    }

    //Submenu
    public static void menuCompra(ArrayList<Producto> productos) {
        int opcion;

        do {
            mostrarMenuCompra();
            opcion = pedirOpcion();

            switch (opcion) {
                case 1 ->
                    comprarProductos(productos);
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
    public static void introducirProductos(ArrayList<Producto> productos) {
        System.out.println();

        System.out.println("Introduce los datos de un producto");
        productos.add(new Producto(pedirNombre(), pedirPrecio(), pedirStock()));
        System.out.println("Producto aniadido correctamente");
    }

    //Metodo que visualiza todos los productos de la lista
    public static void visualizarProductos(ArrayList<Producto> productos) {
        System.out.println();

        if (productos.isEmpty()) {
            System.out.println("No hay productos en la lista");
        } else {
            System.out.println("--LISTA DE PRODUCTOS--");
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }

    //Metodo que elimina un producto de la lista
    public static void eliminarProductos(ArrayList<Producto> productos) {
        System.out.println();

        System.out.println("Introduce el producto que deseas eliminar");
        String nombreEliminar = pedirNombre();

        boolean eliminado = false;
        int i = 0;

        while (i < productos.size() && !eliminado) {
            if (productos.get(i).getNombre().equalsIgnoreCase(nombreEliminar)) {
                productos.remove(i);
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
    public static void comprarProductos(ArrayList<Producto> productos) {
        System.out.println();

        if (productos.isEmpty()) {
            System.out.println("No hay productos disponibles");
        } else {
            float total = 0;

            do {
                System.out.println("--PRODUCTOS DISPONIBLES--");
                for (int i = 0; i < productos.size(); i++) {
                    System.out.println((i + 1) + "- " + productos.get(i));
                }
                System.out.print("Elige el numero del producto: ");
                int indice = pedirNumero();

                if (indice < 1 || indice > productos.size()) {
                    System.out.println("Producto no valido");
                    continue;
                }
                Producto producto = productos.get(indice - 1);

                System.out.print("Cuantas unidades quieres: ");
                int unidades = pedirNumero();

                //Comprobar el stock
                if (unidades > producto.getStock()) {
                    System.out.println("No hay suficiente stock. Quedan: " + producto.getStock());
                } else {
                    total += unidades * producto.getPrecio();
                    producto.setStock(producto.getStock() - unidades);
                    System.out.println("Producto aniadido a la compra");
                }
            } while (pedirSeguir().equalsIgnoreCase("s"));
            System.out.println("El total de la compra es: " + total + " Euros");
        }
    }
    
    
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del producto: ");
        return entrada.nextLine();
    }
    public static float pedirPrecio() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Precio del producto: ");
        return entrada.nextFloat();
    }
    public static int pedirStock() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Stock del producto: ");
        return entrada.nextInt();
    }
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    public static String pedirSeguir() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Deseas comprar otro producto (s/n): ");
        return entrada.nextLine();
    }
}