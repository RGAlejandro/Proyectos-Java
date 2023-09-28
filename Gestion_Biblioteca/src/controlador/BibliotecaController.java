package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import excepciones.CampoObligatorioException;
import excepciones.IsbnException;
import modelo.Libro;

public class BibliotecaController {
	private List <Libro> biblioteca=new ArrayList<Libro>();

	public BibliotecaController() throws IOException, IsbnException, CampoObligatorioException {
		// TODO Auto-generated constructor stub
		FileReader fr=new FileReader("libros.txt");
		BufferedReader br=new BufferedReader(fr);
		String linea=br.readLine();
		String []separador;
		while(linea!=null) {
			separador=linea.split(",");
			Libro libro=new Libro(separador[0], separador[1], separador[2], separador[3], separador[4], separador[5], separador[6]);
			biblioteca.add(libro);
			linea=br.readLine();
		}
	}

	public List<Libro> getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(List<Libro> biblioteca) {
		this.biblioteca = biblioteca;
	}
	
	public Libro buscarLibro(String isbn) {
		boolean noExiste=true;
		for(Libro e: biblioteca) {
			if(isbn.equals(e.getIsbn())) {
				System.err.println(e);
				noExiste=false;
			}
			else {
				System.out.println(e);
			}
		}
		if(noExiste) {
			System.out.println("Lo siento pero no existe ningun libro registrado con ese ISBN");
		}
		
		return null;
		
	}
	public boolean agregarLibro(String isbn, String titulo, String autor, String editorial, String precio) throws IsbnException,CampoObligatorioException {
		boolean seAgrega=true;
		for(Libro e: biblioteca) {
			if(isbn.equals(e.getIsbn())) {
				seAgrega=false;
				break;
			}
		}
		return seAgrega;
		
	}
	public Libro prestarLibro(String isbn,String fecha) throws DateTimeParseException, CampoObligatorioException{
		boolean noExiste=true;
		for(Libro e: biblioteca) {
			if(isbn.equals(e.getIsbn())) {
				if(e.getFechaDevolucion()==null&&e.getPrestado()==false) {
					e.setFechaDevolucion(fecha);
					e.setPrestado("true");
					noExiste=false;
					break;
				}
				else {
					System.out.println("Hemos encontrado tu libro, pero ya esta prestado -_-");
				}
				
			}
		}
		if(noExiste) {
			System.out.println("Lo siento pero no existe ningun libro registrado con ese ISBN para prestarse");
		}

		return null;
		
	}
	public boolean devolverLibro(String isbn) throws CampoObligatorioException {
		boolean seDevuelve=false;
		for(Libro e: biblioteca) {
			if(isbn.equals(e.getIsbn())) {
				if(e.getFechaDevolucion()!=null&&e.getPrestado()==true) {
					e.setFechaDevolucion("null");
					e.setPrestado("false");
					seDevuelve=true;
					break;
				}
				else {
					System.out.println("Hemos encontrado tu libro, pero no esta prestado -_-");
				}
				
			}
		}
		return seDevuelve;
		
	}
	public boolean eliminarLibro(String isbn) {
		boolean noExiste=true;
		for(Libro e: biblioteca) {
			if(isbn.equals(e.getIsbn())) {
				System.err.println(e);
				System.out.println("Este libro va a ser eliminado, tu lo quisiste");
				biblioteca.remove(e);
				noExiste=false;
				break;
			}
			
		}
		return noExiste;
		
	}
	public List<Libro> filtrarAutor(String autor){
		//List <Libro> autores=new ArrayList<Libro>();
		
		
		return biblioteca;
		
	}
	public List<Libro>pendientesEntrega(){
		
		return biblioteca;
		
	}
	public boolean salvarDatos() throws IOException {
		FileWriter fw=new FileWriter("libros.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		boolean datosGuardados=true;
		
		for(Libro e: biblioteca) {
			bw.write(e.getIsbn()+e.getTitulo()+e.getAutor()+e.getEditorial()+e.getFechaDevolucion()+e.getPrecio()+e.getPrestado());
			bw.newLine();
		}
		
		return datosGuardados;
		
	}

	@Override
	public String toString() {
		return "BibliotecaController [biblioteca=" + biblioteca + "]";
	}
	
}
