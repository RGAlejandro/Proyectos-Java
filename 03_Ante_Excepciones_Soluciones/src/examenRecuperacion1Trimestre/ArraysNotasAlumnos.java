package examenRecuperacion1Trimestre;

public class ArraysNotasAlumnos {

	public ArraysNotasAlumnos() {
		// TODO Auto-generated constructor stub
		System.out.println("NOTAS DE ALUMNOS");
		String [] alumnos= {"Pepe","Maria","Luis","Juan","Marina","Carmen","Antonio","Ana","Fernando","Rosario"};
		String [] asignaturas= {"Ingles","Matematicas","Naturales","Lengua","Geografia"};
		int  [][]notas= {{3,5,6,7,8,6,7,4,5,6}, //Notas de Ingles
						 {6,4,7,5,7,5,6,9,2,9}, //Notas de Matematicas
						 {3,6,4,7,8,6,5,5,9,2}, //Notas de Naturales
						 {5,3,5,7,8,4,7,3,4,6}, //Notas de Lengua
						 {5,6,4,7,8,6,5,3,6,2}}; //Notas de Geografia
		alumnosAprobados(notas,alumnos,asignaturas);
	
	}

	private void alumnosAprobados(int[][] notas, String[] alumnos, String[] asignaturas) {
		// TODO Auto-generated method stub
		int suspensos=0;
		int matesSusp=0;
		int lenguaSusp=0;
		int numAlumno=0;
		boolean estaAprobado=true;
		
		for(int y=0;y<notas[0].length;y++) {
			suspensos=0;
			matesSusp=0;
			lenguaSusp=0;
			estaAprobado=true;
			for(int x=0;x<notas.length;x++) {
				if(notas[x][y]<5) {
					suspensos++;
				}
				
			}
			if(notas[1][y]<5) {
				matesSusp++;
			}
			if(notas[3][y]<5) {
				lenguaSusp++;
			}
			if(suspensos>=3 || matesSusp+lenguaSusp==2) {
				estaAprobado=false;
			}
			if(estaAprobado) {
				numAlumno=y;
				muestraBoletinAlumno(numAlumno,notas,asignaturas,alumnos);
			}
			
		}
	}

	private void muestraBoletinAlumno(int numAlumno, int[][] notas, String[] asignaturas, String[] alumnos) {
		// TODO Auto-generated method stub
		System.out.println("Boletin de "+alumnos[numAlumno]);
		for(int x=0;x<notas.length;x++) {
			System.out.print(asignaturas[x]+" ");
			System.out.print(notas[x][numAlumno]+" ");
		}
		System.out.println("");
	}

}
