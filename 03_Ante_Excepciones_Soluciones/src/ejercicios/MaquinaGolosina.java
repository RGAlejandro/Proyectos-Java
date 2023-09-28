package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import excepciones.CodBarraException;
import excepciones.CodGolosinaException;
import excepciones.OpcionesMenuException;

public class MaquinaGolosina {

	public MaquinaGolosina() throws IOException, OpcionesMenuException, CodGolosinaException {
		// TODO Auto-generated constructor stub
		System.out.println("MAQUINA DE GOLOSINA");
		Scanner leer=new Scanner(System.in);
		FileReader fr=new FileReader("maquinagolosinas.txt");
		BufferedReader br=new BufferedReader(fr);
		String linea=br.readLine();
		int tamañoArray=Integer.parseInt(linea);
		String [][] nombreGolosinas=new String [tamañoArray][tamañoArray];
		double [][] precioGolosinas=new double [tamañoArray][tamañoArray];
		int [][] cantGolosinas=new int [tamañoArray][tamañoArray];
		String []separarLinea=new String [tamañoArray];
		int [][]ventasGolosinas=new int [tamañoArray][tamañoArray];
		
		
		for(int x=0;x<nombreGolosinas.length;x++) {
			linea=br.readLine();
			separarLinea=linea.split(",");
			for(int y=0;y<nombreGolosinas[x].length;y++) {
				nombreGolosinas[x][y]=separarLinea[y];
			}
		}
		for(int x=0;x<precioGolosinas.length;x++) {
			linea=br.readLine();
			separarLinea=linea.split(",");
			for(int y=0;y<precioGolosinas[x].length;y++) {
				precioGolosinas[x][y]=Double.parseDouble(separarLinea[y]);
			}
		}
		for(int x=0;x<cantGolosinas.length;x++) {
			linea=br.readLine();
 			separarLinea=linea.split(",");
			for(int y=0;y<cantGolosinas[x].length;y++) {
				cantGolosinas[x][y]=Integer.parseInt(separarLinea[y]);
			}
		}
		
		
		
		int opcionMenu=0;
		int [][]cantAnterior=new int[tamañoArray][tamañoArray];
		
		do {
			System.out.println("1.-- PEDIR GOLOSINA --.");
			System.out.println("2.-- MOSTRAR GOLOSINA --.");
			System.out.println("3.-- RELLENAR GOLOSINA --.");
			System.out.println("4.-- APAGAR MAQUINA DE GOLOSINAS --.");
			opcionMenu=leer.nextInt();
			switch (opcionMenu){
			case 1:
				//cantAnterior=cantGolosinas;
				cantAnterior=rellenaArray(cantGolosinas,cantAnterior);//tengo que rellenarlo manualmente ya que si fuese como arriba se pasan por referencia
				cantGolosinas=pideGolosina(nombreGolosinas,precioGolosinas,cantGolosinas);
				ventasGolosinas=ventaGolosina(cantGolosinas,cantAnterior,ventasGolosinas);
				break;
			case 2:
				muestraGolosina(nombreGolosinas,precioGolosinas,cantGolosinas);
				break;
			case 3:
				cantGolosinas=rellenaGolosina(cantGolosinas);
				break;
			case 4:
				apagaMaquina(tamañoArray,nombreGolosinas,precioGolosinas,cantGolosinas,ventasGolosinas);
				break;
			default:
				System.out.println("Introduce un numero correcto");
			}
			
		}while(opcionMenu!=4);
		
		
	}

	private int[][] rellenaArray(int[][] cantGolosinas, int[][] cantAnterior) {
		// TODO Auto-generated method stub
		for(int x=0;x<cantGolosinas.length;x++) {
			
			for(int y=0;y<cantGolosinas[x].length;y++) {
				cantAnterior[x][y]=cantGolosinas[x][y];
			}
		}
		return cantAnterior;
	}

	private int[][] ventaGolosina(int[][] cantGolosinas, int[][] cantAnterior, int[][] ventasGolosinas) {
		// TODO Auto-generated method stub
		for(int x=0;x<cantGolosinas.length;x++) {
			
			for(int y=0;y<cantGolosinas[x].length;y++) {
				if(cantGolosinas[x][y]!=cantAnterior[x][y]) {
					ventasGolosinas[x][y]++;
				}
			}
		}
		
		
		return ventasGolosinas;
	}

	private void apagaMaquina(int tamañoArray, String[][] nombreGolosinas, double[][] precioGolosinas, int[][] cantGolosinas, int[][] ventasGolosinas) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("maquinagolosinas.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		System.out.println("VENTAS DE MAQUINA DE GOLOSINAS");
		double sumarDinero=0;
		String codigo1="";
		String codigo2="";
		
		for(int x=0;x<ventasGolosinas.length;x++) {
			codigo1=String.valueOf(x);
			for(int y=0;y<ventasGolosinas[x].length;y++) {
				codigo2=String.valueOf(y);
				if(ventasGolosinas[x][y]>0) {
					System.out.println(codigo1+codigo2+" "+nombreGolosinas[x][y]+" "+ventasGolosinas[x][y]+" unidades vendidas, has ganado "+(precioGolosinas[x][y]*ventasGolosinas[x][y])+"€");
					sumarDinero+=precioGolosinas[x][y]*ventasGolosinas[x][y];
				}
			}
		}
		System.out.println("Has ganado hoy un total de "+sumarDinero+"€");
		String linea="";
		linea=String.valueOf(tamañoArray);
		bw.write(linea);
		bw.newLine();
		int vuelta=0;
		linea="";
		for(int x=0;x<nombreGolosinas.length;x++) {
			if(vuelta!=0) {
				bw.write(linea);
				bw.newLine();
				linea="";
			}
			vuelta++;
			for(int y=0;y<nombreGolosinas[x].length;y++) {
				if(y==nombreGolosinas[x].length-1) {
					linea+=nombreGolosinas[x][y];
				}
				else {
					linea+=nombreGolosinas[x][y]+",";
				}
			}
		}
		bw.write(linea);
		bw.newLine();
		vuelta=0;
		linea="";
		for(int x=0;x<precioGolosinas.length;x++) {
			if(vuelta!=0) {
				bw.write(linea);
				bw.newLine();
				linea="";
			}
			vuelta++;
			for(int y=0;y<precioGolosinas[x].length;y++) {
				if(y==precioGolosinas[x].length-1) {
					linea+=precioGolosinas[x][y];
				}
				else {
					linea+=precioGolosinas[x][y]+",";
				}
			}
		}
		bw.write(linea);
		bw.newLine();
		vuelta=0;
		linea="";
		for(int x=0;x<cantGolosinas.length;x++) {
			if(vuelta!=0) {
				bw.write(linea);
				bw.newLine();
				linea="";
			}
			vuelta++;
			for(int y=0;y<cantGolosinas[x].length;y++) {
				if(y==cantGolosinas[x].length-1) {
					linea+=cantGolosinas[x][y];
				}
				else {
					linea+=cantGolosinas[x][y]+",";
				}
			}
		}
		bw.write(linea);
		bw.newLine();
		fw.flush();
		bw.close();
		fw.close();
		
	}

	private int[][] rellenaGolosina(int[][] cantGolosinas) throws CodGolosinaException {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		String contraMaquina="MaquinaExpendedora2023";
		String contraIntentos="";
		
		do {
			System.out.println("Escribe la clave de admin");
			contraIntentos=leer.next();
			
		}while(!contraIntentos.equals(contraMaquina));
		System.out.println("Introduce el codigo de la golosina que quieras rellenar");
		String codGolosina=leer.next();
		if(codGolosina.length()==2) {
		int fila=Integer.parseInt(codGolosina.substring(0,1));
		int columna=Integer.parseInt(codGolosina.substring(1));
		int cant=0;
		System.out.println("Introduce cuanta cantidad quieres meter en "+codGolosina);
		cantGolosinas[fila][columna]=cant=leer.nextInt();
		}
		
		else {
			throw new CodGolosinaException();
		}
		return cantGolosinas;
		
	}

	private void muestraGolosina(String[][] nombreGolosinas, double[][] precioGolosinas, int[][] cantGolosinas) {
		// TODO Auto-generated method stub
		String codigo1="";
		String codigo2="";
		for(int x=0;x<cantGolosinas.length;x++) {
			codigo1=String.valueOf(x);
			for(int y=0;y<cantGolosinas[x].length;y++) {
				if(cantGolosinas[x][y]!=0) {
					codigo2=String.valueOf(y);
					System.out.println(codigo1+codigo2+" "+nombreGolosinas[x][y]+" "+precioGolosinas[x][y]+"€");
				}
			}
		}
	}

	private int[][] pideGolosina(String[][] nombreGolosinas, double[][] precioGolosinas, int[][] cantGolosinas) throws CodGolosinaException {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		String codGolosina=leer.next();
		if(codGolosina.length()==2) {
		int fila=Integer.parseInt(codGolosina.substring(0,1));
		int columna=Integer.parseInt(codGolosina.substring(1));
		if(cantGolosinas[fila][columna]==0) {
			System.out.println("Lo siento pero ya no quedan mas golosinas de "+nombreGolosinas[fila][columna]);
			return cantGolosinas;
		}
		cantGolosinas[fila][columna]--;
		
		}
		else {
			throw new CodGolosinaException();
		}
		return cantGolosinas;
	}

}
