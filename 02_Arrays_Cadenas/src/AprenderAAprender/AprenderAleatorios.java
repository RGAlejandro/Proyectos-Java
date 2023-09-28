package AprenderAAprender;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AprenderAleatorios {

	public AprenderAleatorios() {
		// TODO Auto-generated constructor stub
		System.out.println("Aleatorios SIN REPETIR");
		int cantidad=6;
		int []guardaAleatorio= new int[cantidad];
		guardaAleatorio=generaAleatorios(6,1,6);
		System.out.println(Arrays.toString(guardaAleatorio));
	}

	private int[] generaAleatorios(int cantidad, int min, int may) {
		// TODO Auto-generated method stub
		int []aleatorio=new int[cantidad];
		int numAleatorio=0;
		for(int x=0;x<aleatorio.length;x++) {
			do {
				numAleatorio=(int)Math.floor(Math.random()*(may-min+1)+min);
			}while(repe(aleatorio,numAleatorio));
			
			aleatorio[x]=numAleatorio;
		}
		return aleatorio;
	}

	private boolean repe(int[] aleatorio, int numAleatorio) {
		// TODO Auto-generated method stub
		boolean esRepetido=false;
		
		for(int x=0;x<aleatorio.length;x++) {
			if(aleatorio[x]==numAleatorio) {
				esRepetido=true;
				break;
			}	
		}
		return esRepetido;
	}

	

}
