
package ejercicio15t10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio15T10 {
    /**
     * Método que pide una opción del menú al usuario.
     * 
     * @return la opción introducida.
     */
    public static int pedirOpcion(){
        Scanner entrada = new Scanner(System.in);        
        return entrada.nextInt();
    }
    
    /**
     * Método que pregunta al usuario
     * si quiere insertar otra empresa en la lista.
     * 
     * @return s para sí o n para no.
     */
    public static String pedirSeguir(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n¿Desea introducir una empresa? (s/n): ");        
        return entrada.nextLine();
    }
    
    /**
     * Método que pide el nombre de la empresa al usuario.
     * 
     * @return el nombre introducido.
     */
    public static String pedirNombreEmpresa(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre empresa: ");
        return entrada.nextLine();       
    }
    
    /**
     * Método que inserta empresas en la lista
     * con sus respectivos empleados
     * hasta que el usuario quiera.
     * 
     * @param lEmpresas 
     */
    public static void insertarEmpresas(ArrayList<Empresa> lEmpresas){ 
        System.out.println("\nInsertando nueva empresa...");
        Empresa nEmpresa;
        do{           
            
            nEmpresa = new Empresa(pedirNombreEmpresa());  //Creamos la nueva empresa
            nEmpresa.insertarEmpleados(); //Insertamos sus empleados
            
            lEmpresas.add(nEmpresa);      //Y la insertamos en el ArrayList  
            System.out.println("\nEmpresa añadida correctamente.");
        }while(pedirSeguir().equalsIgnoreCase("s"));
    }
    
    /**
     * Método que muestra las empresas junto con sus empleados.
     * 
     * @param lEmpresas 
     */
    public static void mostrarEmpresas(ArrayList<Empresa> lEmpresas){
        if(!lEmpresas.isEmpty()) {
            System.out.println("\nMostrando empresas con sus empleados...");
            for(Empresa empresa : lEmpresas) {
                empresa.mostrarEmpresa();
            }            
        } else {
            System.out.println("\nAún no hay empresas registradas.");
        }
    }
    
    /**
     * Método que muestra los empleados cuyo nombre contiene la X.
     * 
     * Para cada empresa, llama al método que muestra sólo 
     * aquellos empleados en cuyo nombre tengamos una X.
     * 
     * Utilizamos un iterador para recorrer el arraylist.
     * 
     * @param lEmpresas 
     */
    public static void mostrarEmpleadosX(ArrayList<Empresa> lEmpresas){
        if(!lEmpresas.isEmpty()) {
            System.out.println("\nMostrando empleados con X en su nombre...");
            Iterator<Empresa> it = lEmpresas.iterator();
            Empresa empresaAux;
            while(it.hasNext()){
                empresaAux = it.next();
                empresaAux.mostrarEmpleadosDeEmpresaConX();
            }            
        } else {
            System.out.println("\nAún no hay empresas registradas.");
        }
    }

    /**
     * Método que crea un ArrayList con todos 
     * los empleados de todas las empresas.
     * 
     * @param lEmpresas
     * @return la lista con todos los empleados.
     */
    public static ArrayList<Empleado> getListaConTodosEmpleados(ArrayList<Empresa> lEmpresas){
        ArrayList<Empleado> lConTodos = new ArrayList<>();
        
        if(!lEmpresas.isEmpty()) {
            System.out.println("\nCreando lista con todos los empleados de todas las empresas...");
            ArrayList<Empleado> lAux;

            for(int i = 0;i < lEmpresas.size();i++){

               //Obtenemos el arrayList de empleados de la empresa "i"
               lAux = lEmpresas.get(i).getlEmpleados();

                //Recorremos lAux, insertando cada empleado en la lista lConTodos
               for(int j = 0;j < lAux.size();j++){
                   lConTodos.add(lAux.get(j));
               }
            }

        } else {
            System.out.println("\nAún no hay empresas registradas.");
        }
        
        return lConTodos;        
    }
    
    /**
     * Método que ordena, de menor a mayor, todos los empleados por sueldo.
     * 
     * @param lConTodos 
     */
    public static void burbuja(ArrayList<Empleado> lConTodos){        
        System.out.println("\nOrdenando empleados...");
        Empleado aux;        

        for(int i = 0;i < lConTodos.size();i++){

            for(int j = 0;j < lConTodos.size()-1;j++){

                if  (lConTodos.get(j).getSueldo() > lConTodos.get(j+1).getSueldo()){
                    aux = lConTodos.get(j);
                    lConTodos.set(j, lConTodos.get(j+1));
                    lConTodos.set(j+1, aux);
                }

            }
        }                   
    }
    
    /**
     * Método que ordena, de menor a mayor, todos los empleados 
     * de todas las empresas por sueldo usando el método .sort().
     * 
     * @param lConTodos 
     */
    public static void ordenarConSort(ArrayList<Empleado> lConTodos){                       
            System.out.println("\nOrdenando empleados...");            
            lConTodos.sort((a, b) -> a.getSueldo() - b.getSueldo());           
    }
    
    /**
     * Método que muestra todos los empleados de todas las empresas
     * ordenados, de menor a mayor, por sueldo.
     * 
     * Creamos una lista donde incluimos todos los 
     * empleados de todas las empresas. Después: 
     * OPCIÓN 1: aplicamos el método de la burbuja.
     * OPCIÓN 2: usamos el método .sort().
     * 
     * @param lEmpresas 
     */
    public static void ordenarPorSueldo(ArrayList<Empresa> lEmpresas){
        ArrayList<Empleado> lConTodos = getListaConTodosEmpleados(lEmpresas);
        
        if(!lConTodos.isEmpty()) {
            // OPCIÓN 1:
            burbuja(lConTodos);

            // OPCIÓN 2:
//            ordenarConSort(lConTodos);
        
            //Mostramos la lista ordenada
            for(Empleado empleado : lConTodos){
                empleado.mostrarEmpleado();
            }
            
        } 
    }
    
    /**
     * Método principal.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empresa> lEmpresas = new ArrayList<>();
        int opc;
        do{
            System.out.println("\n- MENÚ -");
            System.out.println("1. Insertar empresas");
            System.out.println("2. Mostrar empresas y empleados");
            System.out.println("3. Mostrar empleados con iterador");
            System.out.println("4. Mostrar empleados ordenados por sueldo");
            System.out.println("5. Salir");
            System.out.println("   Opcion: ");
            opc = pedirOpcion();
            switch(opc){
                case 1:
                    insertarEmpresas(lEmpresas);
                    break;
                case 2:
                    mostrarEmpresas(lEmpresas);
                    break;
                case 3:
                    mostrarEmpleadosX(lEmpresas);
                    break;
                case 4:
                    ordenarPorSueldo(lEmpresas);
                    break;
            }
        }while(opc != 5);
    }
    
}
