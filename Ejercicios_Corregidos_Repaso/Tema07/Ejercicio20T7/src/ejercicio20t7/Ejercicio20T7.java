/*
 *******************************************************************
 ************************* TRES EN RAYA ****************************
 *******************************************************************
 */
package ejercicio20t7;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio20T7 {

    //Declaración CONSTANTES número de filas y de columnas del tablero
    final static int FIL = 3;
    final static int COL = 3;
    
    /*
        fichas O para el jugador
        fichas X para la máquina
    */
    public static void pintarCelda(int celda){
        switch(celda){
            case 0:
                System.out.print("|   ");
                break;
            case 1:
                System.out.print("| O ");
                break;
            case 2:
                System.out.print("| X ");
                break;
        }
    }
    
    public static void pintarTablero(int tablero[][]){
        int i, j;
        System.out.println("\n-------------");
        for(i = 0;i < tablero.length;i++){
            for(j = 0;j < tablero[i].length;j++){
                pintarCelda(tablero[i][j]);
            }
            //Pintamos el final de la fila del talero
            System.out.print("|");
            System.out.println("\n-------------");
        }
    }
    
    public static void inicializarTablero(int tablero[][]){
        int i, j;
        for(i = 0;i < tablero.length;i++){
            for(j = 0;j < tablero[i].length;j++){
                tablero[i][j] = 0;
            }
        }
    }
    
    public static void pedirPosicion(int tablero[][]){
        Scanner teclado = new Scanner(System.in);
        int fila, columna;
        boolean fueraRango, ocupada;
        do{
            fueraRango = false;
            ocupada = false;
            System.out.print("FILA: ");
            fila = teclado.nextInt();
            System.out.print("COLUMNA: ");
            columna = teclado.nextInt();
            if  (((fila < 0)||(fila > 2))||((columna < 0)||(columna > 2))){
                fueraRango = true;
            }
            if  (!fueraRango){
                if  (tablero[fila][columna] != 0){
                    ocupada = true;
                }
            }
            //Volvemos a pedir si nos salimos del rango del tablero o 
            //si la celda ya tiene una ficha
        }while((fueraRango)||(ocupada));
        tablero[fila][columna] = 1;  //Colocamos la ficha O
    }

    public static void colocarFichaAzar(int tablero[][]){
        int fila, columna;
        do{
            fila = (int)(Math.floor(Math.random() * 3)); //Genera aleatorio entre 0 y 2
            columna = (int)(Math.floor(Math.random() * 3)); //Genera aleatorio entre 0 y 2
        }while(tablero[fila][columna] != 0);
        tablero[fila][columna] = 2;  //Colocamos la ficha X
    }
    
    //Turno nos indica el jugador. 
    //   * Turno = 1, si comprobamos si ha ganado el jugador 1 (el real)
    //   * Turno = 2, si comprobamos si ha ganado el jugador 2 (la máquina)
    public static boolean comprobarGanador(int tablero[][], int turno){
        return ((tablero[0][0] == turno)&&(tablero[0][1] == turno)&&(tablero[0][2] == turno)|| //Comprobamos primera fila
                (tablero[1][0] == turno)&&(tablero[1][1] == turno)&&(tablero[1][2] == turno)|| //Comprobamos segunda fila
                (tablero[2][0] == turno)&&(tablero[2][1] == turno)&&(tablero[2][2] == turno)|| //Comprobamos tercera fila
                (tablero[0][0] == turno)&&(tablero[1][0] == turno)&&(tablero[2][0] == turno)|| //Comprobamos primera columna
                (tablero[0][1] == turno)&&(tablero[1][1] == turno)&&(tablero[2][1] == turno)|| //Comprobamos segunda columna
                (tablero[0][2] == turno)&&(tablero[1][2] == turno)&&(tablero[2][2] == turno)|| //Comprobamos tercera columna
                (tablero[0][0] == turno)&&(tablero[1][1] == turno)&&(tablero[2][2] == turno)|| //Comprobamos diagonal sup-izq a inf-dcha
                (tablero[0][2] == turno)&&(tablero[1][1] == turno)&&(tablero[2][0] == turno)); //Comprobamos diagonal sup-izq a inf-dcha
    }
    
    //Busca alguna celda que quede vacía. Si queda alguna vacía, no hay empate. Si estan
    //todas rellenas, hay empate.
    public static boolean comprobarEmpate(int tablero[][]){
        int i, j;
        boolean empate = true;
        for(i = 0;i < tablero.length;i++){
            for(j = 0;j < tablero[i].length;j++){
                if  (tablero[i][j] == 0){
                    empate = false;
                } 
            }
        }
        return empate;
    }
    
    //Limpia la pantalla
    public static void limpiarPantalla(){
        int i;
        for(i = 0;i < 20;i++){
            System.out.println("");
        }
    }
    
    //Muestra el resultado final de la partida
    public static void mostrarMensajeGanador(boolean ganaJug, boolean ganaMaq, boolean empate){
        if  ((ganaJug)||(ganaMaq)||(empate)){
            if  (ganaJug){
                System.out.println("¡Has ganado!!");
            }
            else{
                if  (ganaMaq){
                    System.out.println("¡Has perdido!");
                }
                else{
                    System.out.println("¡Empate!");
                }
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] tablero = new int[FIL][COL];
        inicializarTablero(tablero);
        boolean ganaJug = false, ganaMaq = false, empate = false;
        do{
            limpiarPantalla();
            pintarTablero(tablero);
            pedirPosicion(tablero);  //Turno para jugador
            ganaJug = comprobarGanador(tablero, 1);  //Comprueba si ha ganado el jugador
            if  (!ganaJug){
                colocarFichaAzar(tablero);  //Turno para la máquina
                ganaMaq = comprobarGanador(tablero, 2);  //Comprueba si ha ganado la máquina
                empate = comprobarEmpate(tablero);
            }
        }while((!ganaJug)&&(!ganaMaq));
        //Mostramos una vez más el tablero, para que se vea cómo queda la partida finalmente
        limpiarPantalla();
        pintarTablero(tablero);
        mostrarMensajeGanador(ganaJug, ganaMaq, empate);
    }
    
}
