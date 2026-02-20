/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajafuerte;

/**
 *
 * @author alumno
 */
public class Moneda {
    //Atributos
    private float valor;
    private String pais;
    private String material;

    //Constructores
    public Moneda() {
        valor = 0f;
        pais = "";
        material = "";
    }
    
    public Moneda(float valor, String pais, String material) {
        this.valor = valor;
        this.pais = pais;
        this.material = material;
    }

    //Getters/Setters
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    //Mostrar
    @Override
    public String toString() {
        return "El valor es " + valor + ", es de " + pais + " y esta fabricada de " + material;
    }
}