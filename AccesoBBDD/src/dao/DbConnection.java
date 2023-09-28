package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	static String bd = "biblioteca";
	static String parametros = "?useSSL=false&serverTimezone=UTC";
	static String login = "root";
	static String password = "1234";
	static String url = "jdbc:mysql://localhost:3309/" + bd + parametros;
	
	Connection conn =null;
	
	
	public DbConnection() {
		// TODO Auto-generated constructor stub	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, login, password);
			if(conn!=null) {
				System.out.println("Conneting database [" + conn + "] OK");
			}
		}catch (SQLException e) {
			System.out.println("Excepcion conexion: "+ e.getMessage());
		}catch (ClassNotFoundException e){
			System.out.println("Excepcion driver: "+ e.getMessage());
		}
	}
	public Connection getConnection() {
		return conn;
		
	}
	
	public void disconect() {
		System.out.println("Conneting database [" + conn + "] OK");
		
		if(conn!=null) {
			try {
				conn.close();
			}catch (SQLException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}

}
