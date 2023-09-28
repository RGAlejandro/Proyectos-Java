package modelo;

import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;

public class Persona implements Comparable<Persona>{
	private String nombre;
	private String apellidos;
	private int edad;
	private int altura;
	private float peso;
	private String dni;
	private SortedMap<String,String> agendate1;
	
	public Persona(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		
	}
	public Persona(String nombre, String apellidos,String dni) {
		this(nombre, apellidos);
		this.dni=dni;
		this.agendate1= new TreeMap <String,String>();
	}
	
	public SortedMap<String, String> getAgendate1() {
		return agendate1;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}

	//Comportamineto, conocido como metodos
	public void caminar() {
		System.out.println("Estoy caminando");
	}
	public void hablar() {
		System.out.println("Estoy hablando");
	}
	public void comer() {
		System.out.println("Estoy comiendo");
	}
	public void respirar() {
		System.out.println("Esto respirando");
	}
	public void nacer() {
		System.out.println("¡¡He nacido!!");
	}
	public void morir() {
		System.out.println("¡¡He muerto!!");
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", altura=" + altura
				+ ", peso=" + peso + ", dni=" + dni + ", agendate1=" + agendate1 + "]";
	}
	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return this.apellidos.compareTo(o.apellidos);
	}
	
}
