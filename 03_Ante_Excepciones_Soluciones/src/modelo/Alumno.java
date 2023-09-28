package modelo;

import excepciones.DniException;

public class Alumno {
	String dni; //Esto es un atributo que sirve para inicializar los atributos

	public Alumno(String dni) throws DniException {
		// TODO Auto-generated constructor stub
		compruebaDni(dni);
		this.dni=dni;
		
	}

	private void compruebaDni(String dni) throws DniException {
		// TODO Auto-generated method stub
		String letrasDNI="TRWAGMYFPDXBNJZSQVHLCKE";
		dni=dni.toUpperCase();
		if(dni.length()==9) {
			String numeroDNI=dni.substring(0,8);
			char letra=dni.charAt(8);
			try {
				int numDni=Integer.parseInt(numeroDNI);
				int resto=numDni%23;
				char letraDni=letrasDNI.charAt(resto);
				if(letra!=letraDni) {
					throw new DniException();
				}
				
				
				
			}catch (NumberFormatException e) {
				// TODO: handle exception
				
				throw new DniException();
			}
		}
		else {
			throw new DniException();
		}
	}

}
