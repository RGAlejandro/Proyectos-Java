package excepcionesVideo3_1;

import java.util.Scanner;

public class ExcepcionesVideo {

	public ExcepcionesVideo() throws ArithmeticException {
		// TODO Auto-generated constructor stub
	/*System.out.println("MANEJO DE EXCEPCIONES...");
	//int num1=Integer.parseInt("12m");
	try{
		String numero="1234a"; //Excepcion por pasar texto a numero y haya texto (NumberFormatException)
		int num=Integer.parseInt(numero);
		System.out.println("Numero = "+numero);	
		int div=num/0; //Excepcion que ocurre cuando intentas dividir un numero entre 0(ArithmeticException)
		
		
	}catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("Se ha producido una division por cero");
	}
	catch (NumberFormatException e) {
		// TODO: handle exception
		System.out.println("Se ha producido un error ya que el numero no es correcto");
	}
	System.out.println("El programa continua");*/
	System.out.println("MANEJO DE EXCEPCIONES...");
	Scanner leer=new Scanner (System.in);
	boolean esIncorrecto=true;
	System.out.println("Introduzca un numero");
	int num=0;
	 do {
		 String numero=leer.next();
		 try {
		 num=Integer.parseInt(numero);
		 esIncorrecto=false;
		 }catch (NumberFormatException e) {
			// TODO: handle exception
			System.err.println("Introduzca solo numeros"); 
		 }
			 
		 
	 }while(esIncorrecto);
	System.out.println("Has introducido el numero correctamente");
	
	operar(num);
	}

	private void operar(int num) {
		// TODO Auto-generated method stub
		dividir(num);
	}

	private void dividir(int num) {
		// TODO Auto-generated method stub
		int div=num/0;
	}

}
