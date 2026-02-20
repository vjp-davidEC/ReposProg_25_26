/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajafuerte;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class CajaFuerte {

    /**
     * @param args the command line arguments
     */
    //Constantes para las matrices
    public static final int FIL = 3;
    public static final int COL = 3;
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Moneda[][] moneda = new Moneda[FIL][COL];
        
        int opcion;
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            switch(opcion){
                case 1 -> rellenarCajaFuerteMonedas(moneda);
                case 2 -> mostrarMonedasFabricadas(moneda);
                case 3 -> mostrarMonedaValiosa(moneda);
                case 4 -> System.out.println("Saliendo del programaa...");
                default -> System.out.println("Opcion no valida, intentelo de nuevo");
            }
        }while(opcion != 4);
    }
    
    //Metodo que muestra el menu
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. Rellenar la caja fuerte de monedas");
        System.out.println("2. Mostrar todas las monedas fabricadas con un material determinado");
        System.out.println("3. Mostrar la moneda mas valiosa");
        System.out.println("4. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    //Metodo que rellena las monedas de la caja fuerte
    public static void rellenarCajaFuerteMonedas(Moneda[][] matriz) {
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        for(int i = 0; i < FIL; i++){
            for(int j = 0; j < COL ; j++){
                System.out.println("--Posicion [" + i + j + "]--");
                System.out.print("Por favor, introduzca el valor de la moneda: ");
                float valor = entrada.nextFloat();
                entrada.nextLine();
                System.out.print("Ahora, introduzca el pais de la moneda: ");
                String pais = entrada.nextLine();
                System.out.print("Por ultimo, introduzca el material de la moneda: ");
                String material = entrada.nextLine();
                matriz[i][j] = new Moneda(valor, pais, material);//Se guardan los datos en la matriz
            }
        }
    }
    
    //Metodo que muestra la moneda que se desea
    public static void mostrarMonedasFabricadas(Moneda[][] matriz) {
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.print("Introduce el material de la moneda deseada: ");
        String material = entrada.nextLine();
        
        boolean encontrado = false;
        
        for(int i = 0; i < FIL; i++){
            for(int j = 0; j < COL; j++){
                if(matriz[i][j].getMaterial().equalsIgnoreCase(material)) {
                    System.out.println(matriz[i][j].toString());
                    encontrado = true;
                }
            }
        }
        
        //Sino hay ninguna moneda
        if(!encontrado) {
            System.out.println("No se ha encontrado ninguna moneda con ese material");
        }
    }
    
    //Metodo que muestra la moneda mas valiosa
    public static void mostrarMonedaValiosa(Moneda[][] matriz) {
        System.out.println();
        Moneda mayor = matriz[0][0];//Primer numero que hay
        //Lo que hace es tener los datos de la i y la j
        int letraI = 0;
        int letraJ = 0;
        for(int i = 0; i < FIL; i++){
            for(int j = 0; j < COL; j++){
                if(matriz[i][j].getValor() > mayor.getValor()){
                    mayor = matriz[i][j];
                    //Coge la informacion de i y la j
                    letraI = i;
                    letraJ = j;
                }
            }
        }
        //Muestra los datos de la moneda y en que posicion esta
        System.out.println(matriz[letraI][letraJ].toString() + " y se encuentra en la posicion[" + letraI + letraJ + "]");
    }
}
