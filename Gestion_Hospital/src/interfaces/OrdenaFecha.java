package interfaces;

import java.util.Comparator;

import modelo.Paciente;

public class OrdenaFecha implements Comparator<Paciente>{

	public OrdenaFecha() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Paciente o1, Paciente o2) {
		// TODO Auto-generated method stub
		return o1.getFechaEntrada().compareTo(o2.getFechaEntrada());
	}

}
