package AprenderAAprender;

import java.util.Arrays;
import java.util.Scanner;

public class AprenderAConstanteKaprekar {

	public AprenderAConstanteKaprekar() {
		// TODO Auto-generated constructor stub
		System.out.println("ALGORITMO DE CONSTANTE KAPREKAR");
		Scanner leer=new Scanner(System.in);
		int numIntro=leer.nextInt();
		boolean numerosIguales=calculaIguales(numIntro);
		if(numerosIguales) {
			System.err.println("Lo siento pero no se puede poner 4 digitos que sean iguales");
		}
		else {
			boolean digitos=calcula4Digitos(numIntro);
			int resultado=0;
			if(digitos) {
				do {
				int numAsc=convierteMayorAMenor(numIntro);
				System.out.println(numAsc);
				int numDesc=vueltaNumero(numAsc);
				System.out.println(numDesc);
				resultado=numDesc-numAsc;
				System.out.println(resultado);
				numIntro=resultado;
				}while(resultado!=6174);
			}
			else {
				System.err.println("Lo siento pero tu numero no tiene 4 digitos");
			}
		}
		
	}

	private boolean calculaIguales(int numIntro) {
		// TODO Auto-generated method stub
		boolean esIgual=false;
		int dig4=numIntro%10;
		numIntro=numIntro/10;
		int dig3=numIntro%10;
		numIntro=numIntro/10;
		int dig2=numIntro%10;
		numIntro=numIntro/10;
		int dig1=numIntro%10;
		System.out.print(dig1+" "+dig2+" "+dig3+" "+dig4);
		if(dig1==dig2 && dig1==dig3 && dig1==dig4) {
			esIgual=true;
		}
		return esIgual;
	}

	private int vueltaNumero(int numAsc) {
		// TODO Auto-generated method stub
		String numMayor="";
		int numDesc=0;
		int numSuelto=0;
		int digitos=0;
		String ceroAdicional="0";
		do {
		numSuelto=0;
		numSuelto=numAsc%10;
		numMayor+=numSuelto;
		digitos++;
		numAsc=numAsc/10;
		}while(numAsc!=0);
		if(digitos!=4) {
			numMayor+=ceroAdicional;
		}
		
		
		numDesc=Integer.parseInt(numMayor);
		return numDesc;
	}

	private int convierteMayorAMenor(int numIntro) {
		// TODO Auto-generated method stub
		//Pasamos el numero introducido a cadena
		String numTexto=Integer.toString(numIntro);
		int numMayor=0;//Esta variable se ira almacenando el numero mas grande del numero entero
		String numMenorTexto="";
		int numMenor=0;
		int vueltas=0; //Numero de vueltas que tiene que dar por cada cifra 
		int numeroAparte=0; //numero apartado del numero entero
		int digi=4; //La cantidad de digitos que va teniendo el numero, cada vuekta el digito ira bajando
		String numBajando=Integer.toString(numIntro); //Con este String se ira bajando el numero poco a poco
		String ceroAdicional="0";
		if(numBajando.length()!=4) {
			numBajando+=ceroAdicional;
		}
		char numApartadisimo=0;
		int []numeros=new int[4];
		for(int x=0;x<numeros.length;x++) {
			numApartadisimo=numBajando.charAt(x);
			numeroAparte=Integer.parseInt(String.valueOf(numApartadisimo));
			numeros[x]=numeroAparte;
		}
		Arrays.sort(numeros);
		System.out.print(Arrays.toString(numeros));
		
		for(int x=0;x<numeros.length;x++) {
			numMenorTexto+=numeros[x];
		}
		numMenor=Integer.parseInt(numMenorTexto);
		return numMenor;
	}

	private boolean calcula4Digitos(int numIntro) {
		// TODO Auto-generated method stub
		boolean Digitos=true;
		int contDigitos=0;
		do {
			numIntro=numIntro/10;
			contDigitos++;
		}while(numIntro!=0);
		if(contDigitos!=4) {
			Digitos=false;
		}
		return Digitos;
	}

}
