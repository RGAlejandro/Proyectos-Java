package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CuadradoMagico {

	public CuadradoMagico() throws IOException {
		// TODO Auto-generated constructor stub
		File fichero;
		fichero=new File("matrices.txt");
		
		FileReader fr=new FileReader(fichero);
		BufferedReader br=new BufferedReader(fr);
		String linea="";
		//linea=br.readLine();
		//MOSTRAR LO QUE HAY EN EL FICHERO
		/*
		while((linea=br.readLine())!=null) {
			System.out.println(linea);
		}
		*/
		
		int cantCuadrados=Integer.parseInt(br.readLine());
		int tamañoArray;
		int [][]cuadrado;
		int fila[];
		boolean esMagico;
		for(int x=0;x<cantCuadrados;x++) {
			tamañoArray=Integer.parseInt(br.readLine());
			cuadrado=new int [tamañoArray][];
			for(int y=0;y<tamañoArray;y++) {
				linea=br.readLine();
				fila=devuelveFila(linea);
				cuadrado[y]=fila;
			}
			for(int i=0;i<cuadrado.length;i++) {
				System.out.println("");
				for(int j=0;j<cuadrado[i].length;j++) {
					System.out.print(cuadrado[i][j]+" ");
				}
			}
			System.out.println("");
			esMagico=compruebaCuadradoMagico(cuadrado);
			if(esMagico) {
				System.out.println("Esta matriz es un cuadrado magico");
			}
			else {
				System.out.println("Esta matriz no es un cuadrado magico");
			}
		}
				    


				}

	private boolean compruebaCuadradoMagico(int[][] cuadrado) {
		// TODO Auto-generated method stub
		int []sumaFilas=new int[cuadrado.length];//LAS FILAS SERIAN SUMAR DE IZQUIERDA A DERECHA
		int []sumaColumnas=new int[cuadrado.length];//SUMAR DE ARRIBA ABAJO
		int sumaDiagonal1=0;
		int sumaDiagonal2=0;
		int sumaDiagonales;
		boolean esMagico=true;
		
		for(int x=0;x<cuadrado.length;x++) {
			for(int y=0;y<cuadrado[x].length;y++) {
				sumaFilas[x]+=cuadrado[x][y];
			}
		}
		
		for(int y=0;y<cuadrado.length;y++) {
			for(int x=0;x<cuadrado[y].length;x++) {
				sumaColumnas[y]+=cuadrado[x][y];
			}
		}
		
		int x=0;
		int y=0;
		for(int i=0;i<cuadrado.length;i++) {
			sumaDiagonal1+=cuadrado[x][y];
			x++;
			y++;
		}
		x=cuadrado.length-1;
		y=0;
		for(int i=0;i<cuadrado.length;i++) {
			sumaDiagonal2+=cuadrado[x][y];
			x--;
			y++;
		}
		if(sumaDiagonal1==sumaDiagonal2) {
			sumaDiagonales=sumaDiagonal1;
		}
		else {
			esMagico=false;
			return esMagico;
		}
		int vuelta=0;
		for(int i=0;i<sumaColumnas.length-1;i++) {
			//if(vuelta<sumaColumnas.length) {
				if(sumaColumnas[i]!=sumaColumnas[i+1]) {
					esMagico=false;
					return esMagico;
				}
			//}
			//vuelta++;
		}
		for(int i=0;i<sumaFilas.length-1;i++) {
			if(sumaFilas[i]!=sumaFilas[i+1]) {
				esMagico=false;
				return esMagico;
			}
		}
		if(sumaFilas[0]==sumaColumnas[0] && sumaFilas[0]==sumaDiagonales) {
			
		}
		else {
			esMagico=false;
		}
		return esMagico;
	}

	private int[] devuelveFila(String linea) {
		// TODO Auto-generated method stub
		String [] cadena=linea.split(" ");
		int []fila=new int[cadena.length];
		for(int x=0;x<cadena.length;x++) {
			fila[x]=Integer.parseInt(cadena[x]);
		}
		return fila;
	}
	}


