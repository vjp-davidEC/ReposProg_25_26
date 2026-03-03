/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15y16tema8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Pelicula {
    //Atributos
    private String titulo;
    private float costeLicencia;
    private Socios[] socios;
    
    //Constructores
    public Pelicula(){
        titulo = "";
        costeLicencia = 0f;
        socios = new Socios[4];
    }

    public Pelicula(String titulo, float costeLicencia, Socios[] socios) {
        this.titulo = titulo;
        this.costeLicencia = costeLicencia;
        this.socios = socios;
    }
    
    public Pelicula(String titulo, float costeLicencia) {
        this.titulo = titulo;
        this.costeLicencia = costeLicencia;
        socios = new Socios[4];
    }

    //Getters/Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getCosteLicencia() {
        return costeLicencia;
    }

    public void setCosteLicencia(float costeLicencia) {
        this.costeLicencia = costeLicencia;
    }

    public Socios[] getSocios() {
        return socios;
    }

    public void setSocios(Socios[] socios) {
        this.socios = socios;
    }
    
    //Metodos
    //Se rellenan los socios y en el main las peliculas
    public void rellenarSocios() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce los 4 socios que han asistido:");
        for (int i = 0; i < socios.length; i++) {
            System.out.print("Nombre socio " + (i + 1) + ": ");
            String nombre = entrada.nextLine();
            System.out.print("Precio abonado: ");
            float precio = entrada.nextFloat();
            entrada.nextLine(); // limpiar buffer 
            socios[i] = new Socios(nombre, precio);
        } 
    }
    
    //Muestra los socios de esta película
    public void mostrarSocios() {
        for (Socios s : socios) {
            System.out.println(s.toString());
        }
    }
    
    //Calcula el beneficio bruto con la suma de los precios abonados
    public float calcularBeneficioBruto() {
        float suma = 0f;
        for (Socios s : socios) {
            suma += s.getPrecioAbonado();
        }
        return suma;
    }
    
    //Calcula el beneficio neto de restar bruto y coste licencia
    public float calcularBeneficioNeto() {
        return calcularBeneficioBruto() - costeLicencia;
    }
    
    //Cuenta cuántos socios han pagado más que un mínimo
    public int contarSociosConPrecioMayor(float minimo) {
        int contador = 0;
        for (Socios s : socios) {
            if (s.getPrecioAbonado() > minimo) {
                contador++;
            }
        }
        return contador;
    }
    
    //Muestra socios cuyo nombre empieza por una letra
    public void mostrarSociosPorLetra(char letra) {
        letra = Character.toLowerCase(letra);
        for (Socios s : socios) {
            if (s.getNombreSocio().toLowerCase().charAt(0) == letra) {
                System.out.println(s.toString());
            }
        }
    }
    
    //Devuelve true si el título empieza por un texto
    public boolean empiezaPorTexto(String texto){
        String tituloMin = titulo.toLowerCase();
        String textoMin = texto.toLowerCase();
        boolean coincide = true;
        
        //Si el texto es más largo que el título
        if(textoMin.length() > tituloMin.length()){
            coincide = false;
        }else{
            //Comparación letra a letra
            for(int i = 0; i < textoMin.length() && coincide; i++){
                if(tituloMin.charAt(i) != textoMin.charAt(i)){
                    coincide = false;
                }
            }
        }
        return coincide;
    }
    
    //Se cambia el 'a' por 'e' en el título
    public void cambiarAporE() {
        String nuevo = titulo.replace('a', 'e');
        titulo = nuevo;
        System.out.println("Nuevo titulo: " + nuevo);
    }
    
    //Convierte el título a mayúsculas
    public void convertirTituloMayusculas() {
        titulo = titulo.toUpperCase();
    }

    //Mostrar
    @Override
    public String toString() {
        return "Titulo: " + titulo + " - " + "\nCosteLicencia: " + costeLicencia + " - " + "\nSocios: " + socios;
    }
}