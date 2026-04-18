package ejercicio25repaso08tema11;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ciudad {
    //Atributos
    private String nombre;
    private Set<Sede> sedes;

    //Constructores
    public Ciudad() {
        nombre = "";
        sedes = new LinkedHashSet<>();
    }

    public Ciudad(String nombre, Set<Sede> sedes) {
        this.nombre = nombre;
        this.sedes = sedes;
    }

    public Ciudad(String nombre) {
        this.nombre = nombre;
        sedes = new LinkedHashSet<>();
    }

    //Getters/Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(Set<Sede> sedes) {
        this.sedes = sedes;
    }

    //Metodos
    //Metodo que añade una sede
    public void aniadirSede() {
        sedes.add(new Sede(pedirNombreSede(), pedirIngresosSede()));
    }

    //Metodo que muestra todas las sedes de la ciudad
    public void mostrarSedes() {
        if (sedes.isEmpty()) {
            System.out.println("No hay sedes registradas");
        } else {
            for (Sede sede : sedes) {
                System.out.println(sede.toString());
            }
        }
    }

    //Metodo que calcula la media de ingresos de todas las sedes de la ciudad
    public double ingresosMedios() {
        double total = 0;
        for (Sede sede : sedes) {
            total += sede.getIngresos();
        }
        return total / sedes.size();
    }

    //Metodo que muestra las sedes cuyos ingresos superan la media de la ciudad
    public void mostrarSedeSuperioresMedia() {
        if (sedes.isEmpty()) {
            System.out.println("No hay sedes registradas");
        } else {
            double media = ingresosMedios();
            System.out.println("La media de los ingresos es: " + media);

            boolean alguna = false;

            for (Sede sede : sedes) {
                if (sede.getIngresos() > media) {
                    System.out.println(" -" + sede.getNombreSede() + "\n -" + sede.getIngresos());
                    alguna = true;
                }
            }
            if (!alguna) {
                System.out.println("Ninguna sede supera la media");
            }
        }
    }

    //Metodo que busca si existe una sede con ese nombre
    public boolean buscarSede(String nombreSede) {
        boolean encontrado = false;

        for (Sede sede : sedes) {
            if (sede.getNombreSede().equalsIgnoreCase(nombreSede)) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    //Metodos que pide al usuario el nombre de la sede y el ingreso de la sede
    public String pedirNombreSede() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre de la sede: ");
        return entrada.nextLine();
    }

    public Double pedirIngresosSede() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresos anuales: ");
        return entrada.nextDouble();
    }

    //Mostrar
    @Override
    public String toString() {
        return "Nombre de la ciudad: " + nombre + "\nSedes: " + sedes;
    }
}