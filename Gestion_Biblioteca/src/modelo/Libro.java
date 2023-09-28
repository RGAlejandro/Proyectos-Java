package modelo;

import java.time.LocalDate;
import java.util.Objects;

import excepciones.CampoObligatorioException;
import excepciones.IsbnException;

public class Libro implements Comparable<Libro>{
	private String isbn;
	private String titulo;
	private String autor;
	private String editorial;
	private LocalDate fechaDevolucion;
	private double precio;
	private boolean prestado;
	
	public Libro() {
		// TODO Auto-generated constructor stub
	}

	public Libro(String isbn, String titulo, String autor, String editorial, String fechaDevolucion, String precio,
			String prestado) throws IsbnException, CampoObligatorioException {
		super();
		this.setIsbn(isbn);
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setEditorial(editorial);
		this.setFechaDevolucion(fechaDevolucion);
		this.setPrecio(precio);
		this.setPrestado(prestado);
		}

	

	public Libro(String isbn, String titulo, String autor, String editorial, String precio) throws IsbnException, CampoObligatorioException {
		super();
		this.setIsbn(isbn);
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setEditorial(editorial);
		String fechaDevolucion="";
		this.setFechaDevolucion(fechaDevolucion);
		this.setPrecio(precio);
		String prestado="false";
		this.setPrestado(prestado);

	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) throws IsbnException, CampoObligatorioException {
		if(isbn.isEmpty()) {
			throw new CampoObligatorioException();
		}
		if(compruebaIsbn(isbn)) {
			this.isbn = isbn;
		}
		else {
			throw new IsbnException();
		}
	}

	private boolean compruebaIsbn(String isbn) {
		// TODO Auto-generated method stub
		boolean esCorrecto=true;
		isbn=isbn.replace("-", "");
		
		if(isbn.length()!=13) {
			esCorrecto=false;
			return esCorrecto;
		}
		String isbnParteCalcular=isbn.substring(0, 12);
		String digControlIntro=isbn.substring(12);
		//System.out.println(isbnParteCalcular);
		char [] isbnNums=isbn.toCharArray();
		char [] isbnNumsCalc=isbnParteCalcular.toCharArray();
		for(int x=0;x<isbnNums.length;x++) {
			if(Character.isAlphabetic(isbnNums[x])) {
				esCorrecto=false;
				return esCorrecto;
			}
		}
		int acumulador=0;
		int pos=1;
		int convertidor=0;
		for(int x=0;x<isbnNumsCalc.length;x++) {
			convertidor=Integer.parseInt(Character.toString(isbnNumsCalc[x]));
			if(pos%2==0) {
				acumulador+=convertidor*3;
			}
			else {
				acumulador+=convertidor*1;
			}
			pos++;
		}
		int resto=acumulador%10;
		int digControlCalc=10-resto;
		if(digControlCalc==10) {
			digControlCalc=0;
		}
		String convertirDigCalc=Integer.toString(digControlCalc);
		if(!digControlIntro.equals(convertirDigCalc)) {
			esCorrecto=false;
			return esCorrecto;
		}
		
		return esCorrecto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) throws CampoObligatorioException {
		if(titulo.isEmpty()) {
			throw new CampoObligatorioException();
		}
		else {
			this.titulo = titulo;
		}
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) throws CampoObligatorioException {
		if(autor.isEmpty()) {
			throw new CampoObligatorioException();
		}
		else {
			this.autor = autor;
		}
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) throws CampoObligatorioException {
		if(editorial.isEmpty()) {
			throw new CampoObligatorioException();
		}
		else {
			this.editorial = editorial;
		}
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(String fechaDevolucion) {
		if(fechaDevolucion.equals("null")|| fechaDevolucion.equals("") || fechaDevolucion==null) {
			this.fechaDevolucion=null;
		}
		else {
			this.fechaDevolucion = LocalDate.parse(fechaDevolucion);
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) throws CampoObligatorioException {
		if(precio.isEmpty()) {
			throw new CampoObligatorioException();
		}
		if(compruebaPrecio(precio)) {
			this.precio = Double.parseDouble(precio);
		}
		else {
			throw new NumberFormatException();
		}
	}

	private boolean compruebaPrecio(String precio) {
		// TODO Auto-generated method stub
		boolean esCorrecto=true;
		char [] numeros=precio.toCharArray();
		for(int x=0;x<numeros.length;x++) {
			if(Character.isLetter(numeros[x])) {
				esCorrecto=false;
				return esCorrecto;
			}
		}
		return esCorrecto;
	}

	

	public boolean getPrestado() {
		return prestado;
	}

	public void setPrestado(String prestado) throws CampoObligatorioException {
		if(prestado.isEmpty()) {
			throw new CampoObligatorioException();
		}
		if(prestado.equals("true")||prestado.equals("false")) {
			this.prestado = Boolean.parseBoolean(prestado);
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public String toString() {
		return isbn + ","+ titulo + "," + autor + "," + editorial + "," + fechaDevolucion + "," + precio + "," + prestado ;
	}

	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		return this.getAutor().compareTo(o.getAutor());
	}
	
}
