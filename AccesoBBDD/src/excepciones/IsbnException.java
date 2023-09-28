package excepciones;

public class IsbnException extends Exception {

	public IsbnException() {
		// TODO Auto-generated constructor stub
		super("El ISBN es incorrecto");
	}

	public IsbnException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

}
