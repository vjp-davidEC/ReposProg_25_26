package ejercicio06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio06 {
    
    public static final int PRODUC = 5;

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        TreeSet<Producto> productos2 = new TreeSet<>();
        HashMap<String, Producto> productos3 = new HashMap<>();
        
        pedirProductos(productos);
        mostrarListaProductos(productos);
        buscarProducto(productos);
        calcularPrecioMedio(productos);
        productoMasCaro(productos);
        
        pasarArrayListASet(productos, productos2);
        mostrarSet(productos2);
        eliminarProductosBaratos(productos2);
        mostrarSet(productos2);
        
        pasarArrayListAMap(productos, productos3);
        mostrarMapa(productos3);
        buscarMapa(productos3);
        modificarPrecioEnMap(productos3);
        mostrarMapa(productos3);
        
        pasarSetAArrayList(productos2, productos);
        mostrarListaProductos(productos);
        
        pasarSetAMap(productos2, productos3);
        mostrarMapa(productos3);
        
        pasarMapAArrayList(productos3, productos);
        mostrarListaProductos(productos);
        
        pasarMapASet(productos3, productos2);
        mostrarSet(productos2);
    }
    
    public static void pedirProductos(ArrayList<Producto> productos) {
        System.out.println("Aniadiendo productos...");
        
        for (int i = 0; i < PRODUC; i++) {
            productos.add(new Producto(pedirNombre(), pedirPrecio()));
            System.out.println("---");
        }
    }
    
    public static void mostrarListaProductos(ArrayList<Producto> productos) {
        System.out.println("");
        
        if (productos.isEmpty()) {
            System.out.println("No hay productos en la lista");
        } else {
            for (Producto producto : productos) {
                System.out.println(producto.toString());
            }
        }
    }
    
    public static void buscarProducto(ArrayList<Producto> productos) {
        System.out.println("");
        
        if (productos.isEmpty()) {
            System.out.println("No hay productos en la lista");
        } else {
            System.out.println("Introduce el nombre a buscar");
            String nombre = pedirNombre();
            
            boolean encontrado = false;
            int i = 0;
            
            while (i < productos.size() && !encontrado) {
                if (productos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                    encontrado = true;
                    System.out.println("El producto " + nombre + " tiene un precio de " + productos.get(i).getPrecio());
                }
                i++;
            }
            if (!encontrado) {
                System.out.println("No hay ningun producto llamado " + nombre);
            }
        }
    }
    
    public static void calcularPrecioMedio(ArrayList<Producto> productos) {
        System.out.println("");
        
        if (productos.isEmpty()) {
            System.out.println("No hay productos en la lista");
        } else {
            int suma = 0;
            
            for (Producto producto : productos) {
                suma += producto.getPrecio();
            }
            double media = suma / productos.size();
            
            System.out.println("La media de todos los productos es " + media);
        }
    }
    
    public static void productoMasCaro(ArrayList<Producto> productos) {
        System.out.println("");
        
        if (productos.isEmpty()) {
            System.out.println("No hay productos en la lista");
        } else {
            Producto mayor = productos.get(0);
            
            for (Producto producto : productos) {
                if (producto.getPrecio() > mayor.getPrecio()) {
                    mayor = producto;
                }
            }
            System.out.println("El producto mas caro es " + mayor);
        }
    }
    
    public static void pasarArrayListASet(ArrayList<Producto> productos, TreeSet<Producto> productos2) {
        for (Producto producto : productos) {
            productos2.add(producto);
        }
    }
    
    public static void mostrarSet(TreeSet<Producto> productos2) {
        System.out.println("");
        
        if (productos2.isEmpty()) {
            System.out.println("No hay productos en el conjunto");
        } else {
            for (Producto producto : productos2) {
                System.out.println(producto.toString());
            }
        }
    }
    
    public static void eliminarProductosBaratos(TreeSet<Producto> productos2) {
        System.out.println("");
        
        if (productos2.isEmpty()) {
            System.out.println("No hay productos en el conjunto");
        } else {
            Iterator<Producto> it = productos2.iterator();
            
            while (it.hasNext()) {
                Producto producto = it.next();
                
                if(producto.getPrecio() < 10) {
                    it.remove();
                    System.out.println("Eliminado los productos con precio menor a 10 Euros");
                }
            }
        }
    }
    
    public static void pasarArrayListAMap(ArrayList<Producto> productos, HashMap<String, Producto> productos3) {
        for (Producto producto : productos) {
            productos3.put(producto.getNombre(), producto);
        }
    }
    
    public static void mostrarMapa(HashMap<String, Producto> productos3) {
        System.out.println("");
        
        if (productos3.isEmpty()) {
            System.out.println("No hay productos en el mapa");
        } else {
            for (String key : productos3.keySet()) {
                Producto p = productos3.get(key);
                System.out.println(key + " --> " + p);
            }
        }
    }
    
    public static void buscarMapa(HashMap<String, Producto> productos3) {
        System.out.println("");
        
        if (productos3.isEmpty()) {
            System.out.println("No hay productos en el mapa");
        } else {
            System.out.println("Introduce un nombre a buscar");
            String nombre = pedirNombre();
            
            if (productos3.containsKey(nombre)) {
                System.out.println("El producto con nombre " + nombre + " si existe y tiene un precio de " + productos3.get(nombre).getPrecio() +" Euros");
            } else {
                System.out.println("No existe ningun producto con el nombre " + nombre);
            }
        }
    }
    
    public static void modificarPrecioEnMap(HashMap<String, Producto> productos3) {
        System.out.println("");
        
        if (productos3.isEmpty()) {
            System.out.println("No hay productos en el mapa");
        } else {
            System.out.println("Introduce un nombre para modificar su precio");
            String nombre = pedirNombre();
            
            if (productos3.containsKey(nombre)) {
                productos3.put(nombre, new Producto(nombre, pedirPrecio()));
                System.out.println("Modificado correctamente");
            } else {
                System.out.println("No hay ningun producto para modificar con el nombre " + nombre);
            }
        }
    }
    
    public static void pasarSetAArrayList(TreeSet<Producto> productos2, ArrayList<Producto> productos) {
        System.out.println("");
        
        productos.clear();
        
        for (Producto producto : productos2) {
            productos.add(producto);
        }
    }
    
    public static void pasarSetAMap(TreeSet<Producto> productos2, HashMap<String, Producto> productos3) {
        System.out.println("");
        
        productos3.clear();
        
        for (Producto producto : productos2) {
            productos3.put(producto.getNombre(), producto);
        }
    }
    
    public static void pasarMapAArrayList(HashMap<String, Producto> productos3, ArrayList<Producto> productos) {
        System.out.println("");
        
        productos.clear();
        
        for (String key : productos3.keySet()) {
            Producto producto = productos3.get(key);
            productos.add(new Producto(producto.getNombre(), producto.getPrecio()));
        }
    }
    
    public static void pasarMapASet(HashMap<String, Producto> productos3, TreeSet<Producto> productos2) {
        System.out.println("");
        
        productos2.clear();
        
        for (String key : productos3.keySet()) {
            Producto producto = productos3.get(key);
            productos2.add(new Producto(producto.getNombre(), producto.getPrecio()));
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