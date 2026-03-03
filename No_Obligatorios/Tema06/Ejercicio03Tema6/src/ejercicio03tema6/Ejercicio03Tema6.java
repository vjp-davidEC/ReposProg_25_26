/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03tema6;

/**
 *
 * @author alumno
 */
public class Ejercicio03Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objetos que se crean de cada figura con sus atributos
        Circulo cir = new Circulo("Azul", 5.5);
        Rectangulo r = new Rectangulo("Verde", 4.75, 5.56);
        Cuadrado cua = new Cuadrado("Verde", 6.75);
        TrianguloRectangulo tr = new TrianguloRectangulo("Amarillo", 5, 5.90);
        
        //Mostrar datos de cada figura usando el método auxiliar mostrarFigura()
        mostrarFigura(cir);
        mostrarFigura(r);
        mostrarFigura(cua);
        mostrarFigura(tr);
        
        //Métodos específicos del triángulo rectángulo
        System.out.println("Hipotenusa del triangulo: " + tr.calcularHipotenusa());
        System.out.println("Tipo de triangulo: " + tr.tipoTriangulo());
        
        System.out.println("");
        
        //Objetos que se crean desde la Clase FiguraGeometrica
        FiguraGeometrica fgcir = new Circulo("Rojo", 5.5);
        FiguraGeometrica fgr = new Rectangulo("Azul", 6.75, 2.56);
        FiguraGeometrica fgcua = new Cuadrado("Rojo", 4.75);
        FiguraGeometrica fgtr = new TrianguloRectangulo("Verde", 2.75, 2.75);
        
        //Mostrar datos de las figuras con poliformismo
        mostrarFigura(fgcir);
        mostrarFigura(fgr);
        mostrarFigura(fgcua);
        mostrarFigura(fgtr);
    }
    //Método auxiliar que recibe cualquier figura geométrica y muestra sus datos
    public static void mostrarFigura(FiguraGeometrica figura){
        System.out.println("\nFigura de color: " + figura.getColor());
        System.out.println("Area: " + figura.calcularArea() + " cm2");
        System.out.println("Perimetro: " + figura.calcularPerimetro() + " cm");
    }
}