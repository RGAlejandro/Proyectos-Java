package excepciones;

import modelo.TarjetaRegalo;

public class SaldoInsuficienteException extends Exception{

	public SaldoInsuficienteException(TarjetaRegalo tarjetaRegalo) {
		// TODO Auto-generated constructor stub
		super("Lo suento tu saldo es insuficiente");
	}

}
