/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20tema4;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio20Tema4 {

    /**
     * @param args the command line arguments
     */
    public static final String RESPUESTA_CORRECTA1 = "Madrid";//Se pone asi porque es una constante e igual que RESPUESTA_CORRECTA2
    public static final String RESPUESTA_CORRECTA2 = "Colon";
    public static void main(String[] args) {
        int nota = 0;
        
        System.out.println("EXAMEN DE CULTURA GENERAL");//Mensaje
        
        if (preguntaCapital(RESPUESTA_CORRECTA1)) {//Mensaje que sale al acertar y poner nota si aciertas o no aciertas e igual que en la nota de RESPUESTA_CORRECTA2
            System.out.println("Muy bien, respuesta correcta");
            nota += 5;
        } else {//Mensaje que sale al no acertar e igual que en RESPUESTA_CORRECTA2
            System.out.println("No es correcto. La respuesta correcta seria " + RESPUESTA_CORRECTA1);
        }
        if (preguntaDescubridor(RESPUESTA_CORRECTA2)) {
            System.out.println("Muy bien, respuesta correcta");
            nota += 5;
        } else {
            System.out.println("No es correcto. La respuesta correcta seria " + RESPUESTA_CORRECTA2);
        }
        System.out.println("NOTA DEL EXAMEN: " + nota);//Nota final que sale
    }
    public static boolean preguntaCapital(String respuestaCorrecta) {//Metodo que dice al usuario que diga la respuesta a la pregunta y que ignore si se escribe en mayus o minus
        Scanner entrada = new Scanner(System.in);
        System.out.print("1-PREGUNTA: Cual es la capital de Espania?: ");
        String respuesta = entrada.nextLine();
        return respuesta.equalsIgnoreCase(respuestaCorrecta);
    }
    public static boolean preguntaDescubridor(String respuestaCorrecta) {//Metodo que dice al usuario que diga la respuesta a la pregunta y que ignore si se escribe en mayus o minus
        Scanner entrada = new Scanner(System.in);
        System.out.print("2-PREGUNTA: Quien descubrio America?: ");
        String respuesta = entrada.nextLine();
        return respuesta.equalsIgnoreCase(respuestaCorrecta);
    }
}