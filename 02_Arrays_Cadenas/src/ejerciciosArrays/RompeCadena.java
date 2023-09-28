package ejerciciosArrays;

public class RompeCadena {

	public RompeCadena() {
		// TODO Auto-generated constructor stub
		System.out.println("Romper una cadena letra por letra");
		String frase="Hola me llamo Alejandro";
		machacaMensaje(frase);
	}

	private void machacaMensaje(String frase) {
		// TODO Auto-generated method stub
		for(int x=0;x<frase.length();x++) {
			System.out.print(frase.charAt(x)+" ");
		}
	}

}
