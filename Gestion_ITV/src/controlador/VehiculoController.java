package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

import excepciones.DniException;
import excepciones.MatriculaException;
import modelo.DatosVehiculos;
import modelo.Vehiculo;

public class VehiculoController {
	Queue <DatosVehiculos> colaEntrada=new LinkedList<DatosVehiculos>();
	Queue <DatosVehiculos> colaAtendidos=new LinkedList<DatosVehiculos>();
	
	public VehiculoController() throws IOException, DniException, InterruptedException, MatriculaException {
		
		
		FileReader fr=new FileReader("vehiculosITV.txt");
		BufferedReader br=new BufferedReader(fr);
		String linea=br.readLine();
		String []separador;
		while(linea!=null) {
			separador=linea.split(",");
			Vehiculo vehiculo=new Vehiculo(separador[0], separador[1], separador[2], separador[3]);
			DatosVehiculos datosveh=new DatosVehiculos(vehiculo);
			colaEntrada.add(datosveh);
			vehiculo=null;
			Thread.sleep(1000);
			linea=br.readLine();
		}
	}

	public Queue<DatosVehiculos> getColaEntrada() {
		return colaEntrada;
	}

	public Queue<DatosVehiculos> getColaAtendidos() {
		return colaAtendidos;
	}
	public void NuevoVehiculo(Vehiculo vehiculo) {
		DatosVehiculos datosveh=new DatosVehiculos(vehiculo);
		colaEntrada.add(datosveh);
	}
	public Vehiculo llamarVehiculo() {
		DatosVehiculos datosveh;
		datosveh=colaEntrada.remove();
		datosveh.Atiende();
		colaAtendidos.add(datosveh);
		
		return datosveh.getVehiculo();
		
	}
	public double TiempoEspera() {
		long tiempoEspera=0;
		for(DatosVehiculos e: colaAtendidos) {
			tiempoEspera=e.getTiempoEspera();
			
		}
		return tiempoEspera;
	}
	public void SalvarDatos() throws IOException {
		FileWriter fw=new FileWriter("vehiculosAtendidos.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		LinkedList <DatosVehiculos> colaAtendidos=(LinkedList<DatosVehiculos>) getColaAtendidos();
		String linea;

		for(DatosVehiculos e: colaAtendidos) {
		System.out.println(e.getVehiculo()+" "+e.getTiempoEspera());
		bw.write("Matricula:"+e.getVehiculo().getMatricula()+" Tiempo Espera:"+e.getTiempoEspera()+" segundos");
		bw.newLine();
		
		}
		fw.flush();
		bw.close();
		fw.close();
	}
}
