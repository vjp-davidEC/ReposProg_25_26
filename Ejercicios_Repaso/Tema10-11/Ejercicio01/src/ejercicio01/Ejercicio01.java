package ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio01 {

    public static final int PRODUCT = 5;
    
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        aniadirProductos(productos);
        mostrarProductoMasCaro(productos);
        mostrarProductoMasBarato(productos);
        mostrarMediaProductos(productos);
        modificarPrecioProducto(productos);
    }
    
    public static void aniadirProductos(ArrayList<Producto> productos) {
        System.out.println("Introduciendo los datos...");
        for (int i = 0; i < PRODUCT; i++) {
            productos.add(new Producto(pedirNombre(), pedirPrecio()));
            System.out.println("----");
        }
    }
    
    public static void mostrarProductoMasCaro(ArrayList<Producto> productos) {
        System.out.println("");
        
        if (productos.isEmpty()) {
            System.out.println("No hay nada en la lista de productos");
        } else {
            Producto caro = productos.get(0);
        
            for (Producto producto : productos) {
                if (producto.getPrecio() > caro.getPrecio()) {
                    caro = producto;
                }
            }
            System.out.println("El producto mas caro es " + caro.getNombre() + " con un precio de " + caro.getPrecio());
        }
    }
    
    public static void mostrarProductoMasBarato(ArrayList<Producto> productos) {
        System.out.println("");
        
        if (productos.isEmpty()) {
            System.out.println("No hay nada en la lista de productos");
        } else {
            Producto barato = productos.get(0);
        
            for (Producto producto : productos) {
                if (producto.getPrecio() < barato.getPrecio()) {
                    barato = producto;
                }
            }
            System.out.println("El producto mas barato es " + barato.getNombre() + " con un precio de " + barato.getPrecio());
        }
    }
    
    public static void mostrarMediaProductos(ArrayList<Producto> productos) {
        System.out.println("");
        
        if (productos.isEmpty()) {
            System.out.println("No hay nada en la lista de productos");
        } else {
            int suma = 0;
        
            for (Producto producto : productos) {
                suma += producto.getPrecio();
            }
            double media = suma / productos.size();
        
            System.out.println("La media total es " + media);
        }
    }
    
    public static void modificarPrecioProducto(ArrayList<Producto> productos) {
        System.out.println("");
        
        if (productos.isEmpty()) {
            System.out.println("No hay nada en la lista de prodcutos");
        } else {
            System.out.println("Introduce un nombre para modificar");
            String nombre = pedirNombre();
            
            boolean encontrado = false;
            
            Iterator<Producto> it = productos.iterator();
            
            while (it.hasNext() && !encontrado) {
                Producto producto = it.next();
                if (producto.getNombre().equalsIgnoreCase(nombre)) {
                    encontrado = true;
                    producto.setPrecio(pedirPrecio());
                }
            }
            /*int i = 0;
            
            while (i < productos.size() && !encontrado) {
                if (productos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                    encontrado = true;
                    productos.get(i).setPrecio(pedirPrecio());
                }
                i++;
            }*/
            if (!encontrado) {
                System.out.println("No hay nadie con ese nombre");
            }
        }
    }
    
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del producto: ");
        return entrada.nextLine();
    }
    public static double pedirPrecio() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Precio del producto: ");
        return entrada.nextDouble();
    }
}