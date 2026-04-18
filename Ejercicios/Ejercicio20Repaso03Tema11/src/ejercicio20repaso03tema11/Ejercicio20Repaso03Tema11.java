package ejercicio20repaso03tema11;

import java.util.Scanner;

public class Ejercicio20Repaso03Tema11 {

    public static void main(String[] args) {
        Autobus[] darsenas = new Autobus[6];
        
        int opcion;
        
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            switch (opcion) {
                case 1 -> aparcarBus(darsenas);
                case 2 -> mostrarDarsenasLibres(darsenas);
                case 3 -> buscarAutobus(darsenas);
                case 4 -> buscarConductor(darsenas);
                case 5 -> busConMasConductores(darsenas);
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while (opcion != 6);
    }
    
    //Metodo que muestra el menu por pantalla
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. APARCAR AUTOBUS");
        System.out.println("2. MOSTRAR DARSENAS LIBRES");
        System.out.println("3. BUSCAR AUTOBUSES POR MATRICULA");
        System.out.println("4. BUSCAR CONDUCTOR");
        System.out.println("5. AUTOBUS CON MAS CONDUCTORES");
        System.out.println("6. SALIR DEL PROGRAMA");
        System.out.print("INTRODUCE UNA OPCION: ");
    }
    
    //Metodo que aparca un autobus en una posicion libre del vector
    public static void aparcarBus(Autobus[] darsenas) {
        System.out.println();
        
        int pos;
        do {
            System.out.print("Introduce la posicion para aparcar el bus (0-5): ");
            pos = pedirOpcion();
        } while (pos < 0 || pos > 5 || darsenas[pos] != null);
        
        Autobus bus = new Autobus(pedirMatricula());
        System.out.print("Cuantos conductores quieres aniadir: ");
        int num = pedirOpcion();
        
        //Se añade los conductores al HashMap del autobus
        for (int i = 0; i < num; i++) {
            bus.addConductor(pedirDni(), pedirNombre());
        }
        darsenas[pos] = bus;
        System.out.println("Autobus aparcado correctamente");
    }
    
    //Metodo que muestra las darsenas que estan libres
    public static void mostrarDarsenasLibres(Autobus[] darsenas) {
        System.out.println();
        
        boolean libre = false;
        
        for (int i = 0; i < darsenas.length; i++) {
            if (darsenas[i] == null) {
                System.out.println("Darsena " + i + " libre");
                libre = true;
            }
        }
        if (!libre) {
            System.out.println("No hay darsenas libres");
        }
    }
    
    //Metodo que busca un autobus por su matricula
    public static void buscarAutobus(Autobus[] darsenas) {
        System.out.println();

        String matricula = pedirMatricula();
        
        boolean encontrado = false;
        int i = 0;
        
        while (i < darsenas.length && !encontrado) {
            if (darsenas[i] != null && darsenas[i].getMatricula().equalsIgnoreCase(matricula)) {
                System.out.println("Autobus encontrado en darsena: " + i);
                System.out.println("Conductores asignados: " + darsenas[i].getConductores());
                encontrado = true;
            } else {
                i++;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro ningun autobus con esa matricula");
        }
    }
    
    //Metodo que busca un conductor por su DNI y muestra en que autobus trabaja
    public static void buscarConductor(Autobus[] darsenas) {
        System.out.println();
        
        String DNI = pedirDni();
        
        boolean encontrado = false;
        int i = 0;
        
        //Se recorre cada autobus buscando su DNI en su HashMap
        while (i < darsenas.length && !encontrado) {
            if (darsenas[i] != null && darsenas[i].getConductores().containsKey(DNI)) {
                System.out.println("El conductor trabaja en el autobus con matricula: " + darsenas[i].getMatricula());
                encontrado = true;
            } else {
                i++;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro ningun conductor con ese DNI");
        }
    }
    
    //Metodo que busca el autobus con mayor numero de conductores
    public static void busConMasConductores(Autobus[] darsenas) {
        System.out.println();
        
        int max = 0, posicion = 0;
        
        for (int i = 0; i < darsenas.length; i++) {
            if (darsenas[i] != null) {
                int cantidad = darsenas[i].getConductores().size();
                if (cantidad > max) {
                    max = cantidad;
                    posicion = i;
                }
            }
        }
        if (max == 0) {
            System.out.println("No hay autobuses aparcados o ninguno tiene conductores");
        } else {
            System.out.println("El autobus con mas conductores esta en la darsena " + posicion);
        }
    }
    
    
    //Metodo que piden la informacion al usuario de lo que sea
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    public static String pedirMatricula() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la matricula del autobus: ");
        return entrada.nextLine();
    }
    public static String pedirDni() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("DNI del conductor: ");
        return entrada.nextLine();
    }
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del conductor: ");
        return entrada.nextLine();
    }
}