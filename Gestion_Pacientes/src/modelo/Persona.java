package modelo;

import java.time.LocalDate;

import excepciones.CuentaBancoException;
import excepciones.DniException;
import excepciones.IsbnException;

public class Persona {
	private String nombre;
	private String apellidos;
	private String dni;
	private String isbn;
	private String cuentaBancaria;
	private String matricula;
	private String codigoBarras;
	private LocalDate FechaAtendido;
	private double saldo;
	private String patologia;
	private boolean atendido;
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(String nombre, String apellidos, String dni, String isbn, String cuentaBancaria,String matricula,String codigoBarras,String fechaAtendido, String saldo,
			String patologia, String atendido) throws DniException, IsbnException, CuentaBancoException {
		super();
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setDni(dni);
		this.setIsbn(isbn);
		this.setCuentaBancaria(cuentaBancaria);
		this.setFechaAtendido(fechaAtendido);
		this.setSaldo(saldo);
		this.setPatologia(patologia);
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public boolean isAtendido() {
		return atendido;
	}

	public void setAtendido(boolean atendido) {
		this.atendido = atendido;
	}

	public String getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(String cuentaBancaria) throws CuentaBancoException {
		if(compruebaCuentaBancaria(cuentaBancaria)) {
			this.cuentaBancaria = cuentaBancaria;
		}
		else {
			throw new CuentaBancoException();
		}
	}

	private boolean compruebaCuentaBancaria(String cuentaBancaria) {
		// TODO Auto-generated method stub
		boolean esCorrecto=true;
		cuentaBancaria=cuentaBancaria.replace("-", "");
		if(cuentaBancaria.length()!=20) {
			esCorrecto=false;
			return esCorrecto;
		}
		try {
			double numerosCuenta=Double.parseDouble(cuentaBancaria);
		}catch (NumberFormatException e) {
			// TODO: handle exception
			esCorrecto=false;
			return esCorrecto;
		}
		String parteEntidadSucursal="00"+cuentaBancaria.substring(0, 8);
		char [] parteEntidadSucursalArray=parteEntidadSucursal.toCharArray(); 
		System.out.println(parteEntidadSucursal);
		String parteCuentaBanco=cuentaBancaria.substring(10, 20);
		char [] parteCuentaBancoArray=parteEntidadSucursal.toCharArray(); 

		System.out.println(parteCuentaBanco);
		char DigIzq=cuentaBancaria.charAt(8);
		String DigIzqCad=Character.toString(DigIzq);
		System.out.println(DigIzq);
		char DigDer=cuentaBancaria.charAt(9);
		String DigDerCad=Character.toString(DigDer);

		System.out.println(DigDer);
		int [] numsMultiplicados= {1,2,4,8,5,10,9,7,3,6};
		int acumulador=0;
		int convertidor=0;
		for(int x=0;x<parteEntidadSucursalArray.length;x++) {
			convertidor=Integer.parseInt(Character.toString(parteEntidadSucursalArray[x]));
			acumulador+=convertidor*numsMultiplicados[x];
		}
		int calculo=11-(acumulador%11);
		if(calculo==10) {
			calculo=1;
		}
		if(calculo==11) {
			calculo=0;
		}
		String DigIzqCalculado=String.valueOf(calculo);
		if(!DigIzqCalculado.equals(DigIzqCad)) {
			esCorrecto=false;
			return esCorrecto;
		}
		acumulador=0;
		for(int x=0;x<parteCuentaBancoArray.length;x++) {
			convertidor=Integer.parseInt(Character.toString(parteCuentaBancoArray[x]));
			acumulador+=convertidor*numsMultiplicados[x];
		}
		calculo=11-(acumulador%11);
		if(calculo==10) {
			calculo=1;
		}
		if(calculo==11) {
			calculo=0;
		}
		String DigDerCalculado=String.valueOf(calculo);
		if(!DigDerCalculado.equals(DigDerCad)) {
			esCorrecto=false;
			return esCorrecto;
		}
		return esCorrecto;
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
		int parteNums=0;
		try {
			parteNums=Integer.parseInt(dni.substring(0, 8));
		}catch (NumberFormatException e) {
			// TODO: handle exception
			esCorrecto=false;
			return esCorrecto;
			//throw new DniException();
		}
		String letra=dni.substring(8);
		char compLetra=letra.charAt(0);
		if(Character.isDigit(compLetra)) {
			esCorrecto=false;
			return esCorrecto;
		}
		int resto=parteNums%23;
		
		String [] letras= {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		String letraCalc=letras[resto];
		if(!letra.equals(letraCalc)) {
			esCorrecto=false;
			return esCorrecto;
		}
		return esCorrecto;
	}

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) throws IsbnException {
		if(compruebaIsbn(isbn)) {
			this.isbn = isbn;
		}
		else {
			throw new IsbnException();
		}
		
	}
	private boolean compruebaIsbn(String isbn) {
		// TODO Auto-generated method stub
		boolean esCorrecto=true;
		isbn=isbn.replace("-", "");
		if(isbn.length()!=13){
			esCorrecto=false;
			return esCorrecto;
		}
		Long IsbnNums;
		try {
			IsbnNums=Long.parseLong(isbn);
		}catch (NumberFormatException e) {
			// TODO: handle exception
			esCorrecto=false;
			return esCorrecto;
		}
		String parteCalcular=isbn.substring(0, 12);
		char [] numerosIsbn=parteCalcular.toCharArray();
		String digControl=isbn.substring(12);
		int acumulador=0;
		int suma=0;
		int posicion=1;
		for(int x=0;x<numerosIsbn.length;x++) {
			acumulador=Integer.parseInt(Character.toString(numerosIsbn[x]));
			if(posicion%2==0) {
				suma+=acumulador*3;
			}
			else {
				suma+=acumulador;
			}
			posicion++;
		}
		int resto=suma%10;
		int digCalc=10-resto;
		if(digCalc==10) {
			digCalc=0;
		}
		String digCalcCadena=String.valueOf(digCalc);
		if(!digCalcCadena.equals(digControl)) {
			esCorrecto=false;
			return esCorrecto;
		}
		return esCorrecto;
	}

	public LocalDate getFechaAtendido() {
		return FechaAtendido;
	}
	public void setFechaAtendido(String fechaAtendido) {
		FechaAtendido = LocalDate.parse(fechaAtendido);
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(String saldo) {
		this.saldo = Double.parseDouble(saldo);
	}
	public boolean isPatologia() {
		return patologia;
	}
	public void setPatologia(String patologia) {
		this.patologia = Boolean.parseBoolean(patologia);
	}
	
}
