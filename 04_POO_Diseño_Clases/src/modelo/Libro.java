package modelo;

public class Libro implements Prestable{
	private String isbn_Libro;
	private String nombre_Libro;
	private int ano_Salida_Libro;
	private boolean estaPrestado=false; 
	public Libro(String isbn_Libro, String nombre_Libro, int ano_Salida_Libro) {
		// TODO Auto-generated constructor stub
		this.isbn_Libro=isbn_Libro;
		this.nombre_Libro=nombre_Libro;
		this.ano_Salida_Libro=ano_Salida_Libro;
	}

	@Override
	public void presta() {
		// TODO Auto-generated method stub
		this.estaPrestado=true;
	}

	@Override
	public void devuelve() {
		// TODO Auto-generated method stub
		this.estaPrestado=false;

	}

	@Override
	public boolean estaPrestado() {
		if(this.estaPrestado==true) {
			return true;
		}
		else {
			return false;
		}
		
		
	}

	@Override
	public String toString() {
		return "Libro [isbn_Libro=" + isbn_Libro + ", nombre_Libro=" + nombre_Libro + ", ano_Salida_Libro=" + ano_Salida_Libro
				+ "]";
	}



	
	
}
