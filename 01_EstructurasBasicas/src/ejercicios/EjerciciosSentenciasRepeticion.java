package ejercicios;

import java.util.Scanner;

public class EjerciciosSentenciasRepeticion {

	public EjerciciosSentenciasRepeticion() {
		// TODO Auto-generated constructor stub
		
		//1.- Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.,while y do while
		System.out.println("Esto muestra los multiplos del 5 con Bucle For");
		Scanner leer=new Scanner(System.in);
		String pausa="";
		pausa=leer.next();
		int num=0;
		for(num=0;num<=100;num+=5) {
		System.out.println(num);	
		}
		num=0;
		System.out.println("Bucle While");
		pausa=leer.next();
		while(num<100) {
		num+=5;
		System.out.println(num);
		}
		System.out.println("Bucle While Do");
		pausa=leer.next();
		num=0;
		do {
		num+=5;	
		}while(num<100); {
		System.out.println(num);
		}
		
		//2 .- Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while.
		/*System.out.println("Resto de 20 en 20, pulsa enter  restare del 320 y al 160");
		pausa=leer.next();
		int num1=320;
		while(num1<=320 && num1 >160) {
		num1-=20;
		System.out.println(num1);
		}*/
		/*3.-Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El programa nos pedirá
			la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”y si
			acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.Tendremos cuatro oportunidades para abrir la
			caja fuerte.*/
		System.out.println("Abrir Caja Fuerte");
		System.out.println("introduzca un numero de 4 cifras para poder abrir la caja");
		int numCaja=0;
		int oportunidades=0;
		do {
		numCaja=leer.nextInt();
		oportunidades++;
		if (numCaja >=1000 && numCaja <10000) {
		System.out.println("Has entrado en la caja fuerte");
		break;
		}else {
		System.out.println("Lo siento esta no es la conbinaciona");	
		}
		}
		while(oportunidades<=3); {
		System.out.println("fin");
		}
		
			/*4.- Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. Este ejercicio es
			equivalente a otro realizado anteriormente, con la salvedad de que el anterior estaba limitado a números de 5 dígitos
			como máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de esta manera, la única limitación en
			el número de dígitos la establece el tipo de dato que se utilice (int o long).
			5.- Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. A priori,
			el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de introducir los datos
			cuando meta un número negativo.
			6.- Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer término de la serie de
			Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que tendríamos que los términos
			son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe introducir por teclado.
			7.- Escribe un programa que diga si un número introducido por teclado es o no primo. Un número primo es aquel que
			sólo es divisible entre él mismo y la unidad.
			8.- Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado
			y validados como distintos, el programa debe empezar por el menor de los enteros introducidos e ir incrementando
			de 7 en 7.
			9.- Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos diga cuantos
			números se han introducido, la media de los impares y el mayor de los pares. El número negativo sólo se utiliza para
			indicar el final de la introducción de datos pero no se incluye en el cómputo.
			10.- Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
			11.- Realiza un programa que pida primero un número y a continuación un dígito. El programa nos debe dar la posición
			(o posiciones) contando de izquierda a derecha que ocupa ese dígito en el número introducido.
			12.- Escribe un programa que calcule el factorial de un número entero leído por
			teclado.
			Ejemplo:
			Por favor, introduzca un número entero: 6
			6! = 720*/
	}

}
