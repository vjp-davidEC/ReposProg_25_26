/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09tema9;

import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio09Tema9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre de usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Introduce tu contrasenia: ");
        String contrasenia = sc.nextLine();

        if (esContrasenaValida(usuario, contrasenia)) {
            System.out.println("Contrasenia valida");
        } else {
            System.out.println("Contrasenia no valida");
        }
    }

    //Método que verifica si la contraseña cumple los requisitos
    public static boolean esContrasenaValida(String usuario, String contrasenia) {
        boolean valida = true;

        //1. Comprobar longitud mínima
        if (contrasenia.length() < 6) {
            System.out.println("La contrasenia debe tener al menos 6 caracteres");
            valida = false;
        }

        //2. Comprobar que contiene al menos 2 dígitos
        int contadorDigitos = 0;
        for (int i = 0; i < contrasenia.length(); i++) {
            char c = contrasenia.charAt(i);
            if (c >= '0' && c <= '9') {
                contadorDigitos++;
            }
        }

        if (contadorDigitos < 2) {
            System.out.println("La contrasenia debe contener al menos 2 digitos");
            valida = false;
        }

        //3. Comprobar que el nombre de usuario no está dentro de la contraseña
        if (contrasenia.toLowerCase().contains(usuario.toLowerCase())) {
            System.out.println("La contrasenia no puede contener el nombre de usuario");
            valida = false;
        }
        
        return valida;
    }
}