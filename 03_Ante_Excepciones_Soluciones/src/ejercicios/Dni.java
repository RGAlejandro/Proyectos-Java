package ejercicios;

import excepciones.DniException;

public class Dni {

	public Dni(String DniEscrito) throws DniException {
		// TODO Auto-generated constructor stub
		System.out.println("COMPRUEBA DNI");
		String dniSinGuion=DniEscrito.replace("-", "");
		int numerosDni=compruebaDni(dniSinGuion);
		String letraDni=dniSinGuion.substring(8);
		calculaLetraDni(numerosDni,letraDni);
		System.out.println("Si has llegado hasta aqui es que tu DNI es correcto");
	}

	private void calculaLetraDni(int numerosDni, String letraDni) throws DniException {
		// TODO Auto-generated method stub
		char [] letrasDni= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		int resto=numerosDni%23;
		char letraCalculada=letrasDni[resto];
		char letraPuesta=letraDni.charAt(0);
		try {
			if(letraPuesta==letraCalculada) {
				
			}
			else {
				throw new DniException();
			}
		}catch (Exception e) {
			// TODO: handle exception
			throw new DniException();
		}
	}

	private int compruebaDni(String dniSinGuion) throws DniException {
		// TODO Auto-generated method stub
		int numerosDni=0;
		try {
			if(dniSinGuion.length()!=9) {
				throw new DniException();
			}
			String numerosDniTexto=dniSinGuion.substring(0,8);
			System.out.println(numerosDniTexto);
			numerosDni=Integer.parseInt(numerosDniTexto);
			String letraDni=dniSinGuion.substring(8);
			char letra=letraDni.charAt(0);
			if(Character.isLetter(letra)) {
				
			}
			else {
				throw new DniException();
			}
			System.out.println(letraDni);
		}catch (DniException e) {
			// TODO: handle exception
			throw new DniException();
		}
		return numerosDni;
	
		
	}

}
