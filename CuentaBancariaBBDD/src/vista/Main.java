package vista;

import java.sql.Connection;
import java.util.Scanner;

import controller.CuentaControler;
import dao.DbConnection;
import excepciones.CuentaBancariaException;
import modelo.CuentaBancaria;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String numCuenta="01307244787449348221",titular="Alejandro Gemes",dni="26905231-S",saldo="2500",fechaOperacion="2021-05-05",bloqueada="false";
		try {
			CuentaBancaria cuenta1=new CuentaBancaria(numCuenta, titular, dni, saldo, fechaOperacion, bloqueada);
			System.out.println(cuenta1);
		} catch (CuentaBancariaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		Scanner leer=new Scanner(System.in);
		
		boolean salir=false;
		do {
			System.out.println("1-CONSULTA TABLA");
			System.out.println("2-AGREGAR CUENTA CORRIENTE");
			System.out.println("3-ELIMINAR CUENTA CORRIENTE");
			System.out.println("4-CONSULTA TABLA");
			System.out.println("5-CONSULTAS ESPECIALES");
			System.out.println("6-SALIR DEL PROGRAMA");
			
			String opcion=leer.next();
			switch (opcion){
			case "1":
				DbConnection dbc=new DbConnection();
				Connection conn=dbc.getConnection();
				CuentaControler controler=new CuentaControler(conn);
				break;
			case "6":
				salir=true;
				break;
			default:
				System.out.println("Introduce un numero del 1 al 6...");
				break;
			}
		}while(!salir);
		System.out.println("FIN DEL PROGRAMA");
	}

}
