package estudioFicheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ficheros3 {

	public Ficheros3() throws IOException {
		// TODO Auto-generated constructor stub
		/*
		FileWriter fw;
		BufferedWriter bw;
		fw =new FileWriter("escribirfichero.txt");
		bw=new BufferedWriter(fw);
		String linea="";
		String nombre="Pepito";
		String apellidos="Garcia Perez";
		int edad=24;
		
		linea+=nombre+";"+apellidos+";"+String.valueOf(edad);
		bw.write(linea);
		fw.flush();
		bw.close();
		fw.close();
		*/
		/*
		bw.write(nombre);bw.write(";");bw.write(apellidos);bw.write(";");bw.write(String.valueOf(edad));
		bw.newLine();
		fw.flush();
		bw.close();
		fw.close();
		*/
		String []alumnos= {"Pepe","Ana","Carlos"};
		String []asignaturas= {"Mates","Ingles","Geografia","Fisica"};
		int [][]notas= {{5,6,7},{8,5,9},{6,7,6},{7,4,8}};
		salvarDatos(alumnos,asignaturas,notas);
		alumnos=null;asignaturas=null;notas=null;
	}

	private void salvarDatos(String[] alumnos, String[] asignaturas, int[][] notas) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw =new FileWriter("notasAlumnos.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		String linea="";
		for(int x=0;x<alumnos.length;x++) {
			if(x==alumnos.length-1) {
				linea+=alumnos[x];
			}
			else {
				linea+=alumnos[x]+",";
			}
		}
		bw.write(linea);
		bw.newLine();
		linea="";
		for(int x=0;x<asignaturas.length;x++) {
			if(x==asignaturas.length-1) {
				linea+=asignaturas[x];
			}
			else {
				linea+=asignaturas[x]+",";
			}
		}
		bw.write(linea);
		bw.newLine();
		linea="";
		for(int x=0;x<notas.length;x++) {
			linea="";
			for(int y=0;y<notas[x].length;y++) {
				if(y==notas[x].length-1) {
					linea+=notas[x][y];
				}
				else {
					linea+=notas[x][y]+",";
				}
			}
			bw.write(linea);
			bw.newLine();
		}
		fw.flush();
		bw.close();
		fw.close();
	}

}
