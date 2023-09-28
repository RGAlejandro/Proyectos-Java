package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import excepciones.CampoNuloException;
import excepciones.IsbnException;
import modelo.Libro;

public class LibroDao {
	
	private Connection cn;
	
	public LibroDao(Connection cn) {
		// TODO Auto-generated constructor stub
		this.cn=cn;
	}
	public List<Libro> getConsultaLibros(String sql) throws SQLException, IsbnException, CampoNuloException{
		List<Libro> libros=new ArrayList<Libro>();
		PreparedStatement pst=cn.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		Libro libro;
		while (rs.next()) {
			int id=rs.getInt("idlibros");
			String titulo =rs.getString("titulo");
			String autor =rs.getString("autor");
			String editorial =rs.getString("editorial");
			String isbn =rs.getString("isbn");
			Boolean prestado =rs.getBoolean("prestado");
			LocalDateTime fechaAlta=rs.getTimestamp("fechaAlta").toLocalDateTime();
			LocalDate fechaDevolucion=null;
			LocalDate fechaPrestamo=null;
			if(rs.getDate("fechaDevolucion")!=null) {
				fechaDevolucion = rs.getDate("fechaDevolucion").toLocalDate();
			}
			if(rs.getDate("fechaPrestamo")!=null) {
				fechaPrestamo = rs.getDate("fechaPrestamo").toLocalDate();
			}
			libro = new Libro(id, titulo, autor, editorial, isbn, prestado, fechaPrestamo, fechaDevolucion, fechaAlta);
			libros.add(libro);
			libro=null;
		}
		return libros;
		
	}
}
