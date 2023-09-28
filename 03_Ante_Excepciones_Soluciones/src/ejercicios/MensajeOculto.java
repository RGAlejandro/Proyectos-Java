package ejercicios;

import java.util.Arrays;

public class MensajeOculto {

	public MensajeOculto() {
		// TODO Auto-generated constructor stub
		System.out.println("DESCIFRA MENSAJE OCULTO");
		String menOculto[]= {"5", // cantidad de palabras que tiene el mensaje
							 "2","5","-10","12","194", // cantidad de caracteres de la primera palabra y sus 2 numeros por caracter
							 "7","22","-11","13","197","5","40","14","-13","9","222","20","13","12","-77",
							 "7","1","-34","7","-7","26","99","24","777","1","214","9","9","1","98",
							 "2","26","49","15","7",
							 "8","26","25","13","100","26","77","14","200","22","7","3","-38","5","98","9","3"};
		for(int x=0;x<menOculto.length;x++) {
			System.out.println(menOculto[x]);
		}
		
		int [] longitudPalabrasMensaje=calculaCaracteresMensaje(menOculto,1);//CALCULA LA CANTIDAD DE LETRAS DE CADA PALABRA
		int [] posLongPalabras=calculaCaracteresMensaje(menOculto,2);//CALCULA QUE POSICION TIENE EN EL ARRAY EL NUMERO QUE INDICA LA CANTIDAD DE LETRAS
		
		System.out.println("");
		String [] mensajeDescifrado=descifraMensajeOculto(longitudPalabrasMensaje,posLongPalabras,menOculto);
		for(int x=0;x<mensajeDescifrado.length;x++) {
			System.out.print(mensajeDescifrado[x]+" ");
		}
	}

	private String[] descifraMensajeOculto(int[] longitudPalabrasMensaje, int[] posLongPalabras, String[] menOculto) {
		// TODO Auto-generated method stub
		int cantPalabras=Integer.parseInt(menOculto[0]);
		String []mensajeDescifrado=new String[cantPalabras];
		int numVeces=0;
		int posABC=0;
		int posIniOFinal=0;
		int x=0;
		int contPosLong=0;
		String [] abecedario= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String mensaje="";
		int sumadorVeces=0;
		do {
		
			do {
				int saberPos=posLongPalabras[contPosLong];
				posABC=saberPos+1;
				if(sumadorVeces!=0) {
					for(int i=0;i<sumadorVeces;i++) {
						posABC=posABC+2;
					}
				}
				int posLetra=Integer.parseInt(menOculto[posABC]);
				posIniOFinal=saberPos+2;
				if(sumadorVeces!=0) {
					for(int i=0;i<sumadorVeces;i++) {
						posIniOFinal=posIniOFinal+2;
					}
				}
				int formaLeer=Integer.parseInt(menOculto[posIniOFinal]);
				boolean esPar=true;
				esPar=formaLeer%2==0;
				if(esPar) {
					mensaje+=abecedario[posLetra-1];
				}
				else {
					mensaje+=abecedario[abecedario.length-posLetra];
				}
 				sumadorVeces++;
			}while(mensaje.length()!=longitudPalabrasMensaje[x]);
			sumadorVeces=0;
 			contPosLong++;
			mensajeDescifrado[x]=mensaje;
			mensaje="";
			x++;
			numVeces++;
		}while(numVeces!=cantPalabras);
		
		return mensajeDescifrado;
	}

	private int[] calculaCaracteresMensaje(String[] menOculto, int caso) {
		// TODO Auto-generated method stub
		int cantPalabras=Integer.parseInt(menOculto[0]); //Variable donde guardo cuantas palabras tiene la frase
		int [] longitudPalabrasMensaje=new int[cantPalabras];//Array de la longitud de la frase
		int numVeces=0;//esta variable se utiliza en un el do while de la linea 93
		int salto=0;
		int posMen=1;//Para calcular la posicion de cuantas letras tiene esa palabra es 1 porque el 0 es cantPalabras
		int posiLongitud=0;
		int [] posLongPalabras=new int [cantPalabras];//Sabes la posicion de los numeros  en el array MenOculto que indican la cantidad de letras que tiene
		int sumaPosicion=1;
		posLongPalabras[0]=posMen;
		do {
		if(numVeces!=0) {
			salto=longitudPalabrasMensaje[posiLongitud];
			posiLongitud++;
			posMen= posMen+salto*2+1;
			posLongPalabras[sumaPosicion]=posMen;
			sumaPosicion++;
		}
	    longitudPalabrasMensaje[posiLongitud]=Integer.parseInt(menOculto[posMen]);
		
		numVeces++;	
		}while(numVeces!=cantPalabras);
		if(caso==1) {
			return longitudPalabrasMensaje;
		}
		else{
			return posLongPalabras;
		}
		
	}

}
