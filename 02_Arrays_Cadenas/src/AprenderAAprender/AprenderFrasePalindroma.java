package AprenderAAprender;

public class AprenderFrasePalindroma {

	public AprenderFrasePalindroma() {
		// TODO Auto-generated constructor stub
		System.out.println("VERIFICACION SOBRE SI UNA FRASE ES PALINDROMA O NO");
		String frase="dabale arroz a la zorra el abad";
		String fraseSinEspacios=frase.replace(" ", "");
		//System.out.println(frase);
		//System.out.println(fraseSinEspacios);
		String fraseVuelta=darVueltaCadena(fraseSinEspacios);
		System.out.println(fraseSinEspacios);
		System.out.println(fraseVuelta);
		if (fraseSinEspacios.equals(fraseVuelta)) {
			System.out.println("Esta frase es palindroma");
		}
		else {
			System.err.println("Lo siento pero esta frase no es palindroma");
		}
	}

	private String darVueltaCadena(String fraseSinEspacios) {
		// TODO Auto-generated method stub
		String fraseRevuelta="";
		char letra;
		for(int x=fraseSinEspacios.length();x>0;x--) {
			letra=fraseSinEspacios.charAt(x-1);
			fraseRevuelta+=letra;
		}
		return fraseRevuelta;
	}

}
