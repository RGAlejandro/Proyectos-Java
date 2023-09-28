package AprenderAAprender;

import java.util.Scanner;

public class AprenderDNI {

	public AprenderDNI() {
		// TODO Auto-generated constructor stub
		/*5.-Crea un programa que compruebe si un dni es correcto (8 numeros y una letra ) 
		Recordad que la letra se calcula dividiendo el numero entre 23 y mirando el resto 
		( Mirad en internet la letra con que se corresponde)*/
		System.out.println("VERIFICA DNI");
		Scanner leer=new Scanner(System.in);
		String dni=leer.next();
		
		boolean esValido=compruebaValidez(dni);
		if(esValido) {
			int numerosDNI=compruebaDigitos(dni);
			char letraDNI=compruebaLetra(dni);
			boolean esCorrecto=compruebaDNI(numerosDNI,letraDNI);
			if(esCorrecto) {	
				System.out.println(numerosDNI+"-"+letraDNI+" es un DNI correcto");
			}
			else {
				System.err.println("Lo siento pero ese DNI no es correcto");
			}
			}
		else {
			System.err.println("Lo siento pero este DNI no es valido");
		}
	}

	private boolean compruebaValidez(String dni) {
		// TODO Auto-generated method stub
		boolean EsValido=false;
		if (dni.length()==9) {
			EsValido=true;
		}
		return EsValido;
	}

	private boolean compruebaDNI(int numerosDNI, char letraDNI) {
		// TODO Auto-generated method stub
		boolean esCorrecto=true;
		String todasLetrasDNI="TRWAGMYFPDXBNJZSQVHLCKE";
		int restoDiv=numerosDNI%23;
		char letritachar=todasLetrasDNI.charAt(restoDiv);
		if(letraDNI!=letritachar) {
			esCorrecto=false;
		}
		return esCorrecto;
	}

	private char compruebaLetra(String dni) {
		// TODO Auto-generated method stub
		char LetraDNI=dni.charAt(8);
		return LetraDNI;
	}

	private int compruebaDigitos(String dni) {
		// TODO Auto-generated method stub
		String numerosDNI=dni.substring(0,8);
		int numeros=Integer.parseInt(numerosDNI);
		return numeros;
	}

}
