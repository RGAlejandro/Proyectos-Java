package aleatorios;

import java.util.Arrays;
import java.util.Scanner;

public class Aleatorios {

	public Aleatorios() {
		// TODO Auto-generated constructor stub
		Scanner leer=new Scanner(System.in);
		int menor=1;
		int mayor=5;
		int cantidad=5;
		int []random=generaAleatorio(cantidad, mayor, menor);
		System.out.println(Arrays.toString(random));
	}

	private int[] generaAleatorio(int cantidad, int mayor, int menor) {
		// TODO Auto-generated method stub
		int []aleatorio=new int[cantidad];
		for(int x=0;x<aleatorio.length;x++) {
			aleatorio[x]=(int)(Math.floor(Math.random()*(mayor-menor+1)+menor));
		}
		return aleatorio;
	}
	
}