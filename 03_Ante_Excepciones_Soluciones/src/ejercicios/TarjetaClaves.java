package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class TarjetaClaves {

	public TarjetaClaves() {
		// TODO Auto-generated constructor stub
		System.out.println("TARJETA DE CLAVES");
		System.out.print("      1      2      3      4      5");
		char [] letras= {'A','B','C','D','E'};
		int [][] numerosContraseña=new int[5][5];
		int [] aleatorios=generaNumerosAleatoriosSinRepetir(25,100,999);
		numerosContraseña=rellenaCaja(aleatorios,numerosContraseña);
		for(int x=0;x<numerosContraseña.length;x++) {
			System.out.println("");
			System.out.print(letras[x]+"    ");
			for(int y=0;y<numerosContraseña[x].length;y++) {
				System.out.print(numerosContraseña[x][y]+"    ");
			}
		}
		preguntaClave(letras,numerosContraseña);
	}

	private void preguntaClave(char[] letras, int[][] numerosContraseña) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		
		int aleLetra=(int) Math.floor(Math.random()*(4-0+1)+0);
		int aleNum=(int) Math.floor(Math.random()*(5-0+1)+0);
		System.out.println("");
		System.out.println("Dime la combinacion "+letras[aleLetra]+(aleNum+1));
		int contraseña=leer.nextInt();
		if(numerosContraseña[aleLetra][aleNum]==contraseña) {
			System.out.println("Enhorabuena has escrito bien la contraseña");
		}
		else {
			System.err.println("Lo siento pero no has acertado");
		}
	}

	private int[][] rellenaCaja(int[] aleatorios, int[][] numerosContraseña) {
		// TODO Auto-generated method stub
		int cont=0;
		for(int x=0;x<numerosContraseña.length;x++) {
			
			for(int y=0;y<numerosContraseña[x].length;y++) {
				numerosContraseña[x][y]=aleatorios[cont];
				cont++;
			}
		}
		return numerosContraseña;
	}

	private int[] generaNumerosAleatoriosSinRepetir(int cant, int min, int max) {
		// TODO Auto-generated method stub
		int []aleatorios=new int[cant];
		Arrays.fill(aleatorios, -1);
		int ale=0;
		for(int x=0;x<aleatorios.length;x++) {
			do {
				ale=(int)Math.floor(Math.random()*(max-min+1)+min);
			}while(esRepe(ale,aleatorios));
			aleatorios[x]=ale;
		}
		
		return aleatorios;
	}

	private boolean esRepe(int ale, int[] aleatorios) {
		// TODO Auto-generated method stub
		boolean esRepe=false;
		
		for(int x=0;x<aleatorios.length;x++) {
			if(ale==aleatorios[x]) {
				esRepe=true;
			}
		}
		
		return esRepe;
	}

}
