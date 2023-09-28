package vista;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.format.DateTimeParseException;
import java.util.List;

import controlador.VehiculoController;
import excepciones.CampoNuloException;
import excepciones.DniException;
import excepciones.MatriculaException;
import modelo.Vehiculo;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("INSTANCIAR EL OBJETO DE PRUEBA");
		String nombre="Alejandro",matricula="1234ABC",dni="26905231-S",fechaEntrada="null",fechaReparacion="null",descripcion="COMO? FURBO?",hora="null",reparado="false",mecanico="Pepita";
		Vehiculo vehiculoNuevo=null;
		System.out.println("INSTANCIAR OBJETO DE PRUEBAS");
		try {
			vehiculoNuevo=new Vehiculo(nombre,matricula,dni, fechaEntrada, fechaReparacion, descripcion, hora, reparado, mecanico);
		} catch (DniException | CampoNuloException | DateTimeParseException | MatriculaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("LEER FICHERO");
		VehiculoController controller=null;
		try {
			controller=new VehiculoController();
			List<Vehiculo> lista=controller.getTaller(); 
			mostrar(lista);
		} catch (IOException | DniException | CampoNuloException | MatriculaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		boolean existe=controller.buscarVehiculo("0245NNC");
		if(existe) {
			System.out.println("Bien, hemos encontrado tu vehiculo, te lo vamos a mostrar");
			List<Vehiculo> lista=controller.getTaller(); 
			mostrar(lista,"0245NNC");
		}
		//controller.agregarVehiculo(vehiculoNuevo);
	}

	private static void mostrar(List<Vehiculo> lista, String string) {
		// TODO Auto-generated method stub
		for(Vehiculo e: lista) {
			
		}
	}

	private static void mostrar(List<Vehiculo> lista) {
		// TODO Auto-generated method stub
		for(Vehiculo e: lista) {
			System.out.println(e);
		}
	}

}
