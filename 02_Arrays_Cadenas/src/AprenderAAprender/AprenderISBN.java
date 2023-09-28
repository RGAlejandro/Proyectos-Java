package AprenderAAprender;

public class AprenderISBN {

	public AprenderISBN() {
		// TODO Auto-generated constructor stub
		/*ISBN-13: Debemos multiplicar cada número por 1 si la posición que ocupa es
		impar o por 3 si la posición que ocupa es par y calcular la suma de todos salvo
		del último que es el dígito de control.
		Dividimos el resultado de la suma anterior entre 10 y obtenemos el resto de la
		división. Restamos a 10 el resto obtenido. El isbn será válido si el valor
		obtenido es igual al dígito de control (último dígito del isbn). ( Sí el resultado
		de la resta es 10 el DC será 0)
		Ejemplo: Comprueba la validez del siguiente isbn-13: 978-84-415-2682-2
		• Suma: 9*1 + 7*3 + 8*1 + 8*3 + 4*1 + 4*3 + 1*1 + 5*3 + 2*1 + 6*3 + 8*1 + 2*3
		= 128
		• Cálculo del dígito de control: 128 mod 10 = 8 (el resto). 10 – 8 = 2 (coincide
		con el dígito
		de control)*/
		String isbn="978-84-8130-252-3";
		System.out.println(isbn);
		int digControlNum;
		String isbnSinNada=isbn.replace("-", "");//9788481302523
		String parteSuma=isbnSinNada.substring(0, 12);//978 84 8130 252
		String digControlColocado=isbnSinNada.substring(12);//3
		digControlNum=Integer.parseInt(digControlColocado);
		int digControlCalculado=calculaSumaIsbn(parteSuma);
		boolean esValido=compruebaValidez(digControlCalculado,digControlNum);
		if(esValido) {
			System.out.println("Este ISBN es correcto");
		}
		else {
			System.err.println("Lo siento pero tu ISBN no es correcto");
		}
	}

	private boolean compruebaValidez(int digControlCalculado, int digControlNum) {
		// TODO Auto-generated method stub
		boolean esValido=false;
		if(digControlCalculado==10) {
			digControlCalculado=0;
		}
		if(digControlCalculado==digControlNum) {
			esValido=true;
		}
		return esValido;
	}

	private int calculaSumaIsbn(String parteSuma) {
		// TODO Auto-generated method stub
		int num=0;
		char numTexto;
		int cont=1;
		int sumaTotal=0;
		int restoDiv=0;
		int codDigControl=0;
		for(int x=0;x<parteSuma.length();x++) {
			numTexto=parteSuma.charAt(x);
			num=Integer.parseInt(String.valueOf(numTexto));
			sumaTotal+=calcula(num,cont);
			cont++;
		}
		restoDiv=sumaTotal%10;
		codDigControl=10-restoDiv;
		if(codDigControl==10)
			codDigControl=0;
		return codDigControl;
	}

	private int calcula(int num, int cont) {
		// TODO Auto-generated method stub
		int suma=0;
		if(cont%2==0) {//Posicion PAR
			suma=num*3;
		}
		else {//Posicion IMPAR
			suma=num*1;
		}
		return suma;
	}

}
