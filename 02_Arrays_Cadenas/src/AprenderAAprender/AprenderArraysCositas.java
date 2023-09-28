package AprenderAAprender;

import java.util.Arrays;
import java.util.Scanner;

public class AprenderArraysCositas {

	public AprenderArraysCositas() {
		// TODO Auto-generated constructor stub
		System.out.println("Arrays Notas");
		int [][]notas=new int[5][];
		String []alumnos= {"Alejandro","Adri","Carlos","Jesus","Julio","Messi","Zlatan","Roberto","Benito","Jose"};
		for(int x=0;x<notas.length;x++) {
			notas[x]=generaNotas();
		}
		muestraNotas(notas,alumnos);
	}

	private void muestraNotas(int[][] notas, String[] alumnos) {
		// TODO Auto-generated method stub
		for(int x=0;x<alumnos.length;x++) {
			System.out.print(alumnos[x]+"   ");
		}
		System.out.println("");
		for(int x=0;x<notas.length;x++) {
			for(int y=0;y<notas[x].length;y++) {
				System.out.print(notas[x][y]+"         ");
			}
			System.out.println("");
		}
		
	}

	private int[] generaNotas() {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		int numNotas=10;
		int []asignatura=new int[numNotas];
		int ale;
		for(int x=0;x<asignatura.length;x++) {
			ale=(int) Math.floor(Math.random()*(10-0+1)+0);
			asignatura[x]=ale;
		}
		return asignatura;
		
	}

}
