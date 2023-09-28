package repeticionesEjercicios;

import java.util.Scanner;

public class EjerciciosRepeteciones {

	public EjerciciosRepeteciones() {
		// TODO Auto-generated constructor stub
		Scanner leer=new Scanner(System.in);
		/*System.out.println("EJERCICIO DE SABER SI UN AÑO ES BISIESTO");
		System.out.println("Introduce un año y te dire si es Bisiesto o no");*/
		/*Introducir un número entero por teclado que se supone que es un año. Indicar si es
		bisiesto o no y por qué motivo (P.e.: “Es bisiesto por ser múltiplo de 4 y no de 100”. P.e.:
		“Es bisiesto por ser múltiplo de 400”. P.e.: “No es bisiesto por ser múltiplo de 100”).*/
		/*int añoIntroducido=leer.nextInt();
		boolean esBisiesto=compruebabisiesto(añoIntroducido);
		if(esBisiesto) {
			System.out.println(añoIntroducido+" es Bisiesto ya que cumple las condicion de ser multiplo de 4 y no de 100"
					+ " o ser multiplo de 400");
		}
		else {
			System.out.println(añoIntroducido+" no es Bisiesto ya que no cumple las condiciones");
		}
		*/
		System.out.println("---------------------DIA DE LA SEMANA EN UN MES-----------------------");
		int numSemana=leer.nextInt();
		for(int numMes=1;numMes<32;numMes++) {
		switch(numSemana) {
		case 0:
			System.out.println(numMes+" de Enero sería Domingo");
			break;
		case 1:
			System.out.println(numMes+" de Enero sería Lunes");
			break;
		case 2:
			System.out.println(numMes+" de Enero sería Martes");
			break;
		case 3:
			System.out.println(numMes+" de Enero sería Miercoles");
			break;
		case 4:
			System.out.println(numMes+" de Enero sería Jueves");
			break;
		case 5:
			System.out.println(numMes+" de Enero sería Viernes");
			break;
		case 6:
			System.out.println(numMes+" de Enero sería Sabado");
			break;
		}
		numSemana++;
		if(numSemana>6) {
			numSemana=0;
		}
		}
	}

	private boolean compruebabisiesto(int añoIntroducido) {
		// TODO Auto-generated method stub
		boolean esMultiplo4=true;
		boolean esMultiplo100=true;
		boolean esMultiplo400=true;
		esMultiplo4=añoIntroducido%4==0;
		esMultiplo100=añoIntroducido%100==0;
		esMultiplo400=añoIntroducido%400==0;
		if(esMultiplo4 && !esMultiplo100)	
			return true;
		else if(esMultiplo400) {
			return true;
		}
		else {
			return false;
		}
	}

}
