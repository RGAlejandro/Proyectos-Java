package AprenderAAprender;

public class AprenderAEncriptar {

	public AprenderAEncriptar() {
		// TODO Auto-generated constructor stub
		String frase="Atacaremos al amanecer";
		int [] posicionLetras= {3,2,1,0,7,6,5,4};
		int min=0;
		int max=posicionLetras.length;
		String mensajePartido="";
		String mensajeEncriptado="";
		boolean esDivisible=true;
		do {
			if(frase.length()%posicionLetras.length!=0) {
				frase+=" ";
				esDivisible=true;
			}
			else {
				esDivisible=false;
			}
		}while(esDivisible);
		int frases=frase.length()/posicionLetras.length;
		for(int x=0;x<frases;x++) {
			mensajePartido=frase.substring(min, max);
			mensajeEncriptado=encriptaMensaje(mensajePartido,posicionLetras);
			min+=posicionLetras.length;
			max+=posicionLetras.length;
			System.out.println(mensajePartido);
			System.out.println(mensajeEncriptado);
		}
		
	}

	private String encriptaMensaje(String mensajePartido, int[] posicionLetras) {
		// TODO Auto-generated method stub
		int [] mensajeLiado=new int[mensajePartido.length()];
		String encriptaMensaje="";
		char [] letrasMensaje=new char[mensajePartido.length()];
		for(int x=0;x<mensajePartido.length();x++) {
			letrasMensaje[x]=mensajePartido.charAt(x);
		}
		for(int x=0;x<mensajeLiado.length;x++) {
			encriptaMensaje+=letrasMensaje[posicionLetras[x]]; 
			
		}
		
		
		
		return encriptaMensaje;
	}

}
