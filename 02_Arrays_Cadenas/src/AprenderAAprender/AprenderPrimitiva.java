package AprenderAAprender;

import java.util.Arrays;
import java.util.Scanner;

public class AprenderPrimitiva {

	public AprenderPrimitiva() {
		// TODO Auto-generated constructor stub
		Scanner leer=new Scanner(System.in);
		int aciertosTotales=0;
		System.out.println("JUGAR A LA PRIMITIVA");
		System.out.println("Cuantos boletos quieres comprar");
		int numBoletos=leer.nextInt();
		int [][] primitiva=new int[numBoletos][];
		
		for(int x=0;x<primitiva.length;x++) {
			primitiva[x]=generaPrimitiva(6,1,49);
		}
		System.out.println("");
		System.out.println("============================");
		System.out.println("");
		System.out.println("El sorteo será el siguiente:");
		System.out.println("");
		int[] sorteo=generaPrimitiva(6,1,49);
		System.out.println("");
		System.out.println("============================");
		System.out.println("");
		int numBol=1;
		for(int x=0;x<primitiva.length;x++) {
			int aciertos=buscaAciertos(primitiva[x],sorteo);
			System.out.println("Boleto "+numBol+": "+aciertos+" aciertos");
			aciertosTotales+=aciertos;
			numBol++;
		}
		System.out.println("Has acertado en total "+aciertosTotales+" aciertos");
	}

	private int buscaAciertos(int[] primitiva, int[] sorteo) {
		// TODO Auto-generated method stub
		int aciertos=0;
		for(int x=0;x<sorteo.length;x++) {
			if(Arrays.binarySearch(primitiva, sorteo[x])>=0) 
				aciertos++;
		}
		
		return aciertos;
	}

	private int[] generaPrimitiva(int cant, int min, int max) {
		// TODO Auto-generated method stub
		int []boleto=new int[cant];
		int numAle=0;
		for(int x=0;x<boleto.length;x++) {
			do {
				numAle=(int) Math.floor(Math.random()*(max-min+1)+min);
			}while(repe(boleto,numAle));
			boleto[x]=numAle;
			System.out.print(boleto[x]+" ");
		}
		System.out.println("");
		return boleto;
	}

	private boolean repe(int[] boleto, int numAle) {
		// TODO Auto-generated method stub
		boolean esRepe=false;
		for(int x=0;x<boleto.length;x++) {
			if(boleto[x]==numAle) {
				esRepe=true;
				break;
			}
				
		}
		return esRepe;
	}

}
