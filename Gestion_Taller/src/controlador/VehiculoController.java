package controlador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import excepciones.CampoNuloException;
import excepciones.DniException;
import excepciones.MatriculaException;
import modelo.Vehiculo;

public class VehiculoController {
	List<Vehiculo> taller=new ArrayList<Vehiculo>();
	public VehiculoController() throws IOException, DniException, CampoNuloException, MatriculaException {
		// TODO Auto-generated constructor stub
		FileReader fr=new FileReader("coches.txt");
		BufferedReader br=new BufferedReader(fr);
		String linea=br.readLine();
		String separador[];
		while(linea!=null) {
			separador=linea.split(",");
			String nombre=separador[0],matricula=separador[1],dni=separador[2],fechaEntrada=separador[3],fechaReparacion=separador[4],descripcion=separador[5],hora=separador[6],reparado=separador[7],mecanico=separador[8];
			Vehiculo vehi=new Vehiculo(nombre, matricula, dni, fechaEntrada, fechaReparacion, descripcion, hora, reparado, mecanico);
			taller.add(vehi);
			linea=br.readLine();
		}
		
	}
	public boolean buscarVehiculo(String matricula) {
		boolean existe=false;
		for(Vehiculo e: taller) {
			if(matricula.equals(e.getMatricula())) {
				existe=true;
			}
		}
		return existe;
		
	}
	public Vehiculo agregarVehiculo(Vehiculo vehiculoNuevo) {
		Vehiculo vehiculoAgregado=null;
		if(!taller.contains(vehiculoNuevo)) {
			taller.add(vehiculoAgregado);
			vehiculoAgregado=vehiculoNuevo;
		}
		return vehiculoAgregado;
	}
	public List<Vehiculo> getTaller() {
		return taller;
	}
	public void setTaller(List<Vehiculo> taller) {
		this.taller = taller;
	}

}
