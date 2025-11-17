/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso03tema5;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Repaso03Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Variables 
        int cantidadEstudiantes;
        double sumaNotas = 0;
        int contador = 0;
        String nombre;
        int edad;
        double nota;
        double media;
        
        System.out.print("Cuantos estudiantes quieres registrar?: ");
        cantidadEstudiantes = entrada.nextInt();
        entrada.nextLine();//Limpiar buffer
        System.out.println("");
        
        //Bucle que se repite hasta registrar todos los estudiantes 
        while (contador < cantidadEstudiantes) {
            System.out.print("Nombre: ");
            nombre = entrada.nextLine();

            System.out.print("Edad: ");
            edad = entrada.nextInt();

            System.out.print("Nota final: ");
            nota = entrada.nextDouble();
            entrada.nextLine(); // limpiar buffer

            if (nota >= 5) {//Evaluar si el estudiante aprueba o suspende 
                System.out.println(nombre + " ha aprobado");
            } else {
            System.out.println(nombre + " ha suspendido");
            }
            System.out.println("");

            sumaNotas = sumaNotas + nota;//Rumamos la nota al acumulador 
            contador++;//Incrementamos el contador 
        }
        media = sumaNotas / cantidadEstudiantes;//
        System.out.println("Nota media de la clase: " + media);
    }
}
/*
    Scanner entrada: permite leer datos desde el teclado.
    cantidadEstudiantes: el usuario indica cuántos estudiantes quiere registrar.
    while (contador < cantidadEstudiantes): el programa se repite hasta que se registren todos los estudiantes.
    Dentro del bucle:
        Se pide el nombre, la edad y la nota final.
        Se evalúa si la nota es mayor o igual a 5 → aprobado, si no → suspendido.
        Se acumula la nota en sumaNotas.
        Se incrementa el contador para pasar al siguiente estudiante.
    Al final: se calcula la media de la clase dividiendo la suma de todas las notas entre el número de estudiantes.
*/