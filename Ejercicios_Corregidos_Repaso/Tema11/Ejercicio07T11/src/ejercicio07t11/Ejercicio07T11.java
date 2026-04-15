/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07t11;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio07T11 {
    
    /* Pide y retorna la opción del menú */
    public static int pedirOpcionMenu(){
        Scanner teclado = new Scanner(System.in);
        int opc;
        System.out.print("   Opcion: ");
        try{
            opc = teclado.nextInt();
        }
        catch(InputMismatchException e){
            opc = 0;
            teclado.next();  //Limpiamos el buffer
        }
        return opc;
    }

    /* Pide y retorna el nombre introducido por el usuario */
    public static String pedirNombre(String mensaje){
        Scanner teclado = new Scanner(System.in);
        String nombre;
        System.out.print(mensaje);
        nombre = teclado.nextLine();
        return nombre;
    }

    /* Pide y retorna el importe introducido por el usuario */
    public static int pedirImporte(){
        Scanner teclado = new Scanner(System.in);
        int importe;
        System.out.print("Importe: ");
        try{
            importe = teclado.nextInt();
        }
        catch(InputMismatchException e){
            importe = 0;
            teclado.next();  //Limpiamos el buffer
        }
        return importe;
    }

    /* Inserta la nueva donación en la campaña "nomCampania" */
    public static void insertarDonacionEnCampania(ArrayList<Campania> lCampanias, String nomCampania, Donacion nDonacion){
        Iterator<Campania> it = lCampanias.iterator();
        boolean enc = false;
        Campania aux;
        int pos = 0;
        //Mientras no llegue al final y no lo encuentre
        while((it.hasNext())&&(!enc)){
            aux = it.next();
            if  (aux.getNombre().equalsIgnoreCase(nomCampania)){
                enc = true;
            }
            else{
                pos++;
            }
        }
        if  (enc){
            lCampanias.get(pos).insDonacion(nDonacion);
        }
        else{
            System.out.println("No existe la campaña "+nomCampania);
        }
    }
    
    /* Muestra todas las campañas junto con sus donaciones */
    public static void mostrarCampanias(ArrayList<Campania> lCampanias){
        int i;
        for(i = 0;i < lCampanias.size();i++){
            lCampanias.get(i).mostrarCampania();
        }
    }
    
    /* Busca la campaña "nomCampania" y, si la encuentra, la muestra */
    public static void mostrarCampaniasPorNombre(ArrayList<Campania> lCampanias, String nomCampania){
        Iterator<Campania> it = lCampanias.iterator();
        boolean enc = false;
        Campania aux;
        int pos = 0;
        //Mientras no llegue al final y no lo encuentre
        while((it.hasNext())&&(!enc)){
            aux = it.next();
            if  (aux.getNombre().equalsIgnoreCase(nomCampania)){
                enc = true;
            }
            else{
                pos++;
            }
        }
        if  (enc){
            lCampanias.get(pos).mostrarCampania();
        }
        else{
            System.out.println("No existe la campaña "+nomCampania);
        }
    }

    /* Recorre las campañas sumando el dinero recaudado en cada una de ellas */
    public static int getTotalRecaudado(ArrayList<Campania> lCampanias){
        int i, totalRecaudado = 0;
        for(i = 0;i < lCampanias.size();i++){
            totalRecaudado = totalRecaudado + lCampanias.get(i).getTotalRecaudadoEnCampania();
        }
        return totalRecaudado;
    }
    
    /* Retorna la mayor donación de entre todas las campañas */
    public static Donacion getMayorDonacion(ArrayList<Campania> lCampanias){
        int i;
        int importeMayorDonacion = 0;
        Donacion auxDonacion, mayorDonacion = null;
        //Recorremos las campañas buscando la mayor donación de cada una de ellas
        for(i = 0;i < lCampanias.size();i++){
            //Obtenemos la mayor donación de la campaña "i"
            auxDonacion = lCampanias.get(i).getMayorDonacionEnCampania();
            try{
                if  (auxDonacion.getImporteDonacion() > importeMayorDonacion){
                    importeMayorDonacion = auxDonacion.getImporteDonacion();
                    mayorDonacion = auxDonacion;
                }
            }
            catch(NullPointerException e){
                System.out.println("La campaña "+lCampanias.get(i).getNombre()+" no tiene donaciones todavía ");
            }
        }
        return mayorDonacion;
    }
    
    public static Campania pedirCampania(){
        String nomCampania = pedirNombre("Nombre Campaña: ");
        //Creamos la nueva Campaña
        Campania C = new Campania(nomCampania);
        return C;
    }
    
    public static void insCampania(ArrayList<Campania> lCampanias, Campania nCampania){
        //Insertamos la nueva campaña en la lista de campañas
        lCampanias.add(nCampania);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos e inicializamos la lista de campañas
        ArrayList<Campania> lCampanias = new ArrayList<>();
        String nomCampania, nomDonante;
        Campania nCampania;
        int opc, importe;
        Donacion nDonacion;
        do{
            System.out.println("1. Añadir campaña ");
            System.out.println("2. Añadir donación ");
            System.out.println("3. Mostrar campañas ");
            System.out.println("4. Mostrar campañas por nombre");
            System.out.println("5. Mostrar total dinero recaudado");
            System.out.println("6. Mostrar mayor donación");
            System.out.println("7. Salir");
            opc = pedirOpcionMenu();
            switch(opc){
                case 1:
                    nCampania = pedirCampania();
                    insCampania(lCampanias, nCampania);
                    break;
                case 2:
                    nomCampania = pedirNombre("Nombre Campaña: ");
                    nomDonante = pedirNombre("Nombre Donante: ");
                    importe = pedirImporte();
                    //Cremoa la nueva Donación a partir de los datos que hemos pedido
                    nDonacion = new Donacion(nomDonante, importe);
                    //Buscamos la campaña e insertamos en ella
                    insertarDonacionEnCampania(lCampanias, nomCampania, nDonacion);
                    break;
                case 3:
                    mostrarCampanias(lCampanias);
                    break;
                case 4:
                    nomCampania = pedirNombre("Nombre Campaña: ");
                    mostrarCampaniasPorNombre(lCampanias, nomCampania);
                    break;
                case 5:
                    System.out.println("Total recaudado: "+getTotalRecaudado(lCampanias));
                    break;
                case 6:
                    nDonacion = getMayorDonacion(lCampanias);
                    if  (nDonacion != null){
                        nDonacion.mostrarDonacion();
                    }
                    break;
                case 7:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }while(opc != 7);
    }    
}
