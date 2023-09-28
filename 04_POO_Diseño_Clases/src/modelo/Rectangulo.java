package modelo;

public class Rectangulo {
	
	private Punto[] puntos;
	
	public Rectangulo() {
		// TODO Auto-generated constructor stub
	}
	public Rectangulo(Punto p1,Punto p2,Punto p3,Punto p4) {
		puntos =new Punto[] {p1,p2,p3,p4};
	}
	public Rectangulo(Punto[] puntos) {
		this.puntos=puntos;
	}
	//public setOtraFigura(Punto...puntos) {
	public void setOtraFigura(Punto punto1, Punto punto2, Punto punto3) {
		// TODO Auto-generated method stub
		
	}
		
	//}
	

}
