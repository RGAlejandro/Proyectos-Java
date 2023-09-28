package EXAMENPREPARACIONPREVIA;

import java.util.Arrays;

public class CincuerizadomeArrays {

	public CincuerizadomeArrays() {
		// TODO Auto-generated constructor stub
		System.out.println("Cincueriza un array");
		int []matrizNormal;
		int []matrizCincuerizada;
		matrizNormal=rellenaMatriz(10,1,500);
		matrizCincuerizada=cincuerizaMatriz(matrizNormal);
		System.out.println(Arrays.toString(matrizNormal));
		System.out.println(Arrays.toString(matrizCincuerizada));
		
	}

	private int[] cincuerizaMatriz(int[] matrizNormal) {
		// TODO Auto-generated method stub
		int valor=0;
		int []cincue=new int[matrizNormal.length];
		
		for(int x=0;x<matrizNormal.length;x++) {
			valor=matrizNormal[x];
			cincue[x]=calculaCincuerizado(valor);
		}
		
		return cincue;

	}

	private int calculaCincuerizado(int valor) {
		// TODO Auto-generated method stub
		int resto=0;
		if(valor%5==0) {
		return valor;	
		}
		else {
			resto=valor%5;
			valor+=5-resto;
		}
		return valor;
		
	}

	private int[] rellenaMatriz(int cant, int min, int max) {
		// TODO Auto-generated method stub
		int []matriz=new int[cant];
		int ale=0;
		for(int x=0;x<matriz.length;x++){
			do {
				ale=(int)Math.floor(Math.random()*(max-min+1)+min);
			}while(repe(ale,matriz));
			matriz[x]=ale;
		}
		return matriz;
	}

	private boolean repe(int ale, int[] matriz) {
		// TODO Auto-generated method stub
		boolean esRepe=false;
		for(int x=0;x<matriz.length;x++) {
			if(matriz[x]==ale) {
				esRepe=true;
				break;		
			}
		}
		return esRepe;
	}

}
