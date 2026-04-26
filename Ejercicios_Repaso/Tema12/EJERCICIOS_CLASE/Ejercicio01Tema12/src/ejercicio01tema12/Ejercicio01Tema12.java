/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01tema12;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio01Tema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Lista donde se almaceran los contactos
        ArrayList<Contacto> agendaTelefonica = new ArrayList<>();

        int opcion = 0;

        do {//Bucle principal
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1 -> aniadirContactosAgenda(agendaTelefonica);
                    case 2 -> visualizarListaContactos(agendaTelefonica);
                    case 3 -> eliminarContactoLista(agendaTelefonica);
                    case 4 -> mostrarContactosEdad(agendaTelefonica);
                    case 5 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opcion no valida, intentalo de nuevo");
                }
            } catch (InputMismatchException e) {//Cuando el usuario introduce una letra
                System.out.println("Error: Debes introducir un numero entero");
                entrada.nextLine();
            }
        } while (opcion != 5);//Salir cuando pulse 5
    }

    //Metodo que muestra el menu por pantalla
    public static void mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. ANIADIR CONTACTOS A LA AGENDA");
        System.out.println("2. VISUALIZAR LA LISTA DE CONTACTOS");
        System.out.println("3. ELIMINAR CONTACTOS DE LA LISTA");
        System.out.println("4. MOSTRAR TODOS LOS CONTACTOS POR SU EDAD");
        System.out.println("5. SALIR DEL PROGRAMA");
        System.out.print("INTRODUCE UNA OPCION: ");
    }

    //Metodo que añade un nuevo contacto a la agenda
    public static void aniadirContactosAgenda(ArrayList<Contacto> agendaTelefonica) throws InputMismatchException {
        System.out.println();
        
        System.out.println("--Introduce los datos del contacto--");
        //Se crea un nuevo contacto con las opciones que son
        agendaTelefonica.add(new Contacto(pedirNombre(), pedirEdad(), pedirTelefonoMovil()));
        System.out.println("Contacto guardado correctamente");
    }

    //Metodo que muestra todos los contactos almacenados
    public static void visualizarListaContactos(ArrayList<Contacto> agendaTelefonica) {
        System.out.println();
        
        if (agendaTelefonica.isEmpty()) {
            System.out.println("La agenda esta vacia");
        } else {
            //Se recorre la lista y muestra cada contacto
            for (Contacto contacto : agendaTelefonica) {
                System.out.println(contacto);
            }
        }
    }

    //Metodo que elimina un contacto buscando su numero del movil
    public static void eliminarContactoLista(ArrayList<Contacto> agendaTelefonica) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el telefono movil que deseas eliminar: ");
        int telefonoMovil = entrada.nextInt();
        
        boolean eliminado = false;
        int i = 0;
        
        //Busqueda
        while (i < agendaTelefonica.size() && !eliminado) {
            Contacto contacto = agendaTelefonica.get(i);
            //Si coincide el numero, se elimina
            if (contacto.getNumeroMovil() == telefonoMovil) {
                agendaTelefonica.remove(i);
                eliminado = true;
                System.out.println("Contacto eliminado correctamente");
            } else {
                i++;
            }
        }
        if (!eliminado) {
            System.out.println("No existe ningun contacto con ese numero");
        }
    }

    //Metodo que muestra todos los contactos ordenados por la edad
    public static void mostrarContactosEdad(ArrayList<Contacto> agendaTelefonica) {
        System.out.println();
        
        if (agendaTelefonica.isEmpty()) {
            System.out.println("La agenda esta vacia");
        } else {
            //Ordenacion burbuja
            for (int i = 0; i < agendaTelefonica.size() - 1; i++) {
                for (int j = i + 1; j < agendaTelefonica.size(); j++) {
                    //Si j tiene menor que edad que i, se intercambian
                    if (agendaTelefonica.get(j).getEdad() < agendaTelefonica.get(i).getEdad()) {
                        Contacto aux = agendaTelefonica.get(i);
                        agendaTelefonica.set(i, agendaTelefonica.get(j));
                        agendaTelefonica.set(j, aux);
                    }
                }
            }
            System.out.println("--Contactos ordenador por edad--");
            for (Contacto contacto : agendaTelefonica) {
                System.out.println(contacto.toString());
            }
        }
    }
    
    //Metodos que piden el nombre, edad y telefono movil
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        return nombre;
    }
    
    public static int pedirEdad() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Edad: ");
        int edad = entrada.nextInt();
        return edad;
    }
    
    public static int pedirTelefonoMovil() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Telefono movil: ");
        int telefonoMovil = entrada.nextInt();
        return telefonoMovil;
    }
}