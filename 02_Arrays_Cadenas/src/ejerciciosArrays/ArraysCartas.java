package ejerciciosArrays;

public class ArraysCartas {

	public ArraysCartas() {
		// TODO Auto-generated constructor stub
		System.out.println("JUGADA DE CARTAS ENTRE 2 JUGADORES");
		int jugadas=0;
		String []jugador1=new String [4];
		String []jugador2=new String [4];;
 		String cartas[] = { "1O", "2O", "3O", "4O", "5O", "6O", "7O", "SO", "CO", "RO",
                "1C", "2C", "3C", "4C", "5C", "6C", "7C", "SC", "CC", "RC",
                "1E", "2E", "3E", "4E", "5E", "6E", "7E", "SE", "CE", "RE",
                "1B", "2B", "3B", "4B", "5B", "6B", "7B", "SB", "CB", "RB", };
 		for(int jugada=1;jugada<11;jugada++) {
 			System.out.println("jugada Numero "+jugada);
 			System.out.println("jugador1");
 			jugador1=generaCartasjugador(cartas,jugador1);
 			System.out.println("jugador2");
 			jugador2=generaCartasjugador(cartas,jugador2);
 		}
 		
	}

	private String[] generaCartasjugador(String[] cartas, String[] jugador) {
		// TODO Auto-generated method stub
		int ale=0;
		int valor=0;
		int pos=0;
			for(int cont=0;cont<4;cont++) {
				ale=(int)Math.floor(Math.random()*(39-0+1)+0);
				jugador[pos]=cartas[ale];
				System.out.print(jugador[pos]+"-");
			}
			System.out.println("");
			return jugador;
		}

	
	

}
