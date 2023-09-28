package modelo;

import excepciones.DniException;
import excepciones.MatriculaException;

public class Vehiculo {
	private String nombre;
	private String apellidos;
	private String dni;
	private String matricula;
	private String identificador;

	

	public Vehiculo(String nombre, String apellidos, String dni, String matricula) throws DniException, MatriculaException {
		super();
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		setDni(dni);
		setMatricula(matricula);
		String identificador=creaIdentificador(nombre,apellidos,dni);
		this.identificador=identificador;
	}



	private String creaIdentificador(String nombre, String apellidos, String dni) {
		String identificador="";
		identificador+=nombre.charAt(0);
		String [] separador;
		separador=apellidos.split(" ");
		identificador+=separador[0].charAt(0);
		identificador+=separador[1].charAt(0);
		identificador+=dni.substring(5,8);
		
		return identificador;

	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) throws DniException {
		if(compruebaDni(dni)) {
			this.dni = dni;
		}
		else {
			throw new DniException();
		}
		
	}



	private boolean compruebaDni(String dni) {
		// TODO Auto-generated method stub
		boolean esCorrecto=true;
		dni=dni.replace("-", "");
		if(dni.length()!=9) {
			esCorrecto=false;
			return esCorrecto;
		}
		String parteNum=dni.substring(0, 8);
		char[]letrasDniSeparadas=parteNum.toCharArray();
		for(int x=0;x<letrasDniSeparadas.length;x++) {
			if(Character.isLetter(letrasDniSeparadas[x])) {
				esCorrecto=false;
				return esCorrecto;
			}
		}
		//System.out.println(parteNum);
		char letra=dni.charAt(8);
		if(Character.isDigit(letra)) {
			esCorrecto=false;
			return esCorrecto;
		}
		//System.out.println(letra);
		int numsDni=Integer.parseInt(parteNum);
		int resto=numsDni%23;
		String [] letras= {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		String letraBuscada=letras[resto];
		String letraCadena=Character.toString(letra);
		if(!letraCadena.equalsIgnoreCase(letraBuscada)) {
			esCorrecto=false;
			return esCorrecto;
		}
		return esCorrecto;
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) throws MatriculaException {
		if(compruebaMatricula(matricula)) {
			this.matricula = matricula;
		}
		else {
			throw new MatriculaException();
		}
	}



	private boolean compruebaMatricula(String matricula) {
		// TODO Auto-generated method stub
		boolean esCorrecto=true;
		int parteNums;
		if(matricula.length()!=7) {
			esCorrecto=false;
			return esCorrecto;
		}
		try {
			parteNums=Integer.parseInt(matricula.substring(0, 4));

		}catch (Exception e) {
			// TODO: handle exception
		}
		String parteLetras=matricula.substring(4);
		for(int x=0;x<parteLetras.length();x++) {
			if(!Character.isLetter(parteLetras.charAt(x)) || Character.isLowerCase(parteLetras.charAt(x))) {
				esCorrecto=false;
				return esCorrecto;
			}
		}
		
		return esCorrecto;
	}



	public String getIdentificador() {
		return identificador;
	}



	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}



	@Override
	public String toString() {
		return " [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", matricula=" + matricula
				+ ", identificador=" + identificador + "]";
	}
	
	
	
}
