/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07tema8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio07Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Array con los 30 dias del mes
        Dia[] mes = new Dia[30];
        //Array con los nombres de los dias de la semana
        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        int opcion;

        //Bucle que se repite hasta que el usuario elija salir
        do {
            mostrarMenu();
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> rellenarTemperaturas(mes, diasSemana);
                case 2 -> mostrarTemperatura(mes);
                case 3 -> System.out.println("La temperatura media del mes es: " + temperaturaMedia(mes) + " grados");
                case 4 -> mostrarDiasMasCalurosos(mes);
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while (opcion != 5);//Repetir hasta que no elija la opcion salir
    }

    //Metodo que muestra el menu de opciones
    public static void mostrarMenu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n--MENU--");
        System.out.println("1. Rellenar temperaturas aleatorias");
        System.out.println("2. Mostrar temperaturas");
        System.out.println("3. Temperatura media del mes");
        System.out.println("4. Dia o dias mas calurosos del mes");
        System.out.println("5. Salir del programa");
        System.out.print("Elige una opcion: ");
    }

    //Metodo que rellena el array con numeros aleatorios y con los dias de la semana
    public static void rellenarTemperaturas(Dia[] mes, String[] diasSemana) {
        System.out.println("");
        int diaInicial = (int) (Math.random() * 7);

        for (int i = 0; i < mes.length; i++) {
            String nombreDia = diasSemana[(diaInicial + i) % 7];
            int temperatura = (int) (Math.random() * 41);
            //Se crea el objeto Dia y se guarda en el array
            mes[i] = new Dia(nombreDia, temperatura);
        }
        
        System.out.println("Temperaturas generadas correctamente");
    }

    //Metodo que muestra las temperaturas
    public static void mostrarTemperatura(Dia[] mes) {
        System.out.println("");
        for (int i = 0; i < mes.length; i++) {
            System.out.println(mes[i].getNombreDia() + " dia " + (i + 1) + ": "
                    + mes[i].getTemperatura() + " grados");
        }
    }
    
    //Metodo que calcula la temperatura media del mes y la devuelve
    public static double temperaturaMedia(Dia[] mes){
        System.out.println("");
        int suma = 0;
        
        for (int i = 0; i < mes.length; i++) {
            suma += mes[i].getTemperatura();
        }
        
        return (double)suma / mes.length;
    }

    //Metodo que muestra el dia o dias mas calurosos del mes
    public static void mostrarDiasMasCalurosos(Dia[] mes){
        System.out.println("");
        int max = mes[0].getTemperatura();
        
        //Se busca la temperatura mayor del mes
        for (int i = 0; i < mes.length; i++) {
            if (mes[i].getTemperatura() > max){
                max = mes[i].getTemperatura();
            }
        }
        
        System.out.println("El dia o dias mas calurosos fueron: ");
        
        //Se muestra todos los dias que sean iguales a la temperatura mayor
        for (int i = 0; i < mes.length; i++) {
            if (mes[i].getTemperatura() == max){
                System.out.println("El " + mes[i].getNombreDia() + " dia " + (i + 1) + " con " + max + " grados");
            }
        }
    }
}
