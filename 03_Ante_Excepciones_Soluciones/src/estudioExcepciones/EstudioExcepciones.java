package estudioExcepciones;

import java.util.Scanner;

public class EstudioExcepciones {

	public EstudioExcepciones() {
		// TODO Auto-generated constructor stub
		System.out.println("ESTUDIO EXCEPCIONES");
		Scanner leer=new Scanner(System.in);
		boolean esError=false;
		do {
		esError=false;	
		System.out.println("Introduzca el divisor");
		
		int d=leer.nextInt();
		int div=0;
		try {
			div=4/d;
			int []numeros= {1,2,3,4};
			//System.out.println(numeros[5]);
			System.out.println("El resultado de la division es "+div);
			String num="1234a";
			System.out.println(Integer.parseInt(num));
		}catch (ArithmeticException e) {//La e es el objeto que se  crea al lanzar esa excepcion
				// TODO: handle exception
			System.out.println("Introduzca un divisor distinto de cero");
			//System.out.println(e.getMessage());//get significa que te devuelve algo
			esError=true;
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			esError=true;
		}catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Introduce un numero no pongas letras");
			esError=true;
		}
		
		
		//catch (ArithmeticException |ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		//}
			//System.out.println(div);	
			
			
		}while(esError);
			
		
		
	}

}
