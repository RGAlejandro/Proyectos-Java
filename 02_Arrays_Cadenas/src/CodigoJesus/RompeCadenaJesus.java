package CodigoJesus;

import java.util.Scanner;

public class RompeCadenaJesus {

	public RompeCadenaJesus() {
		// TODO Auto-generated constructor stub
			System.out.println();
			Scanner leer=new Scanner(System.in);
			String cad =leer.next();//" Dabale arroz a la zorra el abad ";
			cad=cad.trim();
			String palabra = "";
			char c=' ';
			int cont=0;
			for (int x = 0; x < cad.length(); x++) {
			c=cad.charAt(x);
			if(c!=' ') {
			palabra+=Character.toString(c);
			cont++;
			}
			else{
			if(cont>0) {
			System.out.println(palabra);
			//System.out.println();
			palabra="";
			}
			cont=0;
			}
			}
			System.out.println(palabra);
			cad=cad.replace(" ", "");
			String cadRev="";
			for(int x=cad.length()-1;x>=0;x--) {
			char car=cad.charAt(x);
			cadRev+=car;
			}
			System.out.println(cadRev);
			if(cad.equalsIgnoreCase(cadRev))
			System.out.println("Frase palindroma");
			else
			System.out.println("Frase NO palindroma");
		}
	}
	


