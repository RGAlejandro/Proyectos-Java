package vista;

import modelo.Calculadora;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc=new Calculadora();
		int suma=calc.suma(3, 17);
		System.out.println(suma);
	}

}
