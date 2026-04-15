/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08t11;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Quique Pineda
 */
public class Ejercicio08T11 {

    public static void insCiudad(ArrayList<Ciudad> lCiudades){
        Scanner teclado = new Scanner(System.in);
        Ciudad nCiudad;
        String ciudad;
        System.out.print("Nombre ciudad: ");
        ciudad = teclado.nextLine();
        nCiudad = new Ciudad(ciudad);
        //Rellenamos las sedes de la nueva ciudad
        nCiudad.rellenarSedes();
        lCiudades.add(nCiudad);
    }
    
    public static void mostrarCiudades(ArrayList<Ciudad> lCiudades){
        for(int i = 0;i < lCiudades.size();i++){
            lCiudades.get(i).mostrarCiudad();
        }
    }
    
    //Calcula la media de ingresos de entre todas las sedes que haya en todas nuestras ciudades
    public static int calcularMediaDeIngresos(ArrayList<Ciudad> lCiudades){
        int totalIngresos = 0;
        int totalSedes = 0;
        for(int i = 0;i < lCiudades.size();i++){
            totalIngresos = totalIngresos + lCiudades.get(i).getTotalIngresosDeCiudad();
            totalSedes = totalSedes + lCiudades.get(i).getNumSedes();
        }
        return (totalIngresos / totalSedes);  //Trabajamos con int porque los ingresos de las sedes son enteros
    }

    //Muestra las sedes cuyos ingresos sean superiores a una media dada
    public static void mostrarSedesSegunMedia(ArrayList<Ciudad> lCiudades, int media){
        System.out.println("Las sedes con ingresos superiores a "+media+" son: ");
        for(int i = 0;i < lCiudades.size();i++){
            lCiudades.get(i).mostrarSedeSiMayorMedia(media);
        }
    }
    
    public static boolean buscarSede(ArrayList<Ciudad> lCiudades, String nombre){
        int i = 0;
        boolean enc = false;
        while((!enc)&&(i < lCiudades.size())){
            if  (lCiudades.get(i).buscarSedePorNombre(nombre)){
                enc = true;
            }
            else{
                i++;
            }
        }
        return enc;
    }
    
    public static boolean buscarCiudad(ArrayList<Ciudad> lCiudades, String nombre){
        int i = 0;
        boolean enc = false;
        while((!enc)&&(i < lCiudades.size())){
            if  (lCiudades.get(i).getNombre().equalsIgnoreCase(nombre)){
                enc = true;
            }
            else{
                i++;
            }
        }
        return enc;
    }
    
    public static Sede crearSede(){
        Scanner tecladoI = new Scanner(System.in);
        Scanner tecladoS = new Scanner(System.in);
        String nombre;
        int ingresos;
        System.out.print("Nombre sede; ");
        nombre = tecladoS.nextLine();
        System.out.print("Ingresos anuales; ");
        ingresos = tecladoI.nextInt();
        Sede nSede = new Sede(nombre, ingresos);
        return nSede;
    }
    
    //Este ejercicio se podría mejorar ya que estamos haciendo dos búsquedas sobre las ciudades. La primera búsqueda,
    //podría retornar una Ciudad en lugar de un boolean para que el apartado sea más eficiente.
    public static void insSedeEnCiudad(ArrayList<Ciudad> lCiudades, Sede nSede, String nombre){
        int i = 0;
        boolean enc = false;
        while((!enc)&&(i < lCiudades.size())){
            if  (lCiudades.get(i).getNombre().equalsIgnoreCase(nombre)){
                enc = true;
                lCiudades.get(i).insertarUnaSede(nSede);
            }
            else{
                i++;
            }
        }
    }
    
    //Retorna la posición de donde deberíamos insertar la nueva Sede
    private static int buscarPosicionDeSede(ArrayList<Sede> lSedesOrdenadas, Sede sedeAux){
        int i = 0;
        boolean enc = false;
        while((!enc) &&(i < lSedesOrdenadas.size())){
            if  (sedeAux.getIngresosAnuales() > lSedesOrdenadas.get(i).getIngresosAnuales()){
                enc = true;
            }
            else{
                i++;
            }
        }
        return i;
    }
    
    //Recorre todas las sedes del conjunto "cSedesAux" y busca la posición adecauda para cada una de ellas. Una vez 
    //obtenida la posición, inserta la sede en el arrayLlist "lSedesOrdenadas"
    private static void insertarSedesEnOrden(ArrayList<Sede> lSedesOrdenadas, Set<Sede> cSedesAux){
        int pos;
        for(Sede sedeAux:cSedesAux){
            pos = buscarPosicionDeSede(lSedesOrdenadas, sedeAux);
            lSedesOrdenadas.add(pos, sedeAux);  //Insertamos ordenadamente la sede que estamos tratando
        }
    }
    
    public static void mostrarSedesOrdenadasPorIngresos(ArrayList<Ciudad> lCiudades){
        ArrayList<Sede> lSedesOrdenadas = new ArrayList<>();
        Set<Sede> cSedesAux;
        for(int i = 0;i < lCiudades.size();i++){
            //Obtenemos las sedes de la ciudad "i"
            cSedesAux = lCiudades.get(i).getcSedes();
            insertarSedesEnOrden(lSedesOrdenadas, cSedesAux);
        }
        System.out.println("Sedes ordenadas: ");
        for(Sede sedeAux:lSedesOrdenadas){
            System.out.println(sedeAux.toString());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecladoI = new Scanner(System.in);
        Scanner tecladoS = new Scanner(System.in);
        ArrayList<Ciudad> lCiudades = new ArrayList<>();
        int opc, media;
        String nombre;
        Sede nSede;
        do{
            System.out.println("1. Añadir ciudad");
            System.out.println("2. Mostrar ciudades y sedes");
            System.out.println("3. Mostrar superiores a media");
            System.out.println("4. Buscar sede por nombre");
            System.out.println("5. Añadir sede");
            System.out.println("6. Ordenar sedes");
            System.out.println("7. Salir");
            System.out.print("   Opción: ");
            opc = tecladoI.nextInt();
            switch(opc){
                case 1:
                    insCiudad(lCiudades);
                    break;
                case 2:
                    mostrarCiudades(lCiudades);
                    break;
                case 3:
                    media = calcularMediaDeIngresos(lCiudades);
                    mostrarSedesSegunMedia(lCiudades, media);
                    break;
                case 4:
                    System.out.print("Nombre sede; ");
                    nombre = tecladoS.nextLine();
                    if  (buscarSede(lCiudades, nombre)){
                        System.out.println("La sede "+nombre+" existe entre nuestras ciudades");
                    }
                    else{
                        System.out.println("La sede "+nombre+" no existe entre nuestras ciudades");
                    }
                    break;
                case 5:
                    System.out.print("Nombre ciudad; ");
                    nombre = tecladoS.nextLine();
                    if  (buscarCiudad(lCiudades, nombre)){
                        nSede = crearSede();
                        insSedeEnCiudad(lCiudades, nSede, nombre);
                    }
                    else{
                        System.out.println("No tenemos registrada la ciudad "+nombre);
                    }
                    break;
                case 6:
                    mostrarSedesOrdenadasPorIngresos(lCiudades);
                    break;
            }
        }while(opc != 7);
    }
    
}
