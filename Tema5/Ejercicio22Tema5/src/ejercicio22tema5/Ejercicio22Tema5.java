/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22tema5;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio22Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Variables
        float total = 0;
        boolean seguir = true;
        String respuesta;
        
        //Objetos Producto que se crean con nombre, precio y stock inicial
        Producto peces = new Producto("Peces", 10F, 40);
        Producto tortugas = new Producto("Tortugas", 4F, 8);
        Producto canarios = new Producto("Canarios", 15.0F, 4);
        
        do{//Bucle que permite al usuario comprar productos hasta que decida salir
            System.out.println("\n--Tienda de mascostas--");
            System.out.println("1. Peces");
            System.out.println("2. Tortugas");
            System.out.println("3. Canarios");
            System.out.print("Elige el producto: ");
            int opcion = entrada.nextInt();
            
            switch(opcion){//Se evalúa la opción elegida
                case 1:
                    comprarProducto(entrada, peces);
                    total = (float) (total + peces.getPrecio() * (40 - peces.getStock()));
                    break;
                case 2:
                    comprarProducto(entrada, tortugas);
                    total = (float) (total + tortugas.getPrecio() * (8 - tortugas.getStock()));
                    break;
                case 3:
                    comprarProducto(entrada, canarios);
                    total = (float) (total + canarios.getPrecio() * (4 - canarios.getStock()));
                    break;
                default:
                    System.out.println("Opcion no valida");//Mensaje de la opcion invalida
            }
            System.out.print("Deseas comprar otro producto?: ");
            respuesta = entrada.next();
        }while(respuesta.equalsIgnoreCase("si"));//Bucle que se repite si responde "si"
        System.out.println("\nTotal de la compra: " + total + " euros");
        System.out.println("Muchas gracias, vuelva cuando quiera");
    }
   public static void comprarProducto(Scanner entrada, Producto producto){//Método para gestionar la compra de un producto
       producto.mostrarDatos();
       System.out.print("Cuanto quieres comprar?: ");
       int cantidad = entrada.nextInt();
       
       if(producto.hayStock(cantidad)){//Verificar si hay stock suficiente
           producto.vender(cantidad);//Se descuenta del stock
           System.out.println("Compra realizada");
       }else{
           System.out.println("No hay suficiente stock");
       }
   }
}