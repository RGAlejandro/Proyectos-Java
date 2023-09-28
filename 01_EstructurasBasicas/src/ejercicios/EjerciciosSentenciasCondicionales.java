package ejercicios;

import java.util.Scanner;

public class EjerciciosSentenciasCondicionales {

	public EjerciciosSentenciasCondicionales() {
		// TODO Auto-generated constructor stub
		/*1.- Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese
		día.*/
		System.out.println("********DIA Y ASIGNATURA*********");
		System.out.println("Digame un dia de la semana: ");
		Scanner leer=new Scanner(System.in);
		String dia= leer.next();
		String asignatura = null;
		switch (dia) {
		case "lunes":
		asignatura="Entorno de desarrollo";
		break;
		case "martes":
			asignatura="Sistemas informaticos";
			break;
		case "miercoles":
			asignatura="Programacion";
			break;
		case "jueves":
			asignatura="Base de datos";
			break;
		case "viernes":
			asignatura="Entorno de desarrollo";
			break;
			default:
				System.out.println("Pon un dia de la semana que sea de lunes a viernes y en minuscula");
		//end switch
		}
		System.out.println("Los " +dia+ " toca a primera "+asignatura);
		
		/*2.- Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o buenas
		noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5 respectivamente. Sólo se tienen en
		cuenta las horas, los minutos no se deben introducir por teclado.*/
		System.out.println("********BUENOS DIAS,TARDES Y NOCHES*********");
		System.out.println("¿Que hora es?");
		
		Scanner tiempo=new Scanner(System.in);
		int hora= tiempo.nextInt();
		if (hora>=6 && hora<=12) {
			System.out.println("Buenos dias");
		}
		else if (hora>=13 && hora<=20){
			System.out.println("Buenas tardes");
		}else if (hora>=21 && hora <=5){
			System.out.println("Buenas noches");
		}
		
		/*3.- Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias
		(40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.*/
		System.out.println("********CALCULAR SALARIO SEMANAL*********");
		System.out.println("Ponga el numero de horas que has trabado en esta semana y te dire cuanto has cobrado");
		Scanner horas=new Scanner(System.in);
		int salarioSemanal;
		int numHoras=horas.nextInt();
		int dineroHora=12;
		int dineroHoraExtra=16;
		if(numHoras<=40){
			salarioSemanal=numHoras*dineroHora;
		}else {
			salarioSemanal=((40*dineroHora) + (numHoras-40)*dineroHoraExtra);
		}
		System.out.println("Has ganado en esta semana un total de "+salarioSemanal+" en esta semana");
		
		/*4-Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.*/
		System.out.println("********EL HOROSCOPO POR MES Y DIA*********");
		Scanner preguntame=new Scanner(System.in);
		System.out.println("Te contaré tu horoscopo pero primero...");
		System.out.println("¿Cual es tu MES de nacimiento?");
		
		String fechaMes=preguntame.next();
		String zodiaco=null;
		System.out.println("¿Cual es tu DIA de nacimiento?");
		int diaMes=preguntame.nextInt();
		
		switch (fechaMes) {
		case "enero":
		if (diaMes >=1 && diaMes<=19){
			System.out.println("Tu signo del zodiaco es Capricornio");
			zodiaco="Capricornio";
		}else if (diaMes >=20 && diaMes<=31) {
			System.out.println("Tu signo del zodiaco es Acuario");
			zodiaco="Acuario";
		}else {
			System.out.println("Escribe un numero del mes valido");
		}
		break;
		
		case "febrero":
		if (diaMes >=1 && diaMes<=18){
			System.out.println("Tu signo del zodiaco es Acuario");
			zodiaco="Acuario";
		}else if (diaMes >=19 && diaMes<=31) {
			System.out.println("Tu signo del zodiaco es Piscis");
			zodiaco="Piscis";
		}else {
			System.out.println("Escribe un numero del mes valido");
		}
		break;
		
		case "marzo":
		if (diaMes >=1 && diaMes<=20){
			System.out.println("Tu signo del zodiaco es Piscis");
			zodiaco="Piscis";
		}else if (diaMes >=21 && diaMes<=31) {
			System.out.println("Tu signo del zodiaco es Aries");
			zodiaco="Aries";
		}else {
			System.out.println("Escribe un numero del mes valido");
		}
		break;
		
		case "abril":
		if (diaMes >=1 && diaMes<=19){
			System.out.println("Tu signo del zodiaco es Aries");
			zodiaco="Aries";
		}else if (diaMes >=20 && diaMes<=31) {
			System.out.println("Tu signo del zodiaco es Tauro");
			zodiaco="Tauro";
		}else {
			System.out.println("Escribe un numero del mes valido");
		}
		break;
		
		case "mayo":
		if (diaMes >=1 && diaMes<=21){
			System.out.println("Tu signo del zodiaco es Tauro");
			zodiaco="Tauro";
		}else if (diaMes >=22 && diaMes<=31) {
			System.out.println("Tu signo del zodiaco es Geminis");
			zodiaco="Geminis";
		}else {
			System.out.println("Escribe un numero del mes valido");
		}
		break;
		
		case "junio":
		if (diaMes >=1 && diaMes<=20){
			System.out.println("Tu signo del zodiaco es Geminis");
			zodiaco="Geminis";
		}else if (diaMes >=21 && diaMes<=31) {
			System.out.println("Tu signo del zodiaco es Cancer");
			zodiaco="Cancer";
		}else {
			System.out.println("Escribe un numero del mes valido");
		}
		break;
		
		case "julio":
		if (diaMes >=1 && diaMes<=22){
			System.out.println("Tu signo del zodiaco es Cancer");
			zodiaco="Cancer";
		}else if (diaMes >=23 && diaMes<=31) {
			System.out.println("Tu signo del zodiaco es Leo");
			zodiaco="Leo";
		}else {
			System.out.println("Escribe un numero del mes valido");
		}
		break;
		
		case "agosto":
		if (diaMes >=1 && diaMes<=22){
			System.out.println("Tu signo del zodiaco es Leo");
			zodiaco="Leo";
		}else if (diaMes >=23 && diaMes<=31) {
			System.out.println("Tu signo del zodiaco es Virgo");
			zodiaco="Virgo";
		}else {
			System.out.println("Escribe un numero del mes valido");
		}
		break;
		
		case "septiembre":
		if (diaMes >=1 && diaMes<=22){
			System.out.println("Tu signo del zodiaco es Virgo");
			zodiaco="Virgo";
		}else if (diaMes >=23 && diaMes<=31) {
			System.out.println("Tu signo del zodiaco es Libra");
			zodiaco="Libra";
		}else {
			System.out.println("Escribe un numero del mes valido");
		}
		break;
		
		case "octubre":
		if (diaMes >=1 && diaMes<=22){
			System.out.println("Tu signo del zodiaco es Libra");
			zodiaco="Libra";
		}else if (diaMes >=23 && diaMes<=31) {
			System.out.println("Tu signo del zodiaco es Escorpio");
			zodiaco="Escorpio";
		}else {
			System.out.println("Escribe un numero del mes valido");
		}
		break;
		
		case "noviembre":
		if (diaMes >=1 && diaMes<=21){
			System.out.println("Tu signo del zodiaco es Escorpio");
			zodiaco="Escorpio";
		}else if (diaMes >=22 && diaMes<=31) {
			System.out.println("Tu signo del zodiaco es Sagitario");
			zodiaco="Sagitario";
		}else {
			System.out.println("Escribe un numero del mes valido");
		}
		break;
		
		case "diciembre":
		if (diaMes >=1 && diaMes<=21){
			System.out.println("Tu signo del zodiaco es Sagitario");
			zodiaco="Sagitario";
		}else if (diaMes >=22 && diaMes<=31) {
			System.out.println("Tu signo del zodiaco es Capricornio");
			zodiaco="Capricornio";
		}else {
			System.out.println("Escribe un numero del mes valido");
		}
		break;
		//end switch
		}
		
		System.out.println("Hola "+zodiaco+ " tu horoscopo es el siguiente:");	
		//end class
		
		



		/*5-Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan para llegar
		a la medianoche.*/
		System.out.println("********CUANTO QUEDA PARA MEDIA NOCHE*********");
		System.out.println("Escribe primero las horas y haz enter para luego escribir los minutos:");
		Scanner leerHora=new Scanner(System.in);
		int mediaNoche=86400;
		int horaDeterminada=leerHora.nextInt();
		System.out.println("Ahora escribe los minutos");
		int minutos=leerHora.nextInt();
		int resultado;
		int calculoSegundos;
		if (horaDeterminada>=0 && horaDeterminada<=24 && minutos >=0 && minutos<=60){
			calculoSegundos=horaDeterminada*3600+minutos*60;
			resultado=mediaNoche-calculoSegundos;
			System.out.println("En total quedan "+resultado+" segundos para que sea media noche");
		}else {
			System.out.println("El horario que has introducido es incorrecto");
		}
		/*6- Escribe un programa que ordene tres números enteros introducidos por teclado.*/
		
		//variable aux IMPORTANTE usarla en este ejercicio (modificar esta en el cuaderno)
		System.out.println("********PROGRAMA QUE ORDENA NUMEROS*********");
		int aux;
		Scanner leerNum=new Scanner(System.in);
		System.out.println("Escribe el primer numero y pulsa enter");
		int num1=leerNum.nextInt();
		System.out.println("Escribe el segundo numero y pulsa enter");
		int num2=leerNum.nextInt();
		System.out.println("Escribe el ultimo numero y pulsa enter para empezar la ordenación");
		int num3=leerNum.nextInt();
		
		if (num1>num2){
			aux=num1;
			num1=num2;
			num2=aux;
		}
		System.out.println("Orden "+num1+" "+num2+" "+num3);
		if(num2>num3){
			aux=num2;
			num2=num3;
			num3=aux;
		}
		System.out.println("Orden "+num1+" "+num2+" "+num3);
		}
		//end public class
		
		//end public class
		}


