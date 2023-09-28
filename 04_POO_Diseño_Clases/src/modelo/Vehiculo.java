package modelo;

public class Vehiculo {
	private static int vehiculosCreados=0;
	private static int kilometrosTotales=0;
	private int kilometrosRecorridos;
	public Vehiculo() {
		// TODO Auto-generated constructor stub
		this.kilometrosRecorridos=0;
		vehiculosCreados++;
	}
	
	public static int getVehiculosCreados() {
		System.out.println("Se han creado "+vehiculosCreados+" vehiculos en total");
		return vehiculosCreados;
	}

	public static int getKilometrosTotales() {
		System.out.println("En total se ha recorrido "+kilometrosTotales+ " km");
		return kilometrosTotales;
	}

	public int getKilometrosRecorridos() {
		System.out.println("Este vehiculo ha recorrido "+kilometrosRecorridos+ " km");
		return kilometrosRecorridos;
	}

	public void anda(int kilometrosRecorridos) {
		this.kilometrosRecorridos+=kilometrosRecorridos;
		kilometrosTotales+=kilometrosRecorridos;
	}
}
