package ejercicio01repaso;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio01Repaso {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        
        System.out.println("Introduce 5 numeros enteros");
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un numero: ");
            int num = entrada.nextInt();
            listaNumeros.add(num);
        }
        
        mostrarMayor(listaNumeros);
        mostrarMenor(listaNumeros);
        mostrarMedia(listaNumeros);
        borrarNumerosPares(listaNumeros);
        mostrarLista(listaNumeros);
    }
    
    public static void mostrarMayor(ArrayList<Integer> listaNumeros) {
        System.out.println("");
        
        if (listaNumeros.isEmpty()) {
            System.out.println("No hay alumnos registrados");
        } else {
            int mayor = listaNumeros.get(0);
            
            for (Integer mejorAlum : listaNumeros) {
                if (mejorAlum > mayor) {
                    mayor = mejorAlum;
                }
            }
            System.out.println("El numero mayor es: " + mayor);
        }
    }
    
    public static void mostrarMenor(ArrayList<Integer> listaNumeros) {
        System.out.println("");
        
        if (listaNumeros.isEmpty()) {
            System.out.println("No hay alumnos registrados");
        } else {
            int menor = listaNumeros.get(0);
            
            for (Integer peorAlum : listaNumeros) {
                if (peorAlum < menor) {
                    menor = peorAlum;
                }
            }
            System.out.println("El numero menor es: " + menor);
        }
    }
    
    public static void mostrarMedia(ArrayList<Integer> listaNumeros) {
        System.out.println("");
        
        if (listaNumeros.isEmpty()) {
            System.out.println("No hay alumnos registrados");
        } else {
            int suma = 0;
            
            for (Integer sumaAlum : listaNumeros) {
                suma += sumaAlum;
            }
            double media = (double)suma / listaNumeros.size();
            System.out.println("La media es: " + media);
        }
    }
    
    public static void borrarNumerosPares(ArrayList<Integer> listaNumeros) {
        if (listaNumeros.isEmpty()) {
            System.out.println("No hay nada creado");
        } else {
            Iterator<Integer> it = listaNumeros.iterator();
            while (it.hasNext()) {
                int valor = it.next();
                if (valor % 2 == 0) {
                    it.remove();
                }
            }
        }
    }
    
    public static void mostrarLista(ArrayList<Integer> listaNumeros) {
        System.out.println("");
        if (listaNumeros.isEmpty()) {
            System.out.println("No hay nada creado");
        } else {
            System.out.println("La lista final es: " + listaNumeros);
        }
    }
}