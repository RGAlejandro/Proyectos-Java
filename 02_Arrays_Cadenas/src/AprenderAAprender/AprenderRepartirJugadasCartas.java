package AprenderAAprender;

public class AprenderRepartirJugadasCartas {

	public AprenderRepartirJugadasCartas() {
		// TODO Auto-generated constructor stub
		String cartas[] = { "1O", "2O", "3O", "4O", "5O", "6O", "7O", "SO", "CO", "RO",
                "1C", "2C", "3C", "4C", "5C", "6C", "7C", "SC", "CC", "RC",
                "1E", "2E", "3E", "4E", "5E", "6E", "7E", "SE", "CE", "RE",
                "1B", "2B", "3B", "4B", "5B", "6B", "7B", "SB", "CB", "RB", };
		int [][]jugadas=new int [10][];
		for(int x=0;x<jugadas.length;x++) {
			jugadas[x]=generaJugadas(8,1,39);
		}
		System.out.println("");
		int cartaGanadora=(int) Math.floor(Math.random()*(39-1+1)+1);
		System.out.println("La Carta Ganadora es "+cartas[cartaGanadora]);
		
		mostrarPartida(cartas,jugadas,cartaGanadora);
		
		saberGanador(cartas,jugadas,cartaGanadora);
	}

	private void saberGanador(String[] cartas, int[][] partidas, int cartaGanadora) {
		// TODO Auto-generated method stub
		int aciertosJugador1=0;
		int aciertosJugador2=0;
		
		for(int x=0;x<partidas.length;x++) {
			for(int y=0;y<partidas[x].length;y++) {
				if(y<=3) {
					if(cartas[partidas[x][y]]==cartas[cartaGanadora]) {
						aciertosJugador1++;
					}
				}
				else {
					if(cartas[partidas[x][y]]==cartas[cartaGanadora]) {
						aciertosJugador2++;
					}
				}
			}
		}
		System.out.println("");
		System.out.println("=============================");
		System.out.println("");
		System.out.println("jugador 1 ha obtenido la carta ganadora "+aciertosJugador1+" veces");
		System.out.println("");
		System.out.println("jugador 2 ha obtenido la carta ganadora "+aciertosJugador2+" veces");
		System.out.println("");

		if(aciertosJugador1>aciertosJugador2) {
			System.out.println("El ganador ha sido el jugador1");
		}
		if(aciertosJugador2>aciertosJugador1) {
			System.out.println("El ganador ha sido el jugador2");
		}
		if(aciertosJugador1==aciertosJugador2) {
			System.out.println("Han quedado empate");
		}
	}

	private void mostrarPartida(String[] cartas, int[][] partidas, int cartaGanadora) {
		// TODO Auto-generated method stub
		System.out.println("jugador 1      jugador 2");
		for(int x=0;x<partidas.length;x++) {
			System.out.println("");
			
			for(int y=0;y<partidas[x].length;y++) {
				if(cartas[partidas[x][y]]==cartas[cartaGanadora]) {
					System.err.print(cartas[partidas[x][y]]+" ");
				}
				else {
					System.out.print(cartas[partidas[x][y]]+" ");
				}
				
				if(y==3) {
					System.out.print("     ");
				}
			}
		}
	}

	private int[] generaJugadas(int cant, int min, int max) {
		// TODO Auto-generated method stub
		int []jugada=new int[cant];
		int ale=0;
		for(int x=0;x<jugada.length;x++) {
			do {
				ale=(int) Math.floor(Math.random()*(max-min+1)+min);
			}while(repe(jugada,ale));
			jugada[x]=ale;
		}
		return jugada;
	}

	private boolean repe(int[] jugada, int ale) {
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
