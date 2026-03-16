
package ejercicio16t10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio16T10 {
    /**
     * Método principal
     * @param args 
     */
    public static void main(String[] args) {
        ArrayList<Producto> lProductos = new ArrayList<>();
        mostrarMenu(lProductos);
    }    
    
    /**
     * Método que pide al usuario el nombre del producto
     * @return el nombre
     */
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }
    
    /**
     * Método que pide al usuario el precio del producto
     * @return el precio
     */
    public static float pedirPrecio() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Precio: ");
        return entrada.nextFloat();
    }
    
    /**
     * Método que pide al usuario el stock del producto
     * @return la cantidad de productos en stock o para comprar
     */
    public static int pedirStock() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Unidades: ");
        return entrada.nextInt();
    }
    
    /**
     * Método que pide al usuario si quiere seguir comprando
     * @return 's' para seguir y 'n' para terminar
     */
    public static String pedirConfirmacion() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Quieres seguir comprando? (s/n) ");
        return entrada.nextLine();
    }
    
    
    
    // OPCIONES DE ADMINISTRACIÓN
    /**
     * Método que crea un producto con los datos que 
     * indique el usuario y lo añade a la lista de productos.
     * 
     * @param lProductos 
     */
    public static void insertar(ArrayList<Producto> lProductos) {
        lProductos.add(new Producto(pedirNombre(), pedirPrecio(), pedirStock()));        
        System.out.println("Producto añadido corectamente");
    }
    
    /**
     * Método que muestra los productos de la lista
     * @param lProductos 
     */
    public static void mostrar(ArrayList<Producto> lProductos) {
        if(!lProductos.isEmpty()) {
            System.out.println("- LISTA DE PRODUCTOS -");
            
            for(Producto producto : lProductos) {
                System.out.println(producto);
            }
            
        } else {
            System.out.println("No hay productos");
        }
    }
    
    /**
     * Método que elimina un producto por nombre 
     * indicado por el usuario.
     * 
     * @param lProductos 
     */
    public static void eliminar(ArrayList<Producto> lProductos) {
        if(!lProductos.isEmpty()) {
            Producto producto = buscar(lProductos);
            lProductos.remove(producto);
            System.out.println("Producto eliminado correctamente");
        } else {
            System.out.println("No hay productos para borrar");
        }
    }
    
    /**
     * Método que pide un nombre de producto al usuario
     * y lo busca en la lista de productos.
     * 
     * @param lProductos
     * @return el producto buscado o null si no se encuentra
     */
    public static Producto buscar(ArrayList<Producto> lProductos) {
        Producto producto = new Producto();
        
        if(!lProductos.isEmpty()) {
            int i = 0;
            boolean encontrado = false;
            String nombre = pedirNombre();
            
            while(!encontrado && i < lProductos.size()) {
                if(lProductos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                    encontrado = true;
                    producto = lProductos.get(i);
                } else {                    
                    i++;
                }
            }
            
        } else {
            System.out.println("No hay productos en la lista");
        }
        
        return producto;
    }
    
    
    
    
    // OPCIONES DE COMPRA
    /**
     * Método que actualiza el stock del producto,
     * restando al stock actual las unidades que
     * el usuario quiere comprar.
     * 
     * @param producto
     * @param unidades 
     */
    public static void actualizarStock(Producto producto, int unidades) {
        int stockActual = producto.getStock();
        producto.setStock(stockActual - unidades);
    }
    
    /**
     * Método que permite al usuario comprar productos 
     * de la lista de productos.
     * Muestra los productos disponibles,
     * le pide al usuario un nombre de producto,
     * busca el producto con ese nombre,
     * le pregunta al usuario las unidades que quiere comprar,
     * suma el precio al total y actualiza al stock.
     * Repite este proceso hasta que el usuario indique
     * que no quiere seguir comprando.
     * Calcula y muestra el precio total de la compra.
     * 
     * @param lProductos 
     */
    public static void comprar(ArrayList<Producto> lProductos) {
        float importeTotal = 0;
        
        do {
            mostrar(lProductos);

            System.out.println("Escribe el nombre del producto que quieres comprar:");
            Producto producto = buscar(lProductos);

            System.out.println("¿Cuántas unidades quieres llevarte?");
            int unidades = pedirStock();
            importeTotal += producto.getPrecio() * unidades;
            
            actualizarStock(producto, unidades);                                    
        } while(pedirConfirmacion().equalsIgnoreCase("s"));
        
        System.out.println("Total: " + importeTotal + "€");
    }
    
    
    // MENÚS
    /**
     * Método que muestra el menú principal,
     * que da las opciones de acceder al menú
     * de administración o al menú de compra.
     * 
     * @param lProductos 
     */
    public static void mostrarMenu(ArrayList<Producto> lProductos) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("- MENÚ - ");
            System.out.println("1. Menú admin");
            System.out.println("2. Menú compra");
            System.out.println("3. Salir");
            
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1 -> mostrarSubmenuAdmin(lProductos);
                case 2 -> mostrarSubmenuCompra(lProductos);
                case 3 -> {}
                default -> System.out.println("Escribe una opción correcta");
            }
        } while (opcion != 3);
    }
    
    /**
     * Método que muestra el submenú de administración,
     * que permite añadir productos, ver los productos creados,
     * eliminar productos y volver al menú principal.
     * 
     * @param lProductos 
     */
    public static void mostrarSubmenuAdmin(ArrayList<Producto> lProductos) {
        Scanner entrada = new Scanner(System.in);
        int opcionAdmin = 0;
        
        do {
            System.out.println("- MENÚ - ");
            System.out.println("1. Añadir producto");
            System.out.println("2. Ver productos");
            System.out.println("3. Eliminar productos");
            System.out.println("4. Volver al menú principal");
            
            System.out.print("Elige una opción: ");
            opcionAdmin = entrada.nextInt();
            
            switch(opcionAdmin) {

                case 1 -> insertar(lProductos);
                case 2 -> mostrar(lProductos);
                case 3 -> eliminar(lProductos);
                case 4 -> {}
                default -> System.out.println("Escribe una opción correcta");
            }
        } while (opcionAdmin != 4);
    }

    /**
     * Método que muestra el submenú de compra,
     * que permite al usuario comprar productos
     * o volver al menú principal.
     * 
     * @param lProductos 
     */
    public static void mostrarSubmenuCompra(ArrayList<Producto> lProductos) {
        Scanner entrada = new Scanner(System.in);
        int opcionCompra = 0;
        
        do {
            System.out.println("- MENÚ - ");
            System.out.println("1. Comprar producto");
            System.out.println("2. Volver al menú principal");             
            
            System.out.print("Elige una opción: ");
            opcionCompra = entrada.nextInt();
            
            switch(opcionCompra) {
                case 1 -> comprar(lProductos);
                case 2 -> {}
                default -> System.out.println("Escribe una opción correcta");
            }
        } while (opcionCompra != 2);
    }
    

}
