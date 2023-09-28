package Main;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

import ejercicios.CodigoBarras;
import ejercicios.CuadradoMagico;
import ejercicios.Dni;
import ejercicios.JugandoTute;
import ejercicios.JugandoTuteFicheros;
import ejercicios.MaquinaGolosina;
import ejercicios.MensajeOculto;
import ejercicios.TarjetaClaves;
import ejercicios.TarjetaClavesFichero;
import estudioExcepciones.EstudioEscepcionesMetodos;
import estudioExcepciones.EstudioExcepciones;
import estudioFicheros.Ficheros;
import estudioFicheros.Ficheros2;
import estudioFicheros.Ficheros3;
import estudioFlujoDatos.FlujoDatos;
import estudioFlujoDatos.Leer;
import examenRecuperacion1Trimestre.ArraysNotasAlumnos;
import examenRecuperacion1Trimestre.CompruebaISBNNuevo;
import examenRecuperacion1Trimestre.NumeroCurioso;
import examenRecuperacion1Trimestre.RepartirCartas;
import excepciones.CodBarraException;
import excepciones.CodGolosinaException;
import excepciones.DniException;
import excepciones.OpcionesMenuException;
import excepcionesVideo3_1.ExcepcionesVideo;
import modelo.Alumno;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		try {
			Dni dni=new Dni("26905231-S");
			CodigoBarras cod=new CodigoBarras("84 12345 67890 5");
			
		} catch (CodBarraException e) {
			// TODO Auto-generated catch block
			System.out.println("Esto es un error del codigo de barra");
		} catch (DniException e) {
			// TODO Auto-generated catch block
			System.out.println("Tienes un error en el DNI que has introducido");
		}
		*/
		//JugandoTute tute=new JugandoTute();
		//MensajeOculto men=new MensajeOculto();
		//FlujoDatos flujo=new FlujoDatos();
		//TarjetaClaves claves=new TarjetaClaves();
		//Ficheros fich=new Ficheros();
		/*try {
			Ficheros2 ficha=new Ficheros2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*
		System.out.println("Introduzca un dato");
		String dato="";
		try {
			dato=Leer.dato();
			System.out.println("Dato="+dato);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Introduzca un numero entero");
		try {
			int num=Leer.datoInt();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Introduzca el dato numero int correctamente");
		}
		
		System.out.println("Introduzca un numero decimal");
		try {
			double numDeci=Leer.datoDouble();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Introduzca el dato numero double correctamente");
		}
		*/
		//Leer leer=new Leer();
		
		try {
			CuadradoMagico magi=new CuadradoMagico();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		try {
			Ficheros3 ficha=new Ficheros3();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		//MensajeOculto men=new MensajeOculto();
		/*
		try {
			JugandoTuteFicheros ficheros=new JugandoTuteFicheros();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		//ArraysNotasAlumnos notas=new ArraysNotasAlumnos();
		//CompruebaISBNNuevo isbn=new CompruebaISBNNuevo();
		//NumeroCurioso curioso=new NumeroCurioso();
		//RepartirCartas cartas=new RepartirCartas();
		/*
		try {
			MaquinaGolosina golo=new MaquinaGolosina();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (OpcionesMenuException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (CodGolosinaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		*/
		/*
		try {
			TarjetaClavesFichero tarjet=new TarjetaClavesFichero();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		//golosinaEjemplo ejemplo=new golosinaEjemplo();
	}

}
