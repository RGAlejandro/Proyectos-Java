package vista;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

import controlador.HospitalController;
import excepciones.CampoNuloException;
import excepciones.CodigoBarrasException;
import excepciones.DniException;
import excepciones.MedicoOcupadoException;
import modelo.Paciente;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws CampoNuloException, CodigoBarrasException {
		// TODO Auto-generated method stub
		String nombre="Alejandro", apellidos="Gemes Rubio", dni="26905231S", medico="null", nombreMedicamento="Paracetamol", codBarrasMedicamento="2066780824029",
		fechaEntrada="2023-03-15", fechaAlta="null",
		precioConsulta="null",
		atendido="false";
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("INSTANCIAR EL OBJETO");
		Paciente pacientePrueba=null;
		try {
			pacientePrueba=new Paciente(nombre, apellidos, dni, medico, nombreMedicamento, codBarrasMedicamento, fechaEntrada, fechaAlta, precioConsulta, atendido);
			System.out.println(pacientePrueba);
		} catch (DniException | CampoNuloException | CodigoBarrasException | DateTimeParseException | NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("LEER FICHERO");
		HospitalController controler = null;
		try {
			controler=new HospitalController();
			mostrar(controler.getHospital());
		} catch (IOException | DniException | CampoNuloException | CodigoBarrasException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("BUSCAR PACIENTE");
		Paciente personaBuscada=controler.buscarPaciente("63443507P");
		if(personaBuscada!=null) {
			System.out.println("Hemos encontrado a tu paciente, estos son sus datos");
			System.out.println(personaBuscada);
		}
		else {
			System.out.println("Lo siento pero no hemos encontrado a tu paciente");
		}
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("AGREGAR PACIENTE");
		
		try {
			boolean agregado=controler.agregarPaciente(nombre,apellidos,dni);
			if(agregado) {
				System.out.println("Se ha añadido el paciente");
				mostrar(controler.getHospital());
			}
			else {
				System.out.println("Lo siento pero no hemos podido agregar a tu paciente");
			}
			
		} catch (CampoNuloException | DniException | CodigoBarrasException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("ASIGNAR MEDICO");
		try {
			Paciente pacienteBuscaMedico=controler.asignarMedico(dni,"Pepe Caro");
			if(pacienteBuscaMedico!=null) {
				System.out.println("Medico asignado al paciente");
			}
		} catch (CampoNuloException | MedicoOcupadoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("DAR ALTA A PACIENTE");
		boolean dadoAlta=controler.darDeAlta(dni);
		if(dadoAlta) {
			System.out.println("El paciente ha sido dado de alta");
			mostrar(controler.getHospital());
		}
		else {
			System.out.println("El paciente no ha sido dado de alta");
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("BUSCAR/FILTRAR MEDICO");
		List <Paciente> medicos=controler.filtrarMedico("Pepe Caro");
		if(medicos!=null) {
			mostrar(medicos);
		}
		else {
			System.out.println("No se ha encontrado ningun medico");
		}
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("PENDIENTES ATENDER");
		List <Paciente> fechas=controler.fechaAtender();
		if(fechas!=null) {
			mostrar(fechas);
		}
		else {
			System.out.println("No se ha podido encontrar ningun paciente");
		}
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("ELIMINAR PACIENTE");
		boolean eliminado=controler.eliminarPaciente(dni);
		if(eliminado) {
			System.out.println("Tu paciente ha sido eliminado");
			mostrar(controler.getHospital());
		}
		else {
			System.out.println("Lo siento pero no he podido eliminar nada");
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("SALVAR DATOS");
		try {
			boolean guardado=controler.salvarDatos();
			if(guardado) {
				System.out.println("SE HA GUARDADO EL FICHERO");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		
		
	}

	private static void mostrar(List<Paciente> hospital) {
		// TODO Auto-generated method stub
		for (Paciente p : hospital) {
			System.out.println(p);
		}
		
	}

}
