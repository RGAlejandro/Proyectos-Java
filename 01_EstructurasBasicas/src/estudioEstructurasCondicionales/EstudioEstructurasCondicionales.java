package estudioEstructurasCondicionales;

import java.util.Scanner;

public class EstudioEstructurasCondicionales {

	public EstudioEstructurasCondicionales() {
		// TODO Auto-generated constructor stub
		System.out.println("Estudio Estructuras Condicionales");
		
		//$$$$$$$$$$$$$$$$$$ Estudio del condicional If $$$$$$$$$$$$$$$$$$$$$$$
		int edad=16;
		boolean EsBisiesto=true;
		if (EsBisiesto) {
			System.out.println("El año SI es bisiesto");	
		}	else {
			System.out.println("El año NO es bisiesto");
		}
		if (edad>=18) {
			System.out.println("MAYOR DE EDAD");
			
		}	else {
			System.out.println("MENOR DE EDAD");
		}
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("¿Cual es la capital de España? ");
		String respuesta =leer.next();
		
		if (respuesta.equals("Madrid")) {
			System.out.println("¡La respuesta es correcta, eres un buen español!");
			
		}	else {
			System.out.println("Vaya lo siento pero vas a tener que estudiar un poco");
		}
		
		System.out.println("Por favor introduce un numero entero: ");
		int x = leer.nextInt();
		
		if (x < 0) {
			System.out.println("El numero introducido es negativo");
		}	else {
			System.out.println("El numero introducido es positivo");
		}
		
		//$$$$$$$$$$$$$$$$$$$$$$$$ If else If... $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		
		/*int edadPedro=15, edadLuis=17;
		boolean esMayordeEdad=true;
		if (edadPedro>=18 && edadLuis>=18) {
			System.out.println("los dos son mayores de edad y pueden votar");
		}else if (edadPedro<18 && edadLuis>=18) {
			System.out.println("Luis puede votar pero Pedro no porque es menor de edad");
		}
		else if (edadPedro<18 && edadLuis<18){
			System.out.println("Los dos son menores y no pueden votar");
		}
		else {
			System.out.println("Ninguna de las tres");
		}
		*/
		
		//$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Estudio switch $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		
		System.out.println("Por favor introduzca un numero de mes: ");
		
		int mes = leer.nextInt();
		
			String nombreDelMes;
			
			switch (mes) {
			case 1:
				nombreDelMes = "enero";
				break;
			case 2:
				nombreDelMes = "febrero";
				break;
			case 3:
				nombreDelMes = "marzo";
				break;
			case 4:
				nombreDelMes = "abril";
				break;
			case 5:
				nombreDelMes = "mayo";
				break;
			case 6:
				nombreDelMes = "junio";
				break;
			case 7:
				nombreDelMes = "julio";
				break;
			case 8:
				nombreDelMes = "agosto";
				break;
			case 9:
				nombreDelMes = "septiembre";
				break;
			case 10:
				nombreDelMes = "octubre";
				break;
			case 11:
				nombreDelMes = "noviembre";
				break;
			case 12:
				nombreDelMes = "diciembre";
				break;
				default:
					nombreDelMes = "no existe ese mes";
			}
			
			System.out.println("Mes" +mes+": " +nombreDelMes);
			
			String pagina="registro";
			switch (pagina) {
			case "Inicio" :
				System.out.println("Pagina de inicio");
				break;
			case "Registro" :
				System.out.println("Pagina de registro");
				break;
			case "Salir" :
				System.out.println("Cerrar sesion");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + pagina);
			}
			
			System.out.println("CALCULO DE ÁREAS");
			System.out.println("-----------------");
			System.out.println("1. Cuadrado");
			System.out.println("2. Rectangulo");
			System.out.println("3. Triangulo");
			System.out.println("Elige una opcion del (1-3): ");
		
	//end class	
	}

	private void nextInt() {
		// TODO Auto-generated method stub
		
	}

	private void If(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
