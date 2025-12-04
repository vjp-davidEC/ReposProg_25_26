/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06tema6;

/**
 *
 * @author DAVID
 */
public class Persona implements Transformable {
    //Atributos
    private String nombre;
    private String apellidos;
    private String alias;
    
    //Cosntructores
    public Persona() {
        nombre = "";
        apellidos = "";
        alias = "";
    }
    
    public Persona(String nombre, String apellidos, String alias) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.alias = alias;
    }
    
    //Getters/Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", alias=" + alias + '}';
    }
    
    //Métodos
    @Override
    public String concatenarTodo() {
        return nombre + "#" + apellidos + "#" + alias;
    }

    @Override
    public String obtenerIniciales() {
        return "" + nombre.charAt(0) + apellidos.charAt(0) + alias.charAt(0);
    }

    @Override
    public void contarVocales() {
        int total = contarVocalesCadena(nombre) 
                  + contarVocalesCadena(apellidos) 
                  + contarVocalesCadena(alias);
        System.out.println("Total de vocales en Persona: " + total);
    }

    @Override
    public String obtenerCadenaMasLarga() {
        String mayor = nombre;
        if (apellidos.length() > mayor.length()) 
            mayor = apellidos;
        if (alias.length() > mayor.length()) 
            mayor = alias;
        return mayor;
    }

    @Override
    public boolean buscarCadena(String cadena) {
        return nombre.equals(cadena) || apellidos.equals(cadena) || alias.equals(cadena);
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