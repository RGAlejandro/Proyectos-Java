package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private static String bd = "banco";
	private static String parametros = "?useSSL=false&serverTimezone=UTC";
	private static String user = "root";
	private static String password = "1234";
	private static String url = "jdbc:mysql://localhost:3309/"+ bd + parametros;
	
	Connection conn=null;
	public DbConnection() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn=DriverManager.getConnection(url, user, password);
			if(conn!=null) {
				System.out.println("Connecting database [" + conn +"] OK");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Excepcion driver: "+e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Excepcion conexion: "+e.getMessage());
		}
	}
	public Connection getConnection() {
		return conn;
	}
	public void disconnect() {
		System.out.println("Closing database: ["+ conn +"] OK");
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			
		}
	}
}
