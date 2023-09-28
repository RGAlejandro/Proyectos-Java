package aleatorios;

import java.util.Arrays;
import java.util.Scanner;

public class Primitiva {

	public Primitiva() {
		// TODO Auto-generated constructor stub
		Scanner leer=new Scanner(System.in);
		int pausa;
		System.out.println("-----------LA PRIMITIVA------------");
		System.out.println("BIENVENIDO A LA PRIMITIVA TIENES QUE ELEGIR ALGUNA DE LAS SIGUIENTES OPCIONES");
				System.out.println("¿Cuantos Boletos quieres comprar?");
				int cantidadBoletos=leer.nextInt();
				int  [][] primitiva=new int [cantidadBoletos][6];
				int numPrimi=1;
				int num=0;
				for(int x=0;x<primitiva.length;x++) {
					System.out.println("Boleto "+numPrimi+":");
					numPrimi++;
					for(int y=0;y<primitiva[x].length;y++) {
						do {
						num=(int)Math.floor(Math.random()*(49-1+1)+1);
						}while(repeticiones(num,primitiva));
						primitiva[x][y]=num;
						System.out.print(primitiva[x][y]+" ");
					}
					System.out.println("");
				}
				System.out.println("PULSA ENTER PARA EMPEZAR EL SORTEO");
				pausa=leer.nextInt();
				System.out.println("");
				System.out.println("SORTEO DE LA PRIMITIVA");
				int []sorteo=new int [6];
				int numSorteo=0;
				for(int x=0;x<sorteo.length;x++) {
					do {
						numSorteo=(int)Math.floor(Math.random()*(49-1+1)+1);
					}while(repesUni(numSorteo,sorteo));
					sorteo[x]=numSorteo;
					System.out.print(sorteo[x]+" ");
				}
				System.out.println("");
				System.out.println("COMPROBACION DE ACIERTOS DEL SORTEO");
				int aciertos=compruebaSorteo(sorteo,primitiva);
				System.out.println("Has tenido "+aciertos+" acierto en total");
			}
		
		

	

	private int compruebaSorteo(int[] sorteo, int[][] primitiva) {
		// TODO Auto-generated method stub
		int posicionSorteo=0;
		int cont=0;
		for(posicionSorteo=0;posicionSorteo<sorteo.length;posicionSorteo++) {
			for(int x=0;x<primitiva.length;x++) {
				for(int y=0;y<primitiva[x].length;y++) {
					if(sorteo[posicionSorteo]==primitiva[x][y]) {
						cont++;
					}
				}
			}
		}
		return cont;	
	}





	private boolean repesUni(int numSorteo, int[] sorteo) {
		// TODO Auto-generated method stub
		boolean repetido=false;
		for(int x=0;x<sorteo.length;x++) {
			if(sorteo[x]==numSorteo) {
				repetido=true;
				break;
				}
		}
		return repetido;
	}

	private boolean repeticiones(int num, int[][] primitiva) {
		// TODO Auto-generated method stub
		boolean repetido=false;
		for(int x=0;x<primitiva.length;x++) {
			for(int y=0;y<primitiva[x].length;y++) {
				if(primitiva[x][y]==num) {
					repetido=true;
					break;
				}
			}
		}
		return repetido;
	}

}
