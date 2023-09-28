package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import modelo.CuentaBancaria;

public class CuentaDao {
	private Connection conn;
	public CuentaDao(Connection conn) {
		// TODO Auto-generated constructor stub
		this.conn=conn;
	}
	public List<CuentaBancaria> getConsultLibros(String sql) throws SQLException{
		List <CuentaBancaria> banco=new ArrayList<CuentaBancaria>();
		PreparedStatement pst=conn.prepareStatement(sql);
		ResultSet rs=pst.executeQuery(); 
		CuentaBancaria cuenta;
		while(rs.next()) {
			String numCuenta=rs.getString("numCuenta");
			String titular=rs.getString("titular");
			String dni=rs.getString("numCuenta");
			LocalDate fechaOperacion=rs.getDate("fechaOperacion").toLocalDate() ;
			boolean bloqueada=rs.getBoolean("bloqueada");
			//CuentaBancaria cuenta=new CuentaBancaria(numCuenta, titular, dni, numCuenta, titular, dni)
		}
		return banco;
		
	}
}
