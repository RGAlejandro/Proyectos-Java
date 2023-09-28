package ejerciciosArrays;

public class CartasSaberGanador {

	public CartasSaberGanador() {
		// TODO Auto-generated constructor stub
		System.out.println("QUIEN TIENE MAS VECES LA CARTA GANADORA");
		String [][]jugada=new String [10][8];
		String cartas[] = { "1O", "2O", "3O", "4O", "5O", "6O", "7O", "SO", "CO", "RO",
                "1C", "2C", "3C", "4C", "5C", "6C", "7C", "SC", "CC", "RC",
                "1E", "2E", "3E", "4E", "5E", "6E", "7E", "SE", "CE", "RE",
                "1B", "2B", "3B", "4B", "5B", "6B", "7B", "SB", "CB", "RB", };
	//	generaCartasJugadas(jugada,cartas);
		
		
		
		
		generaCartaGanadora(cartas);
		
	}

	/*private void generaCartasJugadas(String[][] jugada,String []cartas) {
		// TODO Auto-generated method stub
		int ale=0;
		for(int x=0;x<jugada.length;x++) {
			for(int y=0;y<jugada[x].length;y++) {
				do {
					ale=(int) Math.floor(Math.random()*(39-0+1)+0);
				}while(repe(ale,jugada));
			}
		}
		
		
		
	}
*/
	/*private boolean repe(int ale, String[][] jugada) {
		// TODO Auto-generated method stub
		boolean EsValido=true;
		for(int x=0;x<jugada.length;x++) {
			for(int y=0;y<jugada[x].length;y++) {
				if(aleatorio[x]==num) {
					repetido=true;
					break;
				}
			}
		}
		return false;
	}
*/
	private void generaCartaGanadora(String[] cartas) {
		// TODO Auto-generated method stub
		
	}

}
