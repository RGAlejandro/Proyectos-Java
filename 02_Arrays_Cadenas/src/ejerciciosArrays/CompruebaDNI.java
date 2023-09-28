package ejerciciosArrays;

import java.util.Scanner;

public class CompruebaDNI {

	public CompruebaDNI() {
		// TODO Auto-generated constructor stub
		Scanner leer=new Scanner(System.in);
		String dni="52339371L";
		boolean DigitosValido=compruebaDigito(dni);
		if(!DigitosValido){
			System.err.println("Este numero no tiene 9 digitos y es incorrecto");
		}
		boolean NumerosValidos=compruebaNumeros(dni);
	}

	private boolean compruebaNumeros(String dni) {
		// TODO Auto-generated method stub
		
		
		return false;
	}

	private boolean compruebaDigito(String dni) {
		// TODO Auto-generated method stub
		boolean esValido=false;
		for(int x=0;x<dni.length();x++) {
			System.out.println();
			if(dni.length()==9) {
				esValido=true;
				break;
			}
		}
		return esValido;
	}

}
