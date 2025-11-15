/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25tema5;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio25Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Objetos Servidor que se crean utilizando el constructor con parametros y que se pide a los métodos
        Servidor ser1 = new Servidor(32, pedirDisco(entrada), pedirProcesador(entrada), "NVIDIA Quadro", pedirPrecio(entrada), pedirTamanioMonitor(entrada), "Logitech K120", "Logitech M100");
        System.out.println("");
        Servidor ser2 = new Servidor(64, pedirDisco(entrada), pedirProcesador(entrada), "AMD Radeon", pedirPrecio(entrada), pedirTamanioMonitor(entrada), "HP Teclado", "HP Monitor");
        System.out.println("");
        
        //Objetos Portatil que se crean utilizando el constructor con parametros y que se pide a los métodos
        Portatil por1 = new Portatil(16, pedirDisco(entrada), pedirProcesador(entrada), "Intel Iris", pedirPrecio(entrada), "Lenovo", 15.6, 12);
        System.out.println("");
        Portatil por2 = new Portatil(8, pedirDisco(entrada), pedirProcesador(entrada), "NVIDIA MX", pedirPrecio(entrada), "Asus", 14, 14);
        System.out.println("");
        
        //Objeto Servidor que se crea utilizando el constructor sin parámetros
        Servidor ser3 = new Servidor();
        //Asignar los valores mediante setters/establecer y con métodos
        ser3.establecerCapacidadRAM(16);
        ser3.establecerCapacidadDiscoDuro(pedirDisco(entrada));
        ser3.establecerModeloProcesador(pedirProcesador(entrada));
        ser3.establecerModeloTarjetaGrafica("Intel HD");
        ser3.establecerPrecio(pedirPrecio(entrada));
        ser3.establecerTamanioMonitor(pedirTamanioMonitor(entrada));
        ser3.establecerModeloTeclado("Dell KB");
        ser3.establecerModeloRaton("Dell Mouse");
        System.out.println("");
        
        //Objeto Servidor que se crea utilizando el constructor sin parámetros
        Portatil por3 = new Portatil();
        //Asignar los valores mediante setters/establecer y con métodos
        por3.establecerCapacidadRAM(16);
        por3.establecerCapacidadDiscoDuro(pedirDisco(entrada));
        por3.establecerModeloProcesador(pedirProcesador(entrada));
        por3.establecerModeloTarjetaGrafica("AMD Vega");
        por3.establecerPrecio(pedirPrecio(entrada));
        por3.establecerMarca("HP");
        por3.establecerTamanioPantalla(13.5);
        por3.establecerPeso(10);
        
        //Mostrar todos los datos de los servidores y los portatiles creados
        System.out.println("\nSERVIDOR-1:");
        ser1.mostrarDatosServidor();
        System.out.println("\nSERVIDOR-2:");
        ser2.mostrarDatosServidor();
        System.out.println("\nSERVIDOR-3:");
        ser3.mostrarDatosServidor();
        System.out.println("\nPORTATIL-1:");
        por1.mostrarDatosPortatil();
        System.out.println("\nPORTATIL-2:");
        por2.mostrarDatosPortatil();
        System.out.println("\nPORTATIL-3:");
        por3.mostrarDatosPortatil();
    }
    //Método que pide al usuario la capacidad del disco duro que debe ser múltiplo de 5
    public static int pedirDisco(Scanner entrada){
        int disco;
        do{
            System.out.print("Capacidad del disco duro: ");
            disco = entrada.nextInt();
        }while(disco % 5 !=0);
        return disco;
    }
    //Método que pide al usuario el modelo del procesador y solo admite 4
    public static String pedirProcesador(Scanner entrada){
        String procesador;
        boolean esValido;
        entrada.nextLine();
        do{
            System.out.print("Introduce el modelo de procesador que quieres: ");
            procesador = entrada.nextLine();
            esValido = procesador.equalsIgnoreCase("Intel Core i5") || 
                    procesador.equalsIgnoreCase("Intel Core i7") ||
                    procesador.equalsIgnoreCase("AMD Ryzen 5") ||
                    procesador.equalsIgnoreCase("AMD Ryzen 7");
            if(!esValido){
                System.out.println("Procesador no valido, intentalo de nuevo con (Intel Core i5, Intel Core i7, AMD Ryzen 5, AMD Ryzen 7)");
            }
        }while(!esValido);
        return procesador;
    }
    //Método que pide al usuario el precio que debe ser mayor que 0
    public static double pedirPrecio(Scanner entrada){
        double precio;
        do{
            System.out.print("Precio: ");
            precio = entrada.nextDouble();
        }while(precio <= 0);
        return precio;
    }
    //Método que pide al usuario el tamanio del monitor que debe ser mayor a 14 pulgadas
    public static double pedirTamanioMonitor(Scanner entrada){
        double tamanio;
        do{
            System.out.print("Tamanio del monitor: ");
            tamanio = entrada.nextDouble();
        }while(tamanio <= 14);
        return tamanio;
    }
}