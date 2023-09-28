package ejercicios;

import java.util.Arrays;

public class JugandoTute {

	public JugandoTute() {
		// TODO Auto-generated constructor stub
		System.out.println("Jugando al Tute");
		String cartas[]= {"1O","2O","3O","4O","5O","6O","7O","10O","11O","12O",
						  "1B","2B","3B","4B","5B","6B","7B","10B","11B","12B",
						  "1C","2C","3C","4C","5C","6C","7C","10C","11C","12C",
						  "1E","2E","3E","4E","5E","6E","7E","10E","11E","12E"};
		int [] jugada=new int [40];
		Arrays.fill(jugada, -1);
		
		jugada=generaJugada(jugada);
		reparteJugada(jugada,cartas);
		
	}

	private void reparteJugada(int[] jugada, String[] cartas) {
		// TODO Auto-generated method stub
		int [] jugador1Cartas=new int [10];
		int [] jugador2Cartas=new int [10];
		int [] jugador3Cartas=new int [10];
		int [] jugador4Cartas=new int [10];

		String jugador1="";
		String jugador2="";
		String jugador3="";
		String jugador4="";
		
		int oroJug1=0; int oroJug2=0; int oroJug3=0;	int oroJug4=0;
		
		int bastosJug1=0; int bastosJug2=0; int bastosJug3=0; int bastosJug4=0;
		
		int copasJug1=0; int copasJug2=0; int copasJug3=0;	int copasJug4=0;

		int espadasJug1=0; int espadasJug2=0; int espadasJug3=0; int espadasJug4=0;
		 
		int i1=0;
		int i2=0;
		int i3=0;
		int i4=0;


		for(int x=0;x<jugada.length;x++) {
			if(x>=0 && x<=9) {
				jugador1+=cartas[jugada[x]]+",";
				jugador1Cartas[i1]=jugada[x];
				i1++;
			}
			if(x>=10 && x<=19) {
				jugador2+=cartas[jugada[x]]+",";
				jugador2Cartas[i2]=jugada[x];
				i2++;
			}
			if(x>=20 && x<=29) {
				jugador3+=cartas[jugada[x]]+",";
				jugador3Cartas[i3]=jugada[x];
				i3++;
			}
			if(x>=30 && x<=39) {
				jugador4+=cartas[jugada[x]]+",";
				jugador4Cartas[i4]=jugada[x];
				i4++;
			}
		}
		System.out.println("Jugador1: "+jugador1);
		System.out.println("Jugador2: "+jugador2);
		System.out.println("Jugador3: "+jugador3);
		System.out.println("Jugador4: "+jugador4);
		
		for(int x=0;x<jugador1Cartas.length;x++) {
			if(jugador1Cartas[x]==8 || jugador1Cartas[x]==9) {
				oroJug1++; //si llega a 2 significa que Canta de oro
			}
			if(jugador1Cartas[x]==18 || jugador1Cartas[x]==19) {
				bastosJug1++; //si llega a 2 significa que Canta de bastos
			}
			if(jugador1Cartas[x]==28 || jugador1Cartas[x]==29) {
				copasJug1++; //si llega a 2 significa que Canta de copas
			}
			if(jugador1Cartas[x]==38 || jugador1Cartas[x]==39) {
				espadasJug1++; //si llega a 2 significa que Canta de espadas
			}
			
		}
		
		for(int x=0;x<jugador2Cartas.length;x++) {
			if(jugador2Cartas[x]==8 || jugador2Cartas[x]==9) {
				oroJug2++; //si llega a 2 significa que Canta de oro
			}
			if(jugador2Cartas[x]==18 || jugador2Cartas[x]==19) {
				bastosJug2++; //si llega a 2 significa que Canta de bastos
			}
			if(jugador2Cartas[x]==28 || jugador2Cartas[x]==29) {
				copasJug2++; //si llega a 2 significa que Canta de copas
			}
			if(jugador2Cartas[x]==38 || jugador2Cartas[x]==39) {
				espadasJug2++; //si llega a 2 significa que Canta de espadas
			}
			
		}
		
		for(int x=0;x<jugador3Cartas.length;x++) {
			if(jugador3Cartas[x]==8 || jugador3Cartas[x]==9) {
				oroJug3++; //si llega a 2 significa que Canta de oro
			}
			if(jugador3Cartas[x]==18 || jugador3Cartas[x]==19) {
				bastosJug3++; //si llega a 2 significa que Canta de bastos
			}
			if(jugador3Cartas[x]==28 || jugador3Cartas[x]==29) {
				copasJug3++; //si llega a 2 significa que Canta de copas
			}
			if(jugador3Cartas[x]==38 || jugador3Cartas[x]==39) {
				espadasJug3++; //si llega a 2 significa que Canta de espadas
			}
			
		}
		
		for(int x=0;x<jugador4Cartas.length;x++) {
			if(jugador4Cartas[x]==8 || jugador4Cartas[x]==9) {
				oroJug4++; //si llega a 2 significa que Canta de oro
			}
			if(jugador4Cartas[x]==18 || jugador4Cartas[x]==19) {
				bastosJug4++; //si llega a 2 significa que Canta de bastos
			}
			if(jugador4Cartas[x]==28 || jugador4Cartas[x]==29) {
				copasJug4++; //si llega a 2 significa que Canta de copas
			}
			if(jugador4Cartas[x]==38 || jugador4Cartas[x]==39) {
				espadasJug4++; //si llega a 2 significa que Canta de espadas
			}
			
		}
		System.out.println("");
		if(oroJug1==2) {System.out.println("Jugador 1 puede cantar veinte de copas.");}
		if(bastosJug1==2) {System.out.println("Jugador 1 puede cantar veinte de bastos.");}
		if(copasJug1==2) {System.out.println("Jugador 1 puede cantar veinte de copas.");}
		if(espadasJug1==2) {System.out.println("Jugador 1 puede cantar veinte de bastos.");}
		
		if(oroJug2==2) {System.out.println("Jugador 2 puede cantar veinte de copas.");}
		if(bastosJug2==2) {System.out.println("Jugador 2 puede cantar veinte de bastos.");}
		if(copasJug2==2) {System.out.println("Jugador 2 puede cantar veinte de copas.");}
		if(espadasJug2==2) {System.out.println("Jugador 2 puede cantar veinte de bastos.");}
		
		if(oroJug3==2) {System.out.println("Jugador 3 puede cantar veinte de copas.");}
		if(bastosJug3==2) {System.out.println("Jugador 3 puede cantar veinte de bastos.");}
		if(copasJug3==2) {System.out.println("Jugador 3 puede cantar veinte de copas.");}
		if(espadasJug3==2) {System.out.println("Jugador 3 puede cantar veinte de bastos.");}
		
		if(oroJug4==2) {System.out.println("Jugador 4 puede cantar veinte de copas.");}
		if(bastosJug4==2) {System.out.println("Jugador 4 puede cantar veinte de bastos.");}
		if(copasJug4==2) {System.out.println("Jugador 4 puede cantar veinte de copas.");}
		if(espadasJug4==2) {System.out.println("Jugador 4 puede cantar veinte de bastos.");}
		}

	private int[] generaJugada(int[] jugada) {
		// TODO Auto-generated method stub
		int numAle=0;
		for(int x=0;x<jugada.length;x++) {
			do {
				numAle=(int)Math.floor(Math.random()*(39-0+1)+0);
			}while(esRepe(numAle,jugada));
			jugada[x]=numAle;
		}
		return jugada;
	}

	private boolean esRepe(int numAle, int[] jugada) {
		// TODO Auto-generated method stub
		boolean esRepe=false;
		for(int x=0;x<jugada.length;x++) {
			if(numAle==jugada[x]) {
				esRepe=true;
				return esRepe;
			}
		}
		return esRepe;
	}

}
