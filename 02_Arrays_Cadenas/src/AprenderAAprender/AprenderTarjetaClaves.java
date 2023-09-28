package AprenderAAprender;

import java.util.Arrays;
import java.util.Scanner;

public class AprenderTarjetaClaves {

	public AprenderTarjetaClaves() {
		// TODO Auto-generated constructor stub
		System.out.println("Ejercicio Tarjeta Claves");
		System.out.println("-----------------------------------------");
		String []letras={"A","B","C","D","E"};
		int []ale=generaAleatorios(25,100,200);
		int [][]numerosCaja=new int[5][5];
		System.out.print("     1       2       3       4       5");
		System.out.println("");
		numerosCaja=rellenaCaja(ale,numerosCaja);
		for(int x=0;x<numerosCaja.length;x++) {
			System.out.println("");
			System.out.print(letras[x]+"   ");
			for(int y=0;y<numerosCaja.length;y++) {
				System.out.print(numerosCaja[x][y]+"     ");
			}
		}
		
		preguntaClave(letras,numerosCaja);
		
		
		
	}

	private void preguntaClave(String[] letras, int[][] numerosCaja) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		//String letra;
		//String numero;
		//String combinacion;
		int aleLetra=(int)Math.floor(Math.random()*(4-0+1)+0);
		int aleNum=(int)Math.floor(Math.random()*(4-0+1)+0);
		System.out.println("-----------------------------------------");
		System.out.println("");
		System.out.println("Que numero contiene la combinacion "+letras[aleLetra]+(aleNum+1));
		int contraseña=leer.nextInt();
		if(numerosCaja[aleLetra][aleNum]==contraseña) {
			System.out.println("La contraseña es correcta");
		}
		else {
			System.err.println("Lo siento pero la contraseña no es correcta");
		}
		//letra=letras[aleLetra];
		//numero=Integer.toString(aleNum);
		//combinacion=letra+numero;
		//System.out.println("Que numero contiene la combinacion "+combinacion);
	}

	private int[][] rellenaCaja(int[] ale, int[][] numerosCaja) {
		// TODO Auto-generated method stub
		int cont=0;
		for(int x=0;x<numerosCaja.length;x++) {
			for(int y=0;y<numerosCaja[x].length;y++) {
				numerosCaja[x][y]=ale[cont];
				cont++;
			}
		}
		return numerosCaja;
	}

	private int[] generaAleatorios(int cant, int min, int max) {
		// TODO Auto-generated method stub
		int ale=0;
		int []caja=new int [cant];
		for(int x=0;x<caja.length;x++) {
			do {
				ale=(int)Math.floor(Math.random()*(max-min+1)+min);
			}while(repe(ale,caja));
			caja[x]=ale;
		}
		return caja;
	}

	private boolean repe(int ale, int[] caja) {
		// TODO Auto-generated method stub
		boolean esRepe=false;
		for(int x=0;x<caja.length;x++) {
			if(caja[x]==ale) {
				esRepe=true;
				break; 
			}
		}
		
		return esRepe;
	}

}
