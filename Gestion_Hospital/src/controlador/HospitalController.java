package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import excepciones.CampoNuloException;
import excepciones.CodigoBarrasException;
import excepciones.DniException;
import excepciones.MedicoOcupadoException;
import interfaces.OrdenaFecha;
import modelo.Paciente;


public class HospitalController {
	private List<Paciente> hospital = new ArrayList<Paciente>();
	
	public HospitalController() throws IOException, DniException, CampoNuloException, CodigoBarrasException {
		// TODO Auto-generated constructor stub
		FileReader fr=new FileReader("pacientes.txt");
		BufferedReader br=new BufferedReader(fr);
		String linea=br.readLine();
		String [] separador;
		while(linea!=null) {
			separador=linea.split(",");
			String nombre=separador[0], apellidos=separador[1], dni=separador[2], medico=separador[3], nombreMedicamento=separador[4], codBarrasMedicamento=separador[5],
					 fechaEntrada=separador[6], fechaAlta=separador[7],precioConsulta=separador[8],atendido=separador[9];
			Paciente pacienteNuevo=new Paciente(nombre, apellidos, dni, medico, nombreMedicamento, codBarrasMedicamento, fechaEntrada, fechaAlta, precioConsulta, atendido);
			hospital.add(pacienteNuevo);
			linea=br.readLine();
		}
	}

	public List<Paciente> getHospital() {
		return hospital;
	}

	public void setHospital(List<Paciente> hospital) {
		this.hospital = hospital;
	}
	public Paciente buscarPaciente(String dni) {
		Paciente personaBuscada=null;
		for (Paciente p : hospital) {
			if(dni.equals(p.getDni())) {
				personaBuscada=p;
			}
		}
		return personaBuscada;
		
	}
	public boolean agregarPaciente(String nombre, String apellidos, String dni) throws CampoNuloException, DniException, CodigoBarrasException {
		boolean agregado=false;
		Paciente PacienteCreado=new Paciente(nombre, apellidos, dni);
		if(!hospital.contains(PacienteCreado)) {
			hospital.add(PacienteCreado);
			agregado=true;
		}
		return agregado;
		
	}
	public Paciente asignarMedico(String dni, String medico) throws CampoNuloException, MedicoOcupadoException {
		Paciente paciente=buscarPaciente(dni);
		int cont=0;
		if(paciente!=null) {
			for (Paciente p : hospital) {
				if(medico.equals(p.getMedico())&&p.isAtendido()==false) {
					cont++;
				}
			}
			if(cont<2) {
				//if(paciente.getMedico()=="null") {
					paciente.setMedico(medico);	
				//}
			}
			else {
				throw new MedicoOcupadoException(medico);
			}
			
		}
		return paciente;
		
	}
	public boolean darDeAlta(String dni) throws CampoNuloException, CodigoBarrasException {
		boolean dadoAlta=false;
		Paciente pacienteBuscado=buscarPaciente(dni);
		if(pacienteBuscado!=null&&pacienteBuscado.getMedico()!=null&&pacienteBuscado.isAtendido()==false) {
			pacienteBuscado.setAtendido("true");
			LocalDate fechaAtendido=LocalDate.now().plusDays(2);
			String fechaAtender=String.valueOf(fechaAtendido);
			pacienteBuscado.setFechaAlta(fechaAtender);
			pacienteBuscado.setNombreMedicamento("Paracetamol");
			pacienteBuscado.setCodBarrasMedicamento("2066780824029");
			pacienteBuscado.setPrecioConsulta("20");
			dadoAlta=true;
		}
		return dadoAlta;
		
	}
	public List <Paciente> filtrarMedico(String medico){
		List <Paciente> medicos=new ArrayList<Paciente>();
		for (Paciente p : hospital) {
			if(medico.equals(p.getMedico())) {
				medicos.add(p);
			}
		}
		if(medicos.size()==0) {
			return medicos;
		}
		else {
			Collections.sort(medicos);
		}
		return medicos;
		
	}
	public List <Paciente> fechaAtender(){
		List <Paciente> fechaPendientes=new ArrayList<Paciente>();
		for (Paciente p : hospital) {
			if(p.getFechaAlta()==null) {
				fechaPendientes.add(p);
			}
		}
		if(fechaPendientes.size()==0) {
			return fechaPendientes;
		}
		else {
			Collections.sort(fechaPendientes, new OrdenaFecha());
		}
		
		return fechaPendientes;
		
	}
	public boolean eliminarPaciente(String dni) {
		Scanner leer=new Scanner(System.in);
		String preguntar="";
		boolean eliminado=false;
		Paciente PersonaBuscada=buscarPaciente(dni);
		if(PersonaBuscada!=null) {
			System.out.println("¿Quieres eliminar al paciente? si/no");
			preguntar=leer.next();
			if(preguntar.equals("si")) {
				hospital.remove(PersonaBuscada);
				eliminado=true;
			}
		}
		return eliminado;
		
	}
	public boolean salvarDatos() throws IOException {
		boolean guardado=false;
		FileWriter fw=new FileWriter("pacientes.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		for (Paciente p : hospital) {
			bw.write(p.toString());
			bw.newLine();
		}
		fw.flush();
		bw.close();
		fw.close();
		return guardado;
		
	}

}
