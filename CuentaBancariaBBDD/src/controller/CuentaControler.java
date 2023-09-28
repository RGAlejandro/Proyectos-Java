package controller;

import java.sql.Connection;
import java.util.List;

import dao.CuentaDao;
import modelo.CuentaBancaria;

public class CuentaControler {
	private List<CuentaBancaria> cuentas;
	Connection conn;
	
	public CuentaControler(Connection conn) {
		// TODO Auto-generated constructor stub
		this.conn=conn;
	}

	public List<CuentaBancaria> getCuentas() {
		CuentaDao banco=new CuentaDao(conn); 
		return cuentas;
	}
	
}
