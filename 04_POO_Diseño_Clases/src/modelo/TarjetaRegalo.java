package modelo;

import excepciones.SaldoInsuficienteException;

public class TarjetaRegalo {
	private int numeroDeIdentificacion = 0;
	private double saldo = 0;

	public TarjetaRegalo(double saldo) {
		// Metodo para generar el codigo aleatorio
		this.numeroDeIdentificacion = (int) Math.floor(Math.random() * (99999 - 10000 + 1) + 10000);
		this.saldo = saldo;
	}

	public int getNumeroDeIdentificacion() {
		return numeroDeIdentificacion;
	}

	public void setNumeroDeIdentificacion(int numeroDeIdentificacion) {
		this.numeroDeIdentificacion = numeroDeIdentificacion;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// METODOS
	public double gasta(double gasta) throws SaldoInsuficienteException {
		// Comprobar si tiene saldo y gasta la cantidad indicada
		if (saldo < gasta) {
			throw new SaldoInsuficienteException(this);
		} else {
			saldo -= gasta;
			System.out.println("Comprado");
		}
		return saldo;

	}

	public TarjetaRegalo fusionaCon(TarjetaRegalo tarjeta) {
		// Metodo para fusionar la tarjeta t1 con la tarjeta t2
		double suma = this.getSaldo() + tarjeta.getSaldo();
		this.setSaldo(0);
		tarjeta.setSaldo(0);
		return new TarjetaRegalo(suma);
	}

	@Override
	public String toString() {
		return "TarjetaRegalo [numeroDeIdentificacion=" + numeroDeIdentificacion + ", saldo=" + saldo + "]";
	}

}
