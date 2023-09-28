package estudioExcepciones;

public class EstudioEscepcionesMetodos {

	public EstudioEscepcionesMetodos() {
		// TODO Auto-generated constructor stub
		try {
		int d=metodo1(2);
		int []notas= {1,2,3,4};
		int nota=metodo2(notas,5);
		System.out.println(nota);
		//Tratamiento de excepciones
		
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} 	
	}

	private int metodo2(int[] notas, int i) throws ArrayIndexOutOfBoundsException{
		// TODO Auto-generated method stub
		return metodo3(notas,i);
	}

	private int metodo3(int[] notas, int i) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return notas[i];
	}

	private int metodo1(int i) throws ArithmeticException{
		// TODO Auto-generated method stub
		return 4/i;
	}

}
