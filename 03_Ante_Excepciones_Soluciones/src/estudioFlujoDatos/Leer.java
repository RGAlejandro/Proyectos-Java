package estudioFlujoDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leer {

	public static String dato() throws IOException { //esto lee los que sean String. Es un metodo estatico es decir que no instancia ningun objeto
		
		String dato="";
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		dato=br.readLine();
		
		return dato;
	}
	public static int datoInt() throws IOException,NumberFormatException {
		
		int num=0;
		//String datoCadena=dato();
		//num=Integer.parseInt(datoCadena);
		num=Integer.parseInt(dato());
		return num;
	}
	public static double datoDouble() throws NumberFormatException, IOException {
		double numDeci=0;
		
		numDeci=Double.parseDouble(dato());
		return numDeci;
	}

}
