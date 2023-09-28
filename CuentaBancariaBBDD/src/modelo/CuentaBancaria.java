package modelo;

import java.time.LocalDate;

import excepciones.CuentaBancariaException;

public class CuentaBancaria {
	private String numCuenta,titular,dni;
	private double saldo;
	private LocalDate fechaOperacion;
	private boolean bloqueada;
	
	public CuentaBancaria() {
		// TODO Auto-generated constructor stub
	}
	
	public CuentaBancaria(String numCuenta, String titular, String dni, String saldo, String fechaOperacion,
			String bloqueada) throws CuentaBancariaException {
		
		this.setNumCuenta(numCuenta);
		this.setTitular(titular);
		this.setDni(dni);
		this.setSaldo(saldo);
		this.setFechaOperacion(fechaOperacion);
		this.setBloqueada(bloqueada);
		
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) throws CuentaBancariaException {
		if(compruebaNumCuentaBanco(numCuenta)) {
			this.numCuenta = numCuenta;
		}
		else {
			throw new CuentaBancariaException();
		}
	}

	private boolean compruebaNumCuentaBanco(String numCuenta) {
		// TODO Auto-generated method stub
		boolean esCorrecto=true;
		numCuenta=numCuenta.replace("-", "");
		
		if(numCuenta.length()!=20) {
			esCorrecto=false;
			return esCorrecto;
		}
		
		double numPasado=0;
		try {
			numPasado=Double.parseDouble(numCuenta);
		}catch (Exception e) {
			// TODO: handle exception
			esCorrecto=false;
			return esCorrecto;
		}
		String entidadSucursal="00"+numCuenta.substring(0, 8);
		String digIzqPuesto=numCuenta.substring(8,9);
		String digDerPuesto=numCuenta.substring(9,10);
		String cuentaBanco=numCuenta.substring(10);
		String dizIzqCalc=calculaDigito(entidadSucursal);
		String dizDerCalc=calculaDigito(cuentaBanco);
		if(!digIzqPuesto.equals(dizIzqCalc)||!digDerPuesto.equals(dizDerCalc)) {
			esCorrecto=false;
			return esCorrecto;

		}
		
		return esCorrecto;
	}

	private String calculaDigito(String parteCalculable) {
		// TODO Auto-generated method stub
		String digControl=null;
		int acumulador=0;
		int suma=0;
		int [] multiplicador= {1,2,4,8,5,10,9,7,3,6};
		for(int x=0;x<parteCalculable.length();x++) {
			acumulador=Integer.parseInt(Character.toString(parteCalculable.charAt(x)));
			suma+=acumulador*multiplicador[x];
		}
		int dig=11-(suma%11);
		if(dig==10) {
			dig=1;
		}
		if(dig==11) {
			dig=0;
		}
		digControl=String.valueOf(dig);
		
		return digControl;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = Double.parseDouble(saldo);
	}

	public LocalDate getFechaOperacion() {
		return fechaOperacion;
	}

	public void setFechaOperacion(String fechaOperacion) {
		this.fechaOperacion = LocalDate.parse(fechaOperacion);
	}

	public boolean isBloqueada() {
		return bloqueada;
	}

	public void setBloqueada(String bloqueada) {
		this.bloqueada = Boolean.parseBoolean(bloqueada);
	}

	@Override
	public String toString() {
		return numCuenta + "," + titular + "," + dni + "," + saldo
				+ "," + fechaOperacion + "," + bloqueada;
	}
	
}
