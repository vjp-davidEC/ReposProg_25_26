/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24tema5;

/**
 *
 * @author DAVID
 */
public class ProductoFresco extends Producto{//Clase que se hereda de Producto
    //Atributos
    private String fechaEnvasado;
    private String paisOrigen;
    
    //Constructores
    public ProductoFresco(){
        super();//Se pone para llamar al constructor de la clase Producto sin parámetros
        fechaEnvasado = "";
        paisOrigen = "";
    }
    
    public ProductoFresco(String fc, int nl, String fe, String po){
        super(fc, nl);//Se pone para llamar al constructor de la clase Producto con parámetros
        fechaEnvasado = fe;
        paisOrigen = po;
    }
    
    //Getters y setters
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fe) {
        this.fechaEnvasado = fe;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String po) {
        this.paisOrigen = po;
    }
    
    //Mostrar
    public void mostrarDatosProductoFresco(){
        super.mostrarDatosProducto();
        System.out.println("Fecha de envasado: " + getFechaEnvasado());
        System.out.println("Pais de origen: " + getPaisOrigen());
    }
}