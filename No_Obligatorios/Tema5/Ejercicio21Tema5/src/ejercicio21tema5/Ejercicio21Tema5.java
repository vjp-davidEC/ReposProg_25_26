/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21tema5;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio21Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Declarar un objeto Cuenta y una variable booleana para controlar si la cuenta está creada
        Cuenta cuenta = new Cuenta();
        boolean cuentaCreada = false;
        int opcion;//Variable
        
        do{//Bucle que se repite hasta que el usuario elija salir
            mostrarMenu();
            opcion = pedirOpcion();
            
            switch (opcion){//Evaluar la opcion elegida mediante un switch
                case 1:
                    System.out.print("Ingrese clave para la cuenta: ");
                    String clave1 = entrada.nextLine();
                    cuenta = new CuentaClave(clave1);
                    cuentaCreada = true;
                    System.out.println("Tu cuenta ya esta creada con tu clave");
                    break;
                case 2:
                    System.out.print("Ingrese saldo inicial: ");
                    float saldoInicial = entrada.nextFloat();
                    System.out.println("Ingrese clave para la cuenta: ");
                    String clave2 = entrada.nextLine();
                    cuenta = new CuentaClave(saldoInicial, clave2);
                    cuentaCreada = true;
                    System.out.println("Cuenta creada con saldo y con tu clave");
                    break;
                case 3:
                    if(cuentaCreada){
                        System.out.print("Cantidad a ingresar: ");
                        float ingreso = entrada.nextFloat();
                        cuenta.ingresar(ingreso);
                        System.out.println("Ingreso realizado");
                    }else{
                        System.out.println("Primero debes crear una cuenta");
                    }
                    break;
                case 4:
                    if(cuentaCreada){
                        System.out.print("Cantidad a extraer: ");
                        float retiro = entrada.nextFloat();
                        cuenta.extraer(retiro);
                        System.out.println("Extraccion realizada");
                    }else{
                        System.out.println("Primero debes crear una cuenta");
                    }
                    break;
                case 5:
                    if(cuentaCreada){
                        System.out.print("Saldo actual: " + cuenta.getSaldo());
                        System.out.println("");
                    }else{
                        System.out.println("Primero debes crear una cuenta");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programaaa...");
                    break;
                default:
                    System.out.println("Opcion no valida, intentalo de nuevoo...");
            }
        }while(opcion !=6);//Bucle que se repite mientras la opción no sea salir
    }
    public static void mostrarMenu(){//Método que muestra el menú de opciones
        System.out.println("\n---Cajeroo---");
        System.out.println("1. Crear cuenta vacia");
        System.out.println("2. Crear cuenta con saldo inicial");
        System.out.println("3. Ingresar dinero");
        System.out.println("4. Sacar dinero");
        System.out.println("5. Ver saldo");
        System.out.println("6. Salir");
        System.out.print("Elige una opcion: ");
    }
    
    public static int pedirOpcion(){//Método que pide al usuario una opcion y controla errores de entrada
        Scanner entrada = new Scanner(System.in);
        try{
            return entrada.nextInt();//Devolver la opcio introducida
        }catch(InputMismatchException e){
            entrada.next();//Limpiar el buffer
            return -1;//Devolver -1 para indicar opcion invalida
        }
    }
}