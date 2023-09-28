package vista;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import controler.LibroController;
import dao.DbConnection;
import excepciones.CampoNuloException;
import excepciones.IsbnException;
import modelo.Libro;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbConnection dbc=new DbConnection();
		Connection cn=dbc.getConnection();
		try {
			LibroController libroController=new LibroController(cn);

			List<Libro> libros=libroController.getLibros();
			for (Libro l : libros) {
				System.out.println(l);
			}
		} catch (SQLException | IsbnException | CampoNuloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dbc.disconect();
	}

}
