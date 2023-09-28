package ejerciciosArrays;

import java.util.Scanner;

public class EjerciciosArraysFunciones {

	public EjerciciosArraysFunciones() {
		// TODO Auto-generated constructor stub
		
		/*1.-Crear un array que contenga los caracteres de la 'a' a la 'f'. A continuación muestre los valores contenidos en el
		array.*/
		
		//System.out.println("EJERCICIO 1- ARRAY DE LA (A) HASTA LA (F)");
		Scanner leer=new Scanner(System.in);
		/*String []caracteres= {"a","b","c","d","e","f"};
		calculacaracteres(caracteres);
		*/
		/*2.-Escriba un programa que cree un array con los caracteres dela 'a' a la 'k' y a continuación sustituya todas las
		vocales quese encuentren en el array por el carácter '*'.*/
		/*
		System.out.println("EJERCICIO 2- ARRAY DE LA (A) HASTA LA (K) Y SUSTITUIR VOCALES");
		String []caracteresLargo={"a","b","c","d","e","f","g","h","i","j","k"};
		calculavocales(caracteresLargo);
		*/
		/*3.-Escriba un programa que cree un array de 5 enteros, lo inicialice y a continuación muestre el valor almacenado en
		la tercera posición.*/
		/*
		System.out.println("EJERCICIO 3- ARRAY QUE SEAN 5 ENTEROS Y MUESTRE SOLO EL DE LA POSICION 3");
		int []enteros= {2,7,8,3,10};
		calculaposicion3(enteros);
		*/
		/*4.+ Escriba un programa que cree un array unidimensional de tipo entero. Inicializalo en la propia declaracion. A
		continuación el programa debe copiar el contenido de ese array a otro similar mediante un bucle y mostrar por
		pantalla los valores de ambos array para comprobar la copia.*/
		/*System.out.println("EJERCICIO 4- CREAR COPIA DE UN ARRAY Y MOSTRAR LOS 2 ARRAYS");
		int []original={2,4,6,7,3,8,1,9};
		copiaarray(original);
		*/
		/*5.-Repite el ejercicio 4 con un array bidimensional (y con otro tipo), esta vez los valores del primer array se deben
		obtener a partir del teclado*/
		/*System.out.println("EJERCICIO 5- CREAR COPIA DE UN ARRAY Y PUESTO POR TECLADO DESPUES MOSTRAR LOS 2 ARRAYS");
		int[][]numerosBidi=new int[3][3];
		introducearraybidi(numerosBidi);*/
		/*6.-Escriba un programa que cree el siguiente array y lo inicialice
		con estos valores:*/
		/*3 6 9 12
		15 18 0 0
		0 0 0 0*/
		/*System.out.println("EJERCICIO 6- HACER ARRAY BIDIMENSIONAL COMO LO PONE AHI");
		int [][]replicaDatos= {	{3,6,9,12},	
							    {15,18,0,0},
							    {0,0,0,0} 
							    };
		muestraPosiciones(replicaDatos);*/
		
		
		/*7.-Escriba un programa que lea 8 números del teclado, los almacene en un array y despues muestre la suma y el
		promedio.*/
		/*System.out.println("EJERCICIO 7- HACER SUMA CON ARRAY Y TAMBIEN HACER UN PROMEDIO");
		int []numero=new int[8];
		for(int cont=0;cont<numero.length;cont++) { 
			numero[cont]=leer.nextInt();
		}
		int suma=sumavalores(numero); 
		System.out.println(suma);
		double media=(double)suma/numero.length;
		System.out.println(media);
		*/
		/*8.- Escriba un programa que permita registrar 6 numeros en forma de tabla 3x2. A continuaciÃ3n el programa
		mostrarÃ¡ los valores maximo y minimo de cada fila y de toda la tabla.*/
		
		/*9.-Diseñar un programa en Java que permita declarar un array unidimensional (vector) de 10 números enteros,
		pida al usuario 10 números enteros para almacenarlos en dicho array y a continuacion pida un número para
		comprobar cuantas veces aparece dicho número dentro del array.*/
		
		
		
		
		/*System.out.println("EJERCICIO 9- PEDIR 10 NUMEROS PARA EL ARRAID Y LUEGO PONER OTRO Y VER CUANTAS VECES LO HAS PUESTO");
		System.out.println("Introduce 10 numeros");
		int []numerosUsuario=new int [10];
		for(int z=0;z<numerosUsuario.length;z++) {
			numerosUsuario[z]=leer.nextInt();
		}
		System.out.println("Introduce el numero que quieras saber cuantas veces esta en el array");
		int repeticiones=numerorepetido(numerosUsuario);
		System.out.println("El numero que has puesto se ha repetido en el array un total de "+repeticiones);*/
		
		
		
		
		/*10.-Diseña un programa en Java que permita registrar 200 números enteros en un array. Para cargar el array con
		los 200 números puede generar números aleatorios usando la función random(Math.random). A continuacion
		deberás indicar si dicho array esta o no ordenado.*/
		
		
		
		
		/*System.out.println("EJERCICIO 10- 200 numeros RANDOM metidos en un array");
		int[]randisimo=new int[200];
		for (int veces=0;veces<randisimo.length;veces++) {
			randisimo[veces]=(int)Math.floor(Math.random()*5+1);
		}
		*/
		
		
		
		
		/*11.-Disenar un programa en Java que permita consultar y añadir registros a una agenda de
		contactos donde se guardan los nombres y teléfonos de N personas (el número máximo de contactos N se pedirá¡
		por teclado) al iniciar el programa.
		Juana 675456551
		Ana 698667872
		Federico 674556458
		Maria 668677324
		Antonio 677344231
		El programa debe mostrar un menú como el siguiente:
		1. Registrar nuevo contacto.
		2. Consultar contacto.
		3. Salir.

		La opción 1 permitirá añadir un nuevo contacto a la lista, se pedirá¡ el nombre del nuevo contacto (una sola
		palabra) y a continuación su número de teléfono.
		La opción 2 permitirá consultar un contacto de la agenda, se pedirá el nombre y a
		Continuación se mostrará su número de teléfono correspondiente. En caso de no encontrarse, mostrará un
		mensaje indicando que no ha sido encontrado.
		La opción 3 terminará¡ el programa.*/
		String[]nombreContacto=new String[20];
		int []numeroTelefono=new int[20];
		int opciones=0;
		System.out.println("EJERCICIO 11- APP QUE AÑADE Y CONSULTA CONTACTOS");
		while(opciones<3) {
			System.out.println("1. Registrar nuevo contacto.");
			System.out.println("2. Consultar contacto.");
			System.out.println("3. Salir.");
			opciones=leer.nextInt();
			switch(opciones){
			case 1:
				añadeArray(nombreContacto, numeroTelefono);
				break;
			case 2:
				ConsultasArray(nombreContacto, numeroTelefono);
				break;
			case 3:
				break;
		}
		}
		
		
		/*12.- Disena un programa en Java que rellene un array de 4x4 de la siguiente manera:
			1 0 0 0
			0 1 0 0
			0 0 1 0
			0 0 0 1*/
		
		//A continuación muestre el contenido del array por pantalla.
		
		
		/*13.-Dado un array de NxM elementos de tipo entero (N filas y M columnas. El valor de N y M se
		pedirán por teclado) calcular la suma de sus filas y sus columnas.*/
		
		
		/*14.-Diseñar un programa en Java que compruebe si un array de enteros de 5x5, es un cuadrado mágico. Se
		considera un cuadrado mágico aquel en el que las filas, las columnas y las diagonales suman igual.*/
		
		
		/*15.-Diseñar un programa en Java que mezcle dos arrays ordenados de N números enteros
		consiguiendo un nuevo array de N*2 enteros igualmente ordenados.*/
		
		
		/*16.-Dado un array de enteros de tamaño 5x5, diseñar un programa en Java que lo rellene como en la siguiente
		figura:
		0 1 2 3 4
		1 2 3 4 3
		2 3 4 3 2
		3 4 3 2 1
		4 3 2 1 0
		*/
		
		
		/*17.-DiseÃ±ar un programa en Java que lea números enteros hasta que se escribe el Â1. Los números
		deben ir quedando almacenados en un array. Como no sabemos la cantidad de números que se van a teclear, el
		array deberá¡ ir cambiando de tamaño para adaptarse al
		nuevo número de datos leídos.*/
		
		
	}

	private void ConsultasArray(String[] nombreContacto, int[] numeroTelefono) {
		// TODO Auto-generated method stub
		for(int x=0;x<nombreContacto.length;x++) {	
			System.out.println(nombreContacto[x] +":"+numeroTelefono[x]);
		}
	}

	private void añadeArray(String[] nombreContacto, int[] numeroTelefono) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		int x=0;
		nombreContacto[x]=leer.next();
		numeroTelefono [x]=leer.nextInt();
		x++;
	}

	private void muestraPosiciones(int[][] replicaDatos) {
		// TODO Auto-generated method stub
		System.out.println("MUESTRA LOS DEL ARRAY ORIGINAL");
		int [][]copia=new int [3][4];
		for(int x=0;x<replicaDatos.length;x++) {
			
			for(int y=0;y<replicaDatos[x].length;y++) {
				copia[x][y]=replicaDatos[x][y];
				System.out.print(replicaDatos[x][y]+"-");
			}
			System.out.println("");
		}
		System.out.println("MUESTRA LOS DEL ARRAY COPIADO");
		for(int x2=0;x2<copia.length;x2++) {
			for(int y2=0;y2<copia[x2].length;y2++) {
				System.out.print(replicaDatos[x2][y2]+"-");
			}
			System.out.println("");
		}
	}

	private void introducearraybidi(int[][] numerosBidi) {
		// TODO Auto-generated method stub
		
 		Scanner leer=new Scanner(System.in);
 		int y=0;
		for(int x=0;x<numerosBidi.length;x++) {
			
		}
	}

	private int numerorepetido(int[] numerosUsuario) {
		// TODO Auto-generated method stub
		Scanner leerFuncion=new Scanner(System.in);
		int numeroSaber=leerFuncion.nextInt();
		int contadorCoincidencias=0;
		for(int x=0;x<numerosUsuario.length;x++) {
			if(numerosUsuario[x]==numeroSaber) {
				contadorCoincidencias++;
			}
		}
		return contadorCoincidencias;
	}

	private int sumavalores(int[] numero) {
		// TODO Auto-generated method stub
		int suma=0;
		for(int x=0;x<numero.length;x++) {
			suma+=numero[x];
		}
		return suma;
	}

	private void copiaarray(int[] original) {
		// TODO Auto-generated method stub
		int []copiaOriginal=new int [8];
		for(int i=0;i<original.length;i++) {
		copiaOriginal[i]=original[i];
		}
		System.out.println("resultado del array original");
		for(int i=0;i<original.length;i++) {
			System.out.println(original[i]);
		}
		System.out.println("resultado de la copia del array");
		for(int i=0;i<copiaOriginal.length;i++) {
			System.out.println(copiaOriginal[i]);
		}
	}

	private void calculaposicion3(int[] enteros) {
		// TODO Auto-generated method stub
		for (int cont=0;cont<enteros.length;cont++) {
			System.out.println(enteros[cont]);
		}
		System.out.println("Ahora mostrare el valor de la posicion 3 que esta en el array");
		for (int cont2=0;cont2<enteros.length;cont2++) {
			if(enteros[cont2]==2) {
				System.out.println(enteros[2]);
			}
		}
	}

	private void calculavocales(String[] caracteresLargo) {
		// TODO Auto-generated method stub
		for(int i=0;i<caracteresLargo.length;i++) {
			if(caracteresLargo[i]=="a" || caracteresLargo[i]=="e" || caracteresLargo[i]=="i" || caracteresLargo[i]=="o" || caracteresLargo[i]=="u") {
				System.out.println(caracteresLargo[i]="*");
			}
			else {
				System.out.println(caracteresLargo[i]);
			}
		}
	}

	private void calculacaracteres(String[] caracteres) {
		// TODO Auto-generated method stub
		for(int x=0;x<caracteres.length;x++) {
			System.out.println(caracteres[x]);
		}
	}

}
