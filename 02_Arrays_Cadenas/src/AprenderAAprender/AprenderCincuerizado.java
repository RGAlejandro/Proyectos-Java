package AprenderAAprender;

import java.util.Arrays;

public class AprenderCincuerizado {

	public AprenderCincuerizado() {
		// TODO Auto-generated constructor stub
		/*6.-Escribe un programa que rellene un array de 15 elementos con números enteros comprendidos entre 0 y 500 (ambos incluidos)        . A continuación, se mostrará el array “cincuerizado”, según el siguiente criterio:
            si el número que hay en una posición del array es múltiplo de 5, se deja igual, y si no,
            se cambia por el siguiente múltiplo de 5 que exista a partir de él*/
		System.out.println("CINCUERIZADO");
		int []matriz=generaNumerosAleatorios(15,0,500);
		int []cincuerizado=cincuerizaMatriz(matriz);
		mostrar(matriz,cincuerizado);
}

	private void mostrar(int[] matriz, int[] cincuerizado) {
		// TODO Auto-generated method stub
		for(int x=0;x<matriz.length;x++) {
			if(matriz[x]==cincuerizado[x]) {
				System.err.print(matriz[x]+" ");
			}
			else {
				System.out.print(matriz[x]+" ");
			}
		}
		System.out.println("");
		for(int x=0;x<cincuerizado.length;x++) {
			if(cincuerizado[x]==matriz[x]) {
				System.err.print(cincuerizado[x]+" ");
			}
			else {
				System.out.print(cincuerizado[x]+" ");
			}
		}
		

	}

	private int[] cincuerizaMatriz(int[] matriz) {
		// TODO Auto-generated method stub
		int []cincuerizado=new int[matriz.length];
		int num=0;
		int resto=0;
		for(int x=0;x<matriz.length;x++) {
			num=matriz[x];
			num=OperaCincueriza(num,resto);
			cincuerizado[x]=num;
		}
		return cincuerizado;
	}

	private int OperaCincueriza(int num, int resto) {
		// TODO Auto-generated method stub
		if(num%5!=0) {
			resto=num%5;
			num+=(5-resto);
		}
		return num;

		
	}

	private int[] generaNumerosAleatorios(int cant, int min, int max) {
		// TODO Auto-generated method stub
		int []aleatorios=new int[cant];
		int ale=0;
		for(int x=0;x<aleatorios.length;x++) {
			ale=(int)Math.floor(Math.random()*(max-min+1)+min);
			aleatorios[x]=ale;
		}
		return aleatorios;
	}
}