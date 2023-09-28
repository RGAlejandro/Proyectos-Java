package AprenderAAprender;

import java.util.Scanner;

public class AprenderRomperCadena {

	public AprenderRomperCadena() {
		// TODO Auto-generated constructor stub
		//3.- Rompe cadenas : Crea un programa que me pida una frase y me la rompa en palabras.
		Scanner leer=new Scanner(System.in);
		System.out.println("EJERCICIO ROMPE CADENA");
		String frase="  Hola    me  llamo Alejandro    y estoy en una prueba   ";
		char letra;
		String palabra="";
		int numC=0;
		for(int x=0;x<frase.length();x++) {
			letra=frase.charAt(x);
			if(letra!=' ') {
				palabra+=letra;
				numC++;
			}
			else {
				if(numC>0) {
					System.out.println(palabra);
					palabra="";
					numC=0;
				}
			}
		}
	}

}
