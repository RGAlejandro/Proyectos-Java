package darleALasTeclas;

import java.util.Scanner;

public class ViejoFilisDandoleALasTeclas {

	public ViejoFilisDandoleALasTeclas() {
		// TODO Auto-generated constructor stub
		System.out.println("*************************EJERCICIOS DEL VIEJO FILIS DANDOLE BIEN FUERTE A LAS TECLAS*************************");
		Scanner leer=new Scanner(System.in);
		/*System.out.println("*************************ALGORITMO PARA CALCULAR UN NUMERO PRIMO*************************");
		System.out.println("Introduce un numero entero, que sea positivo");
		int num=leer.nextInt();
		int div=2;
		boolean numValido=true;
		boolean EsPrimo=true;
		numValido=num>0;
		if(numValido) {
			for(div=2;div<num;div++) {
				EsPrimo=num%div!=0;
				if(EsPrimo) {

				}
				else {
					EsPrimo=false;
					break;
				}
			}
			if(EsPrimo) {
				System.out.println(num+" este numero ES PRIMO");
			}
			else {
				System.out.println(num+" este numero NO ES PRIMO");
			}
		}
		else {
			System.err.println("El numero introducido no es valido");
		}
		
		*/
		/*System.out.println("*************************ALGORITMO PARA CALCULAR UN NUMERO PAR O IMPAR*************************");
		System.out.println("Introduce un numero y dire si es PAR o IMPAR");
		int num=leer.nextInt();
		boolean esPar=true;
		esPar=num%2==0;
		if(esPar) {
			System.out.println("Este numero es PAR");
		}
		else {
			System.out.println("Este numero es IMPAR ");
		}
		*/
		/*System.out.println("*************************ALGORITMO PARA VOLTEAR UN NUMERO INTRODUCIDO*************************");
		System.out.println("Introduce un numero que sea entero positivo");
		int numIntro=leer.nextInt();
		int volteado=0;
		boolean esValido=true;
		esValido=numIntro>0;
		int guardaNum=numIntro;
		if(esValido) {
			while(numIntro>0) {
				volteado=(volteado*10)+(numIntro%10);
				numIntro/=10;
			}
			System.out.println("El numero "+guardaNum+ " se escribe asi volteado "+volteado);
		}
		else {
			System.err.println("Este numero no es valido");
		}
		*/
		/*7.Introducir 20 números enteros por teclado. Indicar cuánto suman (en valor absoluto) los
		negativos, y cuánto los positivos.*/
		/*int numIntro=0;
		int acumPosi=0;
		int acumNeg=0;
		int cont=1;
		boolean esPositivo=true;
		System.out.println("Introduce un numero y te lo ire acumulando, tiene que ser 6 veces");
		while(cont<21) {
			numIntro=leer.nextInt();
			esPositivo=numIntro>=0;
			if(esPositivo) {
				acumPosi+=numIntro;
			}
			else {
				acumNeg+=numIntro;
			}
			cont++;
		}
		System.out.println("la suma de los numeros positivos da "+acumPosi+ " y la suma de los nuemros negativos da "+(acumNeg*-1));
		*/
		/*17. Visualizar todos los números binarios representables con 4 bits, ordenados de menor a
		mayor, así como su valor decimal.*/
		System.out.println();
	}

}
