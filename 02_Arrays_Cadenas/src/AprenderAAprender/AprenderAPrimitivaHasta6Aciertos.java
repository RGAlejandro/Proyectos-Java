package AprenderAAprender;

import java.util.Arrays;

public class AprenderAPrimitivaHasta6Aciertos {

	public AprenderAPrimitivaHasta6Aciertos() {
		// TODO Auto-generated constructor stub
		System.out.println("LA PRIMITIVA HASTA QUE ME TOQUE");
		int []primitiva;
		int []sorteo;
		sorteo=generaPrimitiva(6,1,49);
		System.out.println(Arrays.toString(sorteo));
		int aciertos=0;
		int contPrimitivas=0;
		do {
			primitiva=generaPrimitiva(6,1,49);
			aciertos=buscaAciertos(sorteo,primitiva);
			contPrimitivas++;
		}while(aciertos!=6);
		System.out.println(Arrays.toString(primitiva));
		System.out.println("Se han tenido que crear un total de "+contPrimitivas+" para ganar el sorteo");
		
	}

	private int buscaAciertos(int[] sorteo, int[] primitiva) {
		// TODO Auto-generated method stub
		int aciertos=0;
		
		for(int x=0;x<sorteo.length;x++) {
			if(Arrays.binarySearch(primitiva, sorteo[x])>=0) {
				aciertos++;
			}
		}
		return aciertos;
		
	}

	private int[] generaPrimitiva(int cant, int min, int max) {
		// TODO Auto-generated method stub
		int []sorteo=new int[cant];
		int ale=0;
		for(int x=0;x<sorteo.length;x++) {
			do {
				ale=(int)Math.floor(Math.random()*(max-min+1)+min);
			}while(repe(ale,sorteo)); 
			sorteo[x]=ale;
		}
		return sorteo;
	}

	private boolean repe(int ale, int[] sorteo) {
		// TODO Auto-generated method stub
		boolean esRepe=false;
		for(int x=0;x<sorteo.length;x++) {
			if(sorteo[x]==ale) {
				esRepe=true;
				break;
			}
		}
		return esRepe;
	}

}
