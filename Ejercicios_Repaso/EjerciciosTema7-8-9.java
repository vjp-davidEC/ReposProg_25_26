-- EJERCICIOS PROG TEMA7-8-9 --
-- DAVID ESCUDERO COCA --

-- TEMA 7 --
1.
public static void pedirNumero(int[] numero) {
	Scanner entrada = new Scanner(System.in);
	System.out.print("--Introduce 10 valores enteros--\n");
	int i;
	for(i = 0; i < numero.length; i++){
		System.out.print("Introduce " + (i+1) + " valores enteros: ");
		numero[i] = entrada.nextInt();
	}
}
//Método para mostrar solo los números pares del array
public static void mostrarNumerosPares(int[] pares){
	System.out.println("\n--NUMEROS PARES--");
	int i;
	for(i = 0; i < pares.length; i++){
		if(pares[i] % 2 == 0){
			System.out.print(pares[i] + "\n");
		}
	}
}
public static void main(String[] args) {
	int[] vector = new int[10];//Array unidimensional de tamaño 10
	pedirNumero(vector);//Pedimos los 10 números al usuario
	mostrarNumerosPares(vector);//Mostramos solo los números pares
}
2.
public static void pedirNumero(int[] numero) {
    Scanner entrada = new Scanner(System.in);
	System.out.print("--Introduce 7 valores enteros--\n");
    int i;
    for(i = 0; i < numero.length; i++){
		System.out.print("Introduce " + (i+1) +  " valores enteros: ");
        numero[i] = entrada.nextInt();
    }
}
//Método para mostrar los datos del array
public static void mostrarNumeros(int[] numeros){
    System.out.println("\n--NUMEROS--");
    int i;
    for(i = 0; i < numeros.length; i++){
        System.out.print("La posicion de " + i + ": " + numeros[i] + "\n");
    }
}
//Método para intercambiar los valores en la 2ª y 4ª posición (índices 1 y 3)
public static void intercambiar(int[] inter){
    int aux = inter[1];
    inter[1] = inter[3];
    inter[3] = aux;
}
public static void main(String[] args) {
    int[] vector = new int[7];//Array unidimensional de tamaño 7
    pedirNumero(vector);//Introducir los datos
    mostrarNumeros(vector);//Mostrar el array original
    intercambiar(vector);//Intercambiar posiciones 2ª y 4ª
	System.out.println("\nDespues del intercambio");
	mostrarNumeros(vector);//Mostrar el array modificado
    }
3.
public static int elegirLongitud(){
	Scanner entrada = new Scanner(System.in);
	int longitud = 0;
	do{
		System.out.print("Por favor, introduzca la longitud del vector entre 1 y 10: ");
		try{
			longitud = entrada.nextInt();
		}catch(InputMismatchException e){
			System.out.println(e);
			System.out.println("Error: Debes introducir un numero entero");
			entrada.next();
		}
		if(longitud < 1 || longitud > 10){
			System.out.println("La longitud debe estar entre 1 y 10");
		}
	}while(longitud < 1 || longitud > 10);
	return longitud;
}
//Genera y retorna un aleatorio entre 1 y 6
public static int generarAleatorio(){
	int aleatorio;
	aleatorio = (int)((Math.random()*6) + 1);
	return aleatorio;
}
//Rellena un vector con números aleatorios
public static void rellenarVector(int vNum[]){
	int i;
	for (i = 0;i < vNum.length;i++){
	vNum[i] = generarAleatorio();
	}
}
//Método para mostrar el contenido del array
public static void mostrarVector(int [] vector){
	System.out.println("\n--CONTENIDO DEL VECTOR--\n");
	for(int i = 0; i < vector.length; i++){
	System.out.println("La posicion de " + i + ": " + vector[i] + "\n");
	}
}
public static void main(String[] args) {
	int longitud = elegirLongitud();//Elegir longitud del array
	int[] vector = new int[longitud];//Crear array con esa longitud
	rellenarVector(vector);//Rellenar con números aleatorios
	mostrarVector(vector);//Mostrar el contenido
}
4.
//Constantes que sirve para ponerlas en vez de poner "matriz.length"
public final static int FIL = 4;
public final static int COL = 3;
public static void main(String[] args) {
	int[][] matriz = new int[FIL][COL];
	numerosAleatorio(matriz);
	mostrarNumerosPares(matriz);
}
//Metodo que calcula los 12 numeros aleatorios entre 100 y 200
public static void numerosAleatorio(int[][] matriz){
	for(int i = 0; i < FIL; i++){
		for(int j = 0; j < COL; j++){
			matriz[i][j] = (int)(Math.random() * 101) + 100;//Aleatorio entre 100 y 200
		}
	}
}
//Metodo que muestra los numeros pares de la matriz
public static void mostrarNumerosPares(int[][] matriz){
	System.out.println("\n--NUMEROS PARES--");
	for(int i = 0; i < FIL; i++){
		for(int j = 0; j < COL; j++){
			if(matriz[i][j] % 2 == 0){//Se calcula para saber si es par = 0
				System.out.print(matriz[i][j] + "\n");
			}
		}
	}
}
5.
//Constantes que sirve para ponerlas en vez de poner "matriz.length"
public final static int FIL = 4;
public final static int COL = 2;    
public static void main(String[] args) {
	int[][] matriz = new int[FIL][COL];
	rellenarMatriz(matriz);
	mostrarMatrizAtractiva(matriz);
	mostrarNumeroMayor(matriz);
	mostrarNumeroMenor(matriz);
	mostrarSumaTodosElementos(matriz);
}
//Metodo que pide al usuario un valor
public static void rellenarMatriz(int [][] matriz){
	Scanner entrada = new Scanner(System.in);
	System.out.println("Vamos a rellenar un array de 4x2");
	for(int i = 0; i < FIL; i++){
		for(int j = 0; j < COL; j++){
			System.out.print("Por favor, introduce un valor para la posicion [" + i + j + "]: ");
			matriz[i][j] = entrada.nextInt();
		}
	}
}
//Metodo que muestra los valores con la matrices de forma atractiva
public static void mostrarMatrizAtractiva(int [][] matriz){
	for(int i = 0; i < FIL; i++){
		for(int j = 0; j < COL; j++){
			System.out.print(" [" + i + j + "]-->" + matriz[i][j]);
		}
		System.out.print("\n");
	}
}
//Metodo que muestra el numero mayor de la matriz
public static void mostrarNumeroMayor(int [][] matriz){
	int mayor = matriz[0][0];
	for(int i = 0; i < FIL; i++){
		for(int j = 0; j < COL; j++){
			if(matriz[i][j] > mayor){
				mayor = matriz[i][j];
			}
		}
	}
	System.out.println("El numero mayor es: " + mayor);
}
//Metodo que muestra el numero menor de la matriz
public static void mostrarNumeroMenor(int [][] matriz){
	int menor = matriz[0][0];
	for(int i = 0; i < FIL; i++){
		for(int j = 0; j < COL; j++){
			if(matriz[i][j] < menor){
				menor = matriz[i][j];
			}
		}
	}
	System.out.println("El numero menor es: " + menor);
}
//Metodo que muestra la suma de todos los elementos de la matriz
public static void mostrarSumaTodosElementos(int [][] matriz){
	int suma = 0;
	for(int i = 0; i < FIL; i++){
		for(int j = 0; j < COL; j++){
			suma += matriz[i][j];
		}
	}
	System.out.println("La suma de todos los elementos son: " + suma);
}