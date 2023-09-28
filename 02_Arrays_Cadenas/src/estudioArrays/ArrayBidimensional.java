package estudioArrays;

public class ArrayBidimensional {

	public ArrayBidimensional() {
		// TODO Auto-generated constructor stub
		System.out.println("Estudio Arrays Bidimensionales");
		int [][] notas;
		int [] numeros= {1,2,3,4,5,6};
		notas=new int[5][20];
		int [][]notas2=new int[6][30];
		notas2[0][0]=1;
		int [][]notas3 =new int[6][];
		notas3[0]=new int[10];
		notas3[1]=new int[12];		
		notas3[2]=new int[15];		
		notas3[3]=numeros;	
		int [][]notas4= {{5,6,7,8,9,4}//1suspenso
						,{5,6,8,1,7,9}
						,{5,5,4,6,8,7}
						,{2,3,5,6,8,7}};
		//leer un array de principio a fin
		System.out.println("==============================================================");
		for (int x=0;x<notas4.length;x++) {
			for(int y=0;y<notas4[x].length;y++) {
				notas4[x][y]=(int) (Math.random()*10);
				System.out.print(notas4[x][y]+"-");
			}
			System.out.println();
		}
		System.out.println("==============================================================");

		imprimirArray(notas4);
		System.out.println("Cantidad de filas: "+notas4.length);
		System.out.println("Cantidad de columnas: "+notas4[0].length);
		
	}

	private void imprimirArray(int[][] notas) {
		// TODO Auto-generated method stub
		notas[0][0]=0;
		for (int x=0;x<notas.length;x++) {
			for(int y=0;y<notas[x].length;y++) {
				System.out.print(notas[x][y]+"-");
			}
			System.out.println();
		}
	}

}
