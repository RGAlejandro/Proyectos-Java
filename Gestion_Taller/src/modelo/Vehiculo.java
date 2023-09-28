package modelo;

import java.time.LocalDate;

import excepciones.CampoNuloException;
import excepciones.DniException;
import excepciones.MatriculaException;

public class Vehiculo {
	private String nombre;
	private String matricula;
	private String dni;
	private LocalDate fechaEntrada;
	private LocalDate fechaReparacion;
	private String descripcion;
	private double horas;
	private boolean reparado;
	private String mecanico;

	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}
	
	public Vehiculo(String nombre, String matricula, String dni, String fechaEntrada, String fechaReparacion, String descripcion, String horas, String reparado, String mecanico) throws DniException, CampoNuloException, MatriculaException {
		super();
		this.setNombre(nombre);
		this.setMatricula(matricula);
		this.setDni(dni);
		this.setFechaEntrada(fechaEntrada);
		this.setFechaReparacion(fechaReparacion);
		this.setDescripcion(descripcion);
		this.setHoras(horas);
		this.setReparado(reparado);
		this.setMecanico(mecanico);
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) throws CampoNuloException, MatriculaException {
		if(matricula.isEmpty()){
			throw new CampoNuloException();
		}
		if(compruebaMatricula(matricula)) {
			this.matricula = matricula;
		}
		else {
			throw new MatriculaException();
		}
	}

	private boolean compruebaMatricula(String matricula) {
		// TODO Auto-generated method stub
		boolean esCorrecto=true;
		if(matricula.length()!=7) {
			esCorrecto=false;
			return esCorrecto;
		}
		
		String partesNums=matricula.substring(0, 4);
		char [] numsCarac=partesNums.toCharArray();
		String parteLetras=matricula.substring(4, 7);
		char [] letrasCarac=parteLetras.toCharArray();
		for(int x=0;x<numsCarac.length;x++) {
			if(Character.isAlphabetic(numsCarac[x])) {
				esCorrecto=false;
				return esCorrecto;
			}
		}
		for(int x=0;x<letrasCarac.length;x++) {
			if(Character.isDigit(letrasCarac[x])) {
				esCorrecto=false;
				return esCorrecto;
			}
		}
		return esCorrecto;
	}

	public String getNombre() {
		
		return nombre;
	}

	public void setNombre(String nombre) throws CampoNuloException {
		if(nombre.isEmpty()){
			throw new CampoNuloException();
		}
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) throws DniException, CampoNuloException {
		if(dni.isEmpty()){
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
		String parteNums=dni.substring(0,8);
		String letra=dni.substring(8);
		char letraDni=letra.charAt(0);
		char [] numsDni=parteNums.toCharArray();
		for(int x=0;x<numsDni.length;x++) {
			if(Character.isAlphabetic(numsDni[x])) {
				esCorrecto=false;
				return esCorrecto;
			}
		}
		if(Character.isDigit(letraDni)) {
			esCorrecto=false;
			return esCorrecto;
		}
		int numeros=Integer.parseInt(parteNums);
		int resto=numeros%23;
		String [] letras= {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		String letraBuscada=letras[resto];
		if(!letraBuscada.equals(letra)) {
			esCorrecto=false;
			return esCorrecto;
		}
		return esCorrecto;
	}

	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(String fechaEntrada) throws CampoNuloException {
		if(fechaEntrada.isEmpty()){
			throw new CampoNuloException();
		}
		if(fechaEntrada.equals("null")) {
			this.fechaEntrada=null;
		}
		else{
			this.fechaEntrada = LocalDate.parse(fechaEntrada);
		}
		
	}

	public LocalDate getFechaReparacion() {
		return fechaReparacion;
	}

	public void setFechaReparacion(String fechaReparacion) throws CampoNuloException {
		if(fechaReparacion.isEmpty()){
			throw new CampoNuloException();
		}
		if(fechaReparacion.equals("null")) {
			this.fechaReparacion=null;
		}
		else {
			this.fechaReparacion = LocalDate.parse(fechaReparacion);
		}
		
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) throws CampoNuloException {
		if(descripcion.isEmpty()){
			throw new CampoNuloException();
		}
		this.descripcion = descripcion;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(String horas) throws CampoNuloException {
		if(horas.isEmpty()){
			throw new CampoNuloException();
		}
		if(horas.equals("null")) {
			this.horas=0;
		}
		else {
			this.horas = Double.parseDouble(horas);
		}
	}

	public boolean isReparado() {
		return reparado;
	}

	public void setReparado(String reparado) throws CampoNuloException {
		if(reparado.isEmpty()){
			throw new CampoNuloException();
		}
		this.reparado = Boolean.parseBoolean(reparado);
	}

	public String getMecanico() {
		return mecanico;
	}

	public void setMecanico(String mecanico) throws CampoNuloException {
		if(mecanico.isEmpty()){
			throw new CampoNuloException();
		}
		this.mecanico = mecanico;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Vehiculo other = (Vehiculo) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nombre + "," + matricula + "," + dni + "," + fechaEntrada + "," + fechaReparacion + "," + descripcion + "," + horas + "," + reparado + "," + mecanico;
	}
	
}
