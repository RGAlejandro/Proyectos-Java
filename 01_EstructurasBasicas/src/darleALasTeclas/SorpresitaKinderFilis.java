package darleALasTeclas;

import java.util.Scanner;

public class SorpresitaKinderFilis {

	public SorpresitaKinderFilis() {
		// TODO Auto-generated constructor stub
	Scanner leer=new Scanner(System.in);	
	/*System.out.println("Rango de numero de 7 en 7");
	int rango1=0;//este es el primer numero por el que empieza a sumar +7 en el bucle
	int rango2=0;//es el objetivo al que tiene que llegar
	int sumaSietes=7;//sumador de 7 en 7 cada vez que entre en el bucle
	boolean numEsValido=true;//Boleano que comprueba si has ouesto un numero menor en el rango1
	System.out.println("Introduce el rango 1 por el que empieze el numero");
	rango1=leer.nextInt();
	System.out.println("Introduce hasta que numero quieres hacer el rango");
	rango2=leer.nextInt();
	numEsValido=rango1<rango2;//Si es al contrario no entrara en el bucle y daraa un mensaje de error
	if(numEsValido) {
		while(rango1<=rango2) {//suma de 7 en 7 al rango1 hasta que este sea supere al rango2
			System.out.print(rango1+" - ");
			rango1=rango1+sumaSietes;
		}
	}
	else {
		System.err.println("Lo siento pero no puedes colocar como rango principal uin numero mas grande que el rango2");
	}
	System.out.println("");
	*/
	/*System.out.println("CALCULAR FACTORIAL DE UN NUMERO INTRODUCIDO");
	int numFact=0;//numero factorial que queremos calcular
	int multFact=1;//Esta variable es la que calcula el factorial
	int resFact=0;//resultado del factorial
	System.out.println("Introduce un numero que quieras saber su factorial");
	numFact=leer.nextInt();//pedimos por teclado que numero queremos
	resFact=numFact;//metemos en el resultado el numero que hayamos introducido
	while(multFact<numFact) {//bucle que se repite hasta que mult sea mayor que el numero factorial
		
		resFact*=multFact;//multiplica por 7 y acumula el resultado cada vez que entra en el bucle
		
		multFact++;
	}
	System.out.println(numFact+"!= "+resFact);
	*/
	//System.out.println("");
	/*System.out.println("CALCULAR EL METODO FIBONACCI DE UN NUMERO INTRODUCIDO");
	int num1=0;
	int num2=1;
	int sumaNums=0;
	int fiboVeces=0;
	boolean numEsCorrecto=true;
	System.out.println("Introduce el numero de veces que quieres hacer el metodo fibonacci");
	fiboVeces=leer.nextInt();
	numEsCorrecto=fiboVeces>0;
	if(numEsCorrecto) {
		System.out.print(num1+" - ");
		System.out.print(num2+" - ");
		while(fiboVeces>=0) {
			sumaNums=num1+num2;
			System.out.print(sumaNums+" - ");
			num1=num2;
			num2=sumaNums;
			fiboVeces--;
		}
	}
	else {
		System.err.println("Lo siento mucho pero ese numero no es valido");
	}
	*/
	/*System.out.println("SUMAR LAS CIFRAS DE UN NUMERO QUE SEA DE 2 CIFRAS");
	int decena=0;
	int unidad=0;
	int sumaCifras=0;
	System.out.println("introduce un numero de 2 cifras si quieres que te los sume");
	int numEntero=leer.nextInt();
	boolean numeroEs2Cifras=true;
	numeroEs2Cifras=numEntero>9 && numEntero<100;
	if(numeroEs2Cifras) {
		decena=numEntero/10;
		unidad=numEntero%10;
		sumaCifras=decena+unidad;
		System.out.println("La suma de las 2 cifras es "+sumaCifras);	
		}
	else {
		System.err.println("Lo siento pero no ");
	}
	*/
	/*System.out.println("HACER COSAS CON LOS PARES (sumar los pares) Y OTRA CON LOS IMPARES (ver cual es el mas grande)");
	int numColoc=0;
	int acumPares=0;
	int imparMasGrande=0;
	boolean numEsPar=true;
	while(numColoc>=0) {
		numColoc=leer.nextInt();
		if(numColoc>=0) {
			numEsPar=numColoc%2==0;
			if(numEsPar) {//Numeros Pares
				acumPares+=numColoc;
			}
			else {//Numero Impares
				if(numColoc>imparMasGrande) {
					imparMasGrande=numColoc;
				}
			}
		}
		else {
		
		}
	}
	System.out.println("La suma de todos los pares es de "+acumPares);
	System.out.println("El mayor de los impares "+imparMasGrande);*/
	System.out.println("ORDENAR NUMEROS");
	int aux=0;
	System.out.println("Escribeme el numero 1");
	int num1=leer.nextInt();
	System.out.println("Escribeme el numero 2");
	int num2=leer.nextInt();
	if(num1>num2) {
		aux=num1;
		num1=num2;
		num2=aux;
	}
	System.out.print(num1+" - "+num2);
	}

}
