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
6.
    
    public final static int MAX = 80;

    //Método que determina si un número es primo
    public static boolean esPrimo(int numero){
        //Los números menores que 2 no son primos
        if(numero < 2) return false;
        boolean esPrimo = true; //Suponemos que es primo 
        int i = 2;
        
        //Mientras siga siendo primo y no hayamos llegado a la raíz cuadrada
        while(esPrimo && i <= Math.sqrt(numero)){
            if(numero % i == 0){
                esPrimo = false; 
            }
            i++;//Pasamos al siguiente divisor
        }
        return esPrimo;//Si no tiene divisores, es primo
    }
    
    //Método que rellena el vector con los primeros números primos
    public static void rellenarPrimos(int [] vector){
        int contador = 0;
        int numero = 2;
        
        //Mientras no hayamos llenado el vector
        while(contador < MAX){
            if(esPrimo(numero)){//Si el número es primo
                vector[contador] = numero;//Lo guardamos en el vector
                contador++;//Avanzamos a la siguiente posición
            }
            numero++;//Probamos el siguiente número
        }
    }
    
    //Método que muestra el contenido del vector con sus posiciones
    public static void mostrarVector(int [] vector){
        System.out.println("Contenido de un array unidimensional de " + MAX + " posiciones con numeros primos:");
        for(int i = 0; i < vector.length; i++){
            System.out.println("Posicion " + i + " = " + vector[i]);//Mostramos índice y valor
        }
    }
    
    public static void main(String[] args) {
        int[] vector = new int[MAX];//Creamos un vector de 80 posiciones
        rellenarPrimos(vector);//Lo rellenamos con los primeros 80 números primos
        mostrarVector(vector);//Lo mostramos por pantalla
    }
7.
//Método que rellena el vector con números aleatorios entre 0 y 50
    public static void rellenarVector(int [] vector){
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int)(Math.random() * 51);
        }
    }
    
    //Método que muestra el contenido completo del vector
    public static void mostrarVector(int [] vector){
        System.out.println("Contenido del array con " + vector.length + " numeros aleatorios:");
        //Recorremos el vector mostrando posición y valor
        for(int i = 0; i < vector.length; i++){
            System.out.println("Posicion " + i + " = " + vector[i]);
        }
    }
    
    //Método que muestra los 10 números mayores del vector
    public static void mostrarDiezMayores(int [] vector){       
        System.out.println("\nLos 10 numeros mayores son:");
        //Repetimos 10 veces hasta encontrar los mayores
        for(int rep = 0; rep < 10; rep++){
            int max = -1;//Se pone porque que el más pequeño que cualquier número del vector
            int indice = 0;//Se guarda la posición del mayor
            //Buscamos el mayor del vector
            for(int i = 0; i < vector.length; i++){
                if(vector[i] > max){
                    max = vector[i];
                    indice = i;
                }
            }
            //Mostramos el mayor encontrado
            System.out.print(max + " ");
            //Marcamos ese valor como usado para no volver a cogerlo
            vector[indice] = -1;
        }
    }
    
    public static void main(String[] args) {
        int[] vector = new int[15];//Creamos un vector de 15 posiciones
        rellenarVector(vector);//Lo rellenamos con números aleatorios
        mostrarVector(vector);//Mostramos todo el vector
        mostrarDiezMayores(vector);//Mostramos los 10 valores más altos
    }
8.
//Método que pide al usuario un número de 5 cifras
    public static int pedirNumeros(){
        Scanner entrada = new Scanner(System.in);
        
        int numero = 0;
        boolean valido = false;
        
        do{
            System.out.print("Escribe un numero de 5 cifras: ");
            try{
                numero = entrada.nextInt();
                if(numero >= 10000 && numero <= 99999){//Comprobamos si tiene 5 cifras
                    valido = true;
                }else{
                    System.out.println("Error: Debe de ser un numero de 5 cifras");
                }
            }catch(InputMismatchException e){
                System.out.println("Error: Debe introducir un numero entero");
                entrada.next();
            }
        }while(!valido);//Repetimos hasta que el número sea válido
        return numero;//Devolvemos el número correcto
    }
    
    //Método que divide el número en cifras y las guarda en el vector
    public static void dividirNumeros(int numero, int [] vector){
        //Recorremos el array y vamos extrayendo las cifras del número
        for(int i = 0; i < vector.length; i++){
            vector[i] = numero % 10;
            numero /= 10;
        }
    }
    
    //Método que muestra el número al revés usando el vector
    public static void mostrarNumeros(int[] vector){
        System.out.print("El numero introducido escrito al reves es el: ");
        //Recorremos el vector y mostramos cada cifra
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int numero = pedirNumeros();//Pedimos un número válido al usuario
        int[] vector = new int[5];//Array donde guardaremos las 5 cifras
        dividirNumeros(numero, vector);//Dividimos el número en cifras
        mostrarNumeros(vector);//Mostramos el número al revés
    }
9.
//Método que pide un número entero mayor que 0
    public static int pedirNumeros(){
        Scanner entrada = new Scanner(System.in);
        
        int numero = 0;
        
        do{
            System.out.print("Escribe un numero: ");
            try{
                numero = entrada.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Error: Debe introducir un numero entero");
                entrada.next();
            }
        }while(numero<1);//Repetimos mientras el número sea menor que 1
        return numero;//Devolvemos el número válido
    }
    
    //Método que calcula cuántas cifras tiene un número
    public static int calcularCifras(int numero){
        int contador = 0;
        //Mientras el número sea mayor que 0, se va dividiendo entre 10 y suma una cifra
        while(numero>0){
            numero /= 10;
            contador++;
        }
        System.out.println("El numero tiene " + contador + " cifras");
        return contador;//Devolvemos cuántas cifras tiene
    }
    
    //Método que divide el número en cifras y las guarda en el vector
    public static void dividirNumeros(int numero, int [] vector){
        //Recorremos el array y vamos extrayendo las cifras del número
        for(int i = 0; i < vector.length; i++){
            vector[i] = numero % 10;
            numero /= 10;
        }
    }
    
    //Método que muestra el número al revés usando el vector
    public static void mostrarNumeros(int[] vector){
        System.out.print("El numero introducido escrito al reves es el: ");
        //Recorremos el vector y mostramos cada cifra
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int numero = pedirNumeros();//Pedimos un número válido al usuario
        int[] vector = new int[calcularCifras(numero)];//Array donde guardaremos las cifras que diga el usuario
        dividirNumeros(numero, vector);//Dividimos el número en cifras
        mostrarNumeros(vector);//Mostramos el número al revés
    }
10.
public final static int MAX1 = 10;
// Método que rellena el vector con números aleatorios entre 1 y 8
    public static void rellenarVector(int [] vector){
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int)(Math.random() * 8) + 1;
        }
    }
    
    //Método que muestra el vector junto con un mensaje previo
    public static void mostrarVector(int [] vector, String mensaje){
        System.out.print(mensaje);
        //Recorremos el vector imprimiendo cada número separado por un espacio
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    
    //Método que sustituye por 0 todos los valores que estén repetidos
    public static void sustituirRepetidos(int [] vector){
        boolean rep = false;
        for(int i = 0; i <  vector.length; i++){
            for (int j = i+1; j < vector.length; j++) {
                if(vector[i] == vector[j]){
                    vector[j] = 0;
                    rep = true;
                }
            }
            if(rep){
                vector[i] = 0;
                rep = false;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] vector = new int[MAX1];//Creamos un vector de 10 posiciones
        rellenarVector(vector);//Lo rellenamos con números aleatorios
        mostrarVector(vector, "Se han generado los siguientes numeros: ");
        sustituirRepetidos(vector);//Eliminamos los repetidos
        mostrarVector(vector, "Sustituimos los elementos repetidos por un 0: ");
    }
11.
// Método que rellena el vector con números aleatorios entre 0 y 9 sin repetir
    public static void rellenarVector(int [] vector){
        boolean[] usado = new boolean[10];
        
        int contador = 0;
        //Seguimos hasta llenar las 10 posiciones del vector
        while(contador < vector.length){
            int numero = (int)(Math.random() * 10);//Genera un número aleatorio entre 0 y 9
            
            if(!usado[numero]){//Si el número NO ha salido antes, lo aceptamos
                vector[contador] = numero;//Lo guardamos en el vector
                usado[numero] = true;//Marcamos que ya está usado
                contador++;//Pasamos a la siguiente posición
            }
        }
    }
    
    //Método que muestra el vector con un mensaje previo
    public static void mostrarVector(int [] vector, String mensaje){
        System.out.print(mensaje);
        //Recorremos el vector imprimiendo cada número separado por un espacio
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] vector = new int[10];//Creamos un vector de 10 posiciones
        rellenarVector(vector);//Lo rellenamos con números aleatorios sin repetir
        mostrarVector(vector, "Se ha generado el siguiente array: ");
    }
14.
//Constantes que sirve para ponerlas en vez de poner "matriz.length"
    public final static int SEM = 4;
    public final static int DIA = 7;
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] temperaturas = new double[SEM][DIA];//Matriz donde guardaremos las temperaturas
        
        //Array con los nombres de los días de la semana
        String[] diasSemanas = {"Lunes", "Martes", "Miercoles",
            "Jueves", "Viernes", "Sabado", "Domingo"};
        int opcion;
        
        do{
            mostrarMenu();
            opcion = entrada.nextInt();
            
            switch(opcion){//Selección de la acción según la opción elegida
                case 1 -> rellenarTemperaturas(temperaturas);
                case 2 -> mostrarTemperaturas(temperaturas);
                case 3 -> temperaturaMediaDelMes(temperaturas);
                case 4 -> diaMasCalurosoDelMes(temperaturas, diasSemanas);
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida. Intentalo de nuevo");
            }
        }
        while(opcion !=5);//Repetir hasta que el usuario elija salir
    }
    
    //Metodo que muestra el menu por pantalla
    public static void mostrarMenu(){
        System.out.println("\n--MENU--");
        System.out.println("1. Rellenar las temperaturas");
        System.out.println("2. Mostrar las temperaturas");
        System.out.println("3. Visualizar la temperatura media del mes");
        System.out.println("4. Dia o dias mas calurosos del mes");
        System.out.println("5. Salir del menu");
        System.out.print("Elige una opcion: ");
    }
    
    //Metodo que permite al usuario introducir las temperaturas en la matriz
    public static void rellenarTemperaturas(double[][] matriz){
        Scanner entrada = new Scanner(System.in);
        System.out.println("");
        for(int i = 0; i < SEM; i++){
            for(int j = 0; j < DIA; j++){
                System.out.print("Por favor, introduzca la temperatura en la posicion [" + i + j + "]: ");
                matriz[i][j] = entrada.nextDouble();
            }
        }
    }
    
    //Metodo que muestra todas las temperaturas almacenadas en la matriz
    public static void mostrarTemperaturas(double[][] matriz){
        System.out.println("");
        for(int i = 0; i < SEM; i++){
            for(int j = 0; j < DIA; j++){
                System.out.println("La temperatura son: " + matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
    //Metodo que calcula y muestra la temperatura media del mes
    public static void temperaturaMediaDelMes(double[][] matriz){
        System.out.println("");
        double suma = 0;
        for(int i = 0; i < SEM; i++){
            for(int j = 0; j < DIA; j++){
                suma += matriz[i][j];
            }
        }
        double media = suma / 28;
        System.out.println("La temperatura media del mes es: " + media);
    }
    
    //Metodo que busca el día o días con mayor temperatura del mes
    public static void diaMasCalurosoDelMes(double[][] matriz, String[] diasSemenas){
        System.out.println("");
        double mayor = matriz[0][0];
        //Encontrar la temperatura máxima
        for(int i = 0; i < SEM; i++){
            for(int j = 0; j < DIA; j++){
                if(matriz[i][j] > mayor){
                    mayor = matriz[i][j];
                }
            }
        }
        
        //Mostrar todos los días que coincidan con la temperatura máxima
        for (int i = 0; i < SEM; i++) {
            for (int j = 0; j < DIA; j++) {
                if(matriz[i][j] == mayor){
                    System.out.println("El " + diasSemenas[j] + " de la Semana " + (i + 1) + " con " + mayor + " grados");
                }
            }
        }
    }
15.
//Método que rellena el array con ventas aleatorias entre 10 y 100
    public static void pedirVentas(int[] vector){
        for(int i = 0; i < vector.length; i++){
            //Generamos un número aleatorio entre 10 y 100
            vector[i] = (int)(Math.random()*(91)) + 10;
        }
        System.out.println("Ventas generadas aleatoriamente");
    }
    
    //Método que muestra las ventas mensuales en orden normal
    public static void mostrarVentas(int [] vector){
        System.out.println("\n--VENTAS MENSUALES--");
        for(int i = 0; i < vector.length; i++){
            //Recorremos el array y mostramos cada mes con su venta
            System.out.println(vector[i] + " coches");
        }
    }
    
    //Método que muestra las ventas al revés sin modificar el array
    public static void mostrarVentasAlReves(int [] vector){
        System.out.println("\n--VENTAS AL REVES--");
        for(int i = vector.length - 1; i >= 0; i--){
            //Mostramos el mes normal pero la venta invertida
            System.out.println(vector[i] + " coches");
        }
    }
    
    //Método que calcula y muestra la suma total de ventas del año
    public static void mostrarSumaTotal(int [] vector){
        int suma = 0;
        for(int i = 0; i < vector.length; i++){
            //Sumamos todas las ventas del array
            suma += vector[i];
        }
        System.out.println("\nSuma total del anio: " + suma + " coches");
    }
    
    //Método que muestra las ventas de los meses pares
    public static void mostrarVentasMesesPares(int [] vector){
        System.out.println("\n--VENTAS EN MESES PARES--");
        int suma = 0;
        for(int i = 0; i < vector.length; i++){
            if(((i + 1) % 2) == 0){
                suma += vector[i];
            }
        }
        System.out.println(suma + " coches");
    }
    
    //Método que muestra el mes con más ventas
    public static void mostrarMesConMasVentas(int [] vector){
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int max = vector[0];
        int indice = 0;
        
        //Recorremos el array buscando el valor más alto
        for(int i = 1; i < vector.length; i++){
            if(vector[i] > max){
                max = vector[i];
                indice = i;
            }
        }
        System.out.println("\nMes con mas ventas: " + meses[indice] + " (" + indice + " coches)");
    }
    
    //Método que muestra el menú de opciones
    public static void mostrarMenu(){
        System.out.println("\n--MENU DE OPCIONES--");
        System.out.println("1. Rellenar ventas mensuales");
        System.out.println("2. Mostrar ventas");
        System.out.println("3. Mostrar ventas al reves");
        System.out.println("4. Mostrar suma total de ventas");
        System.out.println("5. Mostrar ventas de meses pares");
        System.out.println("6. Mostrar mes con mas ventas");
        System.out.println("7. Salir"); 
        System.out.print("Elige una opcion: ");
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vector = new int[12];//Array donde guardaremos las ventas
        int opcion;
        
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            
            switch(opcion){//Opcion a elegir del usuario
                case 1 -> pedirVentas(vector);
                case 2 -> mostrarVentas(vector);
                case 3 -> mostrarVentasAlReves(vector);
                case 4 -> mostrarSumaTotal(vector);
                case 5 -> mostrarVentasMesesPares(vector);
                case 6 -> mostrarMesConMasVentas(vector);
                case 7 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida. Intentalo de nuevo");
            }
        }while(opcion != 7);//Repetimos hasta que el usuario elija salir
    }
16.
//Constantes que sirve para ponerlas en vez de poner "matriz.length"
    public final static int ALU = 6;
    public final static int ASI = 4;
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Arrays con los nombres de los alumnos y las asignaturas
        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "Maria"};
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"};
        
        int[][] notas = new int[ALU][ASI];//Matriz donde guardaremos las notas
        
        int opcion;
        
        do{
            mostrarMenu();
            opcion = entrada.nextInt();
            
            switch(opcion){//Selección de la acción según la opción elegida
                case 1 -> rellenarNotas(notas, alumnos, asignaturas);
                case 2 -> mostrarNotas(notas, alumnos, asignaturas);
                case 3 -> alumnoMejor(notas, alumnos);
                case 4 -> alumnoSuspensos(notas, alumnos);
                case 5 -> asignaturaDificil(notas, asignaturas);
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida. Intentalo de nuevo");
            }
        }while(opcion != 6);//Repetir hasta que el usuario elija salir
    }
    
    //Metodo que muestra el menu por pantalla
    public static void mostrarMenu(){
        System.out.println("\n--MENU--");
        System.out.println("1. Rellenar las notas de los alumnos");
        System.out.println("2. Mostrar las notas");
        System.out.println("3. Alumno mejor de la clase");
        System.out.println("4. Alumno con mas suspensos");
        System.out.println("5. Asignatura mas dificil");
        System.out.println("6. Salir del menu");
        System.out.print("Elige una opcion: ");
    }
    
    //Metodo que permite introducir las notas de cada alumno en cada asignatura
    public static void rellenarNotas(int[][] notas, String[] alumnos, String[] asignaturas){
        Scanner entrada = new Scanner(System.in);
        System.out.println("");
        System.out.println("Introduce las notas:");
        for(int i = 0; i < ALU; i++){
            System.out.println("Alumno: " + alumnos[i]);
            for(int j = 0; j < ASI; j++){
                System.out.print(" " + asignaturas[j] + ": ");
                notas[i][j] = entrada.nextInt();
            }
        }
    }
    
    //Metodo que muestra todas las notas de todos los alumnos
    public static void mostrarNotas(int[][] notas, String[] alumnos, String[] asignaturas){
        System.out.println("");
        for(int i = 0; i < ALU; i++){
            System.out.print(alumnos[i] + ": ");
            for(int j = 0; j < ASI; j++){
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    //Metodo que calcula que alumno tiene la mejor media
    public static void alumnoMejor(int[][] notas, String[] alumnos){
        System.out.println("");
        double mejorMedia = 0;
        String mejor = "";
        int suma;
        
        for(int i = 0; i < ALU; i++){
            suma = 0;
            for (int j = 0; j < ASI; j++) {
                suma += notas[i][j];
            }
            double media = (double)suma / ASI;
            
            if(media > mejorMedia){
                mejorMedia = media;
                mejor = alumnos[i];
            }
        }
        System.out.println("El mejor alumno es: " + mejor + " con media " + mejorMedia);
    }
    
    //Metodo que determina que alumno tiene más suspensos
    public static void alumnoSuspensos(int[][] notas, String[] alumnos){
        System.out.println("");
        int maxSus = 0;
        String peor = "";
        int suspensos;
        
        for (int i = 0; i < ALU; i++){
            suspensos = 0;
            for (int j = 0; j < ASI; j++){
                if(notas[i][j] < 5){
                    suspensos++;
                }
            }
            if(suspensos > maxSus){
                maxSus = suspensos;
                peor = alumnos[i];
            }
        }
        System.out.println("El alumno con mas suspensos es: " + peor + " con " + maxSus + " suspensos");
    }
    
    //Metodo que calcula que asignatura tiene la peor media
    public static void asignaturaDificil(int[][] notas, String[] asignaturas){
        System.out.println("");
        double peorMedia = 999;//Lo pongo porque es el valor inicial mas alto
        String peor = "";
        int suma;
        
        for (int j = 0; j < ASI; j++){
            suma = 0;
            for (int i = 0; i < ALU; i++){
                suma += notas[i][j];
            }
            double media = (double)suma / ALU;
            
            if(media < peorMedia){
                peorMedia = media;
                peor = asignaturas[j];
            }
        }
        System.out.println("La asignatura mas dificil es: " + peor + " con media " + peorMedia);
    }
17.
 public static void main(String[] args) {
        int[] vector = new int[10];//Crear un vector de 10 posiciones
        
        numerosAleatorios(vector);
        mostrarNumeros(vector, "Vector generado: ");
        ordenarMayorMenor(vector);
        mostrarNumeros(vector, "Vector ordenador de mayor a menor: ");
    }
    
    //Metodo que rellena el vector con números aleatorios entre 0 y 9
    public static void numerosAleatorios(int[] vector){
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int)(Math.random() * 10);
        }
    }
    
    //Metodo que muestra los valores del vector precedidos de un mensaje
    public static void mostrarNumeros(int [] vector, String mensaje){
        System.out.print(mensaje);
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    
    //Metodo que ordena el vector de mayor a menor usando el método burbuja
    public static void ordenarMayorMenor(int [] vector){
        for(int i = 0; i < vector.length; i++){
            for (int j = 0; j < vector.length - 1; j++) {
                //Si el elemento actual es menor que el siguiente, se intercambian
                if(vector[j] < vector[j + 1]){
                int aux = vector[j];
                vector[j] = vector[j + 1];
                vector[j + 1] = aux;
                }
            }
        }
    }
18.
public static void main(String[] args) {
        int[] vector1 = {3, 5, 6, 8, 1};//Primer vector con 5 elementos
        int[] vector2 = {2, 4, 7, 9, 0};//Segundo vector con 5 elementos

        //Unir ambos vectores y ordenarlos de menor a mayor
        int[] resultado = unirOrdenar(vector1, vector2);
        mostrar(resultado, "Los elementos ordenados de menor a mayor son: ");
    }
    
    //Metodo que une dos vectores de 5 elementos cada uno y los ordena de menor a mayor
    public static int[] unirOrdenar(int[] vector1, int [] vector2){
        int[] result = new int[10];
        
        //Copiar los elementos del vector
        for(int i = 0; i < 5; i++) {
            result[i] = vector1[i];
        }
        
        //Copiar los otros elementos del segundo vector
        for (int i = 0; i < 5; i++) {
            result[i + 5] = vector2[i];
        }
        
        //Ordenar el vector resultante usando el método burbuja
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - 1; j++) {
                if(result[j] > result[j + 1]){
                    int aux = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = aux;
                }
            }
        }
        return result;//Devolver el vector ya ordenado
    }
    
    //Metodo que muestra los elementos de un vector precedidos de un mensaje
    public static void mostrar(int[] vector, String mensaje){
        System.out.print(mensaje);
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
19.
 public static void main(String[] args) {
        int[] vector = new int[100];//Crear un vector de 100 posiciones
        
        rellenarVector(vector);
        mayorValor(vector);
        menorValor(vector);
        masRepetidos(vector);
        media(vector);
    }
    
    //Metodo que rellena el vector con números aleatorios entre 10 y 80
    public static void rellenarVector(int [] vector){
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int)(Math.random() * 71) + 10;
        }
    }
    
    //Metodo que busca y muestra el mayor valor del vector
    public static void mayorValor(int [] vector){
        int mayor = vector[0];
        for(int i = 0; i < vector.length; i++){
            if(vector[i] > mayor){
                mayor = vector[i];
            }
        }
        System.out.println("El mayor de todos es: " + mayor);
    }
    
    //Metodo que busca y muestra el menor valor del vector
    public static void menorValor(int [] vector){
        int menor = vector[0];
        for(int i = 0; i < vector.length; i++){
            if(vector[i] < menor){
                menor = vector[i];
            }
        }
        System.out.println("El menor de todos es: " + menor);
    }
    
    //Metodo que determina que valor aparece más veces en el vector
    public static void masRepetidos(int [] vector){
        int rep = vector[0];
        int maxRep = 0;
        
        for(int i = 0; i < vector.length; i++){
            int contador = 0;
            
            for(int j = 0; j < vector.length; j++){
                if(vector[i] == vector[j]){
                    contador++;
                }
            }
            
            //Actualizar si encontramos un valor con más repeticiones
            if(contador > maxRep){
                maxRep = contador;
                rep = vector[i];
            }
        }
        System.out.println("Valor mas repetido: " + rep);
    }
    
    //Metodo que calcula y muestra la media de todos los valores del vector
    public static void media(int [] vector){
        int suma = 0;
        for(int i = 0; i < vector.length; i++){
            suma += vector[i];
        }
        double media = (double)suma / vector.length;
        System.out.println("La media total es: " + media);
    }

-- TEMA 8 --
1.
 public static void main(String[] args) {
        
        //Array de 6 objetos de Asignatura
        Asignatura[] asig = new Asignatura[6];
        String[] nombres = {"Programación", "Lenguaje de Marcas", "BBDD", "Entornos Desarrollo", "Sistemas Informáticos", "FOL"};
        rellenarNotas(asig, nombres);
        mostrarNotas(asig);
        System.out.print("Su nota media del curso es de: " + calcularMedia(asig) + "\n");//Mostrar nota media
    }
    
    //Metodo que pide la nota de cada asignatura la usuario
    public static void rellenarNotas(Asignatura[] vectorAsignaturas, String[] nombres){
        Scanner entrada = new Scanner(System.in);
        double nota;
        
        for(int i = 0;i < vectorAsignaturas.length;i++){
            System.out.print("Introduzca nota "+nombres[i]+": ");
            nota = entrada.nextInt();
            vectorAsignaturas[i] = new Asignatura(nombres[i], nota);
        }
    }

    //Metodo que muestra las notas de las asignaturas
    public static void mostrarNotas(Asignatura vectorAsignaturas[]){
        for(int i = 0;i < vectorAsignaturas.length;i++){
            System.out.println("Nota "+vectorAsignaturas[i].getNombre()+": "+vectorAsignaturas[i].getNota());
        }
    }
    
    //Metodo que calcula la nota media
    public static double calcularMedia(Asignatura[] vectorAsignaturas){
        double suma = 0;
        for(int i = 0; i < vectorAsignaturas.length; i++){
            if(vectorAsignaturas[i] !=null){
                suma += vectorAsignaturas[i].getNota();
            }
        }
        
        return suma / vectorAsignaturas.length;
    }
2.
public static void main(String[] args) {
        int longitud = pedirLongitud();//Longitud que se lo pedimos al usuario
        int[] vector = new int[longitud];//Array que se crea con lo que diga el usuario
        
        //Rellenar el array con su metodo y mostrar el array
        rellenarArray(vector);
        mostrarArray(vector);
    }
    
    //Metodo que rellena el array con numeros aleatorios
    public static void rellenarArray(int [] vector){
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int)(Math.random() * 6) + 1;
        }
    }
    
    //Metodo que muestra el contenido del array con un for-each
    public static void mostrarArray(int [] vector){
        System.out.print("Contenido del array: ");
        for(int num : vector){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    //Metodo que pide al usuario la longitud del array y valida la entrada
    public static int pedirLongitud(){
        Scanner entrada = new Scanner(System.in);
        int longitud = 0;
        boolean valido = false;
        
        //Repetir hasta que el usuario introduzca un valor entero
        while(!valido){
            try {
                System.out.print("Introduce la longitud del array: ");
                longitud = entrada.nextInt();
                
                //Comprobar si esta dentro del rango permitido
                if(longitud >= 1 && longitud <= 10){
                    valido = true;
                }else {
                    System.out.println("Error: La longitud debe ser entre 1 y 10");
                }
            }catch (InputMismatchException e) {
                //Si el usuario introduce una letra
                System.out.println("Error: Debes introducir un numero entero");
                entrada.nextLine();//Limpiar buffer
            }
        }
        return longitud;//Devolver la longitud valida
    }
6.
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Pedir al usuario cuantos empleados quiere introducir
        System.out.print("Cuantos empleados desea introducir?: ");
        int empleados = entrada.nextInt();
        entrada.nextLine();//Limpiar buffer

        //Se crea un array de objetos Empleado con el tamaño que introduzca el usuario
        Empleado[] emple = new Empleado[empleados];

        //Bucle para rellenar los datos de cada empleado
        for (int i = 0; i < emple.length; i++) {
            System.out.println("\n- EMPLEADO " + (i + 1) + " -");

            //Se pide al usuario el nombre, las horas y la tarifa
            System.out.print("Introduzca el nombre del empleado: ");
            String nombre = entrada.nextLine();

            System.out.print("Cuantas horas trabajo este mes?: ");
            int horas = entrada.nextInt();

            System.out.print("Cual es su tarifa por hora de trabajo?: ");
            double tarifa = entrada.nextDouble();
            entrada.nextLine();

            //Se crea el objeto Empleado y se guarda en el array
            emple[i] = new Empleado(nombre, horas, tarifa);

            System.out.println("EMPLEADO " + (i + 1) + " ALMACENADO CON EXITO");
        }
        System.out.println("\nSUELDO BRUTO DE LOS EMPLEADOS");
        //Se recorre el array con un for-each para mostrar la informacion
        for (Empleado empleado : emple) {
            double sueldo = empleado.calcularSueldo();
            System.out.println(empleado.getNombre() + " trabajo " + empleado.getHorasTrabajadas() + " horas, cobra "
                    + empleado.getTarifaHora() + " euros la hora por lo que le corresponde un sueldo de " + sueldo + " euros");
        }
    }
7.
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Array con los 30 dias del mes
        Dia[] mes = new Dia[30];
        //Array con los nombres de los dias de la semana
        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        int opcion;

        //Bucle que se repite hasta que el usuario elija salir
        do {
            mostrarMenu();
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> rellenarTemperaturas(mes, diasSemana);
                case 2 -> mostrarTemperatura(mes);
                case 3 -> System.out.println("La temperatura media del mes es: " + temperaturaMedia(mes) + " grados");
                case 4 -> mostrarDiasMasCalurosos(mes);
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while (opcion != 5);//Repetir hasta que no elija la opcion salir
    }

    //Metodo que muestra el menu de opciones
    public static void mostrarMenu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n--MENU--");
        System.out.println("1. Rellenar temperaturas aleatorias");
        System.out.println("2. Mostrar temperaturas");
        System.out.println("3. Temperatura media del mes");
        System.out.println("4. Dia o dias mas calurosos del mes");
        System.out.println("5. Salir del programa");
        System.out.print("Elige una opcion: ");
    }

    //Metodo que rellena el array con numeros aleatorios y con los dias de la semana
    public static void rellenarTemperaturas(Dia[] mes, String[] diasSemana) {
        System.out.println("");
        int diaInicial = (int) (Math.random() * 7);

        for (int i = 0; i < mes.length; i++) {
            int temperatura = (int) (Math.random() * 41);
            //Se crea el objeto Dia y se guarda en el array
            mes[i] = new Dia(diasSemana[diaInicial], temperatura);
            diaInicial++; //Incrementamos el índice para que pase al siguiente nombre del día de la semana
            if (diaInicial == 7){  //Si se pasa del domingo, volvemos a empezar en el 0 (el lunes)
                diaInicial = 0;
            }
        }
        
        System.out.println("Temperaturas generadas correctamente");
    }

    //Metodo que muestra las temperaturas
    public static void mostrarTemperatura(Dia[] mes) {
        System.out.println("");
        for (int i = 0; i < mes.length; i++) {
            System.out.println(mes[i].getNombreDia() + " dia " + (i + 1) + ": "
                    + mes[i].getTemperatura() + " grados");
        }
    }
    
    //Metodo que calcula la temperatura media del mes y la devuelve
    public static double temperaturaMedia(Dia[] mes){
        System.out.println("");
        int suma = 0;
        
        for (int i = 0; i < mes.length; i++) {
            suma += mes[i].getTemperatura();
        }
        
        return (double)suma / mes.length;
    }

    //Metodo que muestra el dia o dias mas calurosos del mes
    public static void mostrarDiasMasCalurosos(Dia[] mes){
        System.out.println("");
        int max = mes[0].getTemperatura();
        
        //Se busca la temperatura mayor del mes
        for (int i = 1; i < mes.length; i++) {
            if (mes[i].getTemperatura() > max){
                max = mes[i].getTemperatura();
            }
        }
        
        System.out.println("El dia o dias mas calurosos fueron: ");
        
        //Se muestra todos los dias que sean iguales a la temperatura mayor
        for (int i = 0; i < mes.length; i++) {
            if (mes[i].getTemperatura() == max){
                System.out.println("El " + mes[i].getNombreDia() + " dia " + (i + 1) + " con " + max + " grados");
            }
        }
    }
9.
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Arrays con los nombres de los alumnos y las asignaturas
        String[] alumnos = {"Pepe", "Juan", "Marta"};
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"};
        
        //Array de objetos Alumno
        Alumno[] alu = new Alumno[3];
        
        //Se crea cada alumno y asignarle su nombre
        for(int i = 0; i < alu.length; i++){
            alu[i] = new Alumno();
            alu[i].setNombreAlumno(alumnos[i]);
        }
        
        int opcion;
        
        do{
            mostrarMenu();
            opcion = entrada.nextInt();
            
            switch(opcion){//Selección de la acción según la opción elegida
                case 1 -> rellenarAlumnos(alu, asignaturas);
                case 2 -> mostrarAlumnos(alu);
                case 3 -> mejorAlumno(alu);
                case 4 -> peorAlumno(alu);
                case 5 -> asignaturaDificil(alu, asignaturas);
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida. Intentalo de nuevo");
            }
        }while(opcion != 6);//Repetir hasta que el usuario elija salir
    }
    
    //Metodo que muestra el menu por pantalla
    public static void mostrarMenu(){
        System.out.println("\n--MENU--");
        System.out.println("1. Rellenar las notas de los alumnos");
        System.out.println("2. Mostrar las notas introducidas de los alumnos");
        System.out.println("3. Alumno mejor de la clase");
        System.out.println("4. Alumno con mas suspensos");
        System.out.println("5. Asignatura mas dificil");
        System.out.println("6. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    //Metodo que permite introducir las notas de cada alumno en cada asignatura
    public static void rellenarAlumnos(Alumno[] alu, String[] asignaturas) {
        System.out.println("");
        for (int i = 0; i < alu.length; i++) {
            System.out.println("Introduce notas para " + alu[i].getNombreAlumno());
            alu[i].rellenarNotas(asignaturas); //El alumno se rellena solo 
        }
    }
    
    //Metodo que muestra todas las notas de todos los alumnos
    public static void mostrarAlumnos(Alumno[] alu){
        System.out.println("");
        for (int i = 0; i < alu.length; i++) {
            alu[i].mostrarNotas();
        }
    }
    
    //Metodo que calcula que alumno tiene la mejor media
    public static void mejorAlumno(Alumno[] alu){
        System.out.println("");
        float mejorMedia = 0f;
        String mejorAlumno = "";
        
        for (int i = 0; i < alu.length; i++) {
            float media = alu[i].calcularMedia();
            if (media > mejorMedia) {
                mejorMedia = media;
                mejorAlumno = alu[i].getNombreAlumno();
            }
        }
        System.out.println("El mejor alumno es: " + mejorAlumno + " con una media de " + mejorMedia);
    }
    
    //Metodo que determina que alumno tiene más suspensos
    public static void peorAlumno(Alumno[] alu){
        System.out.println("");
        int maxSuspensos = 0;
        String alumnoPeor = "";
        int suspensos;
        
        for (int i = 0; i < alu.length; i++) {
            suspensos = alu[i].contarSuspensos();
            if (suspensos > maxSuspensos) {
                maxSuspensos = suspensos;
                alumnoPeor = alu[i].getNombreAlumno();
            }
        }
        System.out.println("El alumno con mas suspensos es: " + alumnoPeor + " con " + maxSuspensos + " suspensos");
    }
    
    //Metodo que calcula que asignatura tiene la peor media
    public static void asignaturaDificil(Alumno[] alu, String[] asignaturas){
        System.out.println("");
        float peorMedia = 999f;//Lo pongo porque es el valor inicial mas alto
        String peor = "";
        float suma;
        
        for (int pos = 0; pos < asignaturas.length; pos++) {
            suma = 0f;
            for (int i = 0; i < alu.length; i++) {
                suma += alu[i].getNotaPorPosicion(pos);
            }
            float media = suma / alu.length;
            if (media < peorMedia) {
                peorMedia = media;
                peor = asignaturas[pos];
            }
        }
        System.out.println("La asignatura mas dificil es: " + peor + " con media " + peorMedia);
    }
11-12.
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Se crea un mueble con el constructor por defecto
        Mueble mueble1 = new Mueble();
        mueble1.setDescripcion("Mesa de madera"); 
        mueble1.setPrecio(75.99);
        //Se crea un mueble con el constructor parametrizado
        Mueble mueble2 = new Mueble(167.75, "Sofa de color azul");
        
        //Se muestra la información de los muebles creados
        System.out.println("--MUEBLE-1--");
        System.out.println(mueble1.toString());
        System.out.println("--MUEBLE-2--");
        System.out.println(mueble2.toString());
        //Se modifica la descripción de ambos muebles
        mueble1.setDescripcion("Mesa de madera pequenia");
        mueble2.setDescripcion("Sofa de color negro");
        //Se vuelve a mostrar la información después de modificar
        System.out.println("\nDespues de modificar:"); 
        System.out.println(mueble1.toString());
        System.out.println(mueble2.toString());
        
        //Se crea un vector de 4 muebles
        Mueble[] vectorMueble = new Mueble[4];
        int opcion;
        
        do{
            mostrarMenu();
            opcion = entrada.nextInt();
            
            switch(opcion){//Selección de opción del menú
                case 1 -> rellenarMuebles(vectorMueble);
                case 2 -> mostrarMuebles(vectorMueble);
                case 3 -> mostrarPorPrecio(vectorMueble);
                case 4 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        }while(opcion != 4);//Repetir hasta que el usuario elija salir
    }
    
    //Método que muestra el menú por pantalla
    public static void mostrarMenu(){
        System.out.println("\n--MENU--");
        System.out.println("1. Rellenar muebles");
        System.out.println("2. Mostrar muebles");
        System.out.println("3. Mostrar muebles por precio");
        System.out.println("4. Salir");
        System.out.print("Elige una opcion: ");
    }
    
    //Método que permite rellenar los 4 muebles del vector
    public static void rellenarMuebles(Mueble[] vectorMueble){
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < vectorMueble.length; i++) {
            System.out.println("\nMueble " + (i+1));
            
            System.out.print("Descripcion: ");
            String descrip = entrada.nextLine();
            System.out.print("Precio: ");
            double precio = entrada.nextDouble();
            entrada.nextLine();//Limpiar buffer
            
            //Se crea el mueble y guardarlo en el vector
            vectorMueble[i] = new Mueble(precio, descrip);
        }
        System.out.println("Muebles rellenados correctamente");
    }
    
    //Método que muestra todos los muebles del vector
    public static void mostrarMuebles(Mueble[] vectorMueble){
        System.out.println();
        for (int i = 0; i < vectorMueble.length; i++) {
            //Si hay un mueble en esa posición, mostrarlo
            if(vectorMueble[i] != null){
                System.out.println("Mueble " + (i+1) + ": ");
                System.out.println(vectorMueble[i].toString());
            }else{
                //Si no hay mueble, indicar que está vacío
                System.out.println("Mueble " + (i+1) + ": vacio");
            }
        }
    }
    
    //Método que muestra los muebles cuyo precio es menor o igual al introducido
    public static void mostrarPorPrecio(Mueble[] vectorMueble){
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce un precio: ");
        double max = entrada.nextDouble();
        
        boolean encontrado = false;
        
        for(Mueble mueble : vectorMueble){
            //Comprobar que no sea null y que cumpla la condición
            if(mueble != null && mueble.getPrecio() <= max){
                System.out.println(mueble.toString());
                encontrado = true;
            }
        }
        //Si no se encontró ninguno, avisar
        if(!encontrado){
            System.out.println("No hay muebles con ese precio");
        }
    }
13-14.
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Se crea el alumno usando el contructor por defecto
        Alumno alumno1 = new Alumno();
        alumno1.setNombre("David");
        alumno1.setEdad(15);
        alumno1.setNotaMedia(6.5f);
        
        //Se crea el alumno usando el contructor parametrizado
        Alumno alumno2 = new Alumno("Pedro", 12, 7.8f);
        
        //Mostrar los dos alumnos creados
        System.out.println("--ALUMNO-1--");
        System.out.println(alumno1.toString());
        System.out.println("--ALUMNO-2--");
        System.out.println(alumno2.toString());
        System.out.println("");
        
        //Se crea un array de 5 alumnos
        Alumno[] alu = new Alumno[5];
        int opcion;
        
        do{
            mostrarMenu();
            opcion = entrada.nextInt();
            
            switch(opcion){//Se ejecuta la opción elegida
                case 1 -> rellenarAlumnos(alu);
                case 2 -> mostrarAlumnos(alu);
                case 3 -> mostrarAlumnosMediaEncima(alu);
                case 4 -> mostrarAlumnosMediaSuspensa(alu);
                case 5 -> buscarAlumnos(alu);
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        }while (opcion != 6);//No termina hasta que elija el 6
    }
    
    //Metodo que muestra el menu
    public static void mostrarMenu(){
        System.out.println("\n--MENU--");
        System.out.println("1. Rellenar un alumno");
        System.out.println("2. Mostrar vector del alumno");
        System.out.println("3. Mostrar alumnos con nota media por encima de una nota dada");
        System.out.println("4. Mostrar cuantos alumnos hay con la nota media suspensa");
        System.out.println("5. Buscar alumnos");
        System.out.println("6. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    //Metodo que rellena los datos del alumno
    public static void rellenarAlumnos(Alumno[] alu){
        System.out.println("");
        Scanner entrada = new Scanner(System.in);
        
        int posicion;
        //Se pide al usuario una posición válida dentro del array
        do{
            System.out.print("Introduce la posicion entre el 0 y el 4: ");
            posicion = entrada.nextInt();
            entrada.nextLine();
            
            //Si la posición está fuera del rango permitido
            if(posicion < 0 || posicion >= alu.length){
                System.out.println("Posicion fuera de rango");
            //Si la posición está dentro del rango pero ya tiene un alumno guardado
            }else if(alu[posicion] != null){
                System.out.println("Esa posicion ya esta ocupada. Elige otra");
            }
        //Se repite mientras la posición sea inválida o esté ocupada
        }while(posicion < 0 || posicion >= alu.length || alu[posicion] != null);
        
        //Se piden los datos del alumno
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Edad: ");
        int edad = entrada.nextInt();
        System.out.print("Nota media: ");
        float nota = entrada.nextFloat();
        
        //Se crea el alumno y se guarda los datos en la posicion indicada
        alu[posicion] = new Alumno(nombre, edad, nota);
        System.out.println("Alumno insertado correctamente");
    }
    
    //Metodo que muestra los datos del alumno
    public static void mostrarAlumnos(Alumno[] alu){
        System.out.println("");
        for(int i = 0; i < alu.length; i++){
            if(alu[i] != null){
                System.out.println("--Posicion " + i + "--");
                System.out.println(alu[i].toString());
            }
        }
    }
    
    //Metodo que muestra los alumnos que tienen la nota media superior al indicado
    public static void mostrarAlumnosMediaEncima(Alumno[] alu){
        System.out.println("");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una nota limite: ");
        float limite = entrada.nextFloat();
        
        boolean encontrado = false;
        
        for(int i = 0; i < alu.length; i++){
            if(alu[i] != null && alu[i].getNotaMedia() > limite){
                System.out.println(alu[i].toString());
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("No hay alumnos con nota media superior a " + limite);
        }
    }
    
    //Metodo que muestra los alumnos que tienen la nota media inferior a 5
    public static void mostrarAlumnosMediaSuspensa(Alumno[] alu){
        System.out.println("");
        int contador = 0;
        String nombre = "";
        
        for(int i = 0; i < alu.length; i++){
            if(alu[i] != null && alu[i].getNotaMedia() < 5){
                contador++;
                nombre += alu[i].getNombre() + " ";
            }
        }
        System.out.println("Hay " + contador + " alumnos con la nota media suspensa y son: " + nombre);
    }
    
    //Metodo que busca el alumno por si nombre y muestra sus datos si existe
    public static void buscarAlumnos(Alumno[] alu){
        System.out.println("");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el nombre del alumno a buscar: ");
        String nombre = entrada.nextLine();
        
        boolean encontrado = false;
        int posicionActual = 0;
        
        while(posicionActual < alu.length && !encontrado){
            //Se comprueba que la posición no sea null y que el nombre coincida
            if(alu[posicionActual] != null && alu[posicionActual].getNombre().equalsIgnoreCase(nombre)){
                encontrado = true;
            }else{
                posicionActual++;
            }
        }
        if(encontrado){
            System.out.println("El alumno 'si' esta matriculado");
            System.out.println(alu[posicionActual].toString());
        }
        else{
            System.out.println("El alumno 'no' esta matriculado");
        }
    }
15-16.
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Se crea un array de 5 peliculas
        Pelicula[] peliculas = new Pelicula[5];
        
        int opcion;
        
        do {            
            mostrarMenu();
            opcion = entrada.nextInt();
            
            switch(opcion){//Se ejecuta la opción elegida
                case 1 -> rellenarPeliculas(peliculas);
                case 2 -> mostrarPeliculasYSocios(peliculas);
                case 3 -> mostrarPeliculaMasRentable(peliculas);
                case 4 -> mostrarPeliculaMenosRentable(peliculas);
                case 5 -> pedirNombrePelicula(peliculas);
                case 6 -> contarNumeroSocios(peliculas);
                case 7 -> mostrarSociosPorLetra(peliculas);
                case 8 -> mostrarPeliculasPorTexto(peliculas);
                case 9 -> cambiarAporE(peliculas);
                case 10 -> convertirTitulosMayusculas(peliculas);
                case 11 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while (opcion != 11);//No termina hasta que elija el 11
    }
    
    //Metodo que muestra el menu
    public static void mostrarMenu(){
        System.out.println("\n--MENU--");
        System.out.println("1. Rellenar peliculas y socios");
        System.out.println("2. Mostrar peliculas y socios");
        System.out.println("3. Mostrar la pelicula mas rentable");
        System.out.println("4. Mostrar la pelicula menos rentable");
        System.out.println("5. Buscar pelicula y mostrar beneficio + socios");
        System.out.println("6. Contar socios con precio abonado mayor al indicado");
        System.out.println("7. Mostrar socios con empiecen por una letra");
        System.out.println("8. Mostrar peliculas que empiecen por un texto");
        System.out.println("9. Cambiar 'a' por 'e' en la ultima pelicula");
        System.out.println("10. Convertir titulos a mayusculas");
        System.out.println("11. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }
    
    //Metodo que rellena los datos de las peliculas y los socios
    public static void rellenarPeliculas(Pelicula[] peliculas) {
        System.out.println("");
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < peliculas.length; i++) {
            System.out.println("--PELICULA " + (i + 1) + "--");
            System.out.print("Titulo: ");
            String titulo = entrada.nextLine();
            System.out.print("Coste de licencia: ");
            float coste = entrada.nextFloat();
            entrada.nextLine();
            Pelicula p = new Pelicula(titulo, coste);
            p.rellenarSocios();
            peliculas[i] = p;
        }
    }
    
    //Metodo que muestra las peliculas y los socios
    public static void mostrarPeliculasYSocios(Pelicula[] peliculas) {
        System.out.println("");
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i] != null) {
                System.out.println("--PELICULA " + (i + 1) + "--");
                System.out.println("Titulo: " + peliculas[i].getTitulo());
                System.out.println("Coste licencia: " + peliculas[i].getCosteLicencia());
                System.out.println("--Socios--");
                peliculas[i].mostrarSocios();
            }
        }
    }
    
    //Metodo que muestra la pelicula mas rentable de ver
    public static void mostrarPeliculaMasRentable(Pelicula[] peliculas) {
        System.out.println("");
        Pelicula mejor = peliculas[0];
        float max = mejor.calcularBeneficioNeto();

        for (int i = 0; i < peliculas.length; i++) {
            float beneficio = peliculas[i].calcularBeneficioNeto();
            if (beneficio > max) {
                max = beneficio;
                mejor = peliculas[i];
            }
        }

        System.out.println("La pelicula mas rentable es: " + mejor.getTitulo() + " con beneficio: " + max);
    }
    
    //Metodo que muestra la pelicula menos rentable de ver
    public static void mostrarPeliculaMenosRentable(Pelicula[] peliculas) {
        System.out.println("");
        Pelicula peor = peliculas[0];
        float min = peor.calcularBeneficioNeto();

        for (int i = 0; i < peliculas.length; i++) {
            float beneficio = peliculas[i].calcularBeneficioNeto();
            if (beneficio < min) {
                min = beneficio;
                peor = peliculas[i];
            }
        }
        System.out.println("La pelicula menos rentable es: " + peor.getTitulo() + " con beneficio: " + min);
    }
    
    //Metodo que pide el nombre de la pelicula y muestra los beneficios y los socios
    public static void pedirNombrePelicula(Pelicula[] peliculas) {
        System.out.println("");
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el titulo a buscar: ");
        String titulo = entrada.nextLine();

        boolean encontrado = false;
        int i = 0;

        //Se busca la película por título
        while(i < peliculas.length && !encontrado){
            Pelicula p = peliculas[i];
            if (p != null && p.getTitulo().equalsIgnoreCase(titulo)) {

                //Se usa los métodos de la clase Pelicula
                float beneficio = p.calcularBeneficioNeto();

                System.out.println("Beneficio neto: " + beneficio);
                System.out.println("--Socios--");
                p.mostrarSocios();

                encontrado = true;
            }
            i++;
        }

        if (!encontrado) {
            System.out.println("No existe esa pelicula");
        }
    }
    
    //Metodo que cuenta los numeros de socios que han abonado mas que el introducido
    public static void contarNumeroSocios(Pelicula[] peliculas) {
        System.out.println("");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce precio minimo: ");
        float minimo = entrada.nextFloat();
        int total = 0;

        for (Pelicula p : peliculas) {
            if (p != null) {
                total += p.contarSociosConPrecioMayor(minimo);
            }
        }
        System.out.println("Hay " + total + " socios que han abonado mas de " + minimo);
    }
    
    //Metodo que muestra los socios por la letra
    public static void mostrarSociosPorLetra(Pelicula[] peliculas) {
        System.out.println("");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una letra: ");
        char letra = entrada.nextLine().charAt(0);

        for (Pelicula p : peliculas) {
            if (p != null) {
                p.mostrarSociosPorLetra(letra);
            }
        }
    }
    
    //Metodo que muestra las peliculas por texto
    public static void mostrarPeliculasPorTexto(Pelicula[] peliculas){
        System.out.println("");
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce texto inicial: ");
        String texto = entrada.nextLine();

        for(Pelicula p : peliculas){
            if(p != null && p.startsWith(texto)){
                System.out.println(p.getTitulo());
            }
        }
    }
    
    //Metodo que cambia la letra 'a' por la 'e'
    public static void cambiarAporE(Pelicula[] peliculas) {
        System.out.println("");
        Pelicula ultima = peliculas[peliculas.length - 1];
        if (ultima != null) {
            ultima.cambiarAporE();
        }
    }
    
    //Metodo que muestra los titulos en mayusculas
    public static void convertirTitulosMayusculas(Pelicula[] peliculas) {
        System.out.println("");
        for (Pelicula p : peliculas) {
            if (p != null) {
                p.convertirTituloMayusculas();
                System.out.println("Nuevo titulo: " + p.getTitulo());
            }
        }
    }

-- TEMA 9 --
2.
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Pido al usuario que introduzca una cadena de texto
        System.out.print("Introduzca una cadena: ");
        String texto = entrada.nextLine();
        
        //Se muestra el mensaje y con el for recorre toda la cadena y muestra el mensaje final
        System.out.println("Caracteres uno por uno");
        for(int i = 0; i < texto.length(); i++){
            System.out.println("Posicion " + i + ": " + texto.charAt(i));
        }
    }
3.
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Pido al usuario que introduzca una cadena de texto
        System.out.print("Introduce una cadena: ");
        String texto = entrada.nextLine();
        
        //Se convierte la cadena en un array de caracteres
        char[] letras = texto.toCharArray();
        
        //Se muestra cada caracter en la posicion i
        System.out.println("Caracteres uno por uno:");
        for(int i = 0; i < letras.length; i++){
            System.out.println("Posicion " + i + ": " + letras[i]);
        }
    }
5.
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Se crea una array con los dias de la semana
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        
        //Pide al usuario que introduzca un dia
        System.out.print("Introduzca un dia de la semana: ");
        String dia = entrada.nextLine();
        
        boolean encontrado = false;
        int i = 0;
        
        //Buscamos el dia
        while (i < dias.length && !encontrado){
            //Se compara ignorando mayusculas y minusculas
            if (dias[i].equalsIgnoreCase(dia)){
                encontrado = true;
            //Sino se sigue buscando
            }else{
                i++;
            }
        }
        
        //Se muestra el resultado
        if(encontrado){
            System.out.println("Es el " + (i + 1) + " dia de la semana");
        }else{
            System.out.println("Dia no valido");
        }
    }
7.
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Pide al usuario que introduzca una frase
        System.out.print("Introduce una frase: ");
        String frase = entrada.nextLine();
        
        //Se llama al metodo que mostrará la frase invertida
        mostrarFraseInvertida(frase);
    }
    public static void mostrarFraseInvertida(String frase){
        //Se divide la frase en palabras usando split con un espacio como separador
        String[] palabras = frase.split(" ");
        //Nueva cadena donde se construye la frase invertida
        String fraseInvertida = "";

        //Se recoore el array de izquierda a derecha, pero se va añadiendo cada palabra al principio de la nueva frase
        for(int i = 0; i < palabras.length; i++){
            fraseInvertida = palabras[i] + " " + fraseInvertida;
        }
        //Se muestra el resultado final
        System.out.println("Frase invertida palabra a palabra:");
        System.out.println("- " + fraseInvertida);
    }
9.
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre de usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Introduce tu contrasenia: ");
        String contrasenia = sc.nextLine();

        if (esContrasenaValida(usuario, contrasenia)) {
            System.out.println("Contrasenia valida");
        } else {
            System.out.println("Contrasenia no valida");
        }
    }

    //Método que verifica si la contraseña cumple los requisitos
    public static boolean esContrasenaValida(String usuario, String contrasenia) {
        boolean valida = true;

        //1. Comprobar longitud mínima
        if (contrasenia.length() < 6) {
            System.out.println("La contrasenia debe tener al menos 6 caracteres");
            valida = false;
        }

        //2. Comprobar que contiene al menos 2 dígitos
        int contadorDigitos = 0;
        for (int i = 0; i < contrasenia.length(); i++) {
            char c = contrasenia.charAt(i);
            if (c >= '0' && c <= '9') {
                contadorDigitos++;
            }
        }

        if (contadorDigitos < 2) {
            System.out.println("La contrasenia debe contener al menos 2 digitos");
            valida = false;
        }

        //3. Comprobar que el nombre de usuario no está dentro de la contraseña
        if (contrasenia.toLowerCase().contains(usuario.toLowerCase())) {
            System.out.println("La contrasenia no puede contener el nombre de usuario");
            valida = false;
        }
        
        return valida;
    }