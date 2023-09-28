package vista;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import EjerciciosInternet.Cuenta;
import excepciones.SaldoInsuficienteException;
import herencia.Consultor;
import herencia.Empleado;
import herencia.Trabajador;
import modelo.Artista;
import modelo.Bici;
import modelo.Bicicleta;
import modelo.Circulo;
import modelo.Coche;
import modelo.Libro;
import modelo.Persona;
import modelo.Persona1;
import modelo.Persona2;
import modelo.Punto;
import modelo.Rectangulo;
import modelo.Revista;
import modelo.TarjetaRegalo;
import modelo.Vehiculo;
import paquetec.C;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClasePersona();
		//Constructores();
		//Propiedades_y_Metodos();
		//Argumentos();
		//imprimeMensajes();
		//PasoValorReferencia();
		//Modificadores();
		//MetodosEstaticos();
		//Sobrecarga();
		//Internet();
		//Polimorfismo();
		//TarjetaCorteIngles();
		//Vehiculos();
		//Biblioteca();
		//Listas1();
		//Listas2();
		//EstudioFechas();
	}

	private static void EstudioFechas() {
		// TODO Auto-generated method stub
		estudioPOO.EstudioFechas fechas=new estudioPOO.EstudioFechas();
	}

	private static void Listas2() {
		// TODO Auto-generated method stub
		Set<Persona> listaHasSet=new HashSet<Persona>();
		Persona p1=new Persona("Pepe", "Garcia", "123");
		Persona p2=new Persona("Maria", "Perez", "1234");
		Persona p3=new Persona("Luis", "Alvarez", "1235");
		Persona p4=new Persona("Ana", "Rodriguez", "1236");
		System.out.println(listaHasSet.add(p1));
		System.out.println(listaHasSet.add(p2));
		System.out.println(listaHasSet.add(p3));
		
		System.out.println("===================Lista HasSet=======================");
		for(Persona person: listaHasSet) {
			System.out.println(person);
		}
		
		System.out.println("===================Lista Sorted=======================");
		SortedSet<Persona> listaSorted=new TreeSet<Persona>();
		listaSorted.add(p1);listaSorted.add(p2);listaSorted.add(p3);listaSorted.add(p4);
		for(Persona person: listaSorted) {
			System.out.println(person);
		}
		System.out.println("===================Map=======================");

		Map <Integer,Persona> mp =new HashMap<Integer,Persona>();
		mp.put(4, p4);mp.put(2, p2);mp.put(1, p1);mp.put(3, p3);
		System.out.println(mp.toString());
		
		System.out.println("Personas en el mapa: \n"+mp.toString().replaceAll(",", "\n"));
		
		
		System.out.println("===================TreeMap=======================");
		p1.getAgendate1().put("Trabajo", "954825748");
		p1.getAgendate1().put("Oficina", "958746362");
		p1.getAgendate1().put("Móvil", "666555444");
		p1.getAgendate1().put("Casa", "952473456");

		System.err.println("Personas en el mapa: \n"+p1);
	
	}

	private static void Listas1() {
		// TODO Auto-generated method stub
		Persona p1=new Persona("Pepe","Garcia");
		Persona p2=new Persona("Maria","Perez");
		Bicicleta b1=new Bicicleta(11, 29, 0);
		Collection coleccion=new ArrayList(); //Utiliza la clase Collection donde alli podremos usar el constructor del array list
		coleccion.add(p1);
		coleccion.add(p2);
		coleccion.add(p1);
		coleccion.add(b1);
		for(Object elem: coleccion) {
			System.out.println(elem);
		}
		//LISTAS
		List<Persona> lista=null;
		lista=new ArrayList<Persona>();
		lista.add(p1);lista.add(p2);lista.add(p2);
		for( Persona person:lista) {
			System.out.println(person);
		}
		System.out.println("El primer elemento es "+lista.get(0));
		Persona p=lista.remove(0);
		System.out.println("Hemos borrado "+p);
		for(Persona person:lista) {
			System.out.println(person);
		}
		lista.remove(p2);
		for(Persona person:lista) {
			System.out.println("..."+person);
		}
		lista.add(p1);lista.add (new Persona("Alejandro","Gemes"));
		System.out.println("--------------------------------------------------------------------------");
		for(Persona person:lista) {
			System.out.println("..."+person);
		}
		
		System.err.println(lista.get(2));
		System.out.println("----------------------ITERATOR--------------------------------");
		java.util.Iterator<Persona> iter=lista.iterator();
		while(iter.hasNext()) {
			//Persona p3=iter.next();
			System.out.println( iter.next().toString());
		}
		System.out.println("----------------------FOR--------------------------------");
		for(int x=0;x<lista.size();x++) {
			p=lista.get(x);
			System.out.println(p);
		}
	}

	private static void Biblioteca() {
		// TODO Auto-generated method stub
		Libro libro1=new Libro("123456","La Ruta Prohibida",2007);
		Libro libro2=new Libro("112233","Los Otros",2016);
		Libro libro3=new Libro("456789","La Rosa Del Mundo",1995);
		Revista revista1=new Revista("444555","Año Cero",2019,344);
		Revista revista2=new Revista("002244","National Geographic",2003,255);
		System.out.println(libro1);
		System.out.println(libro2);
		System.out.println(libro3);
		System.out.println(revista1);
		System.out.println(revista2);
		libro2.presta();
		if(libro2.estaPrestado()) {
			System.out.println("Este libro esta prestado");
		}
		libro2.presta();
		libro2.devuelve();
		if(libro2.estaPrestado()) {
			System.out.println("Este libro esta prestado");
		}
	}

	private static void Vehiculos() {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		boolean noSalgo=true;
		int kilometros=0;
		Bici bicicleta=new Bici(0);
		Coche coche=new Coche(0);
		String opcion="";
		do {
			noSalgo=true;
			System.out.println("1. Anda con la bicicleta");
	        System.out.println("2. Haz el caballito con la bicicleta");
	        System.out.println("3. Anda con el coche");
	        System.out.println("4. Quema rueda con el coche");
	        System.out.println("5. Ver kilometraje de la bicicleta");
	        System.out.println("6. Ver kilometraje del coche");
	        System.out.println("7. Ver kilometraje total");
	        System.out.println("8. Salir");
	        System.out.println("Elige una opción (1-8): ");
	        opcion =leer.next();
	        
	        switch(opcion) {
	        
	        case "1":
                System.out.println("¿Cuántos kilómetros quiere recorrer en bicicleta? ");
	        	kilometros=leer.nextInt();
	        	//bicicleta.setKilometrosBici(kilometros);
	        	bicicleta.anda(kilometros);
	        	break;
	        case "2":
	        	bicicleta.caballito();
	        	break;
	        case "3":
	        	System.out.println("¿Cuántos kilómetros quiere recorrer en coche? ");
	        	kilometros=leer.nextInt();
	        	//coche.setKilometrosCoche(kilometros);
	        	coche.anda(kilometros);
	        	break;
	        case "4":
	        	coche.quemarRueda();
	        	break;
	        case "5":
	        	bicicleta.getKilometrosRecorridos();
	        	break;
	        case "6":
	        	coche.getKilometrosRecorridos();
	        	break;
	        case "7":
	        	Vehiculo.getKilometrosTotales();
	        	break;
	        case "8":
	        	noSalgo=false;
	        	Vehiculo.getVehiculosCreados();
	        	break;
	        default:
	        	System.out.println("Introduce un numero del 1 al 8");
	        	break;
	        }
		}while(noSalgo);
		  
          
	}

	private static void TarjetaCorteIngles() {
		// TODO Auto-generated method stub
		TarjetaRegalo t1 = new TarjetaRegalo(100);
        TarjetaRegalo t2 = new TarjetaRegalo(120);
        System.out.println(t1);
        System.out.println(t2);
       try {
        t1.gasta(45);
        t2.gasta(5);
        t2.gasta(200);
        t1.gasta(3.55);
        }catch (SaldoInsuficienteException e) {        
           
            System.err.println(e.getMessage());
        }
        System.out.println(t1);
        System.out.println(t2);
        TarjetaRegalo t3 = t1.fusionaCon(t2);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
	}

	private static void Polimorfismo() {
		// TODO Auto-generated method stub
		Trabajador trabajador=new Trabajador("Bill Gates", "Presidente", "Redmond", "", "");
		Trabajador empleado=new Empleado(null, null, null, null, null, 0, 0);
		Trabajador consultor=new Consultor(null, null, null, null, null, 0, 0);

	}

	private static void Internet() {
		// TODO Auto-generated method stub
		Cuenta per1=new Cuenta("Alejandro Gemes");
		System.out.println(per1);
		Cuenta per2=new Cuenta("Benito Garcia", 4300);
		System.out.println(per2);
		per2.retirar();
		System.out.println(per2);
		per2.ingresar();
		System.out.println(per2);
		
		//ESTA MAL, YA QUE LE TENGO QUE PEDIR AL USUARIO LO QUE QUIERO INGRESAR Y LO QUE QUIERO RETIRAR
		//PARA QUE TODO ESTE EN EL MAIN Y NO TENGA QUE PEDIR COSAS EN EL SERVIDOR
	}

	private static void Sobrecarga() {
		// TODO Auto-generated method stub
		Artista artista=new Artista();
		
		artista.dibuja("Hola");
		artista.dibuja(7);
		artista.dibuja(3, 8.3f);
		
		Persona2 perso1=new Persona2();
		Persona2 perso2=new Persona2("Yaramind", "Mango");
		Persona2 perso3=new Persona2("Alejandro", "Gemes", 18);
		
		System.out.println(perso1);
		System.out.println(perso2);
		System.out.println(perso3);

	}

	private static void MetodosEstaticos() {
		// TODO Auto-generated method stub
		Bicicleta bici1=new Bicicleta(21, 27, 0);
		Bicicleta bici2=new Bicicleta(18, 24, 0);
		
		System.out.println(bici1);
		System.out.println(bici2);
		
		//System.out.println(bici1.getNumeroBicicletas());
		System.out.println(Bicicleta.getNumeroBicicletas());
	}

	private static void Modificadores() {
		// TODO Auto-generated method stub
		B b=new B();
		System.out.println(b.b);
		System.out.println(b.getB());
		
		C c=new C();
		//System.out.println(c.c);//Si intentamos acceder al atributo da error
		System.out.println(c.getC());
	}

	private static void imprimeMensajes() {
		// TODO Auto-generated method stub
		
	}

	private static void PasoValorReferencia() {
		// TODO Auto-generated method stub
		Circulo circle=new Circulo(2,3);
		System.out.println(circle);
		moveCircle(circle,23,56);
		System.out.println(circle);
	}

	private static void moveCircle(Circulo circle, int i, int j) {
		// TODO Auto-generated method stub
		circle.setX(circle.getX()+i);
		circle.setY(circle.getY()+j);
		
		circle=new Circulo(0,0);
	}

	private static void Argumentos() {
		// TODO Auto-generated method stub
		Punto punto1=new Punto(0, 0);Punto punto2=new Punto(5, 0);
		Punto punto3=new Punto(5, 3);Punto punto4=new Punto(0, 3);
		Punto[]puntos= {punto1,punto2,punto3,punto4};
		Rectangulo rectangulo=new Rectangulo(punto1,punto2,punto3,punto4);
		Rectangulo rectangulo2=new Rectangulo(puntos);
		System.out.println(rectangulo.toString());
		rectangulo=null;
		rectangulo=new Rectangulo();
		rectangulo.setOtraFigura(punto1,punto2,punto3);
		System.out.println(rectangulo.toString());
	}

	private static void Propiedades_y_Metodos() {
		// TODO Auto-generated method stub
		
	}

	private static void Constructores() {
		// TODO Auto-generated method stub
		Persona1 johndoe=new Persona1();
		johndoe.presentacion();
		
		Persona1 manuel=new Persona1("Manuel","Ruiz Gonzalez");
		manuel.presentacion();
		
		Persona1 alejandro=new Persona1("Alejandro","Gemes Rubio",18);
		alejandro.presentacion();
	}

	private static void ClasePersona() {
		// TODO Auto-generated method stub
		
	}

}
