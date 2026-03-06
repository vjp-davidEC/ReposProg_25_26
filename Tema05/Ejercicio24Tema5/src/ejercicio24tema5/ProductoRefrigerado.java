/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24tema5;

/**
 *
 * @author DAVID
 */
public class ProductoRefrigerado extends Producto{//Clase que se hereda de Producto
    //Atributo
    private String codigoOrganismo;
    
    //Constructores
    public ProductoRefrigerado(){
        super();//Se pone para llamar al constructor de la clase Producto sin parámetros
        codigoOrganismo = "";
    }
    
    public ProductoRefrigerado(String fc, int nl, String co){
        super(fc, nl);//Se pone para llamar al constructor de la clase Producto con parámetros
        codigoOrganismo = co;
    }
    
    //Getter y setter
    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String co) {
        codigoOrganismo = co;
    }
    
    //Mostrar
    public void mostrarDatosProductoRefrigerado(){
        super.mostrarDatosProducto();
        System.out.println("Codigo del organismo: " + getCodigoOrganismo());
    }
}