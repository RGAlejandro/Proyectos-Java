package AprenderAAprender;

import java.util.Scanner;

public class AprenderAJugadasDeCaballoEnAjedrez {

	public AprenderAJugadasDeCaballoEnAjedrez() {
		// TODO Auto-generated constructor stub
		int [][]TableroAjedrez=new int[8][8];
		posicionCaballo(TableroAjedrez);
	}

	private void posicionCaballo(int[][] tableroAjedrez) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		int caballo=2;
		int filaOri=0;
		int columnaOri=0;
		String pared="║";
		String techo="════════════════";
		System.out.println("¿En que posicion quieres poner al caballo?");
		System.out.println("Introduce la fila");
		int fila=leer.nextInt();
		fila--;
		filaOri=fila;
		System.out.println("Introduce la columna");
		int columna=leer.nextInt();
		columna--;
		columnaOri=columna;
		if(fila<0 || fila>7 || columna<0 || columna>7) {
			System.err.println("Lo siento pero esa posicion no existe en el tablero");
		}
		tableroAjedrez[fila][columna]=caballo;
		int jugadaC=1;
		if(fila+1<8 && columna+2<8){//1 para abajo y 2 a la derecha OK
			tableroAjedrez[fila+1][columna+2]=jugadaC;
		}
		if(fila-1>=0 && columna-2>=0){//1 para arriba y 2 a la izquierda OK
			tableroAjedrez[fila-1][columna-2]=jugadaC;
		}
		if(fila-1>=0 && columna+2<8){//1 para arriba y 2 a la derecha OK
			tableroAjedrez[fila-1][columna+2]=jugadaC;
		}
		if(fila-2>=0 && columna-1>=0){//2 para arriba y 1 a la izquierda OK
			tableroAjedrez[fila-2][columna-1]=jugadaC;
		}	
		if(fila-2>=0 && columna+1<8){//2 para arriba y 1 a la derecha OK
			tableroAjedrez[fila-2][columna+1]=jugadaC;
		}	
		if(fila+1<8 && columna-2>=0){//1 para abajo y 2 a la izquierda OK
			tableroAjedrez[fila+1][columna-2]=jugadaC;
		}
		if(fila+2<8 && columna+1<8){//2 para abajo y 1 a la derecha OK
			tableroAjedrez[fila+2][columna+1]=jugadaC;
		}
		if(fila+2<8 && columna-1>=0){//2 para abajo y 1 a la izquierda OK
			tableroAjedrez[fila+2][columna-1]=jugadaC;
		}	
		
		
		System.out.print(techo);
		for(int x=0;x<tableroAjedrez.length;x++) {
			
			System.out.println("");
			for(int y=0;y<tableroAjedrez[x].length;y++) {
				System.out.print(pared);
				System.out.print(tableroAjedrez[x][y]+"");
				
			}
			System.out.print(pared);
		}
		System.out.println("");
		System.out.print(techo);
	}

}
