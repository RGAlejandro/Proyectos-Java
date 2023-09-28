package controler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.LibroDao;
import excepciones.CampoNuloException;
import excepciones.IsbnException;
import modelo.Libro;

public class LibroController {
	private List<Libro> libros;
	Connection cn;
	public LibroController(Connection cn) {
		// TODO Auto-generated constructor stub
		
		this.cn=cn;
	}
	public List<Libro> getLibros() throws SQLException, IsbnException, CampoNuloException {
		LibroDao biblioteca=new LibroDao(cn);
		return biblioteca.getConsultaLibros("Select * from libros");
		
	}
}
