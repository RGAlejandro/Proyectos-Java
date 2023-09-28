package examenRecuperacion1Trimestre;

public class CompruebaISBNNuevo {

	public CompruebaISBNNuevo() {
		// TODO Auto-generated constructor stub
		System.out.println("Comprueba ISBN");
		String Isbn="978-84-415-2682-2";
		System.out.println(Isbn);
		Isbn=Isbn.replace("-", "");
		//System.out.println(Isbn); 9788441526822
		String parteNumeros=Isbn.substring(0, 12);
		//System.out.println(parteNumeros); 978844152682
		String digControl=Isbn.substring(12);
		//System.out.println(digControl); 2
		String digCalculado=calculaIsbn(parteNumeros);
		if(digCalculado.equals(digControl)) {
			System.out.println("Enhorabuena este ISBN es correcto");
		}
		else {
			System.err.println("Lo siento pero este ISBN no es correcto");
		}
	}

	private String calculaIsbn(String parteNumeros) {
		// TODO Auto-generated method stub
		char caracter;
		int num=0;
		int acumulaSuma=0;
		int pos=1;
		for(int x=0;x<parteNumeros.length();x++) {
			caracter=parteNumeros.charAt(x);
			num=Integer.parseInt(String.valueOf(caracter));
			acumulaSuma+=sumaNumeros(num,pos);
			pos++;
		}
		int resto=acumulaSuma%10;
		int digControl=10-resto;
		if(digControl==10) {
			digControl=0;
		}
		String digCadena=Integer.toString(digControl);
		return digCadena;
		
	}

	private int sumaNumeros(int num, int pos) {
		// TODO Auto-generated method stub
		int suma=0;
		boolean esPar=true;
		esPar=pos%2==0;
		if(esPar) {
			suma=num*3;
		}
		else {
			suma=num*1;
		}
		
		return suma;
	}

}
