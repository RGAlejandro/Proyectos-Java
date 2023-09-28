package EXAMENPREPARACIONPREVIA;

import java.util.Scanner;

public class ArraysCartasJugadas {

	public ArraysCartasJugadas() {
		// TODO Auto-generated constructor stub
		Scanner leer=new Scanner(System.in);
		String cartas[] = { "1O", "2O", "3O", "4O", "5O", "6O", "7O", "SO", "CO", "RO",
                "1C", "2C", "3C", "4C", "5C", "6C", "7C", "SC", "CC", "RC",
                "1E", "2E", "3E", "4E", "5E", "6E", "7E", "SE", "CE", "RE",
                "1B", "2B", "3B", "4B", "5B", "6B", "7B", "SB", "CB", "RB", };
		System.out.println("Sacar Carta Ganadora");
		int cartaGanadora=(int)Math.floor(Math.random()*(39-1+1)+1);
		System.out.println(cartas[cartaGanadora]);
		System.out.println("Repartir cartas");
		int [][]jugadas=reparteCartas(cartas);
		MostrarCartas(jugadas,cartas,cartaGanadora);
		SaberGanador(jugadas,cartas,cartaGanadora);
	}

	private void SaberGanador(int[][] jugadas, String[] cartas, int cartaGanadora) {
		// TODO Auto-generated method stub
		int aciertosJug1=0;
		int aciertosJug2=0;
		for(int x=0;x<jugadas.length;x++) {
			
			
			for(int y=0;y<jugadas[x].length;y++) {
				if(y<4) {
					if(jugadas[x][y]==cartaGanadora) {
						aciertosJug1++;
					}
				}
				else {
					if(jugadas[x][y]==cartaGanadora) {
						aciertosJug2++;
					}
				}
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("El jugador 1 ha acertado la carta ganadora un total de "+aciertosJug1);
		System.out.println("");
		System.out.println("El jugador 2 ha acertado la carta ganadora un total de "+aciertosJug2);
		System.out.println("");
		if(aciertosJug1>aciertosJug2) {
			System.out.println("Ha ganado el jugador 1 con "+aciertosJug1+" aciertos");
		}
		if(aciertosJug2>aciertosJug1) {
			System.out.println("Ha ganado el jugador 2 con "+aciertosJug2+" aciertos");
		}
		if(aciertosJug1==aciertosJug2) {
			System.out.println("Han quedado empate los 2 con "+aciertosJug1+" aciertos");
		}
	}

	private void MostrarCartas(int[][] jugadas, String[] cartas, int cartaGanadora) {
		// TODO Auto-generated method stub
		System.out.println("jugador 1       jugador 2");
		for(int x=0;x<jugadas.length;x++) {
			System.out.println("");
			for(int y=0;y<jugadas[x].length;y++) {
				if(y==4) {
					System.out.print("    ");
				}
				if(jugadas[x][y]==cartaGanadora) {
					System.err.print(cartas[jugadas[x][y]]+" ");
				}
				else {
					System.out.print(cartas[jugadas[x][y]]+" ");
				}
				
			}
		}
	}

	private int[][] reparteCartas(String[] cartas) {
		// TODO Auto-generated method stub
		int [][]jugadas=new int[10][];
		for(int x=0;x<jugadas.length;x++) {
			jugadas[x]=generaCartasAleatorias(8,1,39);
		}
		return jugadas;
	}

	private int[] generaCartasAleatorias(int cant, int min, int max) {
		// TODO Auto-generated method stub
		int []jugada=new int[cant];
		int ale=0;
		
		for(int x=0;x<jugada.length;x++) {
			do {
				ale=(int)Math.floor(Math.random()*(max-min+1)+min);

			}while(repe(ale,jugada));
			jugada[x]=ale;
		}
		return jugada;
	}

	private boolean repe(int ale, int[] jugada) {
		// TODO Auto-generated method stub
		boolean esRepe=false;
		for(int x=0;x<jugada.length;x++) {
			if(jugada[x]==ale) {
				esRepe=true;
				break;
			}
		}
		return esRepe;
	}

}
