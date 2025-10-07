/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9tema3;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Ejercicio9Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1, menor1;
        int numero2, menor2;
        int numero3, menor3;
        int numero4, menor4;
        
        System.out.println("Por favor, introduzca el primer numero:");
        numero1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero:");
        numero2 = entrada.nextInt();
        System.out.println("Introduzca el tercer numero:");
        numero3 = entrada.nextInt();
        System.out.println("Por ultimo, introduzca un cuarto numero:");
        numero4 = entrada.nextInt();
        
        //Encontrar el menor número
        if (numero1 <= numero2 && numero1 <= numero3 && numero1 <= numero4) {
            menor1 = numero1;
            //Encontrar el menor entre numero2, numero3, numero4
            if (numero2 <= numero3 && numero2 <= numero4) {
                menor2 = numero2;
                if (numero3 <= numero4) {
                    menor3 = numero3;
                    menor4 = numero4;
                } else {
                    menor3 = numero4;
                    menor4 = numero3;
                }
            } else if (numero3 <= numero2 && numero3 <= numero4) {
                menor2 = numero3;
                if (numero2 <= numero4) {
                    menor3 = numero2;
                    menor4 = numero4;
                } else {
                    menor3 = numero4;
                    menor4 = numero2;
                }
            } else {
                menor2 = numero4;
                if (numero2 <= numero3) {
                    menor3 = numero2;
                    menor4 = numero3;
                } else {
                    menor3 = numero3;
                    menor4 = numero2;
                }
            }
        } else if (numero2 <= numero1 && numero2 <= numero3 && numero2 <= numero4) {
            menor1 = numero2;
            //Encontrar el menor entre numero1, numero3, numero4
            if (numero1 <= numero3 && numero1 <= numero4) {
                menor2 = numero1;
                if (numero3 <= numero4) {
                    menor3 = numero3;
                    menor4 = numero4;
                } else {
                    menor3 = numero4;
                    menor4 = numero3;
                }
            } else if (numero3 <= numero1 && numero3 <= numero4) {
                menor2 = numero3;
                if (numero1 <= numero4) {
                    menor3 = numero1;
                    menor4 = numero4;
                } else {
                    menor3 = numero4;
                    menor4 = numero1;
                }
            } else {
                menor2 = numero4;
                if (numero1 <= numero3) {
                    menor3 = numero1;
                    menor4 = numero3;
                } else {
                    menor3 = numero3;
                    menor4 = numero1;
                }
            }
        } else if (numero3 <= numero1 && numero3 <= numero2 && numero3 <= numero4) {
            menor1 = numero3;
            //Encontrar el menor entre numero1, numero2, numero4
            if (numero1 <= numero2 && numero1 <= numero4) {
                menor2 = numero1;
                if (numero2 <= numero4) {
                    menor3 = numero2;
                    menor4 = numero4;
                } else {
                    menor3 = numero4;
                    menor4 = numero2;
                }
            } else if (numero2 <= numero1 && numero2 <= numero4) {
                menor2 = numero2;
                if (numero1 <= numero4) {
                    menor3 = numero1;
                    menor4 = numero4;
                } else {
                    menor3 = numero4;
                    menor4 = numero1;
                }
            } else {
                menor2 = numero4;
                if (numero1 <= numero2) {
                    menor3 = numero1;
                    menor4 = numero2;
                } else {
                    menor3 = numero2;
                    menor4 = numero1;
                }
            }
        } else {
            menor1 = numero4;
            //Encontrar el menor entre numero1, numero2, numero3
            if (numero1 <= numero2 && numero1 <= numero3) {
                menor2 = numero1;
                if (numero2 <= numero3) {
                    menor3 = numero2;
                    menor4 = numero3;
                } else {
                    menor3 = numero3;
                    menor4 = numero2;
                }
            } else if (numero2 <= numero1 && numero2 <= numero3) {
                menor2 = numero2;
                if (numero1 <= numero3) {
                    menor3 = numero1;
                    menor4 = numero3;
                } else {
                    menor3 = numero3;
                    menor4 = numero1;
                }
            } else {
                menor2 = numero3;
                if (numero1 <= numero2) {
                    menor3 = numero1;
                    menor4 = numero2;
                } else {
                    menor3 = numero2;
                    menor4 = numero1;
                }
            }
        }

        System.out.println("El orden de los numeros introducidos es el " + menor1 + "-" + menor2 + "-" + menor3 + "-" + menor4);
    }
}
