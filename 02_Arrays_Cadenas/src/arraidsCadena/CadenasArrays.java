package arraidsCadena;

public class CadenasArrays {

	public CadenasArrays() {
		// TODO Auto-generated constructor stub
		System.out.println("Propiedades de la Cadenas");
		String cadenaSaludo="Bienvenido a la clase de Programación   ";
		String cadena2="AAA";
		int tam=cadenaSaludo.length();
		System.out.println("El tamaño de "+cadenaSaludo+" = "+tam);
		System.out.println("==========================================");
		System.out.println("================chartAt===================");
		System.out.println("Caracter = "+cadenaSaludo.charAt(0));
		for(int x=0;x<cadenaSaludo.length();x++) {
			System.out.print(cadenaSaludo.charAt(x)+" ");
		}
		System.out.println("==========================================");
		System.out.println("================Substring=================");
		System.out.println(cadenaSaludo.substring(1,3));
		System.out.println(cadenaSaludo.substring(2));
		
		System.out.println("==========================================");
		System.out.println("================indexOf=================");
		System.out.println(cadenaSaludo.indexOf("llamo"));
		System.out.println(cadenaSaludo.indexOf('o'));
		System.out.println(cadenaSaludo.indexOf('x'));
		
		System.out.println("==========================================");
		System.out.println("================equals=================");
		String nombre="Alejandro", nombre2="Alejandro";
		System.out.println(nombre.equals(nombre2));
		nombre2="alejandro";
		System.out.println(nombre.equals(nombre2));
		System.out.println(nombre.equalsIgnoreCase(nombre2));
		
		System.out.println("==========================================");
		System.out.println("================compareTo=================");
		nombre="Ana";
		System.out.println(nombre.compareTo(nombre2));
		
		System.out.println("==========================================");
		System.out.println("================trim=================");
		String cad3=cadenaSaludo.trim();
		System.out.println(cad3.length());
		
		System.out.println("==========================================");
		System.out.println("================toLowerCase===============");
		System.out.println(cadenaSaludo.toLowerCase());
		System.out.println(cadenaSaludo.toUpperCase());
		
		System.out.println("==========================================");
		System.out.println("================replace===================");
		System.out.println(cadenaSaludo.replace(" ", ""));
		System.out.println(cadenaSaludo.replace("a", "*"));
		
		System.out.println(cadenaSaludo.startsWith("Bienvenido"));
		System.out.println(cadenaSaludo.startsWith("ido"));
		
		String alumno="Alejandro,Gemes,1DAW,programacion,bbdd,sistemas,lenguaje de marcas";
		String[] rompeCadena=alumno.split(",");
		
		String asignatura="Programacion";
		char[]caracteres=asignatura.toCharArray();
	}

}
