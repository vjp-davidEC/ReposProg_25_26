/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17tema5;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio17Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double nota = 0;//Variable
        
        //Objetos de la clase enunciado cada uno con una pregunta y su respuesta
        Enunciado enun1 = new Enunciado("Cual es la capital de Espania?: ", "Madrid");
        Enunciado enun2 = new Enunciado("Quien descubrio America?: ", "Colon");
        Enunciado enun3 = new Enunciado("Cuanto es 5x5: ", "25");
        Enunciado enun4 = new Enunciado("Color del cielo?: ", "Azul");
        
        //Mostrar las preguntas y recoger la respuesta del usuario
        System.out.print(enun1.getPregunta());
        String r1 = entrada.nextLine();
        if (r1.equalsIgnoreCase("Madrid")){
            nota += 2.5;
        }
        enun1.comprobar(r1);
        
        System.out.print(enun2.getPregunta());
        String r2 = entrada.nextLine();
        if (r2.equalsIgnoreCase("Colon")){
            nota += 2.5;
        }
        enun2.comprobar(r2);
        
        System.out.print(enun3.getPregunta());
        String r3 = entrada.nextLine();
        if (r3.equalsIgnoreCase("25")){
            nota += 2.5;
        }
        enun3.comprobar(r3);
        
        System.out.print(enun4.getPregunta());
        String r4 = entrada.nextLine();
        if (r4.equalsIgnoreCase("Azul")){
            nota += 2.5;
        }
        enun4.comprobar(r4);
        
        System.out.println("La nota final es: " + nota);//Resultado
    }
}