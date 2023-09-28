package modelo;

public class Persona2 {
	private String nombre;
	private String apellidos;
	private int edad;
	private int altura;
	private float peso;
	
	public Persona2() {
		// TODO Auto-generated constructor stub
		this.nombre="desconocido";
		this.apellidos="desconocido";
		this.edad=0;
	}
	public Persona2(String nombre,String apellidos) {
		this.nombre=nombre;
		this.apellidos=apellidos;
	}
	
	public Persona2(String nombre,String apellidos,int edad) {
		this(nombre, apellidos);
		this.edad=edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Persona2 [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}
	
}
