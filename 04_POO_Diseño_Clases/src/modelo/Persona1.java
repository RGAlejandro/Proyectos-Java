package modelo;

public class Persona1 {
	private String nombre;
	private String apellidos;
	private int edad;
	private int altura;
	private float peso;
	public Persona1() {
		// TODO Auto-generated constructor stub
		this.nombre="desconocido";
		this.apellidos="desconocido";
		this.edad=0; 
	}
	public Persona1(String nombre,String apellidos) {
		this.nombre=nombre;
		this.apellidos=apellidos;
	}
	
	public Persona1(String nombre,String apellidos,int edad) {
		this(nombre, apellidos);
		this.edad=edad;
	}
	
	public Persona1(String nombre,String apellidos,int edad, int altura, float peso) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		this.altura=altura;
		this.peso=peso;
		
	}
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
	public void presentacion() {
		System.out.println("Mi nombre es "+ this.nombre +" "+ this.apellidos +" y tengo "+this.edad+" años de edad.");
	}
	
}
