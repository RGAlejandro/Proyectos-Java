package modelo;

public class Revista {
	private String isbn_Revista;
	private String nombre_Revista;
	private int ano_Salida_Revista;
	private int paginas_Revista;

	public Revista(String isbn_Revista, String nombre_Revista, int ano_Salida_Revista, int paginas_Revista) {
		super();
		this.isbn_Revista = isbn_Revista;
		this.nombre_Revista = nombre_Revista;
		this.ano_Salida_Revista = ano_Salida_Revista;
		this.paginas_Revista = paginas_Revista;
	}

	@Override
	public String toString() {
		return "Revista [isbn_Revista=" + isbn_Revista + ", nombre_Revista=" + nombre_Revista + ", ano_Salida_Revista="
				+ ano_Salida_Revista + ", paginas_Revista=" + paginas_Revista + "]";
	}
	
}
