package examenRecuperacion1Trimestre;

public class RepartirCartas {

	String[][] mano = new String[4][5];
	String[] baraja = { "1O", "2O", "3O", "4O", "5O", "1C", "2C", "3C", "4C", "5C", "1E", "2E", "3E", "4E", "5E", "1B",
			"2B", "3B", "4B", "5B", };
	int limSuperior = baraja.length;
	int limInferior = 0;

	public RepartirCartas() {

		// VARIABLES

		int cantidad = baraja.length;

		int[] reparto = generaAleatoriosSinRepeticion(cantidad, 1, cantidad);
		for (int x = 0; x < baraja.length; x++) {
			System.out.print(reparto[x]+"-");
		}
		System.out.println();
		repartirCartas(reparto);
		
		
		int ale = (int) Math.floor(Math.random() * (limSuperior  - limInferior + 1) + limInferior);
		
		String cartaGanadora = baraja[ale];
		
		System.out.print("\nLa carta ganadora es :"+cartaGanadora+" ");
		
		boolean ganador = false;
		
		for (int x = 0; x < mano.length; x++) {
			for (int y = 0; y < mano[x].length; y++) {
				if (mano[x][y].equals(cartaGanadora)) {
					ganador = true;
					System.out.println("gana la partida el jugador " + (x+1));
				}
			}
		}
		
		if (!ganador) {
			System.out.println("Nadie ha ganado");
		}
		

	}

	private void repartirCartas(int[] reparto) {
		// METODO PARA REPARTIR CARTAS
		int cont = 0;

		for (int x = 0; x < mano.length; x++) {
			System.out.print("Jugador " + (x + 1) + " ");
			
			for (int y = 0; y < mano[x].length; y++) {
				mano[x][y] = baraja[reparto[cont]];
				System.out.print(mano[x][y]+"-");
				cont++;
			}
			System.out.println("");
		}

	}

	private int[] generaAleatoriosSinRepeticion(int cantidad, int inf, int sup) {
		// METODO PARA GENERAR NUMEROS ALEATORIOS

		int[] aleatorios = new int[cantidad];
		int limSuperior = cantidad;
		int limInferior = inf;

		for (int x = 0; x < aleatorios.length; x++) {
			aleatorios[x] = (int) (Math.random() * cantidad);
			for (int y = 0; y < x; y++) {
				if (aleatorios[x] == aleatorios[y]) {
					x--;
				}
			}
		}

		return aleatorios;
	}

}
