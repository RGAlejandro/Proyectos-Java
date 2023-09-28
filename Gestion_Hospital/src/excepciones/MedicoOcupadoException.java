package excepciones;

import controlador.HospitalController;
import modelo.Paciente;

public class MedicoOcupadoException extends Exception{

	public MedicoOcupadoException(String medico) {
		// TODO Auto-generated constructor stub
		super("Medico "+medico+" Ocupado...");
	}

}
