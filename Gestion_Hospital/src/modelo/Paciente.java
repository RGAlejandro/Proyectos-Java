package modelo;

import java.time.LocalDate;

import excepciones.CampoNuloException;
import excepciones.CodigoBarrasException;
import excepciones.DniException;

public class Paciente implements Comparable<Paciente>{
	private String nombre, apellidos, dni, medico, nombreMedicamento, codBarrasMedicamento;
	private LocalDate fechaEntrada, fechaAlta;
	private double precioConsulta;
	private boolean atendido;
	public Paciente() {
		// TODO Auto-generated constructor stub
	}
	
	public Paciente(String nombre, String apellidos, String dni, String medico, String nombreMedicamento,
			String codBarrasMedicamento, String fechaEntrada, String fechaAlta, String precioConsulta,
			String atendido) throws DniException, CampoNuloException, CodigoBarrasException {
		super();
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setDni(dni);
		this.setMedico(medico);
		this.setNombreMedicamento(nombreMedicamento);
		this.setCodBarrasMedicamento(codBarrasMedicamento);
		this.setFechaEntrada(fechaEntrada);
		this.setFechaAlta(fechaAlta);
		this.setPrecioConsulta(precioConsulta);
		this.setAtendido(atendido);
	}
	
	public Paciente(String nombre, String apellidos, String dni) throws CampoNuloException, DniException, CodigoBarrasException {
		super();
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setDni(dni);
		this.setMedico("null");
		this.setNombreMedicamento("null");
		this.setCodBarrasMedicamento("null");
		LocalDate fechaActual=LocalDate.now();
		String fechaEntrada=String.valueOf(fechaActual);
		this.setFechaEntrada(fechaEntrada);
		this.setFechaAlta("null");
		this.setPrecioConsulta("0");
		this.setAtendido("false");
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) throws CampoNuloException {
		if(nombre.isEmpty()) {
			throw new CampoNuloException();
		}
		else {
			this.nombre = nombre;
		}
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) throws CampoNuloException {
		if(apellidos.isEmpty()) {
			throw new CampoNuloException();
		}
		else {
			this.apellidos = apellidos;
		}
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) throws DniException, CampoNuloException {
		if(dni.isEmpty()) {
			throw new CampoNuloException();
		}
		if(compruebaDni(dni)) {
			this.dni = dni;
		}
		else {
			throw new DniException();
		}
	}
	private boolean compruebaDni(String dni) {
		// TODO Auto-generated method stub
		boolean esCorrecto=true;
		dni=dni.replace("-", "");
		if(dni.length()!=9) {
			esCorrecto=false;
			return esCorrecto;
		}
		int parteNumeros=0;
		try {
			parteNumeros=Integer.parseInt(dni.substring(0, 8));
		}catch (NumberFormatException e) {
			// TODO: handle exception
			esCorrecto=false;
			return esCorrecto;
		}
		char letra=dni.charAt(8);
		if(!Character.isAlphabetic(letra)) {
			esCorrecto=false;
			return esCorrecto;
		}
		String letraPuesta=dni.substring(8);
		
		String [] letras= {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		int resto=parteNumeros%23;
		if(!letraPuesta.equals(letras[resto])) {
			esCorrecto=false;
			return esCorrecto;
		}
		
		return esCorrecto;
	}

	public String getMedico() {
		return medico;
	}
	public void setMedico(String medico) throws CampoNuloException {
		if(medico.isEmpty()) {
			throw new CampoNuloException();
		}
		if(medico.equals("null")) {
			medico=null;
		}
		else {
			this.medico = medico;
		}
	}
	public String getNombreMedicamento() {
		return nombreMedicamento;
	}
	public void setNombreMedicamento(String nombreMedicamento) throws CampoNuloException {
		if(nombreMedicamento.isEmpty()) {
			throw new CampoNuloException();
		}
		if(nombreMedicamento.equals("null")) {
			medico=null;
		}
		else {
			this.nombreMedicamento = nombreMedicamento;
		}
	}
	public String getCodBarrasMedicamento() {
		return codBarrasMedicamento;
	}
	public void setCodBarrasMedicamento(String codBarrasMedicamento) throws CampoNuloException, CodigoBarrasException {
		if(codBarrasMedicamento.isEmpty()) {
			throw new CampoNuloException();
		}
		else if(codBarrasMedicamento.equals("null")) {
			this.codBarrasMedicamento=null;
		}
		
		else {
			if(compruebaCodBarras(codBarrasMedicamento)) {
				this.codBarrasMedicamento = codBarrasMedicamento;
			}
			else {
				throw new CodigoBarrasException();
			}
		}
		
		
		/*
		if(codBarrasMedicamento.isEmpty()) {
			throw new CampoNuloException();
		}
		if(codBarrasMedicamento.equals("null")) {
			this.codBarrasMedicamento=null;
		}
		
		if(!codBarrasMedicamento.equals("null")&&!codBarrasMedicamento.isEmpty()) {
			if(compruebaCodBarras(codBarrasMedicamento)) {
				this.codBarrasMedicamento = codBarrasMedicamento;
			}
			else {
				throw new CodigoBarrasException();
			}
		}
		*/
		
		
	}
	private boolean compruebaCodBarras(String codBarrasMedicamento) {
		// TODO Auto-generated method stub
		boolean esCorrecto=true;
		codBarrasMedicamento=codBarrasMedicamento.replace("-", "");
		if(codBarrasMedicamento.length()!=13) {
			esCorrecto=false;
			return esCorrecto;
		}
		double numerosCodBarra=0;
		try {
			numerosCodBarra=Double.parseDouble(codBarrasMedicamento);
		}catch (NumberFormatException e) {
			// TODO: handle exception
			esCorrecto=false;
			return esCorrecto;
		}
		String parteCalcular=codBarrasMedicamento.substring(0, 12);
		String digPuesto=codBarrasMedicamento.substring(12);
		
		String digCalc=calculaDigito(parteCalcular);
		if(!digCalc.equals(digPuesto)) {
			esCorrecto=false;
			return esCorrecto;
		}
		return esCorrecto;
	}

	private String calculaDigito(String parteCalcular) {
		// TODO Auto-generated method stub
		String digCalc="";
		int acumulador=0;
		int suma=0;
		int posicion=1;
		for(int x=0;x<parteCalcular.length();x++) {
			acumulador=Integer.parseInt(Character.toString(parteCalcular.charAt(x)));
			if(posicion%2==0) {
				suma+=acumulador*3;
			}
			else {
				suma+=acumulador;
			}
			posicion++;
		}
		int dig=10-(suma%10);
		if(dig==10) {
			dig=0;
		}
		digCalc=String.valueOf(dig);
		return digCalc;
	}

	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(String fechaEntrada) {
		if(fechaEntrada.equals("null")) {
			this.fechaEntrada=null;
		}
		else {
			this.fechaEntrada = LocalDate.parse(fechaEntrada);
		}
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(String fechaAlta) {
		if(fechaAlta.equals("null")) {
			this.fechaAlta=null;
		}
		else {
			this.fechaAlta = LocalDate.parse(fechaAlta);
		}
	}
	public double getPrecioConsulta() {
		return precioConsulta;
	}
	public void setPrecioConsulta(String precioConsulta) {
		if(precioConsulta.equals("null")) {
			this.precioConsulta=0;
		}
		else {
			this.precioConsulta = Double.parseDouble(precioConsulta);
		}
		
	}
	public boolean isAtendido() {
		return atendido;
	}
	public void setAtendido(String atendido) {
		this.atendido = Boolean.parseBoolean(atendido);
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nombre + "," + apellidos + "," + dni + "," + medico
				+ "," + nombreMedicamento + "," + codBarrasMedicamento
				+ "," + fechaEntrada + "," + fechaAlta + "," + precioConsulta
				+ "," + atendido;
	}

	@Override
	public int compareTo(Paciente o) {
		// TODO Auto-generated method stub
		return apellidos.compareTo(o.getApellidos());
	}
	

}
