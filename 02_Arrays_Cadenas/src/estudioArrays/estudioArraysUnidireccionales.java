package estudioArrays;

public class estudioArraysUnidireccionales {

	public estudioArraysUnidireccionales() {
		// TODO Auto-generated constructor stub
		int[]enteros;
		enteros=new int[10];
		int[]enteros2=new int[10];
		
		int notas[]= {10,2,7,3,5,6,2,6,9,5};
		int suspensos=0;
		for(int x=0;x<10;x++) {
			if(notas[x]<5) {
				suspensos++;
			}
			
		}
		System.out.println("Suspensos: "+suspensos);
		int notas2[]=notas;
		notas2[0]=10; 
		metodo1(notas);
		int primitiva[]=generaPrimitiva();
		for(int x=0;x<primitiva.length;x++)
			System.out.print(primitiva[x]+"-");
		
		String nombres[]= {"Alba","Cristina","Elena","Cristian","Andres","Alejandro","Gabi","Jose","Pedro","Dani"};
		for(int x=0;x<notas.length;x++) {
			System.out.println(nombres[x]+"   :  "+notas[x]);
		}
	}

	private int[] generaPrimitiva() {
		// TODO Auto-generated method stub
		int nuevaPrimitiva[]= {5,14,23,65,2,6,38};
		return nuevaPrimitiva;
	}

	private void metodo1(int[] notasCambiadas) {
		// TODO Auto-generated method stub
		notasCambiadas[9]=0;
	}

}
