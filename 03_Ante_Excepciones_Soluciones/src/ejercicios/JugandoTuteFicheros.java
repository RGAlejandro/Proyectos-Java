package ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JugandoTuteFicheros {

	public JugandoTuteFicheros() throws IOException {
		// TODO Auto-generated constructor stub
		System.out.println("Jugando al tute");
		FileReader fr=new FileReader("tute.txt");
		BufferedReader br=new BufferedReader(fr);
		String linea=br.readLine();//En este String almacenamos la linea 
		int cantJugadas=Integer.parseInt(linea);//Esto tiene el 3 ya que es la primera linea que lee
		//System.out.println(cantJugadas);
		int []jugadas=new int [cantJugadas];
		String []separarLinea;
		String cartasJugador="";
		char caracter='a';
		String cartasSeparadas="";
		boolean esNormal=true;
		for(int x=0;x<cantJugadas;x++) {
			
			for(int i=0;i<jugadas.length;i++) {  
				linea=br.readLine();
				separarLinea=linea.split(":");
				cartasJugador=separarLinea[1];
				cartasSeparadas="";
				for(int j=0;j<cartasJugador.length();j++) {
					caracter=cartasJugador.charAt(j);
					esNormal=true;
					if(Character.isLetter(caracter) && j==cartasJugador.length()-1) {
						esNormal=false;
						cartasSeparadas+=caracter;
					}
					if(Character.isLetter(caracter) && j!=cartasJugador.length()-1) {
						esNormal=false;
						cartasSeparadas+=caracter+",";
					}
					else if(esNormal){
						cartasSeparadas+=caracter;
					}
					
				}
				
				
				
			}
		}
	}

}
