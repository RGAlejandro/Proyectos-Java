package modelo;

public class DatosVehiculos {
	private Vehiculo vehiculo;
	private long entrada,salida;
	private long tiempoEspera;
	public DatosVehiculos() {
		// TODO Auto-generated constructor stub
	}

	public DatosVehiculos(Vehiculo vehiculo) {
		// TODO Auto-generated constructor stub
		this.vehiculo=vehiculo;
		this.entrada=Reloj.ahora();
	}
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public long getEntrada() {
		return entrada;
	}

	public long getSalida() {
		return salida;
	}

	public long getTiempoEspera() {
		this.tiempoEspera=this.salida-this.entrada;
		
		return tiempoEspera/1000;
	}
	public void Atiende() {
		this.salida=Reloj.ahora();
	}
	
	@Override
	public String toString() {
		return "DatosVehiculos [vehiculo=" + vehiculo + ", entrada=" + entrada + ", salida=" + salida
				+ ", tiempoEspera=" + tiempoEspera + "]";
	}
	
}
