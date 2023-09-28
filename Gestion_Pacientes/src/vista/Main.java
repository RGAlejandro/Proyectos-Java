package vista;

import java.time.LocalDate;

import excepciones.CuentaBancoException;
import excepciones.DniException;
import excepciones.IsbnException;
import modelo.Persona;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="Alejandro",apellidos="Gemes Rubio",dni="26905231S",isbn="978-84-95354-15-0",cuentaBancaria="3121-3832-13-9810036996",fechaAtendido="2023-03-10",saldo="300.50",patologia="false";
		Persona sujetoPrueba=null;
		try {
			sujetoPrueba=new Persona(nombre, apellidos, dni, isbn, cuentaBancaria, fechaAtendido, saldo, patologia);
		} catch (DniException | IsbnException | CuentaBancoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}	

}
