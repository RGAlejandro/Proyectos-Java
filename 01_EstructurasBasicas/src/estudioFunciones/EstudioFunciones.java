package estudioFunciones;

import java.util.Scanner;

public class EstudioFunciones {

	public EstudioFunciones() {
		// TODO Auto-generated constructor stub
	Scanner leer=new Scanner(System.in);	
	String nombre="Alejandro";
	saludo();
	saludo2(nombre);
	int x=7;
	double y=3;
	double resultado=calcula(x,y);
	System.out.println("El resultado de la division es "+resultado);
	System.out.println("La x principal vale "+x);
	int n=leer.nextInt();
	if(esPrimo(n)) {
	System.out.println("el numero "+n+ " ES PRIMO");	
	}//end if
	else {
	System.out.println("el numero "+n+ " NO ES PRIMO");	
	}
	}
	private boolean esPrimo(int numeroPrimo) {
		// TODO Auto-generated method stub
	boolean primo=true;	
	for (int i=2;i<numeroPrimo;i++) {
		if ((numeroPrimo/i)==0) {
		return primo=false;	
		}
	}
		return primo;
	}
	private double calcula(int x, double y) {
		// TODO Auto-generated method stub
		double div=x/y;
		x=10;
		System.out.println("la x en el metodo "+x);
		return div;
	}
	private void saludo2(String nom) {
		// TODO Auto-generated method stub
	System.out.println("Hola "+nom+" bienvenido a la clase");	
	}
//end class

	private void saludo() {
		// TODO Auto-generated method stub
	System.out.println("Hola bienvenido a programacion");	
	}
}
