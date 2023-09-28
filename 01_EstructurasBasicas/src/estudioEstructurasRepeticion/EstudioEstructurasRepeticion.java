package estudioEstructurasRepeticion;

import java.util.Scanner;

public class EstudioEstructurasRepeticion {

	public EstudioEstructurasRepeticion() {
		// TODO Auto-generated constructor stub
		Scanner leer=new Scanner(System.in);
		String pulsa="";
		
		
		/*System.out.println("----------Estudio Estructuras de Repetición-------");
		System.out.println("----------Bucle For-----------");
		for(int cont=1; cont<11; cont++) {
			System.out.println(cont);
		}
		System.out.println("pulsa para continuar");
		pulsa=leer.next();
		System.out.println("=============================");
		for(int cont=1;cont<11;cont+=2) {
			System.out.println(cont);
		}
		System.out.println("pulsa para continuar");
		pulsa=leer.next();
		System.out.println("=============================");
		for(int cont=10;cont>0;cont--) {
			System.out.println(cont);
		}
		System.out.println("pulsa para continuar");
		pulsa=leer.next();
		
		System.out.println("------------Bucle While-----------");
		int i=1;
		
		while (i <11) {
			System.out.println(i);
			i++;
		}
		System.out.println("pulsa para continuar");
		pulsa=leer.next();
		System.out.println("------------Bucle do while----------");
		i=1;
		do {
			System.out.println(i);
			i++;
		}while (i<11);
		System.out.println("pulsa para continuar");
		pulsa=leer.next(); */
		
		
		//EJERCICIOS DE BUCLES 
		
		/*Bucle While que termina cuando se introduce por teclado un numero negativo
		 * Muestra la cantidad de numeros introducidos y la suma
		 */
		System.out.println("Introduce un numero que sea positivo hasta que sea negativo");
		Scanner leerNum=new Scanner(System.in);
		int numCont=0;
		int numero=0;
		int suma=0;
		while (numero >=0) {
			numero=leerNum.nextInt();
			numCont++;
			suma+= numero; //acumulador
		}
		System.out.println("Has introducido "+(numCont -1)+" numeros positivos");
		System.out.println("La suma total de ellos es "+(suma - numero));
		
		
		
		/*
		 * Bucle do while que termina cuando se introudce por teclado un numero impar
		 */
		System.out.println("Introduzca un numero y terminara cuando sea impar");
		int num=0;
		boolean esPar=false;
		do {
			System.out.println("Dime un numero: ");
			num=leerNum.nextInt();
			esPar=num%2 == 0;
			if(esPar){
				System.out.println("Este numero es muy bonito "+num);
			}else {
				System.out.println("Lo siento no me gustan los numero impares, adios");
			}
		}while (esPar);
		
		
	}

}
