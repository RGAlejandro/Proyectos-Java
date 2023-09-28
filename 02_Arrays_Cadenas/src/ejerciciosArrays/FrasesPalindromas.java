package ejerciciosArrays;

import java.util.Scanner;

public class FrasesPalindromas {

	public FrasesPalindromas() {
		// TODO Auto-generated constructor stub
		Scanner leer=new Scanner(System.in);
		System.out.println("SABER SI UNA FRASE ES PALINDROMA O NO");
		String frase="Ana lava lana";
		boolean esPalindroma=analizaPalindroma(frase);
		if(esPalindroma) {
			System.out.println("Esta frase ES PALINDROMA");
		}
		else {
			System.err.println("Esta frase NO ES PALINDROMA");
		}
		
		
		}

	private boolean analizaPalindroma(String frase) {
		// TODO Auto-generated method stub
		boolean esPalindroma=false;
		String frasePalindroma="Ana lava lana";
		if(frase.equals(frasePalindroma)) {
			esPalindroma=true;
		}
		return esPalindroma;
	}

}
