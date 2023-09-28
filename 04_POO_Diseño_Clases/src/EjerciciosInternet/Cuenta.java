package EjerciciosInternet;

import java.util.Scanner;

public class Cuenta {
	private String titular;
	private double cantidad;
	public Cuenta() {
		// TODO Auto-generated constructor stub
	}
	
	public Cuenta(String titular) {
		this.titular = titular;
	}
	
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public double ingresar() {
		System.out.println("INGRESAR DINERO");
		Scanner leer=new Scanner(System.in);
		double cantidad=leer.nextDouble();
		
		
		if(cantidad>0) {
			this.cantidad=this.cantidad+cantidad;
			return this.cantidad;
		}
		else{
			return 0;
		}
		
		
	}
	public double retirar() {
		System.out.println("RETIRAR DINERO");
		Scanner leer=new Scanner(System.in);
		double cantidad=leer.nextDouble();
		if(this.cantidad-cantidad>0) {
			this.cantidad=this.cantidad-cantidad;
			return this.cantidad;
		}
		else {
			return 0;
		}
		
	}
	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	

}
