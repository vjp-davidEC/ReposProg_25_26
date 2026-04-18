package ejercicio23repaso06bistema11;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Campania {
    //Atributos
    private Set<Donacion> donaciones;
    private String nombre;
    
    //Constructores
    public Campania() {
        donaciones = new TreeSet<>();
        nombre = "";
    }

    public Campania(TreeSet<Donacion> donaciones, String nombre) {
        this.donaciones = donaciones;
        this.nombre = nombre;
    }
    
    //Getters/Setters
    public Set<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(Set<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodos
    //Metodo que añade una nueva donacion al conjunto
    public void aniadirDonacion() {
        System.out.println();
        donaciones.add(new Donacion(pedirNombre(), pedirCantidad()));
    }
    
    //Metodo que muestra las donaciones registradas
    public void mostrarDonaciones() {
        System.out.println();
        if(donaciones.isEmpty()) {
            System.out.println("No hay donaciones registradas");
        } else {
            for(Donacion dona : donaciones) {
                System.out.println(dona.toString());
            }
        }
    }
    
    //Metodo que busca una donacion por el nombre del donante
    public void buscarPorNombre() {
        System.out.println();
        String nombreBuscado = nombreABuscar();
        
        boolean encontrado = false;
        
        for (Donacion dona : donaciones) {
            if(dona.getNombrePersona().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("La cantidad es de " + dona.getCantidad());
                encontrado = true;
            }
        }
        
        if(!encontrado) {
            System.out.println("No existe ninguna donacion con ese nombre");
        }
    }
    
    //Metodo que devuelve el numero total de donaciones
    public int numeroDonaciones() {
        return donaciones.size();
    }
    
    //Metodo que calcula el total recaudado sumando todas las donaciones
    public float totalRecaudado() {
        float total = 0;
        for(Donacion dona : donaciones) {
            total += dona.getCantidad();
        }
        return total;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Donaciones: " + donaciones + "\nNombre: " + nombre;
    }
    
    
     //Pedir al usuario el nombre, cantidad y el nombre a buscar
    public String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del donante: ");
        return entrada.nextLine();
    }
    public float pedirCantidad() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cantidad a donar: ");
        return entrada.nextFloat();
    }
    public String nombreABuscar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre a buscar: ");
        return entrada.nextLine();
    }
}