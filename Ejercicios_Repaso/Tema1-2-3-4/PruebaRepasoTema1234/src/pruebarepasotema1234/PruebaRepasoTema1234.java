/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebarepasotema1234;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class PruebaRepasoTema1234 {

    /**
     */
    //----CONSTANTE----
    public final static int VALOR_CONSTANTE = 100;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //----VARIABLE----
        int miPrimeraVariable = 5;
        //--MOSTRAR VARIABLE/CONSTANTE--
        System.out.println("----VARIABLES/CONSTANTE----");
        System.out.println("El valor es: " + (miPrimeraVariable * VALOR_CONSTANTE));
        System.out.println("El valor de la constante es: " + VALOR_CONSTANTE);
        System.out.println("");
        
        //----OPERADORES ARITMETICOS----
        int suma = miPrimeraVariable + VALOR_CONSTANTE;
        int resta = miPrimeraVariable - VALOR_CONSTANTE;
        int mult = miPrimeraVariable * VALOR_CONSTANTE;
        int division = VALOR_CONSTANTE / miPrimeraVariable;
        int modulo = VALOR_CONSTANTE % miPrimeraVariable;
        //--MOSTRAR-O.ARITMETICOS--
        System.out.println("----OPERADORES ARITMETICOS----");
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(mult);
        System.out.println(division);
        System.out.println(modulo);
        System.out.println("");
        
        //----OPERADORES RELACIONALES----
        /*  false || false = false
            true || false = true
            false || true = true
            true || true = true
        */
        boolean or = miPrimeraVariable == 5 || VALOR_CONSTANTE == 100;
        
        /*  false && false = false
            true && false = false
            false && true = false
            true && true = true
        */
        boolean and = miPrimeraVariable > 0 && VALOR_CONSTANTE < 110;
        
        //El operador && tiene mas prioridad que el ||
        boolean combinacion = miPrimeraVariable < 0 && VALOR_CONSTANTE >= 100 || miPrimeraVariable != 20;
        //--MOSTRAR--
        System.out.println("----OPERADORES RELACIONALES----");
        System.out.println(or);
        System.out.println(and);
        System.out.println(combinacion);
        System.out.println("");
        
        //----OPERADORES LOGICOS----
         boolean mayor = miPrimeraVariable > VALOR_CONSTANTE;
        boolean mayorIgual = miPrimeraVariable >= VALOR_CONSTANTE;
        boolean menor = miPrimeraVariable < VALOR_CONSTANTE;
        boolean menorIgual = miPrimeraVariable <= VALOR_CONSTANTE;
        boolean igual = miPrimeraVariable == VALOR_CONSTANTE;
        boolean distinto = miPrimeraVariable != VALOR_CONSTANTE;
        boolean inverso = !distinto;
        //--MOSTRAR--
        System.out.println("----OPERADORES LOGICOS----");
        System.out.println(mayor);
        System.out.println(mayorIgual);
        System.out.println(menor);
        System.out.println(menorIgual);
        System.out.println(igual);
        System.out.println(distinto);
        System.out.println(inverso);
        System.out.println("");
        
        //----OPERADORES UNARIOS/MOSTRAR----
        System.out.println("----OPERADORES UNARIOS----");
        //El valor no se actualiza hasta la siguiente linea
        System.out.println(miPrimeraVariable++);//miPrimeraVariable = miPrimeraVariable + 1
        System.out.println(miPrimeraVariable);
        //El valor no se actualiza hasta la siguiente linea
        System.out.println(miPrimeraVariable--);//miPrimeraVariable = miPrimeraVariable - 1
        System.out.println(miPrimeraVariable);
        //El valor no se actualiza antes de la siguiente linea
        System.out.println(++miPrimeraVariable);
        System.out.println(miPrimeraVariable);
        //El valor no se actualiza antes de la siguiente linea
        System.out.println(--miPrimeraVariable);
        System.out.println(miPrimeraVariable);
        System.out.println("");
        
        //----SCANNER----
        int numero;
        double decimal;
        String cadena;
        //--MOSTRAR--
        System.out.println("----SCANNER----");
        System.out.print("Introduce un numero entero: ");
        numero = entrada.nextInt();
        System.out.println("Has introducido el numero: " + numero);
        System.out.print("Introduce un numero decimal: ");
        decimal = entrada.nextDouble();
        System.out.println("Has introducido el numero: " + decimal);
        System.out.print("Introduce tu nombre: ");
        cadena = entrada.next();
        System.out.println("Tu nombre es: " + cadena);
        System.out.println("");
        
        //----IF...ELSE/MOSTRAR----
        System.out.println("----IF...ELSE----");
        if(miPrimeraVariable >= 6){
            System.out.println("Es mayor de 5 anios");
        }else{
            System.out.println("Es menor de 5 anios");
        }
        System.out.println("");
        
        //----SWITCH----
        int diaSemana = 2;
        //MOSTRAR
        System.out.println("----SWITCH----");
        switch(diaSemana){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Dia no valido");
        }
        System.out.println("");
        
        //----WHILE/MOSTRAR----
        System.out.println("----WHILE----");
        while(miPrimeraVariable <= 15){
            System.out.println(miPrimeraVariable);
            miPrimeraVariable++;
        }
        System.out.println("");
        
        //----DO...WHILE----
        int p = 1;
        //--MOSTRAR--
        System.out.println("----DO...WHILE----");
        do{
            System.out.println(p);
            p++;
        }while(p <= 15);
        System.out.println("");
        
        //----FOR----
        int i;
        //--MOSTRAR--
        System.out.println("----FOR----");
        for(i = 0; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("");
        
        //----TRY...CATCH----
        int num = 10;
        int num2 = 0;
        int division1;
        //--MOSTRAR--
        System.out.println("----TRY...CATCH----");
        try{
            System.out.print("Introduce un numero entero: ");
            numero = entrada.nextInt();
            System.out.println("El numero introducido es: " + numero);
        }catch(InputMismatchException e){
            entrada.next();
            System.out.println("Debes introducir un numero");
        }
        System.out.println("");
        try{
            division1 = num / num2;
            System.out.println("La division es: " + division1);
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir entre 0");
        }
        System.out.println("");
        
        //----MATH----
        int valor1 = -5;
        double valor2 = 5.3;
        int valor3 = 25;
        int valor4 = 2;
        int valor5 = 120;
        //---CLASES MATH---
        int abs = Math.abs(valor1);
        double floor = Math.floor(valor2);
        double ceil = Math.ceil(valor2);
        double round = Math.round(valor2);
        double pow = Math.pow(valor3, valor4);
        double sqrt = Math.sqrt(valor3);
        double exp = Math.exp(valor4);
        int max = Math.max(valor4, valor3);
        int min = Math.min(valor4, valor3);
        //--MOSTRAR--
        System.out.println("----MATH----");
        System.out.println(abs);
        System.out.println(floor);
        System.out.println(ceil);
        System.out.println(round);
        System.out.println(pow);
        System.out.println(sqrt);
        System.out.println(exp);
        System.out.println(max);
        System.out.println(min);
        System.out.println("");
        
        //----RANDOM/MOSTRAR----
        Random random = new Random();
        System.out.println("----RANDOM----");
        numero = random.nextInt(1, 100);
        System.out.println(numero);
        decimal = random.nextDouble(1, 10);
        System.out.println(decimal);
        System.out.println("");
               
        //----STRING----
        String hola = "Hola";
        String hola2 = "hola";
        //--MOSTRAR--
        System.out.println("----STRING----");
        System.out.println(hola.toLowerCase());
        System.out.println(hola.toUpperCase());
        if(hola.equals(hola2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
        if(hola.equalsIgnoreCase(hola2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        System.out.println(hola.length());
        System.out.println(hola.charAt(0));
        System.out.println(hola.charAt(1));
        System.out.println(hola.charAt(2));
        System.out.println(hola.charAt(3));
        System.out.println("");
               
        //----FUNCIONES----
        System.out.println("----FUNCIONES CON METODOS----");
        saludar("David Escudero Coca");
        
        division1 = suma(VALOR_CONSTANTE, miPrimeraVariable);
        System.out.println("El resultado es " + division1);
        
        if(esPar(valor4)){
            System.out.println("El numero " + valor4 + " es par");
        }else{
            System.out.println("El numero " + valor4 + " es impar");
        }
    }
    
    //----MÉTODOS DE LAS FUNCIONES----
    public static void saludar(String nombre){
        System.out.println("Hola " + nombre);
    }
    
    public static int suma(int num1, int num2){
        return num1 + num2;
    }
    
    public static boolean esPar(int numero){
        return numero % 2 == 0;
    }
}