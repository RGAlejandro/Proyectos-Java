package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TarjetaClavesFichero {

	public TarjetaClavesFichero() throws IOException {
		// TODO Auto-generated constructor stub
		Scanner leer=new Scanner(System.in);
		System.out.println("BIENVENIDO A NUESTRO BANCO");
		System.out.println("Introduzca el usuario");
		String usuario=leer.next();
		System.out.println("Introduzca la contraseña");
		String contrasena=leer.next();
		String [] datosEscritos=new String [2];
		datosEscritos[0]=usuario;
		datosEscritos[1]=contrasena;
		int [][]tarjeta=leerFichero(datosEscritos);
		char [] letras= {'A','B','C','D','E'};
		if(tarjeta!=null) {
			System.out.print("      1      2      3      4      5      6");
			for(int x=0;x<tarjeta.length;x++) {
				System.out.println("");
				System.out.print(letras[x]+"    ");
				for(int y=0;y<tarjeta[x].length;y++) {
					System.out.print(tarjeta[x][y]+"    ");
				}
			}
			preguntaClave(letras,tarjeta);
		}
		else {
			System.err.println("Lo siento pero el usuario y contraseña son incorrectos");
		}
	}

	private void preguntaClave(char[] letras, int[][] tarjeta) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		
		int aleLetra=(int) Math.floor(Math.random()*(4-0+1)+0);
		int aleNum=(int) Math.floor(Math.random()*(5-0+1)+0);
		System.out.println("");
		System.out.println("Dime la combinacion "+letras[aleLetra]+(aleNum+1));
		int contraseña=leer.nextInt();
		if(tarjeta[aleLetra][aleNum]==contraseña) {
			System.out.println("Enhorabuena has escrito bien la clave");
		}
		else {
			System.err.println("Lo siento pero no has acertado");
		}
	}

	private int[][] leerFichero(String[] datosEscritos) throws IOException {
		// TODO Auto-generated method stub
		int [][]tarjeta=null;
		FileReader fr=new FileReader("tarjetaClaves.txt");
		BufferedReader br=new BufferedReader(fr);
		String linea="";
		linea=br.readLine();
		int cantUsuarios=Integer.parseInt(linea);
		String []lineaBaseDatos=new String[datosEscritos.length];
		String[]lineaClaves=new String[30];
		int coincidencias=0;
		int cont=0;
		for(int x=0;x<cantUsuarios;x++) {
			linea="";
			linea=br.readLine();
			lineaBaseDatos=linea.split(",");
			for(int i=0;i<lineaBaseDatos.length;i++) {
				if(lineaBaseDatos[i].equals(datosEscritos[i])) {
					coincidencias++;
				}
			}
			if(coincidencias==datosEscritos.length) {
				linea="";
				linea=br.readLine();
				lineaClaves=linea.split(",");
				tarjeta=new int [5][6];
				for(int i=0;i<tarjeta.length;i++) {
					
					for(int j=0;j<tarjeta[i].length;j++) {
						tarjeta[i][j]=Integer.parseInt(lineaClaves[cont]);
						cont++;
					}
				}
				return tarjeta;
			}
			coincidencias=0;
		}
		return tarjeta;
	}

}
