package estudioFlujoDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlujoDatos {

	public FlujoDatos() {
		// TODO Auto-generated constructor stub
		System.out.println("Estudio flujo de datos............");
		String dato="";
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("Introduzca un dato");
		int num=0;
		try {
			dato=br.readLine();
			num=Integer.parseInt(dato);
			System.out.println("Dato ="+dato);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Oye eso tiene numeros y letras");
		}
		
	}

}
