package vista;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Iterator;

import controlador.VehiculoController;
import excepciones.DniException;
import excepciones.MatriculaException;
import modelo.DatosVehiculos;
import modelo.Vehiculo;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//INSTANCIAR VEHICULO
			Vehiculo vehi=new Vehiculo("Alejandro","Gemes Rubio","26905231S","1234ABC");
			
			//LEO EL FICHERO
			VehiculoController controler=new VehiculoController();
			
			controler.NuevoVehiculo(vehi);//METER VEHICULO INSTANCIADO DE ARRIBA
			LinkedList<DatosVehiculos> colaEntrada=(LinkedList<DatosVehiculos>) controler.getColaEntrada() ; //METER EN EL OBJETO LA COLA CON SUS DATOSVEHICULOS
			//MUESTRO LA COLAENTRADA
			for(DatosVehiculos e: colaEntrada) {
				System.out.println(e);
			}
			
			Iterator<DatosVehiculos> data=controler.getColaEntrada().iterator();//INSTANCIO EL ITERATOR Y LE MANDO LA COLA ENTRADA QUE VOY A MODIFICAR
			//LEER DATA MIENTRAS QUE HAYA ALGO
			while(data.hasNext()) {
			vehi=controler.llamarVehiculo();//QUITARLO DE COLA ENTRADA Y METERLO EN COLA ATENDIDOS
			System.out.println("Siguiente "+vehi.getIdentificador());
			}
			//GUARDAR LOS DATOS EN UN FICHERO
			controler.SalvarDatos();
			
		} catch (DniException | IOException | InterruptedException | MatriculaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}