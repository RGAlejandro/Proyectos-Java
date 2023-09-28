package Examen;

import java.util.Scanner;

public class ejercicio1 {

	public ejercicio1() {
		// TODO Auto-generated constructor stub
		/*
		 * Introduce numeros positivos, y muestra por pantalla si ese numero al sumar sus cifras es primo, para parar el programa hay que introducir un numero negativo
		 */
		/*int suma=sumacifras(287);
		System.out.println(suma);
		System.out.println(calculaprimo(suma));
		System.out.println();
		*/
		Scanner leer=new Scanner(System.in);
		System.out.println("Introduce un numero que sea entero positivo hasta que el que introduzcas sea un numero negativo");
		int num=0;
		int guardaNum=0;
		int sumaCifras=0;
		int contPrimos=0;
		String acumulaNormal="";
		String acumulaSuma="";
		boolean esPrimo;
		while(num>=0) {
			num=leer.nextInt();
			guardaNum=num;
			sumaCifras=sumacifras(num);
			esPrimo=calculaprimo(sumaCifras);
			if(esPrimo) {
				contPrimos++;
				acumulaNormal+=guardaNum+"-";
				acumulaSuma+=sumaCifras+"-";
			}
		}
		System.out.println("Numeros normales: "+acumulaNormal);
		System.out.println("Numeros con las cifras sumadas: "+acumulaSuma);
	}

	private boolean calculaprimo(int sumaCifras) {
		// TODO Auto-generated method stub
		int contDiv=2;
		if (sumaCifras==2)
			return true;
		while(contDiv<sumaCifras) {
			if(sumaCifras%contDiv==0) {
				return false;
			}
			else {
				return true;
			}
		}
		return false;
	}

	private int sumacifras(int num) {
		// TODO Auto-generated method stub
		int sumaCifras=0;
		while(num>0) {
			sumaCifras+=num%10;
			num/=10;
		}
		return sumaCifras;
	}

}
