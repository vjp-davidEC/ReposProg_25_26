/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06tema6;

/**
 *
 * @author DAVID
 */
public class Libro implements Transformable {
    //Atributos
    private String titulo;
    private String autor;
    private String genero;
    
    //Constructores
    public Libro(){
        super();
        titulo = "";
        autor = "";
        genero = "";
    }
    
    public Libro(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }
    
    //Getters/Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + '}';
    }
    
    //Métodos
    @Override
    public String concatenarTodo() {
        return titulo + "#" + autor + "#" + genero;
    }

    @Override
    public String obtenerIniciales() {
        return "" + titulo.charAt(0) + autor.charAt(0) + genero.charAt(0);
    }

    @Override
    public void contarVocales() {
    int total = contarVocalesCadena(titulo) 
              + contarVocalesCadena(autor) 
              + contarVocalesCadena(genero);

    System.out.println("Total de vocales en Libro: " + total);
}

    @Override
    public String obtenerCadenaMasLarga() {
        String mayor = titulo;
        if (autor.length() > mayor.length()) mayor = autor;
        if (genero.length() > mayor.length()) mayor = genero;
        return mayor;
    }

    @Override
    public boolean buscarCadena(String cadena) {
        return titulo.equals(cadena) || autor.equals(cadena) || genero.equals(cadena);
    }
    
    //Método para contar vocales en la cadena
    public int contarVocalesCadena(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {//Recorre cada carácter de la cadena
            char c = Character.toLowerCase(cadena.charAt(i));//Convierte a minúscula
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {//Si el carácter es una vocal, incrementa el contador
                contador++;
            }
        }
        return contador;//Devuelve el número de vocales encontradas
    }
}