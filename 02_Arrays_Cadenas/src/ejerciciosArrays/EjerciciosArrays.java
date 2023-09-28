package ejerciciosArrays;

import java.util.Scanner;

public class EjerciciosArrays {

	public EjerciciosArrays() {
		// TODO Auto-generated constructor stub
		/*1.-Crear un array que contenga los caracteres de la 'a' a la 'f'. A continuación muestre los valores contenidos en el
		array.*/
		System.out.println("EJERCICIO 1-ARRAY DE LA (A) HASTA LA (F)");
		Scanner leer=new Scanner(System.in);
		String []caracteres= {"a","b","c","d","e","f"};
		for(int x=0;x<caracteres.length;x++) {
			System.out.println(caracteres[x]);
		}
		/*2.-Escriba un programa que cree un array con los caracteres dela 'a' a la 'k' y a continuación sustituya todas las
		vocales quese encuentren en el array por el carácter '*'.*/
		System.out.println("EJERCICIO 2-ARRAY DE LA (A) HASTA LA (K) Y SUSTITUIR VOCALES");
		String []caracteresLargo={"a","b","c","d","e","f","g","h","i","j","k"};
		for(int i=0;i<caracteresLargo.length;i++) {
			if(caracteresLargo[i]=="a" || caracteresLargo[i]=="e" || caracteresLargo[i]=="i" || caracteresLargo[i]=="o" || caracteresLargo[i]=="u") {
				System.out.println(caracteresLargo[i]="*");
			}
			else {
				System.out.println(caracteresLargo[i]);
			}
		}
		/*3.-Escriba un programa que cree un array de 5 enteros, lo inicialice y a continuación muestre el valor almacenado en
		la tercera posición.*/
		System.out.println("EJERCICIO 3-ARRAY QUE SEAN 5 ENTEROS Y MUESTRE SOLO EL DE LA POSICION 3");
		int []enteros= {2,7,8,3,10};
		for (int cont=0;cont<enteros.length;cont++) {
				System.out.println(enteros[cont]);
			}
		System.out.println("Ahora mostrare el valor de la posicion 3 que esta en el array");
		for (int cont2=0;cont2<enteros.length;cont2++) {
			if(enteros[cont2]==2) {
				System.out.println(enteros[2]);
			}
		}
		/*4.+ Escriba un programa que cree un array unidimensional de tipo entero. Inicializalo en la propia declaracion. A
		continuación el programa debe copiar el contenido de ese array a otro similar mediante un bucle y mostrar por
		pantalla los valores de ambos array para comprobar la copia.*/
		
	}

}
