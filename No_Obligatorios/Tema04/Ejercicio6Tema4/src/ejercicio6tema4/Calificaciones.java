/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6tema4;

/**
 *
 * @author DAVID
 */
public class Calificaciones {
    public static void calificarNota(int nota) {//El metodo para recibir la nota y mostrar la calificación
      if (nota >= 0 && nota <= 4) {//Resultado suspenso
          System.out.println("Suspenso");
      } else if (nota >= 5 && nota <= 6) {//Resultado bien
          System.out.println("Bien");
      } else if (nota >= 7 && nota <= 8) {//Resultado notable
          System.out.println("Notable");
      } else if (nota >= 9 && nota <= 10) {//Resultado sobresaliente
          System.out.println("Sobresaliente");
      } else {
          System.out.println("Error: Nota invalida, debe estar entre 0 y 10");//Error
      }
    }   
}