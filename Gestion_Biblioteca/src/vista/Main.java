package vista;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import controlador.BibliotecaController;
import excepciones.CampoObligatorioException;
import excepciones.IsbnException;
import modelo.Libro;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String isbn="978-84-415-2682-2",titulo="Ejemplo Deportes",autor="Alejandro Gemes Rubio",editorial="Tomasito",
		fechaDevolucion="null",precio="4.0",prestado="false";
		Libro libroEjemplo=null;
		try {
			libroEjemplo=new Libro(isbn, titulo, autor, editorial, fechaDevolucion, precio, prestado);
		} catch (IsbnException | CampoObligatorioException | DateTimeException | NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		BibliotecaController controler=null; 
		try {
			controler=new  BibliotecaController();
			
		} catch (IOException | DateTimeException | IsbnException | NumberFormatException | CampoObligatorioException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		Scanner leer=new Scanner(System.in);
		boolean seSale=false;
		String opcion="";
		System.out.println("SELECIONE UNA DE LAS SIGUIENTES OPCIONES:");
		do {
			System.out.println("0-Ver Biblioteca");//Esto es para los experimentos
			System.out.println("1-Agregar Libro");
			System.out.println("2-Buscar Libro");
			System.out.println("3-Prestar Libro");
			System.out.println("4-Devolver Libro");
			System.out.println("5-Eliminar Libro");
			System.out.println("6-Filtrar Autor");
			System.out.println("7-Pendientes Entregas");
			System.out.println("8-Salvar los Datos");


			opcion=leer.next();
			System.out.println("");
			switch(opcion){
			case "0":
				ArrayList <Libro> biblioteca= (ArrayList <Libro>)controler.getBiblioteca();
				mostrar(biblioteca,"");
				System.out.println("");

				break;
			case "1":
				try {
					Libro libroNuevo=new Libro(isbn, titulo, autor, editorial, precio);
					boolean seAgrega=controler.agregarLibro(isbn, titulo, autor, editorial, precio);
					if(seAgrega) {
						ArrayList <Libro> listaBiblio= (ArrayList <Libro>)controler.getBiblioteca();
						
						listaBiblio.add(libroNuevo);
						mostrar(listaBiblio,isbn);
					}
					else {
						System.err.println("Lo siento este libro ya esta en la biblioteca");
					}
				} catch (IsbnException | CampoObligatorioException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("");
				break;
			case "2":
				controler.buscarLibro("978-84-322-3637-2"); //DEBERIA DE SALIR EL DEL QUIJOTE
				
				break;
			case "3":
				try {
					controler.prestarLibro("978-84-18949-13-5", "2023-03-12");
					ArrayList <Libro> listaBiblio= (ArrayList <Libro>)controler.getBiblioteca();
					mostrar(listaBiblio,"978-84-18949-13-5");
				} catch (DateTimeParseException | CampoObligatorioException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("");

				break;
			case "4":
				try {
					boolean seDevuelve=controler.devolverLibro("978-84-18949-13-5");
					if(seDevuelve) {
						System.out.println("Tu libro se ha devuelto ahora veras tu libro de color rojo");
						ArrayList <Libro> listaBiblio= (ArrayList <Libro>)controler.getBiblioteca();
						mostrar(listaBiblio,"978-84-18949-13-5");
					}
					else{
						System.err.println("Lo siento este libro ya estaba devuelto asi que no veras nada nuevo");
					}
				} catch (DateTimeParseException | CampoObligatorioException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("");

				break;
			case "5":
				boolean seElimina=controler.eliminarLibro(isbn);
				if(seElimina) {
					System.out.println("Para que veas que no te engaño acabo de eliminar tu libro, si sientas buscarlo no lo vas a encontrar");
					ArrayList <Libro> listaBiblio= (ArrayList <Libro>)controler.getBiblioteca();
					mostrar(listaBiblio,"");
				}
				else {
					System.out.println("Lo siento, pero el libro no se ha eliminado ya que el ISBN no identifica a ningun libro");
				}
				System.out.println("");
				break;
			case "6":
				
				System.out.println("");
				break;
			case "7":
				
				System.out.println("");
				break;
			case "8":
				try {
					boolean datosEstanSalvados=controler.salvarDatos();
					if(datosEstanSalvados) {
						System.out.println("BIEN... TUS DATOS HAN SIDO SOBREESCRIBIDOS :D");
						System.out.println("El programa ya ha acabado...");
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				seSale=true;
				break;
			default:
				System.out.println("Introduce un numero del 1 al 8");
			}
			
		}while(!seSale);
		
	}

	private static void mostrar(ArrayList<Libro> listaBiblio, String isbn) {
		for(Libro e: listaBiblio) {
			if(isbn.equals(e.getIsbn())) {
				System.err.println(e);
			}
			else {
				System.out.println(e);
			}
		}
		// TODO Auto-generated method stub
		
	}

}
