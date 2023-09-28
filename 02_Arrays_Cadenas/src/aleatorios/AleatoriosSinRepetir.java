package aleatorios;

import java.util.Arrays;

public class AleatoriosSinRepetir {

	public AleatoriosSinRepetir() {
		// TODO Auto-generated constructor stub
		System.out.println("GENERAR NUMEROS ALEATORIOS SIN QUE SE REPITA");
		int menor=1;
		int mayor=5;
		int cantidad=5;
		int num=0;
		int []aleatorio=new int[cantidad];
		System.out.println(Arrays.toString(aleatorio));
		for(int x=0;x<aleatorio.length;x++)  {
		do {
			num=(int)Math.floor(Math.random()*(mayor-menor+1)+menor);	
		}while(repetido(num,aleatorio));
		aleatorio[x]=num;
		}
		System.out.println(Arrays.toString(aleatorio));
	}

	private boolean repetido(int num, int[] aleatorio) {
		// TODO Auto-generated method stub
		boolean repetido=false;
		for(int x=0;x<aleatorio.length;x++) {
			if(aleatorio[x]==num) {
				repetido=true;
				break;
			}
		}
		return repetido;
	}

}