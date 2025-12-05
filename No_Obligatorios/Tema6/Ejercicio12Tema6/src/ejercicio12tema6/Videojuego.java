/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12tema6;

/**
 *
 * @author DAVID
 */
public final class Videojuego extends Contenido {
    //Atributos
    private int horasEstimadas;
    private Estudio estudio;

    //Constructores
    public Videojuego() {
        super("Sin título", "Sin género");
        this.horasEstimadas = 10;
        this.estudio = new Estudio("Desconocido", "Sin lanzamiento");
    }

    public Videojuego(String titulo, int horasEstimadas) {
        super(titulo, "Sin género");
        this.horasEstimadas = horasEstimadas;
        this.estudio = new Estudio("Desconocido", "Sin lanzamiento");
    }

    public Videojuego(String titulo, String genero, int horasEstimadas, Estudio estudio) {
        super(titulo, genero);
        this.horasEstimadas = horasEstimadas;
        this.estudio = estudio;
    }
    
    //Getters/Setters
    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public Estudio getEstudio() {
        return estudio;
    }

    public void setEstudio(Estudio estudio) {
        this.estudio = estudio;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return super.toString() + "Videojuego{" + "horasEstimadas=" + horasEstimadas + ", estudio=" + estudio + '}';
    }
     
    //Métodos abtractos de la clase Contenido
    @Override
    //Solicitar al usuario que valore distintos aspectos del videojuego
    public float valorar() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Valora el videojuego '" + getTitulo() + "' de " + estudio.getNombre());
        System.out.print("Contenidos exclusivos del 1-5: ");
        int exclusivos = sc.nextInt();
        System.out.print("Gameplay del 1-5: ");
        int gameplay = sc.nextInt();
        System.out.print("Innovacion del 1-5: ");
        int innovacion = sc.nextInt();
        float media = (exclusivos + gameplay + innovacion) / 3f;
        System.out.println("Valoracion media: " + media);
        return media;
    }

    @Override
    //Verificar si el videojuego ya está entregado
    public void entregar() {
        if (!esEntregado()) {
            super.entregar();
            System.out.println("'Has alquilado " + getTitulo() + " de " + estudio.getNombre() + "'");
        } else {
            System.out.println("'" + getTitulo() + " no esta disponible'");
        }
    }

    @Override
    //Verificar si el videojuego está entregado antes de devolverlo
    public void devolver() {
        if (esEntregado()) {
            super.devolver();
            System.out.println("'" + getTitulo() + " de " + estudio.getNombre() + " devuelto correctamente." + 
                    " Si te ha gustado, puedes probar el ultimo lanzamiento de " + estudio.getNombre() + ": " + estudio.getUltimoLanzamiento() + "'");
            System.out.println();
        } else {
            System.out.println("No puedes devolver el videojuego");
        }
    }
}