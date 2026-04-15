/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02t11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio02T11 {
    
    private static int idProducto = 1;
    
    //MÉTODOS PARA ADMINISTRACIÓN   

    /* Inserta un Producto junto con su clave en el mapa */
    public static void insertarProductoAdmin(Map<Integer, Producto> mapa){
        Scanner tecladoS = new Scanner(System.in);
        Scanner tecladoI = new Scanner(System.in);
        Scanner tecladoF = new Scanner(System.in);
        Producto p;
        String nombre;
        float precio;
        int stock;
        //Pedimos datos del Producto
        System.out.println("Nuevo Producto ");
        System.out.print("Nombre: ");
        nombre = tecladoS.nextLine();
        System.out.print("Precio: ");
        precio = tecladoF.nextFloat();
        System.out.print("Stock: ");
        stock = tecladoI.nextInt();
        p = new Producto(nombre, precio, stock);
        //Insertamos el Producto en el mapa
        mapa.put(idProducto, p);
        //Actualizo el identificador de Producto para el siguiente
        idProducto = idProducto + 1;  
        System.out.println("Producto insertado correctamente");
    }
    
    /* Muestra todos los productos del mapa */
    public static void mostrarProductosAdmin(Map<Integer, Producto> mapa){
        Producto p;
        int clave;
        Iterator it = mapa.keySet().iterator();
        while(it.hasNext()){
            clave = (int) it.next();
            p = (Producto) mapa.get(clave);
            System.out.println("Producto ("+clave+")");
            System.out.println("    Nombre: "+p.getNombre());
            System.out.println("    Precio: "+p.getPrecio());
            System.out.println("    Stock: "+p.getStock());
        }
    }
    
    /* Elimina un producto del mapa */
    public static void eliminarProductoAdmin(Map<Integer, Producto> mapa){
        Scanner teclado = new Scanner(System.in);
        int codigo;
        System.out.println("Eliminar Producto");
        System.out.print("Código: ");
        codigo = teclado.nextInt();
        if  (mapa.containsKey(codigo)){  //Si existe la clave en el mapa
            mapa.remove(codigo);  //Eliminamos el producto
            System.out.println("Producto eliminado correctamente");
        }
        else{
            System.out.println("Código ("+codigo+") no existe");
        }
    }
    
    //MÉTODOS PARA COMPRA   
    
    /* Muestra al usuario los productos que puede comprar. Retorna el código del producto elegido por el usuario */
    public static int elegirProductoCompra(Map<Integer, Producto> mapa){
        Scanner teclado = new Scanner(System.in);
        Producto p;
        int clave, cod;
        Iterator it = mapa.keySet().iterator();
        while(it.hasNext()){
            clave = (int) it.next();
            p = (Producto) mapa.get(clave);
            System.out.println("Pulse "+clave+" para comprar "+p.getNombre());
        }
        System.out.print("Opción: ");
        cod = teclado.nextInt();
        return cod;
    }
    
    /* Actualiza el stock y retorna el precio del producto * unidades vendidas */
    public static float actualizarStock(Map<Integer, Producto> mapa, int codigo, int unidades){
        //Obtenemos el producto que se ha comprado
        Producto p = (Producto) mapa.get(codigo);
        float precio = 0;
        //Si existe el Producto y tenemos stock suficiente
        if  ((p != null)&&(unidades <= p.getStock())){  
            //Actualizamos el precio
            precio = p.getPrecio() * unidades;
            //Actualizamos stock
            p.setStock(p.getStock() - unidades);
        }
        else{
            System.out.println("No existe o no hay stock suficiente para el producto ("+codigo+")");
        }
        return precio;
    }
    
    /* Muestra todos los productos de los que dispone la tienda y da la opción de comprarlos */
    public static void comprarProductos(Map<Integer, Producto> mapa){
        Scanner tecladoI = new Scanner(System.in);
        Scanner tecladoS = new Scanner(System.in);
        String resp;
        int cod, unidades;
        float precioProductoVendido, precioTotal = 0;
        //Mostrar productos para comprar
        do{
            //Mostramos los productos que se pueden comprar
            cod = elegirProductoCompra(mapa);
            if  (mapa.containsKey(cod)){  //Si existe el producto, actualizamos datos
                //Decide el número de unidades que desea comprar
                System.out.print("¿Cuántas unidades desea? ");
                unidades = tecladoI.nextInt();
                //Actualizamos stock del producto y el precio total de la compra
                precioProductoVendido = actualizarStock(mapa, cod, unidades);
                precioTotal = precioTotal + precioProductoVendido;
            }
            else{
                System.out.println("Código ("+cod+") no existe");
            }
            //Preguntamos si quiere seguir comprando
            System.out.print("¿Desea comprar otro producto?(si/no) ");
            resp = tecladoS.nextLine();
        }while(resp.equalsIgnoreCase("si"));
        //Mostramos el importe total de la compra
        System.out.println("Importe total compra: "+precioTotal);
    }

    //MENÚ ADMINISTRCIÓN     
    public static void menuAdministracion(Map<Integer, Producto> mapa){
        Scanner teclado = new Scanner(System.in);
        int opc;
        do{
            System.out.println("\n   MENÚ ADMINISTRACIÓN");
            System.out.println("1. Introducir Productos");
            System.out.println("2. Mostrar Productos");
            System.out.println("3. Eliminar Productos");
            System.out.println("4. Volver");
            System.out.print("   Opción: ");
            opc = teclado.nextInt();
            switch(opc){
                case 1:
                    insertarProductoAdmin(mapa);
                    break;
                case 2:
                    mostrarProductosAdmin(mapa);
                    break;
                case 3:
                    eliminarProductoAdmin(mapa);
                    break;
                case 4:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }while(opc != 4);
    }
        
    //MENÚ COMPRA  
    public static void menuCompra(Map<Integer, Producto> mapa){
        Scanner teclado = new Scanner(System.in);
        int opc;
        do{
            System.out.println("\n   MENÚ COMPRA");
            System.out.println("1. Comprar Productos");
            System.out.println("2. Volver");
            System.out.print("   Opción: ");
            opc = teclado.nextInt();
            switch(opc){
                case 1:
                    comprarProductos(mapa);
                    break;
                case 2:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }while(opc != 2);
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<Integer, Producto> mapa = new HashMap<>();
        int opc;
        do{
            System.out.println("\n   MENÚ PRINCIPAL");
            System.out.println("1. Menú de administración");
            System.out.println("2. Menú de compra");
            System.out.println("3. Salir");
            System.out.print("   Opción: ");
            opc = teclado.nextInt();
            switch(opc){
                case 1:
                    menuAdministracion(mapa);
                    break;
                case 2:
                    menuCompra(mapa);
                    break;
                case 3:
                    System.out.println("¡Hasta pronto!");
            }
        }while(opc != 3);
    }

}
