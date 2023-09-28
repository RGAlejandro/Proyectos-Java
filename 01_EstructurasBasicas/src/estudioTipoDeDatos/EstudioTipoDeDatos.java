package estudioTipoDeDatos;

import java.util.Scanner;

public class EstudioTipoDeDatos {
	enum Dias {Lunes,Martes,Miercoles,Jueves,Viernes,Sabado,Domingo};
	public EstudioTipoDeDatos() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Estudio Tipo de Datos"); //Mostrar por pantalla lo que aparece dentro de las comillas
		byte tipoByte=0; //Indica que el tipo de dato byte mete una variable que se llama tipoByte que es igual a 0
		tipoByte=24; //Indica el valor de la variable tipoByte
		System.out.println("tipoByte = "+ tipoByte); //Muestra por pantalla lo que vale la variable tipoByte
		int x; //Creamos una variable que se llama x
		x=5; //Le asignamos un valor que es 5
		System.out.println("x = " + x); //Mostramos por pantalla lo que vale ese valor
		x=7; //Ahora cambiamos el valor de una variable existente 
		System.out.println("Ahora la x vale " + x); //La volvemos a mostrar para ver el cambio del valor
		long tipoLong= 2349872341L; //Tiene que ir con la L al final para que no se considere un error
		char letra1= 'h';
		char letra2= 'o';
		char letra3= 'l';
		char letra4= 'a';
		System.out.println("Letra1 = " + letra1);
		System.out.println("Letra3 = " + letra3);
		System.out.println("Escribir todas las letras "+letra1 +letra2 +letra3 +letra4);
		char c= 'A';
		int codAscii =c;
		System.out.println("Caracter " + c + " Ascii " +codAscii);
		c=77;
		System.out.println("Caracter " + c);
		//los decimales son considerados como double si queremos utilizar float,
		// tendremos que hacer un casting
		float tipoFloat;
		//tipoFloat=23.4;//da error
		tipoFloat=(float)23.4;
		float tipoFloat2=23.4F;
		double a; //se declaran las variables x e y
		double b; //de tal forma que pueden almacenar decimales
		a=7;
		b=25.01;
		System.out.println("a vale "+ a);
		System.out.println("b vale "+ b);
		//CONSTANTES
		final double PI=3.14; //para que sea constante la variable se tiene que escribir todo en mayusculas
		//Y ademas poner final delante del tipo de dato
		//CONVERSION DE TIPOS..... CASTING
		double div;
		int cociente, divisor;
		cociente=9;
		divisor=4;
		div= cociente/divisor;
		System.out.println("La division de"+ cociente +"/" + divisor +"=" +div);
		
		//CADENAS
		String miPalabra = "cerveza";
		String miFrase= "¿Donde esta mi bebida?";
		System.out.println("Una palabra que uso con frecuencia:" +miPalabra);
		System.out.println("Una pregunta que suelo hacer mucho es:" +miFrase);
		//PEDIR DATO POR TECLADO
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre: ");
		String nombre = leer.nextLine();
		//String nombre = leer.next();
		//leer=null; leer=new Scanner(System.in);
		System.out.println("Introduzca su edad: ");
		int edad = leer.nextInt();
		
		System.out.println("Tu nombre es " +nombre+ " y tienes " +edad+ " años");
		//TIPOS ENUMERADOS
		Dias diaActual=Dias.Jueves;
		Dias diaSiguiente=Dias.Viernes;
		System.out.println("Hoy es " +diaActual);
		System.out.println("Mañana es "+diaSiguiente);
		//Para que est funcione hace falta crear un tipo de dato llamado enum que tiene que ir a nivel de clase
		//para que no de error en la ejecución
	}

}
